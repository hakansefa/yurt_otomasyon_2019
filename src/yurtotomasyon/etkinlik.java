package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import keeptoo.KButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import keeptoo.KGradientPanel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class etkinlik extends JPanel {
	DefaultListModel<String> listModel = new DefaultListModel();
	private JTextField txtrenciAd;
	private JTextField txtYl;
	private JTextField txtOnaylama;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etkinlik frame = new etkinlik();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public etkinlik() {
		setBackground(new Color (216,204,192));
		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ETK\u0130NL\u0130KLER");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		
		txtOnaylama = new JTextField();
		txtOnaylama.setForeground(Color.CYAN);
		txtOnaylama.setOpaque(false);

		txtOnaylama.setText("64 K\u0130\u015E\u0130 G\u0130D\u0130YOR");
		txtOnaylama.setFont(new Font("Purisa", Font.BOLD, 16));
		txtOnaylama.setColumns(10);
		txtOnaylama.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtOnaylama.setBounds(457, 299, 285, 34);
		add(txtOnaylama);
		
		KButton button_1 = new KButton();
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setBounds(264, 356, 285, 45);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("ETKÝNLÝÐE KATIL");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 130, 275, 203);
		add(scrollPane);
		
		JList list = new JList();
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		list.setOpaque(false);
		list.setFont(new Font("Ubuntu", Font.BOLD, 16));
		scrollPane.setViewportView(list);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 847, 413);
		add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(455, 127, 283, 163);
		gradientPanel.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		

		try {
			int a = list.getSelectedIndex()+2;
			System.out.print(a);
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.etkinlik");
			PreparedStatement sorgu2 = con.prepareStatement("Select count(ogrenciler_ogr_id) as say from etk_say where etkinlik_etkinlik_id="+a+"");
			
			ResultSet sonuc = sorgu.executeQuery();

			ResultSet sonuc2 = sorgu2.executeQuery();
			while(sonuc.next()) {
			
			listModel.addElement(sonuc.getString("etkinlik_ad"));
			
			textArea.setText(sonuc.getString("etkinlik_acýklama")+" \n "+"Etkinlik Ücreti :"+sonuc.getString("etkinlik_fiyat")+"\n "+"Katýlýmcý Sayý Sýnýrý :"+sonuc.getString("etkinlik_sayi"));
			
			
			
			}
			while(sonuc2.next()) {
				
				txtOnaylama.setText("Bu etkinliðe  "+sonuc2.getString("say")+"  kiþi gidiyor");
				
				
				}
			list.setModel(listModel);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				try {
					int a = list.getSelectedIndex()+1;
					System.out.print(a);
					Connection con = connection.getConnection();
					PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.etkinlik where etkinlik_id="+a+"");
					PreparedStatement sorgu2 = con.prepareStatement("Select count(ogrenciler_ogr_id) as say from etk_say where etkinlik_etkinlik_id="+a+"");
					
					ResultSet sonuc = sorgu.executeQuery();

					ResultSet sonuc2 = sorgu2.executeQuery();
					while(sonuc.next()) {
					textArea.setText(sonuc.getString("etkinlik_acýklama")+" \n "+"Etkinlik Ücreti :"+sonuc.getString("etkinlik_fiyat")+"\n "+"Katýlýmcý Sayý Sýnýrý :"+sonuc.getString("etkinlik_sayi"));
					
					
					
					}
					while(sonuc2.next()) {
						
						txtOnaylama.setText("Bu etkinliðe  "+sonuc2.getString("say")+"  kiþi gidiyor");
						
						
						}
				
				
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});

	}
}
