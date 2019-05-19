package yurtotomasyon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

import com.mysql.jdbc.Connection;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.ImageIcon;

import keeptoo.KButton;
import keeptoo.KGradientPanel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;

public class yenikayit extends JFrame {
	DefaultListModel<String> listModel = new DefaultListModel();
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txttc;
	private JTextField txttel;
	private JTextField txtKayitTarihi;
	private JTextField txtemail;
	private JTextField txtad;
	private JTextField txtucret;
	private JLabel label_1;
	private JTextField textField;
	private ImageIcon format =null;
	String filename = null;
	int s =0;
	byte [] foto = null;
	int a;
	private JComboBox cmboda;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yenikayit frame = new yenikayit();
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
	public yenikayit() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\depositphotos_90393430-stock-illustration-student-reading-book-rounded-vector.jpg"));
		setTitle("\u00D6\u011Frenci Ekle");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 847, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(42, 44, 90, 90);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Maksimum 90x90 Boyutunda Foto\u011Fraf Ekleyiniz !");
		lblNewLabel.setBounds(142, 50, 326, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Foto\u011Fraf Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				 filename = f.getAbsolutePath();
				try {
					File image = new File(filename);
					FileInputStream fis = new FileInputStream(image);
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					byte[] buf = new byte[100000];
					for(int readNum;(readNum=fis.read(buf))!=-1; ) {
						bos.write(buf,0,readNum);
					}
					foto=bos.toByteArray();
					label.setIcon(new ImageIcon(filename));
				  
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
		}
		});
		btnNewButton.setBounds(143, 107, 125, 23);
		contentPane.add(btnNewButton);
		
		txttc = new JTextField();
		txttc.setForeground(Color.WHITE);
		txttc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txttc.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txttc.setText("T.C");
		txttc.setOpaque(false);
		txttc.setFont(new Font("Dialog", Font.BOLD, 16));
		txttc.setColumns(10);
		txttc.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txttc.setBounds(42, 166, 285, 34);
		contentPane.add(txttc);
		
		txttel = new JTextField();
		txttel.setForeground(Color.WHITE);
		txttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txttel.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txttel.setText("telefon");
		txttel.setOpaque(false);
		txttel.setFont(new Font("Dialog", Font.BOLD, 16));
		txttel.setColumns(10);
		txttel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txttel.setBounds(42, 295, 285, 34);
		contentPane.add(txttel);
		
		txtKayitTarihi = new JTextField();
		txtKayitTarihi.setForeground(Color.WHITE);
		txtKayitTarihi.setEditable(false);
		txtKayitTarihi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtKayitTarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtKayitTarihi.setText("Kayit Tarihi");
		txtKayitTarihi.setOpaque(false);
		txtKayitTarihi.setFont(new Font("Dialog", Font.BOLD, 16));
		txtKayitTarihi.setColumns(10);
		txtKayitTarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtKayitTarihi.setBounds(477, 228, 285, 34);
		contentPane.add(txtKayitTarihi);
		
		txtemail = new JTextField();
		txtemail.setForeground(Color.WHITE);
		txtemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtemail.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtemail.setText("email");
		txtemail.setOpaque(false);
		txtemail.setFont(new Font("Dialog", Font.BOLD, 16));
		txtemail.setColumns(10);
		txtemail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtemail.setBounds(42, 493, 285, 34);
		contentPane.add(txtemail);
		
		txtad = new JTextField();
		txtad.setForeground(Color.WHITE);
		txtad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtad.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtad.setText("adSoyad");
		txtad.setOpaque(false);
		txtad.setFont(new Font("Dialog", Font.BOLD, 16));
		txtad.setColumns(10);
		txtad.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtad.setBounds(42, 228, 285, 34);
		contentPane.add(txtad);
		
		txtucret = new JTextField();
		txtucret.setForeground(Color.WHITE);
		txtucret.setText("TotalUcret");
		txtucret.setOpaque(false);
		txtucret.setFont(new Font("Dialog", Font.BOLD, 16));
		txtucret.setColumns(10);
		txtucret.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtucret.setBounds(477, 426, 285, 34);
		contentPane.add(txtucret);
		Random r = new Random();
		String abc ;
		abc = Integer.toString(r.nextInt(99999999));
		
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 831, 558);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		KButton button_4 = new KButton();
		
		
		button_4.kHoverStartColor = SystemColor.text;
		button_4.setBounds(485, 495, 277, 34);
		button_4.setFont(new Font("Purisa", Font.BOLD, 16));
		gradientPanel.add(button_4);
		button_4.kAllowTab = false;
		button_4.setOpaque(false);
		button_4.setBorder(null);
		button_4.setText("KAYIT EKLE");
		label_1 = new JLabel("");
		label_1.setBounds(466, 11, 303, 128);
		gradientPanel.add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image.png"));
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setText("adres");
		textField.setOpaque(false);
		textField.setFont(new Font("Dialog", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		textField.setBounds(477, 167, 285, 34);
		gradientPanel.add(textField);
		
		JComboBox cmbbol = new JComboBox();
		cmbbol.setForeground(Color.CYAN);
		
		
		cmbbol.setOpaque(false);
		cmbbol.setBorder(BorderFactory.createEmptyBorder());
		cmbbol.setModel(new DefaultComboBoxModel(new String[] {"B\u00F6l\u00FCmler"}));
		cmbbol.setSelectedIndex(0);
		cmbbol.setFont(new Font("Dialog", Font.BOLD, 16));
		cmbbol.setBounds(41, 356, 285, 34);
		gradientPanel.add(cmbbol);
		cmbbol.setOpaque(false);
		cmbbol.setRenderer(new DefaultListCellRenderer(){
		    @Override
		    public Component getListCellRendererComponent(JList list, Object value,
		            int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		        result.setOpaque(false);
		        result.setBorder(null);
		        return result;
		    }});
		
		JComboBox cmbuni = new JComboBox();
		cmbuni.setForeground(Color.CYAN);
		cmbuni.setFont(new Font("Dialog", Font.BOLD, 16));
		cmbuni.setModel(new DefaultComboBoxModel(new String[] {"\u00DCniversiteler"}));
		cmbuni.setBounds(477, 291, 285, 34);
		gradientPanel.add(cmbuni);
		cmbuni .setOpaque(false);
		cmbuni.setRenderer(new DefaultListCellRenderer(){
		    @Override
		    public Component getListCellRendererComponent(JList list, Object value,
		            int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		        result.setOpaque(false);
		        result.setBorder(null);
		        return result;
		    }});
		
		JComboBox cmbsinif = new JComboBox();
		cmbsinif.setFont(new Font("Dialog", Font.BOLD, 16));
		cmbsinif.setModel(new DefaultComboBoxModel(new String[] {"S\u0131n\u0131f"}));
		cmbsinif.setForeground(Color.CYAN);
		cmbsinif.setBounds(477, 356, 285, 34);
		gradientPanel.add(cmbsinif);
		cmbsinif .setOpaque(false);
		cmbsinif.setRenderer(new DefaultListCellRenderer(){
		    @Override
		    public Component getListCellRendererComponent(JList list, Object value,
		            int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		        result.setOpaque(false);
		        result.setBorder(null);
		        return result;
		    }});
		
		cmboda = new JComboBox();
		cmboda.setModel(new DefaultComboBoxModel(new String[] {"Oda"}));
		cmboda.setForeground(Color.CYAN);
		cmboda.setOpaque(false);
		cmboda.setFont(new Font("Dialog", Font.BOLD, 16));
		cmboda.setBorder(BorderFactory.createEmptyBorder());
		cmboda.setBounds(41, 426, 285, 34);
		gradientPanel.add(cmboda);
		cmboda.setOpaque(false);
		cmboda.setRenderer(new DefaultListCellRenderer(){
		    @Override
		    public Component getListCellRendererComponent(JList list, Object value,
		            int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		        result.setOpaque(false);
		        result.setBorder(null);
		        return result;
		    }});
		
		
		try {
			Connection con = (Connection) connection.getConnection();

			PreparedStatement sorgu2 = con.prepareStatement("Select uni_ad  from universite");
			PreparedStatement sorgu = con.prepareStatement("Select bolum_ad  from bolumler");
			PreparedStatement sorgu3 = con.prepareStatement("Select sinif  from siniflar");
			PreparedStatement sorgu4 = con.prepareStatement("Select *  from odalar");
			
			ResultSet sonuc = sorgu.executeQuery();
			ResultSet sonuc2 = sorgu2.executeQuery();
			ResultSet sonuc3 = sorgu3.executeQuery();
			ResultSet sonuc4 = sorgu4.executeQuery();
			while(sonuc2.next()) {
			 		cmbuni.addItem(sonuc2.getString("uni_ad"));	
			}
			while(sonuc.next()) {
		 		cmbbol.addItem(sonuc.getString("bolum_ad"));	
		}
			while(sonuc3.next()) {
		 		cmbsinif.addItem(sonuc3.getString("sinif"));	
		}
			while(sonuc4.next()) {
		 		cmboda.addItem(sonuc4.getString("oda_kod")+"   "+sonuc4.getString("oda_yatak")+" Yataklý"+"  "+sonuc4.getString("oda_kat")+".Katta");	
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = (Connection) connection.getConnection();
				
					PreparedStatement sorgu2 = con.prepareStatement("Select max(ogr_id) as max from ogrenciler");
					
				
					ResultSet sonuc2 = sorgu2.executeQuery();
	
					while(sonuc2.next()) {
					a = Integer.parseInt(sonuc2.getString("max"));
					a++;
					
					
					}
					System.out.println(filename);
					PreparedStatement sorgu = con.prepareStatement("INSERT INTO `yurtdb`.`ogrenciler` (`ogr_id`, `ogr_tc`, `ogr_ad`, `ogr_sifre`, `ogr_tel`, `ogr_email`, `kayittarihi`, `universite_uni_id`, `Bolumler_bolum_id`, `siniflar_sinif_id`, `Odalar_oda_id`, `profil_photo`) VALUES ('"+a+"', '"+txttc.getText()+"', '"+txtad.getText()+"', '"+abc+"', '"+txttel.getText()+"', '"+txtemail.getText()+"', '"+txtKayitTarihi.getText()+"', '"+(cmbuni.getSelectedIndex()+1)+"', '"+(cmbbol.getSelectedIndex()+1)+"', '"+(cmbsinif.getSelectedIndex()+1)+"', '"+(cmboda.getSelectedIndex()+1)+"','"+filename+"'");
					 sorgu.executeUpdate();
				} catch (Exception e2) {
					System.out.print(e2);
				System.out.print(e2);
				}
				
				
			}
		});
	}
	
}
