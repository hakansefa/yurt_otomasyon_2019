package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.mysql.jdbc.Connection;

import keeptoo.KButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class izinpage extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtTcGiriniz;
	private JTextField txtAdresGiriniz;
	private JTextField txtAklama;
	private JTextField txtYl;
	private JTextField txttarih;
	String tc;
    int id;
    DefaultListModel<String> listModel = new DefaultListModel();
    int maxid;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					izinpage frame = new izinpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public izinpage() {
		setBackground(new Color (216,204,192));

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0130Z\u0130N B\u0130LG\u0130LER\u0130");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		txtTcGiriniz = new JTextField();
		txtTcGiriniz.setOpaque(false);
		txtTcGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTcGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtTcGiriniz.setText("TCNO");
		txtTcGiriniz.setBounds(28, 84, 285, 34);
		
		txtTcGiriniz.setColumns(10);
		add(txtTcGiriniz);
		
		
		txtAdresGiriniz = new JTextField();
		txtAdresGiriniz.setOpaque(false);

		txtAdresGiriniz.setText("ADRES B\u0130LG\u0130S\u0130 G\u0130R\u0130N\u0130Z ");
		txtAdresGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAdresGiriniz.setColumns(10);
		txtAdresGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdresGiriniz.setBounds(28, 226, 285, 34);
		add(txtAdresGiriniz);
		
		txtAklama = new JTextField();
		txtAklama.setOpaque(false);

		txtAklama.setText("A\u00C7IKLAMA");
		txtAklama.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAklama.setColumns(10);
		txtAklama.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAklama.setBounds(28, 299, 285, 34);
		
		add(txtAklama);
		
		
		
		txttarih = new JTextField();
		txttarih.setOpaque(false);

		txttarih.setText("G\u00DCN-AY-YIL");
		txttarih.setFont(new Font("Purisa", Font.BOLD, 16));
		txttarih.setColumns(10);
		txttarih.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txttarih.setBounds(28, 152, 285, 34);
		add(txttarih);
		
		KButton button_1 = new KButton();
	
		
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setBounds(28, 357, 285, 45);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Ýzin Al");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		add(button_1);
		
		KButton button_2 = new KButton();
		button_2.setText("Ýzin Ýptal Et");
		button_2.kHoverForeGround = Color.YELLOW;
		button_2.setkHoverForeGround(Color.YELLOW);
		button_2.kHoverEndColor = new Color(135, 206, 235);
		button_2.setkHoverEndColor(new Color(135, 206, 235));
		button_2.kEndColor = new Color(64, 224, 208);
		button_2.setkEndColor(new Color(64, 224, 208));
		button_2.setFont(new Font("Purisa", Font.BOLD, 16));
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
		
		button_2.setBorder(null);
		button_2.setOpaque(false);
		button_2.kBorderRadius = 30;
		button_2.setkBorderRadius(30);
		button_2.kAllowTab = false;
		button_2.setkAllowTab(false);
		button_2.setBounds(404, 357, 378, 45);
		add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("Sadece bug\u00FCn i\u00E7in izin al\u0131nabilir !");
		lblNewLabel_1.setBounds(187, 30, 218, 14);
		add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(389, 84, 416, 249);
		add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		scrollPane.setViewportView(list);
		
		txtTcGiriniz.setText(tc);
		txtTcGiriniz.setEditable(false);
		Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd/M/yyyy");
        System.out.println(df.format(simdikiZaman));
        txttarih.setText(df.format(simdikiZaman));
        try {
        	JSeparator den = new JSeparator();
			den.setBounds(389, 55, 416, 0);
			add(den);
        	Connection con = (Connection) connection.getConnection();
			PreparedStatement sorgu4 = con.prepareStatement("select   * from ogrenciler inner join izinler on ogrenciler.ogr_id=izinler.ogrenciler_ogr_id  where ogrenciler.ogr_tc='"+tc+"' ORDER BY izinler.izin_tarihi ASC ");


			ResultSet sonuc4 = sorgu4.executeQuery();

			while(sonuc4.next()) {
				listModel.addElement("Ýzin Tarihi   : "+sonuc4.getString("izin_tarihi"));
				listModel.addElement("Ýzin Açýklama : "+sonuc4.getString("izin_aciklama"));
				listModel.addElement("Ýzin Adresi : "+sonuc4.getString("izin_Adres"));
				listModel.addElement("------------");
			   
			}
            
			list.setModel(listModel);
			list.setSelectedIndex(0);
			
			
		} catch (Exception e) {
			System.out.print(e);
		}
       

		button_1.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = (Connection) connection.getConnection();
				
					
					PreparedStatement sorgu = con.prepareStatement("Select ogr_id from ogrenciler where ogr_tc ="+tc+"");
					PreparedStatement sorgu3 = con.prepareStatement("Select max(izin_id) as max from izinler");
				
					
					ResultSet sonuc = sorgu.executeQuery();
					ResultSet sonuc3 = sorgu3.executeQuery();
					
					
					while(sonuc.next()) {
                     id=Integer.parseInt(sonuc.getString("ogr_id"));
					} 
					while(sonuc3.next()) {
                    maxid=Integer.parseInt(sonuc3.getString("max"));
                    maxid++;
					}
					
					PreparedStatement sorgu2 = con.prepareStatement("INSERT INTO `yurtdb`.`izinler` (`izin_id`, `ogrenciler_ogr_id`, `izin_tarihi`, `izin_aciklama`,`izin_Adres`) VALUES ('"+maxid+"', '"+id+"', '"+txttarih.getText()+"', '"+txtAklama.getText()+"','"+txtAdresGiriniz.getText()+"');");
					sorgu2.executeUpdate();
					
					
					
					
				} catch (Exception e2) {
				System.out.print(e2);
				}
				list.repaint();
			}
		});
	}
}
