package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class FileFrame {

	private JFrame frmHS;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileFrame window = new FileFrame();
					window.frmHS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FileFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHS = new JFrame();
		frmHS.setTitle("H\u1ED2 S\u01A0");
		frmHS.setResizable(false);
		frmHS.setBounds(0,0,630,498);
		frmHS.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 180, 461);
		frmHS.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(179, 0, 435, 461);
		frmHS.getContentPane().add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(145, 11, 142, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 80, 100, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 130, 100, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 180, 100, 25);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 230, 100, 25);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("T\u1EC9nh/Th\u00E0nh ph\u1ED1");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 280, 100, 25);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(10, 330, 100, 25);
		panel_1.add(lblNewLabel_1_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(145, 83, 250, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(145, 133, 250, 20);
		panel_1.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(145, 180, 250, 20);
		panel_1.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(145, 232, 250, 22);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(145, 282, 250, 22);
		panel_1.add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(145, 333, 250, 20);
		panel_1.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("L\u01B0u");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.setBounds(145, 389, 89, 35);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_2);
		
		JLabel lblThngTinChung = new JLabel("Th\u00F4ng tin chung");
		lblThngTinChung.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinChung.setBounds(145, 11, 142, 35);
		panel_2.add(lblThngTinChung);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Tr\u00ECnh \u0111\u1ED9");
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6_1.setBounds(10, 80, 140, 25);
		panel_2.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cty/Doanh nghi\u1EC7p");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 130, 140, 25);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("V\u1ECB tr\u00ED mong mu\u1ED1n");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(10, 180, 140, 25);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("M\u1EE9c l\u01B0\u01A1ng mong mu\u1ED1n");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(0, 230, 150, 25);
		panel_2.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("N\u01A1i l\u00E0m vi\u1EC7c");
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1_1.setBounds(10, 280, 140, 25);
		panel_2.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("M\u1EE5c ti\u00EAu c\u00F4ng vi\u1EC7c");
		lblNewLabel_1_5_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_5_1_1.setBounds(10, 330, 140, 25);
		panel_2.add(lblNewLabel_1_5_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(160, 83, 250, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(160, 133, 250, 20);
		panel_2.add(textField_4);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(160, 282, 250, 22);
		panel_2.add(comboBox_1_1_1);
		
		JButton btnNewButton_1_5 = new JButton("L\u01B0u");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_5.setBorder(null);
		btnNewButton_1_5.setBackground(new Color(220, 20, 60));
		btnNewButton_1_5.setBounds(160, 400, 90, 35);
		panel_2.add(btnNewButton_1_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 330, 250, 49);
		panel_2.add(scrollPane);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(160, 182, 250, 22);
		panel_2.add(comboBox_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(160, 233, 250, 20);
		panel_2.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_3);
		
		JLabel lblTrnh = new JLabel("Kinh nghi\u1EC7m");
		lblTrnh.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrnh.setBounds(145, 11, 148, 35);
		panel_3.add(lblTrnh);
		
		JLabel lblNewLabel_1_6 = new JLabel("Doanh nghi\u1EC7p");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(10, 80, 100, 25);
		panel_3.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("V\u1ECB tr\u00ED l\u00E0m vi\u1EC7c");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 130, 100, 25);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Th\u1EDDi gian l\u00E0m vi\u1EC7c");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(0, 180, 110, 25);
		panel_3.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("M\u1EE9c l\u01B0\u01A1ng");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(10, 230, 100, 25);
		panel_3.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("M\u00F4 t\u1EA3 c\u00F4ng vi\u1EC7c");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(10, 280, 100, 25);
		panel_3.add(lblNewLabel_1_4_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(145, 83, 250, 20);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBounds(145, 133, 250, 20);
		panel_3.add(textField_7);
		
		JButton btnNewButton_1_1_1 = new JButton("L\u01B0u");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1_1_1.setBounds(145, 414, 89, 35);
		panel_3.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("T\u1EEB");
		lblNewLabel_2.setBounds(145, 186, 22, 14);
		panel_3.add(lblNewLabel_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(166, 182, 68, 22);
		panel_3.add(comboBox_3);
		
		JLabel lbln = new JLabel("\u0110\u1EBFn");
		lbln.setBounds(271, 186, 25, 14);
		panel_3.add(lbln);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(300, 182, 68, 22);
		panel_3.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_7 = new JLabel("M\u00F4 t\u1EA3 nh\u1EEFng c\u00F4ng vi\u1EC7c, nhi\u1EC7m v\u1EE5 b\u1EA1n t\u1EEBng l\u00E0m");
		lblNewLabel_1_7.setBounds(53, 55, 342, 14);
		panel_3.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("M\u00F4 t\u1EA3 c\u00F4ng vi\u1EC7c");
		lblNewLabel_1_4_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1_1_1.setBounds(10, 350, 100, 25);
		panel_3.add(lblNewLabel_1_4_1_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(145, 280, 250, 43);
		panel_3.add(scrollPane_1);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(145, 350, 250, 43);
		panel_3.add(scrollPane_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(145, 232, 68, 22);
		panel_3.add(comboBox_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBounds(223, 233, 172, 20);
		panel_3.add(textField_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_4);
		
		JLabel lblTrnh_1 = new JLabel("Tr\u00ECnh \u0111\u1ED9 & B\u1EB1ng c\u1EA5p");
		lblTrnh_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrnh_1.setBounds(145, 11, 148, 35);
		panel_4.add(lblTrnh_1);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("Tr\u00ECnh \u0111\u1ED9");
		lblNewLabel_1_6_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6_1_1.setBounds(10, 80, 100, 25);
		panel_4.add(lblNewLabel_1_6_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("\u0110\u01A1n v\u1ECB \u0111\u00E0o t\u1EA1o");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 130, 100, 25);
		panel_4.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Th\u1EDDi gian");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1_1_1.setBounds(10, 180, 100, 25);
		panel_4.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Chuy\u00EAn ng\u00E0nh");
		lblNewLabel_1_3_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3_1_1_1.setBounds(10, 230, 100, 25);
		panel_4.add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Lo\u1EA1i t\u1ED1t nghi\u1EC7p");
		lblNewLabel_1_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4_1_2.setBounds(10, 280, 100, 25);
		panel_4.add(lblNewLabel_1_4_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBounds(145, 83, 250, 20);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBounds(145, 133, 250, 20);
		panel_4.add(textField_10);
		
		JButton btnNewButton_1_1_1_1 = new JButton("L\u01B0u");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1_1_1_1.setBounds(145, 358, 89, 35);
		panel_4.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("T\u1EEB");
		lblNewLabel_2_1.setBounds(145, 186, 22, 14);
		panel_4.add(lblNewLabel_2_1);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(166, 182, 68, 22);
		panel_4.add(comboBox_3_1);
		
		JLabel lbln_1 = new JLabel("\u0110\u1EBFn");
		lbln_1.setBounds(271, 186, 25, 14);
		panel_4.add(lbln_1);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setBounds(300, 182, 68, 22);
		panel_4.add(comboBox_1_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBounds(145, 233, 250, 20);
		panel_4.add(textField_11);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setBounds(145, 282, 250, 22);
		panel_4.add(comboBox_2_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_5);
		
		JLabel lblTrnh_2 = new JLabel("Ngo\u1EA1i ng\u1EEF & Tin h\u1ECDc");
		lblTrnh_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrnh_2.setBounds(145, 11, 149, 35);
		panel_5.add(lblTrnh_2);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("Ngo\u1EA1i ng\u1EEF");
		lblNewLabel_1_6_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6_2.setBounds(10, 80, 100, 25);
		panel_5.add(lblNewLabel_1_6_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Tr\u00ECnh \u0111\u1ED9");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(10, 130, 100, 25);
		panel_5.add(lblNewLabel_1_1_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBounds(145, 83, 250, 20);
		panel_5.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBounds(145, 133, 250, 20);
		panel_5.add(textField_13);
		
		JButton btnNewButton_1_1_2 = new JButton("L\u01B0u");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_2.setBorder(null);
		btnNewButton_1_1_2.setBackground(new Color(220, 20, 60));
		btnNewButton_1_1_2.setBounds(145, 414, 89, 35);
		panel_5.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("B\u1EB1ng c\u1EA5p");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_2.setBounds(10, 180, 100, 25);
		panel_5.add(lblNewLabel_1_1_1_1_2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(145, 182, 250, 22);
		panel_5.add(comboBox_4);
		
		JLabel lblNewLabel_3 = new JLabel("Ngo\u1EA1i ng\u1EEF");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(20, 55, 90, 14);
		panel_5.add(lblNewLabel_3);
		
		JLabel lblTinHc = new JLabel("Tin h\u1ECDc");
		lblTinHc.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblTinHc.setBounds(20, 231, 90, 14);
		panel_5.add(lblTinHc);
		
		JLabel lblNewLabel_1_8 = new JLabel("Tin h\u1ECDc v\u0103n ph\u00F2ng");
		lblNewLabel_1_8.setBounds(10, 256, 120, 14);
		panel_5.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Ph\u1EA7n m\u1EC1m kh\u00E1c");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 357, 100, 25);
		panel_5.add(lblNewLabel_1_1_1_1_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(145, 357, 250, 47);
		panel_5.add(scrollPane_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("MS Word");
		chckbxNewCheckBox.setBounds(20, 286, 120, 23);
		panel_5.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMsExcel = new JCheckBox("MS Excel");
		chckbxMsExcel.setBounds(160, 286, 120, 23);
		panel_5.add(chckbxMsExcel);
		
		JCheckBox chckbxMsPowerPoint = new JCheckBox("MS Power Point");
		chckbxMsPowerPoint.setBounds(20, 312, 120, 23);
		panel_5.add(chckbxMsPowerPoint);
		
		JCheckBox chckbxMsOutlook = new JCheckBox("MS Outlook");
		chckbxMsOutlook.setBounds(160, 312, 120, 23);
		panel_5.add(chckbxMsOutlook);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_6);
		
		JLabel lblTrnh_3 = new JLabel("K\u1EF9 n\u0103ng c\u00E1 nh\u00E2n");
		lblTrnh_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrnh_3.setBounds(145, 11, 149, 35);
		panel_6.add(lblTrnh_3);
		
		JLabel lblNewLabel_1_6_3 = new JLabel("K\u1EF9 n\u0103ng/S\u1EDF tr\u01B0\u1EDDng");
		lblNewLabel_1_6_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6_3.setBounds(0, 80, 130, 25);
		panel_6.add(lblNewLabel_1_6_3);
		
		JButton btnNewButton_1_1_3 = new JButton("L\u01B0u");
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_3.setBorder(null);
		btnNewButton_1_1_3.setBackground(new Color(220, 20, 60));
		btnNewButton_1_1_3.setBounds(145, 414, 89, 35);
		panel_6.add(btnNewButton_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("S\u1EDF th\u00EDch");
		lblNewLabel_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_2.setBounds(10, 212, 100, 25);
		panel_6.add(lblNewLabel_1_1_1_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("L\u00E3nh \u0111\u1EA1o");
		chckbxNewCheckBox_1.setBounds(33, 112, 120, 23);
		panel_6.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Gi\u1EA3i quy\u1EBFt v\u1EA5n \u0111\u1EC1");
		chckbxNewCheckBox_1_1.setBounds(33, 138, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Qu\u1EA3n l\u00FD th\u1EDDi gian");
		chckbxNewCheckBox_1_1_1.setBounds(33, 164, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("L\u00E0m vi\u1EC7c nh\u00F3m");
		chckbxNewCheckBox_1_1_1_1.setBounds(165, 112, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1 = new JCheckBox("Qu\u1EA3n l\u00FD nh\u00E2n l\u1EF1c");
		chckbxNewCheckBox_1_1_1_1_1.setBounds(165, 138, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1 = new JCheckBox("Qu\u1EA3n l\u00FD d\u1EF1 \u00E1n");
		chckbxNewCheckBox_1_1_1_1_1_1.setBounds(165, 164, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1 = new JCheckBox("Ra chi\u1EBFn l\u01B0\u1EE3c");
		chckbxNewCheckBox_1_1_1_1_1_1_1.setBounds(295, 112, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_1 = new JCheckBox("Giao ti\u1EBFp");
		chckbxNewCheckBox_1_1_1_1_1_1_1_1.setBounds(295, 138, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_2 = new JCheckBox("S\u00E1ng t\u1EA1o");
		chckbxNewCheckBox_1_1_1_1_1_1_1_2.setBounds(295, 164, 120, 23);
		panel_6.add(chckbxNewCheckBox_1_1_1_1_1_1_1_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(145, 212, 240, 59);
		panel_6.add(scrollPane_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("K\u1EF9 n\u0103ng kh\u00E1c");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 306, 100, 25);
		panel_6.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(145, 306, 240, 59);
		panel_6.add(scrollPane_1_2);
		
		JButton btnNewButton = new JButton("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 180, 76);
		panel.add(btnNewButton);
		
		JButton btnThngTinTi = new JButton("Th\u00F4ng tin chung");
		btnThngTinTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnThngTinTi.setForeground(Color.WHITE);
		btnThngTinTi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThngTinTi.setBorder(null);
		btnThngTinTi.setBackground(new Color(30, 144, 255));
		btnThngTinTi.setBounds(0, 76, 180, 76);
		panel.add(btnThngTinTi);
		
		JButton btnNewButton_1_1 = new JButton("Kinh nghi\u1EC7m");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_1.setBounds(0, 152, 180, 76);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Tr\u00ECnh \u0111\u1ED9 & B\u1EB1ng c\u1EA5p");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2.setBounds(0, 228, 180, 76);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ngo\u1EA1i ng\u1EEF & Tin h\u1ECDc");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(true);
				panel_6.setVisible(false);
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(new Color(30, 144, 255));
		btnNewButton_1_3.setBounds(0, 304, 180, 76);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("K\u1EF9 n\u0103ng c\u00E1 nh\u00E2n");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(true);
			}
		});
		btnNewButton_1_4.setForeground(Color.WHITE);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBorder(null);
		btnNewButton_1_4.setBackground(new Color(30, 144, 255));
		btnNewButton_1_4.setBounds(0, 380, 180, 76);
		panel.add(btnNewButton_1_4);
	}
}
