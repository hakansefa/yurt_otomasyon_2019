package yurtotomasyon;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import keeptoo.KButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class pers_duyuru extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtYl;
	private JTextField txtEkleyen;
	private JTextField txtBaslik;
	private JTextField txtTarih;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_duyuru frame = new pers_duyuru();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_duyuru() {

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DUYURULAR");
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
		button_1.setFont(new Font("Purisa", Font.BOLD, 16));
		button_1.setText("Duyuru Ýncele");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 72, 275, 203);
		add(scrollPane);
		
		KButton button = new KButton();
		button.setText("Yeni Duyuru");
		button.setBounds(47, 309, 124, 36);
		button.kAllowTab = false;
		button.kHoverEndColor = new Color(135, 206, 235);
		button.kHoverForeGround = new Color(255, 255, 0);
		button.kEndColor = new Color(64, 224, 208);
		
		button.setFont(new Font("Purisa", Font.BOLD, 16));
		button.setBorder(null);
		button.setOpaque(false);
		button.kBorderRadius=30;
		add(button);
		
		KButton button_2 = new KButton();
		button_2.kAllowTab = false;
		button_2.kHoverEndColor = new Color(135, 206, 235);
		button_2.kHoverForeGround = new Color(255, 255, 0);
		button_2.kEndColor = new Color(64, 224, 208);
		button_2.setFont(new Font("Purisa", Font.BOLD, 16));
		button_2.setBorder(null);
		button_2.setOpaque(false);
		button_2.kBorderRadius=30;
		button_2.setText("Duyuru Sil");
		button_2.setBounds(198, 309, 124, 36);
		add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(493, 72, 298, 276);
		add(panel);
		panel.setLayout(null);
		
		txtEkleyen = new JTextField();
		txtEkleyen.setText("ekleyen");
		txtEkleyen.setOpaque(false);
		txtEkleyen.setFont(new Font("Dialog", Font.BOLD, 16));
		txtEkleyen.setEditable(false);
		txtEkleyen.setColumns(10);
		txtEkleyen.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtEkleyen.setBounds(0, 127, 285, 34);
		panel.add(txtEkleyen);
		
		txtBaslik = new JTextField();
		txtBaslik.setText("baslik");
		txtBaslik.setOpaque(false);
		txtBaslik.setFont(new Font("Dialog", Font.BOLD, 16));
		txtBaslik.setEditable(false);
		txtBaslik.setColumns(10);
		txtBaslik.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtBaslik.setBounds(0, 185, 285, 34);
		panel.add(txtBaslik);
		
		txtTarih = new JTextField();
		txtTarih.setText("Tarih");
		txtTarih.setOpaque(false);
		txtTarih.setFont(new Font("Dialog", Font.BOLD, 16));
		txtTarih.setEditable(false);
		txtTarih.setColumns(10);
		txtTarih.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
		txtTarih.setBounds(0, 242, 285, 34);
		panel.add(txtTarih);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 288, 101);
		panel.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setLineWrap(true);
		scrollPane_1.setViewportView(textArea);
		
		

	}
}
