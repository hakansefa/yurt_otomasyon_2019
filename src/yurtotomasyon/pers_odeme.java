package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import keeptoo.KButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class pers_odeme extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtAdresGiriniz;
	private JTextField txtAklama;
	private JTextField txtYl;
	private JTextField txtOnaylama;
	private JTextField txtdemeTarihi;
	private JScrollPane scrollPane;
	private JList list;
	private JTextField txtAdSoyad;
	private JLabel label;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_odeme frame = new pers_odeme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_odeme() {
		setBackground(new Color (216,204,192));
		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00D6DEME B\u0130LG\u0130LER\u0130");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		txtAdresGiriniz = new JTextField();
		txtAdresGiriniz.setOpaque(false);

		txtAdresGiriniz.setText("ADRES");
		txtAdresGiriniz.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAdresGiriniz.setColumns(10);
		txtAdresGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdresGiriniz.setBounds(486, 260, 285, 34);
		add(txtAdresGiriniz);
		
		txtAklama = new JTextField();
		txtAklama.setOpaque(false);

		txtAklama.setText("TUTAR");
		txtAklama.setFont(new Font("Purisa", Font.BOLD, 16));
		txtAklama.setColumns(10);
		txtAklama.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAklama.setBounds(486, 215, 285, 34);
		
		add(txtAklama);
		
		
		
		txtOnaylama = new JTextField();
		txtOnaylama.setOpaque(false);

		txtOnaylama.setText("A\u00C7IKLAMA");
		txtOnaylama.setFont(new Font("Purisa", Font.BOLD, 16));
		txtOnaylama.setColumns(10);
		txtOnaylama.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtOnaylama.setBounds(486, 305, 285, 34);
		add(txtOnaylama);
		
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
		
		txtdemeTarihi = new JTextField();
		txtdemeTarihi.setEnabled(false);
		txtdemeTarihi.setText("ODEME TAR\u0130H\u0130");
		txtdemeTarihi.setOpaque(false);
		txtdemeTarihi.setFont(new Font("Purisa", Font.BOLD, 16));
		txtdemeTarihi.setColumns(10);
		txtdemeTarihi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtdemeTarihi.setBounds(486, 170, 285, 34);
		add(txtdemeTarihi);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(26, 67, 352, 272);
		add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		txtAdSoyad = new JTextField();
		txtAdSoyad.setText("AD SOYAD");
		txtAdSoyad.setOpaque(false);
		txtAdSoyad.setFont(new Font("Dialog", Font.BOLD, 16));
		txtAdSoyad.setColumns(10);
		txtAdSoyad.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtAdSoyad.setBounds(486, 126, 285, 34);
		add(txtAdSoyad);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hakan\\Desktop\\linux\\icon&resim\\cam.png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(584, 30, 90, 90);
		add(label);
		
		txtAdresGiriniz.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtAdresGiriniz.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtAklama.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtAklama.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		txtOnaylama.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtOnaylama.setBorder(new MatteBorder(0, 0, 2, 0, (Color.CYAN)));
			}
		});
		

	}
}
