package yurtotomasyon;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import keeptoo.KButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import keeptoo.KGradientPanel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class ogr_panel extends JFrame {

	private JPanel contentPane;
	private JTextField txtrenciAd;
	private JTextField txtTcGiriniz;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private ImageIcon format = null;
	String tc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogr_panel frame = new ogr_panel();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ogr_panel() {
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
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image.png"));
		setResizable(false);
		setBounds(100, 100, 1120, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(75, 75, 75));
		panel.setBounds(0, 0, 273, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtrenciAd = new JTextField();
		txtrenciAd.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtrenciAd.setHorizontalAlignment(SwingConstants.CENTER);
		txtrenciAd.setForeground(Color.BLUE);
		txtrenciAd.setEditable(false);
		txtrenciAd.setFont(new Font("Ubuntu", Font.BOLD, 16));
		txtrenciAd.setBounds(12, 108, 249, 44);
		panel.add(txtrenciAd);
		txtrenciAd.setColumns(10);
		
		JButton btnNewButton = new JButton("Profilim");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton.setIconTextGap(50);
		btnNewButton.setOpaque(false);
		btnNewButton.setForeground(Color.CYAN);
		
		btnNewButton.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image3.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btnNewButton.setBounds(10, 187, 253, 56);
		panel.add(btnNewButton);
		
		JButton btnIzinler = new JButton("\u0130zin \u0130\u015Flemleri");
		btnIzinler.setFocusPainted(false);
		btnIzinler.setIconTextGap(50);
		btnIzinler.setForeground(Color.WHITE);
		btnIzinler.setOpaque(false);
		btnIzinler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		btnIzinler.setBorder(null);
		btnIzinler.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image2s.png"));
		
		btnIzinler.setHorizontalAlignment(SwingConstants.LEADING);
		btnIzinler.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btnIzinler.setBackground(Color.WHITE);
		btnIzinler.setBounds(10, 241, 251, 56);
		panel.add(btnIzinler);
		
		JButton btnDuyurular = new JButton("Duyurular");
		btnDuyurular.setIconTextGap(50);
		btnDuyurular.setFocusPainted(false);
		btnDuyurular.setForeground(Color.WHITE);
		btnDuyurular.setOpaque(false);
		
		btnDuyurular.setBorder(null);
		
		btnDuyurular.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image33.png"));
		btnDuyurular.setHorizontalAlignment(SwingConstants.LEADING);
		btnDuyurular.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btnDuyurular.setBackground(Color.WHITE);
		btnDuyurular.setBounds(12, 295, 251, 56);
		panel.add(btnDuyurular);
		
		JButton btndemeler = new JButton("\u00D6demelerim");
		btndemeler.setIconTextGap(50);
		btndemeler.setFocusPainted(false);
		btndemeler.setForeground(Color.WHITE);
		btndemeler.setOpaque(false);
		
		btndemeler.setBorder(null);
		
		btndemeler.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\22.png"));
		btndemeler.setHorizontalAlignment(SwingConstants.LEADING);
		btndemeler.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btndemeler.setBackground(Color.WHITE);
		btndemeler.setBounds(10, 348, 253, 56);
		panel.add(btndemeler);
		
		JButton btnMesajlar = new JButton("Mesajlar\u0131m");
		btnMesajlar.setIconTextGap(50);
		btnMesajlar.setFocusPainted(false);
		btnMesajlar.setForeground(Color.WHITE);
		btnMesajlar.setOpaque(false);
		
		btnMesajlar.setBorder(null);
		
		btnMesajlar.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image (1).png"));
		btnMesajlar.setHorizontalAlignment(SwingConstants.LEADING);
		btnMesajlar.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btnMesajlar.setBackground(Color.WHITE);
		btnMesajlar.setBounds(10, 397, 253, 56);
		panel.add(btnMesajlar);
		
		JButton btnetkin = new JButton("Etkinlikler");
		
		btnetkin.setIconTextGap(50);
		btnetkin.setFocusPainted(false);
		btnetkin.setForeground(Color.WHITE);
		btnetkin.setOpaque(false);
		btnetkin.setBorder(null);
		btnetkin.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\cam.png"));
		btnetkin.setHorizontalAlignment(SwingConstants.LEADING);
		btnetkin.setFont(new Font("Ubuntu", Font.BOLD, 16));
		btnetkin.setBackground(Color.WHITE);
		btnetkin.setBounds(12, 449, 251, 56);
		panel.add(btnetkin);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image321.png"));
		lblNewLabel_1.setBounds(96, 12, 90, 90);
		panel.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				kullanicigirisi kg = new kullanicigirisi();
			    kg.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image (2).png"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(205, 533, 56, 56);
		panel.add(label_1);
		
		JButton btnikayetBildir = new JButton("\u015Eikayet Bildir");
		btnikayetBildir.setIconTextGap(20);
		btnikayetBildir.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\sikaet.png"));
		btnikayetBildir.setOpaque(false);
		btnikayetBildir.setHorizontalAlignment(SwingConstants.LEADING);
		btnikayetBildir.setForeground(Color.WHITE);
		btnikayetBildir.setFont(new Font("Dialog", Font.BOLD, 16));
		btnikayetBildir.setFocusPainted(false);
		btnikayetBildir.setBorder(null);
		btnikayetBildir.setBackground(Color.WHITE);
		btnikayetBildir.setBounds(10, 533, 192, 56);
		panel.add(btnikayetBildir);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = new Color(102, 204, 255);
		gradientPanel.setBounds(858, 33, 193, 117);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblGiriSaatleri = new JLabel("Son Giri\u015F Saatleri");
		lblGiriSaatleri.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblGiriSaatleri.setBounds(12, 12, 151, 15);
		gradientPanel.add(lblGiriSaatleri);
		
		JLabel lblHaftaIi = new JLabel("Hafta \u0130\u00E7i");
		lblHaftaIi.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblHaftaIi.setBounds(12, 39, 88, 31);
		gradientPanel.add(lblHaftaIi);
		
		JLabel label = new JLabel("23:00");
		label.setForeground(Color.RED);
		label.setFont(new Font("Ubuntu", Font.BOLD, 16));
		label.setBounds(142, 39, 51, 31);
		gradientPanel.add(label);
		
		JLabel lblHaftaSonu_1 = new JLabel("Hafta Sonu :");
		lblHaftaSonu_1.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblHaftaSonu_1.setBounds(12, 74, 118, 31);
		gradientPanel.add(lblHaftaSonu_1);
		
		JLabel lblHaftaSonu = new JLabel("24:00");
		lblHaftaSonu.setForeground(Color.RED);
		lblHaftaSonu.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblHaftaSonu.setBounds(142, 74, 51, 31);
		gradientPanel.add(lblHaftaSonu);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kEndColor = new Color(255, 255, 51);
		gradientPanel_1.kStartColor = new Color(102, 255, 51);
		gradientPanel_1.setBounds(602, 33, 193, 117);
		contentPane.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblKalanIzin = new JLabel("Kullanılan İzinler");
		lblKalanIzin.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblKalanIzin.setBounds(12, 12, 171, 15);
		gradientPanel_1.add(lblKalanIzin);
		
		JLabel label_2 = new JLabel("75/15");
		label_2.setFont(new Font("Nirmala UI", Font.BOLD | Font.ITALIC, 44));
		label_2.setBounds(12, 39, 151, 55);
		gradientPanel_1.add(label_2);
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.setBounds(348, 33, 193, 117);
		contentPane.add(gradientPanel_2);
		gradientPanel_2.setLayout(null);
		
		
		JLabel lblBorlar = new JLabel("Kalan Borç");
		lblBorlar.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblBorlar.setBounds(12, 12, 102, 15);
		gradientPanel_2.add(lblBorlar);
		
		JLabel lblTl = new JLabel("5000 TL");
		lblTl.setFont(new Font("Nirmala UI", Font.BOLD | Font.ITALIC, 44));
		lblTl.setBounds(12, 39, 181, 55);
		gradientPanel_2.add(lblTl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(273, 187, 847, 413);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		homepage panels = new homepage();
		panels.setBounds(0, 0, 847, 413);
		panel_1.add(panels);
		panels.setVisible(true);
	 
		try {
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.ogrenciler where ogr_tc="+tc+"");
			PreparedStatement sorgu2 = con.prepareStatement("Select * from borc where ogrenciler_ogr_id =(Select ogr_id from ogrenciler where ogr_tc="+tc+")");
			PreparedStatement sorgu3 = con.prepareStatement("Select Count(izin_id) as en from izinler where ogrenciler_ogr_id =(Select ogr_id from ogrenciler where ogr_tc="+tc+")");
			ResultSet sonuc3 = sorgu3.executeQuery();
			
			
			ResultSet sonuc = sorgu.executeQuery();
			ResultSet sonuc2 = sorgu2.executeQuery();
			while(sonuc.next()) {
			txtrenciAd.setText(sonuc.getString("ogr_ad"));
			byte[] imagedata = sonuc.getBytes("profil_photo");
			format = new ImageIcon(imagedata);
			lblNewLabel_1.setIcon( new ImageIcon(sonuc.getString("profil_photo")));
			
			
			}
			while(sonuc2.next()) {
				lblTl.setText(sonuc2.getString("top_borc") +" TL");
				
				}
			while(sonuc3.next()) {
				label_2.setText(sonuc3.getString("en") +"/75");
		
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		izinpage izinpage = new izinpage();
		duyurupage duyurupage = new duyurupage();
		odemepage odemepage = new odemepage();
		mesajpage mesajpage = new mesajpage();
		etkinlik etkinlik = new etkinlik();
		btnetkin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIzinler.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.CYAN);
				
				btnDuyurular.setForeground(Color.WHITE);
				btndemeler.setForeground(Color.WHITE);
				btnMesajlar.setForeground(Color.WHITE);
				btnNewButton.setForeground(Color.WHITE);
				btnetkin.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
				btnNewButton.setBorder(null);
				btndemeler.setBorder(null);
				btnMesajlar.setBorder(null);
				btnDuyurular.setBorder(null);
				btnIzinler.setBorder(null);
				panels.setVisible(false);
			duyurupage.setVisible(false);
			odemepage.setVisible(false);
			mesajpage.setVisible(false);
			izinpage.setVisible(false);
			etkinlik.setVisible(true);
			panel_1.add(etkinlik);
			}
		});
	
		
		btnIzinler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIzinler.setForeground(Color.CYAN);
				btnDuyurular.setForeground(Color.WHITE);
				btndemeler.setForeground(Color.WHITE);
				btnMesajlar.setForeground(Color.WHITE);
				btnNewButton.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.WHITE);
				btnIzinler.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
				btnNewButton.setBorder(null);
				btndemeler.setBorder(null);
				btnMesajlar.setBorder(null);
				btnDuyurular.setBorder(null);
				btnetkin.setBorder(null);
				panels.setVisible(false);
			duyurupage.setVisible(false);
			odemepage.setVisible(false);
			mesajpage.setVisible(false);
			etkinlik.setVisible(false);
			izinpage.setVisible(true);
	
			panel_1.add(izinpage);

			
			}
		});
		btnDuyurular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDuyurular.setForeground(Color.CYAN);
				btnIzinler.setForeground(Color.WHITE);
				btndemeler.setForeground(Color.WHITE);
				btnMesajlar.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.WHITE);

				btnNewButton.setForeground(Color.WHITE);
				btnDuyurular.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
				btnNewButton.setBorder(null);
				btndemeler.setBorder(null);
				btnMesajlar.setBorder(null);
				btnetkin.setBorder(null);
				btnIzinler.setBorder(null);
				panels.setVisible(false);
				izinpage.setVisible(false);
				mesajpage.setVisible(false);
				etkinlik.setVisible(false);
				odemepage.setVisible(false);
				duyurupage.setVisible(true);
				
				panel_1.add(duyurupage);
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setForeground(Color.CYAN);
				btnDuyurular.setForeground(Color.WHITE);
				btndemeler.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.WHITE);

				btnMesajlar.setForeground(Color.WHITE);
				btnIzinler.setForeground(Color.WHITE);
				btnNewButton.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
				btnDuyurular.setBorder(null);
				btnetkin.setBorder(null);
				btndemeler.setBorder(null);
				btnMesajlar.setBorder(null);
				btnIzinler.setBorder(null);
				mesajpage.setVisible(false);
				izinpage.setVisible(false);
				duyurupage.setVisible(false);
				odemepage.setVisible(false);
				etkinlik.setVisible(false);
				panels.setVisible(true);
			
			}
		});
		btndemeler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btndemeler.setForeground(Color.CYAN);
				btnIzinler.setForeground(Color.WHITE);
				btnDuyurular.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.WHITE);

				btnMesajlar.setForeground(Color.WHITE);
				btnNewButton.setForeground(Color.WHITE);
				
				btndemeler.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
				panel_1.add(odemepage);
				btnDuyurular.setBorder(null);
				btnNewButton.setBorder(null);
				btnMesajlar.setBorder(null);
				btnetkin.setBorder(null);
				btnIzinler.setBorder(null);
				mesajpage.setVisible(false);
				etkinlik.setVisible(false);
				panels.setVisible(false);
				izinpage.setVisible(false);
				duyurupage.setVisible(false);
				odemepage.setVisible(true);
			}
		});
		btnMesajlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMesajlar.setForeground(Color.CYAN);
				btnIzinler.setForeground(Color.WHITE);
				btnetkin.setForeground(Color.WHITE);

				btnDuyurular.setForeground(Color.WHITE);
				btndemeler.setForeground(Color.WHITE);
				btnNewButton.setForeground(Color.WHITE);
				
				btnMesajlar.setBorder(new MatteBorder(0, 0, 0, 2, (Color) Color.CYAN));
			
				btnDuyurular.setBorder(null);
				btnNewButton.setBorder(null);
				btndemeler.setBorder(null);
				btnIzinler.setBorder(null);
				btnetkin.setBorder(null);
				panels.setVisible(false);
				izinpage.setVisible(false);
				duyurupage.setVisible(false);
				etkinlik.setVisible(false);
				odemepage.setVisible(false);
				panel_1.add(mesajpage);
				mesajpage.setVisible(true);
				
			}
		});
	
	}
}
