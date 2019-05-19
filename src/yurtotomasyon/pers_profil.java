package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import keeptoo.KGradientPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class pers_profil extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtnumara;
	private JTextField txttc;
	private JTextField txtYl;
	private JTextField txttel;
	private JTextField txtkayit;
	private JScrollPane scrollPane;
	private JList list;
	private JTextField txtAdSoyad;
	private JLabel lblfotoico;
	private ImageIcon format = null;
	String tc;
	
	DefaultListModel<String> listModel = new DefaultListModel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_profil frame = new pers_profil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_profil() {

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblas = new JLabel("\u00D6\u011ERENC\u0130 \u0130\u015ELEMLER\u0130");
		lblas.setForeground(new Color(0, 191, 255));
		lblas.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblas.setBounds(47, 12, 209, 44);
		add(lblas);
		
		
		txtnumara = new JTextField();
		txtnumara.setForeground(Color.WHITE);
		txtnumara.setOpaque(false);

		txtnumara.setText("Numara");
		txtnumara.setFont(new Font("Purisa", Font.BOLD, 16));
		txtnumara.setColumns(10);
		txtnumara.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtnumara.setBounds(486, 248, 285, 34);
		add(txtnumara);
		
		txttc = new JTextField();
		txttc.setForeground(Color.WHITE);
		txttc.setOpaque(false);

		txttc.setText("TC");
		txttc.setFont(new Font("Purisa", Font.BOLD, 16));
		txttc.setColumns(10);
		txttc.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txttc.setBounds(486, 203, 285, 34);
		
		add(txttc);
		
		
		
		txttel = new JTextField();
		txttel.setForeground(Color.WHITE);
		txttel.setOpaque(false);

		txttel.setText("TELEFON");
		txttel.setFont(new Font("Purisa", Font.BOLD, 16));
		txttel.setColumns(10);
		txttel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txttel.setBounds(486, 293, 285, 34);
		add(txttel);
		
		KButton button_1 = new KButton();
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setBounds(264, 356, 285, 45);
		button_1.setOpaque(false);
		button_1.setBorder(null);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("GÜNCELLE");
		button_1.kBorderRadius=60;
		add(button_1);
		
		KButton button = new KButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yenikayit ogrkayit = new yenikayit ();
				ogrkayit.setVisible(true);
			}
		});
		button.setText("YENÝ EKLE");
		button.kHoverForeGround = Color.YELLOW;
		button.setkHoverForeGround(Color.YELLOW);
		button.kHoverEndColor = new Color(135, 206, 235);
		button.setkHoverEndColor(new Color(135, 206, 235));
		button.kEndColor = new Color(64, 224, 208);
		button.setkEndColor(new Color(64, 224, 208));
		button.setkBorderRadius(30);
		button.kAllowTab = false;
		button.setFont(new Font("Purisa", Font.BOLD, 16));
		button.setkAllowTab(false);
		button.setBorder(null);
		button.setOpaque(false);
		button.kBorderRadius=30;
		button.setBounds(46, 298, 137, 45);
		add(button);
		
		KButton button2 = new KButton();
		button2.setText("SÝL");
		button2.kHoverForeGround = Color.YELLOW;
		button2.setkHoverForeGround(Color.YELLOW);
		button2.kHoverEndColor = new Color(135, 206, 235);
		button2.setkHoverEndColor(new Color(135, 206, 235));
		button2.kEndColor = new Color(64, 224, 208);
		button2.setkEndColor(new Color(64, 224, 208));
		button2.setkBorderRadius(30);
		button2.kAllowTab = false;
		button2.setFont(new Font("Purisa", Font.BOLD, 16));
		button2.setkAllowTab(false);
		button2.setBorder(null);
		button2.setOpaque(false);
		button2.kBorderRadius=30;
		button2.setBounds(193, 298, 137, 45);
		add(button2);
		
		txtkayit = new JTextField();
		txtkayit.setEditable(false);
		txtkayit.setForeground(Color.WHITE);
		txtkayit.setText("Kay\u0131t Tarihi");
		txtkayit.setOpaque(false);
		txtkayit.setFont(new Font("Purisa", Font.BOLD, 16));
		txtkayit.setColumns(10);
		txtkayit.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtkayit.setBounds(486, 158, 285, 34);
		add(txtkayit);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(21, 93, 343, 194);
		add(scrollPane);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		
		scrollPane.setViewportView(list);
		
		txtAdSoyad = new JTextField();
		txtAdSoyad.setForeground(Color.WHITE);
		txtAdSoyad.setText("AD SOYAD");
		txtAdSoyad.setOpaque(false);
		txtAdSoyad.setFont(new Font("Dialog", Font.BOLD, 16));
		txtAdSoyad.setColumns(10);
		txtAdSoyad.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdSoyad.setBounds(486, 113, 285, 34);
		add(txtAdSoyad);
		
		lblfotoico = new JLabel("");
		lblfotoico.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\cam.png"));
		lblfotoico.setHorizontalAlignment(SwingConstants.CENTER);
		lblfotoico.setBackground(Color.WHITE);
		lblfotoico.setBounds(585, 12, 90, 90);
		add(lblfotoico);
		
		try {
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.ogrenciler");
			
			
			ResultSet sonuc = sorgu.executeQuery();
			
			while(sonuc.next()) {
			
			listModel.addElement(sonuc.getString("ogr_ad"));
			
			
			
			}
			list.setModel(listModel);
			list.setSelectedIndex(0);
			
			KGradientPanel gradientPanel = new KGradientPanel();
			gradientPanel.kStartColor = SystemColor.controlShadow;
			gradientPanel.kEndColor = SystemColor.textInactiveText;
			gradientPanel.setBounds(0, 0, 847, 413);
			add(gradientPanel);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		txtnumara.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtnumara.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txttc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txttc.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txttel.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
	
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			  
			}
		});
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  try {
				    	Connection con = connection.getConnection();
				    	int a=(list.getSelectedIndex()+1);
						PreparedStatement sorgu = con.prepareStatement("Select * from ogrenciler where ogr_id='"+a+"'");
						
						
						ResultSet sonuc = sorgu.executeQuery();
						
						while(sonuc.next()) {
						txtAdSoyad.setText(sonuc.getString("ogr_ad"));
						txtnumara.setText(sonuc.getString("ogr_id"));
						txtkayit.setText(sonuc.getString("kayittarihi"));
						txttc.setText(sonuc.getString("ogr_tc"));
						txttel.setText(sonuc.getString("ogr_tel"));
						String imagedata = sonuc.getString("profil_photo");
						lblfotoico.setIcon(new ImageIcon (imagedata));
						
						
						
						}
					
					
						
					} catch (Exception e2) {
						
					}
			}
		});
		

	}
}
