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
import javax.swing.AbstractListModel;

public class pers_etkinlik extends JPanel {

	private JTextField txtrenciAd;
	private JTextField txtYl;
	private JTextField txtOnaylama;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pers_etkinlik frame = new pers_etkinlik();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public pers_etkinlik() {

		setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setBounds(0, 0, 847, 413);
	
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ETK\u0130NL\u0130KLER");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 12, 209, 44);
		add(lblNewLabel);
		
		
		
		txtOnaylama = new JTextField();
		txtOnaylama.setOpaque(false);

		txtOnaylama.setText("64 K\u0130\u015E\u0130 G\u0130D\u0130YOR");
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
		button_1.setText("ETKÝNLÝÐE KATIL");
		button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.kBorderRadius=60;
		add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 130, 275, 203);
		add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"DENEME YAZISI"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setOpaque(false);
		list.setFont(new Font("Ubuntu", Font.BOLD, 16));
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(457, 130, 275, 165);
		add(scrollPane_1);
		
		

	}
}
