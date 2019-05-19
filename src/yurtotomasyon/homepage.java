package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import keeptoo.KButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import keeptoo.KGradientPanel;

public class homepage extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtTcGiriniz;
	private JTextField txtAdSoyad;
	private JTextField txtOkul;
	private JTextField txtBolum;
	private JTextField txtTelNo;
	private JTextField txtEmail;
	private JTextField txtKaytTarihi;
	private JTextField txtOdaNo;
	String tc;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public homepage() {
		try {
			File file = new File("tc.txt");
			FileReader fileReader = new FileReader(file);
			String line;

			BufferedReader br = new BufferedReader(fileReader);

			while ((line = br.readLine()) != null) {

			   tc=line;

			}

			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00D6\u011ERENC\u0130 DETAYLARI");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		txtTcGiriniz = new JTextField();
		txtTcGiriniz.setEditable(false);
		txtTcGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtTcGiriniz.isEditable())txtTcGiriniz.setText(null);
			}
		});
		txtTcGiriniz.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				txtTcGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtTcGiriniz.setOpaque(false);
		txtTcGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTcGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtTcGiriniz.setText("T.C");
		txtTcGiriniz.setBounds(28, 84, 285, 34);
		
		txtTcGiriniz.setColumns(10);
		add(txtTcGiriniz);
		txtAdSoyad = new JTextField();
		txtAdSoyad.setEditable(false);
		txtAdSoyad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtAdSoyad.isEditable())txtAdSoyad.setText(null);
			}
		});
		txtAdSoyad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtAdSoyad.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtAdSoyad.setOpaque(false);
		txtAdSoyad.setText("AD SOYAD");
		txtAdSoyad.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAdSoyad.setColumns(10);
		txtAdSoyad.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdSoyad.setBounds(28, 154, 285, 34);
		add(txtAdSoyad);
		
		
		txtOkul = new JTextField();
		txtOkul.setEditable(false);
		txtOkul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtOkul.isEditable())txtOkul.setText(null);
			}
		});
		txtOkul.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtOkul.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtOkul.setOpaque(false);

		txtOkul.setText("OKUL");
		txtOkul.setFont(new Font("Purisa", Font.BOLD, 16));
		txtOkul.setColumns(10);
		txtOkul.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtOkul.setBounds(28, 226, 285, 34);
		add(txtOkul);
		
		txtBolum = new JTextField();
		txtBolum.setEditable(false);
		txtBolum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtBolum.isEditable())txtBolum.setText(null);
			}
		});
		txtBolum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtBolum.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			

			}
		});
		txtBolum.setOpaque(false);

		txtBolum.setText("BOLUM");
		txtBolum.setFont(new Font("Purisa", Font.BOLD, 16));
		txtBolum.setColumns(10);
		txtBolum.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtBolum.setBounds(28, 299, 285, 34);
		
		add(txtBolum);
		txtTelNo = new JTextField();
		txtTelNo.setEditable(false);
		txtTelNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtTelNo.isEditable())txtTelNo.setText(null);
				
			}
		});
		txtTelNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtTelNo.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtTelNo.setOpaque(false);
		txtTelNo.setText("TEL NO");
		txtTelNo.setFont(new Font("Purisa", Font.BOLD, 16));
		txtTelNo.setColumns(10);
		txtTelNo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTelNo.setBounds(457, 89, 285, 34);
		add(txtTelNo);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtEmail.isEditable())txtEmail.setText(null);
			}
		});
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtEmail.setOpaque(false);

		txtEmail.setText("EMA\u0130L");
		txtEmail.setFont(new Font("Purisa", Font.BOLD, 16));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtEmail.setBounds(457, 159, 285, 34);
		add(txtEmail);
		
		txtKaytTarihi = new JTextField();
		txtKaytTarihi.setEditable(false);
		txtKaytTarihi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtKaytTarihi.isEditable())txtKaytTarihi.setText(null);
			}
		});
		txtKaytTarihi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtKaytTarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtKaytTarihi.setOpaque(false);

		txtKaytTarihi.setText("KAYIT TAR\u0130H\u0130");
		txtKaytTarihi.setFont(new Font("Purisa", Font.BOLD, 16));
		txtKaytTarihi.setColumns(10);
		txtKaytTarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtKaytTarihi.setBounds(457, 231, 285, 34);
		add(txtKaytTarihi);
		
		txtOdaNo = new JTextField();
		txtOdaNo.setEditable(false);
		txtOdaNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtOdaNo.isEditable())txtOdaNo.setText(null);
			}
		});
		txtOdaNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtOdaNo.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));

			}
		});
		txtOdaNo.setOpaque(false);

		txtOdaNo.setText("ODA NO");
		txtOdaNo.setFont(new Font("Purisa", Font.BOLD, 16));
		txtOdaNo.setColumns(10);
		txtOdaNo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtOdaNo.setBounds(457, 299, 285, 34);
		add(txtOdaNo);
		
		KButton button_1 = new KButton();
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setBounds(264, 356, 285, 45);
		button_1.setOpaque(false);
		button_1.setBorder(null);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Düzenle");
		button_1.kBorderRadius=60;
		add(button_1);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 847, 413);
		add(gradientPanel);
		try {
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.ogrenciler where ogr_tc="+tc+"");
			PreparedStatement sorgu3 = con.prepareStatement("Select oda_kod from odalar where oda_id =(Select Odalar_oda_id from ogrenciler where ogr_tc="+tc+")");
			PreparedStatement sorgu2 = con.prepareStatement("select uni_ad from universite where uni_id =(select universite_uni_id from ogrenciler where ogr_tc="+tc+")");
			PreparedStatement sorgu4 = con.prepareStatement("select bolum_ad from bolumler where bolum_id =(select Bolumler_bolum_id from ogrenciler where ogr_tc="+tc+")");
			PreparedStatement sorgu5 = con.prepareStatement("select sinif from siniflar where sinif_id =(select Siniflar_sinif_id from ogrenciler where ogr_tc="+tc+")");
			ResultSet sonuc4 = sorgu4.executeQuery();

			ResultSet sonuc5=sorgu5.executeQuery();
			ResultSet sonuc3 = sorgu3.executeQuery();
			
			
			ResultSet sonuc = sorgu.executeQuery();
			ResultSet sonuc2 = sorgu2.executeQuery();
			while(sonuc.next()) {
				txtTcGiriniz.setText(sonuc.getString("ogr_tc"));
			
				txtOdaNo.setText(sonuc.getString("ogr_tc"));
				txtKaytTarihi.setText(sonuc.getString("kayittarihi"));
				txtEmail.setText(sonuc.getString("ogr_email"));
				txtTelNo.setText(sonuc.getString("ogr_tel"));
				txtAdSoyad.setText(sonuc.getString("ogr_ad"));
			
			
			
			
			}
			while(sonuc2.next()) {
				
				txtOkul.setText(sonuc2.getString("uni_ad"));
				}
			while(sonuc3.next()) {
				txtOdaNo.setText(sonuc3.getString("oda_kod"));
		
				}
			while(sonuc4.next()) {
				while(sonuc5.next()) {
				
			txtBolum.setText(sonuc4.getString("bolum_ad")+"-"+sonuc5.getString("sinif")+".Sýnýf");
					}
				}
		} catch (Exception e) { System.out.print(e);
			// TODO: handle exception
		}
		

	}
}
