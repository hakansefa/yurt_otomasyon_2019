package yurtotomasyon;

import javax.swing.JPanel;

import com.mysql.jdbc.Connection;

import keeptoo.KGradientPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class sifre extends JFrame {
     String to;
     String from;
     String text;
     private JTextField txttc;
     private JTextField txtad;
     private JTextField txttel;
     private JTextField txtemail;
	
     
     public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					sifre frame = new sifre();
 					frame.setVisible(true);
 				} catch (Exception e) {
 					e.printStackTrace();
 				}
 			}
 		});
 	}
	public sifre()  {
		getContentPane().setLayout(null);
		setBounds(0, 0, 465, 355);
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.CYAN;
		gradientPanel.setBounds(0, 0, 450, 319);
		getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.DARK_GRAY));
		panel.setOpaque(false);
		panel.setBounds(0, 0, 450, 37);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Dialog", Font.BOLD, 20));
		lblX.setBounds(423, 0, 27, 32);
		panel.add(lblX);
		
		JLabel lblifreDeitir = new JLabel("\u015Eifre De\u011Fi\u015Ftir");
		lblifreDeitir.setForeground(Color.WHITE);
		lblifreDeitir.setFont(new Font("Dialog", Font.BOLD, 20));
		lblifreDeitir.setBounds(0, 0, 144, 32);
		panel.add(lblifreDeitir);
		
		JLabel lblNewLabel = new JLabel("Kullanici TC :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 43, 116, 32);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblKullaniciAd = new JLabel("Kullanici Ad :");
		lblKullaniciAd.setFont(new Font("Dialog", Font.BOLD, 16));
		lblKullaniciAd.setBounds(10, 98, 116, 32);
		gradientPanel.add(lblKullaniciAd);
		
		JLabel lblKullaniciTel = new JLabel("Kullanici Tel :");
		lblKullaniciTel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblKullaniciTel.setBounds(10, 156, 116, 32);
		gradientPanel.add(lblKullaniciTel);
		
		txttc = new JTextField();
		txttc.setFont(new Font("Dialog", Font.BOLD, 16));
		txttc.setBounds(220, 43, 220, 32);
		gradientPanel.add(txttc);
		txttc.setColumns(10);
		
		JLabel lblKullaniciEmail = new JLabel("Kullanici E-mail :");
		lblKullaniciEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblKullaniciEmail.setBounds(10, 213, 144, 32);
		gradientPanel.add(lblKullaniciEmail);
		
		txtad = new JTextField();
		txtad.setFont(new Font("Dialog", Font.BOLD, 16));
		txtad.setColumns(10);
		txtad.setBounds(220, 98, 220, 32);
		gradientPanel.add(txtad);
		
		txttel = new JTextField();
		txttel.setFont(new Font("Dialog", Font.BOLD, 16));
		txttel.setColumns(10);
		txttel.setBounds(220, 156, 220, 32);
		gradientPanel.add(txttel);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Dialog", Font.BOLD, 16));
		txtemail.setColumns(10);
		txtemail.setBounds(220, 213, 220, 32);
		gradientPanel.add(txtemail);
		
		KButton button = new KButton();
	
		button.setBounds(169, 263, 271, 45);
		button.setText("Þifremi Gönder");
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setOpaque(false);
		button.kBorderRadius=50;
		button.setBorder(null);
		gradientPanel.add(button);
		
		

	  	button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			      try {
			    	  Connection con = (Connection) connection.getConnection();
			    	 
						PreparedStatement sorgu4 = con.prepareStatement("Select * from ogrenciler where ogr_tc="+txttc.getText()+"");


						ResultSet sonuc4 = sorgu4.executeQuery();

						while(sonuc4.next()) {
							 to = sonuc4.getString("ogr_email");
						   text = sonuc4.getString("ogr_sifre");
						}
			    

				      // Sender's email ID needs to be mentioned
				      from = "maildeneme@karahanenerji.com";

				      // Assuming you are sending email from localhost
				      String host = "localhost";

				      // Get system properties
				      Properties properties = System.getProperties();

				      // Setup mail server
				      properties.setProperty("smtp.hostinger.web.tr", host);
				  
				      // Get the default Session object.
				      Session session = Session.getDefaultInstance(properties);
			    	  
			         // Create a default MimeMessage object.
			         MimeMessage message = new MimeMessage(session);
			         
			         // Set From: header field of the header.
			         message.setFrom(new InternetAddress(from));

			         // Set To: header field of the header.
			         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			         // Set Subject: header field
			         message.setSubject("Köyceðiz Yurtlarý Þifre Yenileme");
                     
			         // Now set the actual message
			         message.setText("Köyceðiz Yurtlarý Otomasyon Þifreniz :"+text);
                     
			         // Send message
			         Transport.send(message);
			         System.out.println("Sent message successfully....");
			      } catch (MessagingException mex) {
			         mex.printStackTrace();
			      } catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	      
	   

	}
}
