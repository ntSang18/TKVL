package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;

public class SignupFrame {

	private JFrame SignupFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame window = new SignupFrame();
					window.SignupFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignupFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SignupFrame = new JFrame();
		SignupFrame.setTitle("\u0110\u0102NG K\u00DD");
		SignupFrame.setResizable(false);
		SignupFrame.setBounds(100, 100, 500, 600);
		SignupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SignupFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 484, 561);
		SignupFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0103ng k\u00FD t\u00E0i kho\u1EA3n");
		lblNewLabel.setBounds(157, 112, 154, 35);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 21));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(28, 186, 427, 154);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn t\u00E0i kho\u1EA3n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 22, 95, 22);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("M\u1EADt kh\u1EA9u");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 64, 95, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nh\u1EADp l\u1EA1i m\u1EADt kh\u1EA9u");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(10, 106, 95, 22);
		panel_1.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(133, 16, 261, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 58, 261, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 100, 261, 30);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		lblNewLabel_1.setBounds(73, 166, 128, 25);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(195, 175, 255, 1);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(20, 175, 50, 1);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Th\u00F4ng tin c\u00E1 nh\u00E2n");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(73, 351, 128, 25);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(185, 361, 270, 1);
		panel.add(panel_2_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(20, 361, 50, 1);
		panel.add(panel_2_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(135, 206, 250));
		panel_1_1.setBounds(28, 371, 427, 103);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(10, 22, 95, 22);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 64, 95, 22);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 16, 261, 30);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(133, 58, 261, 30);
		panel_1_1.add(textField_4);
		
		JButton btnNewButton = new JButton("\u0110\u0103ng k\u00FD");
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 21));
		btnNewButton.setBounds(157, 492, 154, 35);
		panel.add(btnNewButton);
		
		ImageIcon SigninIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\registration_80px.png");
		JLabel lblNewLabel_3 = new JLabel(SigninIcon);
		lblNewLabel_3.setBounds(172, 11, 142, 90);
		panel.add(lblNewLabel_3);
	}
}
