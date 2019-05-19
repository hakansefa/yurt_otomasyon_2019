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
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class duyurupage extends JPanel {
	DefaultListModel<String> listModel = new DefaultListModel();
	private JTextField txtrenciAd;
	private JTextField txtTcGiriniz;
	private JTextField txtYl;
	private JTextField txtOnaylama;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					duyurupage frame = new duyurupage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public duyurupage() {
		setBackground(new Color (216,204,192));
		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DUYURULAR");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		txtTcGiriniz = new JTextField();
		txtTcGiriniz.setOpaque(false);
		txtTcGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTcGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtTcGiriniz.setText("TAR\u0130H ARALI\u011EI G\u0130R\u0130N");
		txtTcGiriniz.setBounds(28, 84, 285, 34);
		
		txtTcGiriniz.setColumns(10);
		add(txtTcGiriniz);
		
		
		
		txtOnaylama = new JTextField();
		txtOnaylama.setOpaque(false);

		txtOnaylama.setText("YAYINLAYAN");
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
		button_1.setText("Duyuru Ýncele");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 130, 275, 203);
		add(scrollPane);
		
		JList list = new JList();
		
		list.setOpaque(false);
		list.setFont(new Font("Ubuntu", Font.BOLD, 16));
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(457, 130, 275, 165);
		add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		scrollPane_1.setViewportView(textArea);
		
		try {
			int a = list.getSelectedIndex()+2;
			System.out.print(a);
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.duyuru");
			PreparedStatement sorgu2 = con.prepareStatement("Select count(ogrenciler_ogr_id) as say from etk_say where etkinlik_etkinlik_id="+a+"");
			
			ResultSet sonuc = sorgu.executeQuery();

			ResultSet sonuc2 = sorgu2.executeQuery();
			while(sonuc.next()) {
			
			listModel.addElement(sonuc.getString("duyuru_baslik"));

			}
			while(sonuc2.next()) {
				
				
				
				
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
					PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.duyuru INNER JOIN personel ON duyuru.personel_personel_id = personel.personel_id where duyuru.duyuru_id="+a+"");
					PreparedStatement sorgu2 = con.prepareStatement("Select count(ogrenciler_ogr_id) as say from etk_say where etkinlik_etkinlik_id="+a+"");
					
					ResultSet sonuc = sorgu.executeQuery();

					ResultSet sonuc2 = sorgu2.executeQuery();
					while(sonuc.next()) {
					
						textArea.setText(sonuc.getString("duyuru")+"\n"+sonuc.getString("duyuru_tarihi")+"\n---------\n");
						txtOnaylama.setText(sonuc.getString("personel_ad")+" "+sonuc.getString("personel_soyad"));
						

					}
					while(sonuc2.next()) {
						
						
						
						
						}
				
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});


	}
}
