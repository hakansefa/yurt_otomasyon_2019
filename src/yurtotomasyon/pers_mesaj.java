package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import keeptoo.KTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class pers_mesaj extends JPanel {
    String tc;
	private JTextField txtrenciAd;
	private JTextField txtYl;
	private JTextField textField;

	String [] dizi = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_mesaj frame = new pers_mesaj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_mesaj() {
		setBackground(new Color(240, 240, 240));
	

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MESAJLAR");
		lblNewLabel.setBounds(47, 12, 209, 44);
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		add(lblNewLabel);
		
		KButton button_1 = new KButton();
		button_1.kAllowTab = false;
		button_1.setOpaque(false);
		button_1.setBorder(null);
		button_1.setBounds(264, 356, 285, 45);
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Konuþma Baþlat");
		button_1.kBorderRadius=60;
	
		add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 65, 471, 266);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Ubuntu", Font.BOLD, 12));
		textArea.setBounds(0, 24, 468, 195);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(0, 216, 468, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 346, 23);
		panel_1.add(textField);
		textField.setColumns(10);
		
		KButton button_4 = new KButton();
		button_4.kHoverStartColor = SystemColor.text;
		button_4.setBounds(370, 12, 86, 23);
		panel_1.add(button_4);
		button_4.kAllowTab = false;
		button_4.setOpaque(false);
		button_4.setBorder(null);
		button_4.setText("Gönder");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(0, 0, 468, 25);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("....  ÝLE KONUSUYOR");
		lblNewLabel_1.setBounds(168, 0, 164, 15);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_3.setBounds(12, 65, 315, 266);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("KÝÞÝLER");
		lblNewLabel_2.setBounds(133, 11, 114, 15);
		panel_3.add(lblNewLabel_2);
		DefaultListModel<String> listModel = new DefaultListModel();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 32, 295, 223);
		panel_3.add(scrollPane_1);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		scrollPane_1.setViewportView(list);
		try {
			int a=0;
				File file = new File("tc.txt");
				FileReader fileReader = new FileReader(file);
				String line;

				BufferedReader br = new BufferedReader(fileReader);

				while ((line = br.readLine()) != null) {

				   tc=line;

				}

				br.close();
			
				Connection con = connection.getConnection();
				PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.ogrenciler,yurtdb.personel");
				ResultSet sonuc = sorgu.executeQuery();
				while(sonuc.next()) {
					listModel.addElement(sonuc.getString("ogr_ad"));
					listModel.addElement(sonuc.getString("personel_ad"));
				
		}
				list.setModel(listModel);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
