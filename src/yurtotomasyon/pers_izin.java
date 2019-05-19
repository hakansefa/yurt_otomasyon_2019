package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import keeptoo.KButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import keeptoo.KGradientPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pers_izin extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtTcGiriniz;
	private JTextField txtAdSoyad;
	private JTextField txtoda;
	private JTextField txtokul;
	private JTextField txtYl;
	DefaultListModel<String> listModel = new DefaultListModel();
	DefaultListModel<String> listModel2 = new DefaultListModel();
	private JTextField txttarih;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_izin frame = new pers_izin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_izin() {

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);


		setLayout(null);

		JLabel lblNewLabel = new JLabel("\u0130Z\u0130N B\u0130LG\u0130LER\u0130");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);


		txtTcGiriniz = new JTextField();
		txtTcGiriniz.setForeground(Color.WHITE);
		txtTcGiriniz.setEditable(false);
		txtTcGiriniz.setOpaque(false);
		txtTcGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTcGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtTcGiriniz.setText("TCNO");
		txtTcGiriniz.setBounds(457, 143, 285, 34);

		txtTcGiriniz.setColumns(10);
		add(txtTcGiriniz);
		txtAdSoyad = new JTextField();
		txtAdSoyad.setForeground(Color.WHITE);
		txtAdSoyad.setEditable(false);
		txtAdSoyad.setOpaque(false);
		txtAdSoyad.setText("AD SOYAD");
		txtAdSoyad.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAdSoyad.setColumns(10);
		txtAdSoyad.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdSoyad.setBounds(457, 198, 285, 34);
		add(txtAdSoyad);


		txtoda = new JTextField();
		txtoda.setForeground(Color.WHITE);
		txtoda.setOpaque(false);

		txtoda.setText("Oda_no");
		txtoda.setFont(new Font("Purisa", Font.BOLD, 16));
		txtoda.setColumns(10);
		txtoda.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtoda.setBounds(457, 256, 285, 34);
		add(txtoda);

		txtokul = new JTextField();
		txtokul.setForeground(Color.WHITE);
		txtokul.setOpaque(false);

		txtokul.setText("A\u00C7IKLAMA");
		txtokul.setFont(new Font("Purisa", Font.BOLD, 16));
		txtokul.setColumns(10);
		txtokul.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtokul.setBounds(457, 312, 285, 34);

		add(txtokul);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(28, 125, 176, 224);
		add(scrollPane);

		JList list = new JList();

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		list.setSelectedIndex(0);
		scrollPane.setViewportView(list);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kEndColor = SystemColor.textInactiveText;
		gradientPanel.kStartColor = SystemColor.controlShadow;
		gradientPanel.setBounds(0, 0, 847, 413);
		add(gradientPanel);
		gradientPanel.setLayout(null);

		KButton button_1 = new KButton();
		
		button_1.setBounds(174, 357, 463, 45);
		gradientPanel.add(button_1);

		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Öðrenci Detaylarýný Ýncele");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		
				JLabel label = new JLabel("");
				label.setBounds(547, 35, 90, 90);
				gradientPanel.add(label);
				label.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\22.png"));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setBackground(Color.WHITE);
				
				txttarih = new JTextField();
				txttarih.setText("tarih");
				txttarih.setOpaque(false);
				txttarih.setForeground(Color.WHITE);
				txttarih.setFont(new Font("Dialog", Font.BOLD, 16));
				txttarih.setEditable(false);
				txttarih.setColumns(10);
				txttarih.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
				txttarih.setBounds(66, 77, 285, 34);
				gradientPanel.add(txttarih);
				
				
				Date simdikiZaman = new Date();
		        System.out.println(simdikiZaman.toString());
		        DateFormat df = new SimpleDateFormat("dd/M/yyyy");
		        System.out.println(df.format(simdikiZaman));
		        txttarih.setText(df.format(simdikiZaman));
		        
		        JScrollPane scrollPane_1 = new JScrollPane();
		        scrollPane_1.setViewportBorder(null);
		        scrollPane_1.setBounds(203, 125, 176, 224);
		        gradientPanel.add(scrollPane_1);
		        
		        JList list_1 = new JList();
		        list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		        list_1.setSelectedIndex(0);
		        scrollPane_1.setViewportView(list_1);

		try {
			Connection con = connection.getConnection();
			int a=(list.getSelectedIndex()+1);
			PreparedStatement sorgu = con.prepareStatement("select   * from ogrenciler inner join izinler on ogrenciler.ogr_id=izinler.ogrenciler_ogr_id where izin_tarihi like '%"+txttarih.getText()+"%'");


			ResultSet sonuc = sorgu.executeQuery();

			while(sonuc.next()) {
				listModel.addElement(sonuc.getString("ogr_ad"));
				listModel.addElement("-----------------");
				
			}

			list.setModel(listModel);
			list.setSelectedIndex(0);
		} catch (Exception e2) {
			System.out.print(e2);
		}
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String ad =(String) list.getSelectedValue();
					Connection con = connection.getConnection();
					int a=(list.getSelectedIndex()+1);

					PreparedStatement sorgu = con.prepareStatement("select  distinct * from ogrenciler inner join universite on ogrenciler.universite_uni_id=universite.uni_id inner join Odalar on ogrenciler.Odalar_oda_id=odalar.oda_id where ogrenciler.ogr_ad='"+ad+"'");


					ResultSet sonuc = sorgu.executeQuery();

					while(sonuc.next()) {
                    txtTcGiriniz.setText(sonuc.getString("ogr_tc"));
                    txtAdSoyad.setText(sonuc.getString("ogr_ad"));
                    txtokul.setText(sonuc.getString("uni_ad"));
                    txtoda.setText(sonuc.getString("oda_kod"));
                    
                    
                    label.setIcon(new ImageIcon(sonuc.getString("profil_photo")));
					}


				} catch (Exception e2) {
					System.out.print(e2);
				}


			}

		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ad =(String) list.getSelectedValue();
					Connection con = connection.getConnection();
					int a=(list.getSelectedIndex()+1);

					PreparedStatement sorgu = con.prepareStatement("select  distinct * from ogrenciler inner join universite on ogrenciler.universite_uni_id=universite.uni_id inner join Odalar on ogrenciler.Odalar_oda_id=odalar.oda_id inner join bolumler on ogrenciler.Bolumler_bolum_id=bolumler.bolum_id where ogrenciler.ogr_ad ='"+ad+"'");


					ResultSet sonuc = sorgu.executeQuery();

					while(sonuc.next()) {
                  
                    
                  
                   
                    listModel2.addElement("tel : "+sonuc.getString("ogr_tel"));
                    listModel2.addElement("email_: "+sonuc.getString("ogr_email"));
                    listModel2.addElement("Kayýt Tarihi : "+sonuc.getString("kayittarihi"));
                    listModel2.addElement("Bölüm :"+sonuc.getString("bolum_ad"));
                    listModel2.addElement("Kat :" +sonuc.getString("oda_kat"));
                    listModel2.addElement("Yatak Sayýsý :"+ sonuc.getString("oda_yatak"));
    				listModel2.addElement("-----------------");
                    
         
					}


				} catch (Exception e2) {
					System.out.print(e2);
				}
				list_1.setModel(listModel2);
				list_1.setSelectedIndex(0);
			}
		});

	}
}
