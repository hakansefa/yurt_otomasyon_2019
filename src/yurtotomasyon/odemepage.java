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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

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
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class JTextFieldLimit extends PlainDocument {
	  private int limit;
	  JTextFieldLimit(int limit) {
	    super();
	    this.limit = limit;
	  }

	  JTextFieldLimit(int limit, boolean upper) {
	    super();
	    this.limit = limit;
	  }

	  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	    if (str == null)
	      return;

	    if ((getLength() + str.length()) <= limit) {
	      super.insertString(offset, str, attr);
	    }
	  }
	}
public class odemepage extends JPanel {
	int max;
	String id;
	String tc;
	int maxkart;
	DefaultListModel<String> listModel = new DefaultListModel();
	int i =0;
	private JTextField txtrenciAd;
	private JTextField txtYl;
	private JScrollPane scrollPane;
	private JList list;
	private JTextField textField;
	private JTextField txtOdemetarihi;
	private JTextField txtTutar;
	private JTextField txtKartNp;
	private JTextField txtAklama;
	private JTextField txtCcv;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odemepage frame = new odemepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public odemepage() {
		setBackground(new Color (216,204,192));
		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);

		
		setLayout(null);

		JLabel lblNewLabel = new JLabel("\u00D6DEME B\u0130LG\u0130LER\u0130");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);

		KButton button_1 = new KButton();
	
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = new Color(135, 206, 235);
		button_1.kHoverForeGround = new Color(255, 255, 0);
		button_1.kEndColor = new Color(64, 224, 208);
		button_1.setBounds(264, 356, 285, 45);
		button_1.setOpaque(false);
		button_1.setBorder(null);
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Ödeme Yap");
		button_1.kBorderRadius=60;
		add(button_1);

		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(589, 86, 201, 259);
		add(scrollPane);

		list = new JList();
		list.setOpaque(false);
		list.setFont(new Font("Dialog", Font.BOLD, 14));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

		textField = new JTextField();
		textField.setText("AD SOYAD");
		textField.setOpaque(false);
		textField.setFont(new Font("Dialog", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		textField.setBounds(47, 182, 225, 34);
		add(textField);

		txtOdemetarihi = new JTextField();
		txtOdemetarihi.setEditable(false);
		txtOdemetarihi.setText("odemetarihi");
		txtOdemetarihi.setOpaque(false);
		txtOdemetarihi.setFont(new Font("Dialog", Font.BOLD, 16));
		txtOdemetarihi.setColumns(10);
		txtOdemetarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtOdemetarihi.setBounds(342, 115, 188, 34);
		add(txtOdemetarihi);

		txtTutar = new JTextField();
		txtTutar.setText("tutar");
		txtTutar.setOpaque(false);
		txtTutar.setFont(new Font("Dialog", Font.BOLD, 16));
		txtTutar.setColumns(10);
		txtTutar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTutar.setBounds(47, 115, 259, 34);
		add(txtTutar);
		
	
		txtKartNp = new JTextField();
		txtKartNp.setDocument(new JTextFieldLimit(19));
		txtKartNp.setHorizontalAlignment(SwingConstants.CENTER);
		txtKartNp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String den;
				
				
				String[] parca= new String[19];
                String a=txtKartNp.getText();
				
				
					if(txtKartNp.getText().length()==4){
                     den=txtKartNp.getText()+"-";
                     txtKartNp.setText(den);
					}
					if(txtKartNp.getText().length()==9){
	                     den=txtKartNp.getText()+"-";
	                     txtKartNp.setText(den);
						}
					if(txtKartNp.getText().length()==14){
	                     den=txtKartNp.getText()+"-";
	                     txtKartNp.setText(den);
						}
					


					


				

			
			}
		});
		
		
		txtKartNp.setOpaque(false);
		txtKartNp.setFont(new Font("Dialog", Font.BOLD, 16));
		txtKartNp.setColumns(10);
		txtKartNp.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtKartNp.setBounds(47, 247, 483, 34);
		add(txtKartNp);

		txtAklama = new JTextField();
		txtAklama.setText("A\u00E7\u0131klama");
		txtAklama.setOpaque(false);
		txtAklama.setFont(new Font("Dialog", Font.BOLD, 16));
		txtAklama.setColumns(10);
		txtAklama.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAklama.setBounds(325, 182, 205, 34);
		add(txtAklama);

		txtCcv = new JTextField();
		txtCcv.setText("CCV");
		txtCcv.setOpaque(false);
		txtCcv.setFont(new Font("Dialog", Font.BOLD, 16));
		txtCcv.setColumns(10);
		txtCcv.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtCcv.setBounds(388, 311, 142, 34);
		add(txtCcv);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_1.setBounds(47, 323, 100, 22);
		add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2019"}));
		comboBox_2.setBounds(170, 323, 100, 22);
		add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"MasterCard", "Visa", "Maestro"}));
		comboBox_3.setBounds(47, 67, 209, 22);
		add(comboBox_3);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hakan\\eclipse-workspace\\yurtotomasyon\\images\\master60.png"));
		lblNewLabel_1.setBounds(311, 15, 61, 60);
		add(lblNewLabel_1);
		
		Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd/M/yyyy");
        System.out.println(df.format(simdikiZaman));
        txtOdemetarihi.setText(df.format(simdikiZaman));
        
		JLabel label = new JLabel("New label");
		
		label.setIcon(new ImageIcon("C:\\Users\\hakan\\eclipse-workspace\\yurtotomasyon\\images\\visa60.png"));
		label.setBounds(405, 15, 61, 60);
		add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\hakan\\eclipse-workspace\\yurtotomasyon\\images\\ziraat60.png"));
		label_1.setBounds(506, 15, 54, 60);
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\hakan\\eclipse-workspace\\yurtotomasyon\\images\\is60.png"));
		label_2.setBounds(586, 15, 61, 60);
		add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\hakan\\eclipse-workspace\\yurtotomasyon\\images\\maestro60.png"));
		label_3.setBounds(680, 15, 61, 60);
		add(label_3);
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

		try {
			
			Connection con = connection.getConnection();
			PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.odeme INNER JOIN ogrenciler ON ogrenciler_ogr_id=ogrenciler.ogr_id where ogrenciler.ogr_tc="+tc+"");
			PreparedStatement sorgu2 = con.prepareStatement("Select count(odeme_id) as max from odeme");
			PreparedStatement sorgu3 = con.prepareStatement("Select count(kart_id) as maxkart from kredikart");
			ResultSet sonuc = sorgu.executeQuery();
			ResultSet sonuc2 = sorgu2.executeQuery();
			ResultSet sonuc3 = sorgu3.executeQuery();
			while(sonuc.next()) {
		    id=sonuc.getString("ogr_id");
		     
		    
			
			listModel.addElement("Tutar :        "+sonuc.getString("odeme_tut"));
			listModel.addElement("Tarih :        "+sonuc.getString("odeme_tarih"));
			listModel.addElement("Acýklama :"+sonuc.getString("odeme_aciklama"));
			listModel.addElement("-------------");
			
		
			
			
			
			}
			while(sonuc2.next()) {
				max=Integer.parseInt(sonuc2.getString("max"));
				max++;
			}
			while(sonuc3.next()) {
				maxkart=Integer.parseInt(sonuc3.getString("maxkart"));
				maxkart++;
			
			}
			list.setModel(listModel);
		
		} catch (Exception e) {
			System.out.print(e);

		}
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				try {
					con = connection.getConnection();
					PreparedStatement sorgu = con.prepareStatement("INSERT INTO `yurtdb`.`odeme` (`odeme_id`, `odeme_tut`, `odeme_tarih`, `odeme_aciklama`, `ogrenciler_ogr_id`) VALUES ('"+max+"','"+txtTutar.getText()+"','"+txtOdemetarihi.getText()+"','"+txtAklama.getText()+"','"+id+"')");
					PreparedStatement sorgu2 = con.prepareStatement("IF EXISTS (SELECT * FROM kredikart WHERE kart_no = '"+txtKartNp.getText()+"' )   BEGIN   END ELSE  INSERT INTO `yurtdb`.`odeme` (`odeme_id`, `odeme_tut`, `odeme_tarih`, `odeme_aciklama`, `ogrenciler_ogr_id`) VALUES ('"+max+"','"+txtTutar.getText()+"','"+txtOdemetarihi.getText()+"','"+txtAklama.getText()+"','"+id+"')  END");
					sorgu.executeUpdate();
					sorgu2.executeUpdate();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.print(e1);
				}
				
			}
		});

	}
}
