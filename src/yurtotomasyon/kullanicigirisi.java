package yurtotomasyon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import keeptoo.KGradientPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import keeptoo.KTextField;
import keeptoo.Drag;
import javax.swing.JComponent;
import keeptoo.KButton;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;

public class kullanicigirisi extends JFrame {
	  public Color kStartColor = Color.MAGENTA;
	    public Color kEndColor = Color.BLUE;
	    public boolean kTransparentControls = true;
	    public int kGradientFocus = 500;
		public String sif = null;
		public String deg = null;
	    public Color getkStartColor() {
	        return kStartColor;
	    }

	    public void setkStartColor(Color kStartColor) {
	        this.kStartColor = kStartColor;
	    }

	    public Color getkEndColor() {
	        return kEndColor;
	    }

	    public void setkEndColor(Color kEndColor) {
	        this.kEndColor = kEndColor;
	    }

	    public boolean iskTransparentControls() {
	        return kTransparentControls;
	    }

	    public void setkTransparentControls(boolean kTransparentControls) {
	        this.kTransparentControls = kTransparentControls;
	    }

	    public int getkGradientFocus() {
	        return kGradientFocus;
	    }

	    public void setkGradientFocus(int kGradientFocus) {
	        this.kGradientFocus = kGradientFocus;
	    }
	  
	private JPanel contentPane;
	private KTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kullanicigirisi frame = new kullanicigirisi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public kullanicigirisi()  {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image.png"));
		setTitle("Yurt Otomasyonu");
		
		setBounds(100, 100, 1120, 630);
		getContentPane().setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.CYAN;
		gradientPanel.setBounds(0, -30,  1120, 630);
		getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Köyceğiz Yurtları");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel.setBounds(113, 54, 336, 94);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblgrenciKaytVe = new JLabel("Öğrenci Kayıt ve Bilgilendirme Otomasyonu");
		lblgrenciKaytVe.setForeground(Color.CYAN);
		lblgrenciKaytVe.setFont(new Font("Manjari Bold", Font.BOLD, 20));
		lblgrenciKaytVe.setBounds(109, 104, 451, 112);
		gradientPanel.add(lblgrenciKaytVe);
		
		JLabel lbldanBeriLks = new JLabel("1996'dan Beri Lüks Hizmet");
		lbldanBeriLks.setForeground(Color.WHITE);
		lbldanBeriLks.setFont(new Font("Segoe Script", Font.BOLD, 20));
		lbldanBeriLks.setBounds(109, 169, 451, 112);
		gradientPanel.add(lbldanBeriLks);
		gradientPanel.setOpaque(true);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\image.png"));
		label.setBounds(108, 314, 492, 262);
		gradientPanel.add(label);
		
		JLabel lblGiriYap = new JLabel("Giriş Yap");
		lblGiriYap.setForeground(new Color(255, 255, 255));
		lblGiriYap.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblGiriYap.setBounds(772, 77, 118, 44);
		gradientPanel.add(lblGiriYap);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		panel.setOpaque(false);
		panel.setBounds(641, 133, 362, 443);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblrenciTc = new JLabel("Öğrenci TC :");
		lblrenciTc.setForeground(Color.WHITE);
		lblrenciTc.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblrenciTc.setBounds(12, 12, 183, 44);
		panel.add(lblrenciTc);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		textField_1.setForeground(Color.MAGENTA);
		textField_1.setOpaque(false);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 51)));
		textField_1.setFont(new Font("Ubuntu", Font.BOLD, 18));
		textField_1.setBounds(12, 82, 338, 44);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSifre = new JLabel("Sifre :");
		lblSifre.setForeground(Color.WHITE);
		lblSifre.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblSifre.setBounds(12, 138, 118, 44);
		panel.add(lblSifre);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		
			
		});
		passwordField.setFont(new Font("Ubuntu", Font.BOLD, 18));
		passwordField.setForeground(Color.MAGENTA);
		passwordField.setCaretColor(Color.MAGENTA);
		passwordField.setOpaque(false);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		passwordField.setBounds(12, 197, 338, 44);
		panel.add(passwordField);
		connection cons = new connection();
		KButton button = new KButton();
		button.kAllowTab = false;
	
		
		//SORGU_CUMLELERİ
		
	
		button.kSelectedColor = UIManager.getColor("CheckBoxMenuItem.acceleratorForeground");
		button.kHoverEndColor = Color.BLUE;
		button.kBackGroundColor = Color.BLUE;
		button.kEndColor = Color.BLUE;
		button.setBounds(12, 260, 338, 51);
		button.setText("Giriş Yap");
		button.setFont(new Font("Ubuntu", Font.BOLD, 16));
		button.kBorderRadius=50;
		button.setOpaque(false);
		button.setBorder(null);
		panel.add(button);
		
		KButton button_1 = new KButton();
		
		
		button_1.kAllowTab = false;
		button_1.kHoverEndColor = Color.BLUE;
		button_1.kEndColor = Color.BLUE;
		button_1.setBounds(12, 323, 338, 51);
		button_1.setText("Şifremi Unuttum ?");
		button_1.setFont(new Font("Ubuntu", Font.BOLD, 16));
		button_1.setOpaque(false);
		button_1.kBorderRadius=50;
		button_1.setBorder(null);
		panel.add(button_1);
		
		JRadioButton rdbogr = new JRadioButton("Öğrenci Girişi");
		rdbogr.setIconTextGap(5);
		rdbogr.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.textHighlightText));
		rdbogr.setFocusPainted(false);
		rdbogr.setRolloverEnabled(false);
		rdbogr.setSelected(true);
		rdbogr.setOpaque(false);
		rdbogr.setBounds(41, 400, 109, 23);
		panel.add(rdbogr);
		rdbogr.setFont(new Font("Ubuntu", Font.BOLD, 12));
		
		JRadioButton rdbogrent = new JRadioButton("Öğretmen Girişi");
		rdbogrent.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.textHighlightText));
		rdbogrent.setOpaque(false);
		rdbogrent.setBounds(200, 400, 138, 23);
		panel.add(rdbogrent);
		rdbogrent.setFont(new Font("Ubuntu", Font.BOLD, 12));
		rdbogr.setForeground(Color.WHITE);
		rdbogrent.setForeground(Color.WHITE);
		String ogr_cek  = "Select * from yurtdb.ogrenciler where ogr_id=1";
		ButtonGroup group = new ButtonGroup();
		group.add(rdbogr);
		group.add(rdbogrent);
	
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				if(rdbogr.isSelected()) {
				try {
					String str = textField_1.getText();

			        File file = new File("tc.txt");
			        if (!file.exists()) {
			            file.createNewFile();
			        }

			        FileWriter fileWriter = new FileWriter(file, false);
			        BufferedWriter bWriter = new BufferedWriter(fileWriter);
			        bWriter.write(str);
			        bWriter.close();
			        
			        
			        
					Connection con = connection.getConnection();
					PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.ogrenciler where ogr_tc="+textField_1.getText()+"");
					ResultSet sonuc = sorgu.executeQuery();
					while(sonuc.next()) {
					sif=sonuc.getString("ogr_sifre");
					System.out.print(sif);
					
					}
					
				} catch (Exception a) {System.out.print(a);
					
				}
				
				

			if (Integer.parseInt(sif)==Integer.parseInt(String.valueOf(passwordField.getPassword()))) {
				dispose();
				ogr_panel ogrgir = new ogr_panel();
				ogrgir.setVisible(true);
				}
				
			}
				if(rdbogrent.isSelected()) {
					try {
						String str = textField_1.getText();

				        File file = new File("perstc.txt");
				        if (!file.exists()) {
				            file.createNewFile();
				        }

				        FileWriter fileWriter = new FileWriter(file, false);
				        BufferedWriter bWriter = new BufferedWriter(fileWriter);
				        bWriter.write(str);
				        bWriter.close();
				        
				        
				        
						Connection con = connection.getConnection();
						PreparedStatement sorgu = con.prepareStatement("Select * from yurtdb.personel where personel_tc="+textField_1.getText()+"");
						ResultSet sonuc = sorgu.executeQuery();
						while(sonuc.next()) {
						sif=sonuc.getString("personel_sifre");
						System.out.print(sif);
						
						}
						
					} catch (Exception a) {System.out.print(a);
						
					}
					
					

				if (Integer.parseInt(sif)==Integer.parseInt(String.valueOf(passwordField.getPassword()))) {
					dispose();
					pers_panel ogrgir = new pers_panel();
					ogrgir.setVisible(true);
					}
				}
				
				
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				
					sifre sifredegis  = new sifre();
					sifredegis.setVisible(true);
					
					
				
				
			
			
					sifredegis.setVisible(true);
					
				} catch (Exception e1) {
					System.out.print(e1);
					e1.printStackTrace();
				}
			}
		});
		
	
	}
}
