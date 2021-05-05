package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class LoginFrame {

	private JFrame LoginFrame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
					window.LoginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginFrame = new JFrame();
		LoginFrame.setResizable(false);
		LoginFrame.setTitle("\u0110\u0102NG NH\u1EACP");
		LoginFrame.setBounds(100, 100, 450, 325);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 434, 286);
		LoginFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0103ng nh\u1EADp t\u00E0i kho\u1EA3n");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 21));
		lblNewLabel.setBounds(115, 94, 185, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setBounds(28, 147, 85, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u1EADt kh\u1EA9u");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(28, 192, 85, 20);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(135, 140, 246, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 182, 246, 30);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("\u0110\u0103ng nh\u1EADp");
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton.setBounds(135, 235, 105, 30);
		panel.add(btnNewButton);
		
		JButton btnThot = new JButton("Tho\u00E1t");
		btnThot.setBackground(new Color(230, 230, 250));
		btnThot.setForeground(new Color(220, 20, 60));
		btnThot.setBorder(null);
		btnThot.setFont(new Font("Calibri", Font.BOLD, 15));
		btnThot.setBounds(276, 237, 105, 30);
		panel.add(btnThot);
		
		ImageIcon LoginIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\person_80px.png");
		JLabel lblNewLabel_2 = new JLabel(LoginIcon);
		lblNewLabel_2.setBounds(173, 11, 67, 80);
		panel.add(lblNewLabel_2);
	}
}
