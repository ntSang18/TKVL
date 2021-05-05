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
	private JTextField txtTentaikhoan;
	private JTextField txtMatkhau;
	private JTextField txtNhaplaimk;
	private JTextField txtHoten;
	private JTextField txtSdt;

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
		
		JLabel lbDangky = new JLabel("\u0110\u0103ng k\u00FD t\u00E0i kho\u1EA3n");
		lbDangky.setBounds(157, 112, 154, 35);
		lbDangky.setFont(new Font("Calibri", Font.BOLD, 21));
		panel.add(lbDangky);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(28, 186, 427, 154);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbTentk = new JLabel("T\u00EAn t\u00E0i kho\u1EA3n");
		lbTentk.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTentk.setFont(new Font("Calibri", Font.BOLD, 12));
		lbTentk.setBounds(10, 22, 95, 22);
		panel_1.add(lbTentk);
		
		JLabel lbMatkhau = new JLabel("M\u1EADt kh\u1EA9u");
		lbMatkhau.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMatkhau.setFont(new Font("Calibri", Font.BOLD, 12));
		lbMatkhau.setBounds(10, 64, 95, 22);
		panel_1.add(lbMatkhau);
		
		JLabel lbNhaplaimk = new JLabel("Nh\u1EADp l\u1EA1i m\u1EADt kh\u1EA9u");
		lbNhaplaimk.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNhaplaimk.setFont(new Font("Calibri", Font.BOLD, 12));
		lbNhaplaimk.setBounds(10, 106, 95, 22);
		panel_1.add(lbNhaplaimk);
		
		txtTentaikhoan = new JTextField();
		txtTentaikhoan.setBounds(133, 16, 261, 30);
		panel_1.add(txtTentaikhoan);
		txtTentaikhoan.setColumns(10);
		
		txtMatkhau = new JTextField();
		txtMatkhau.setColumns(10);
		txtMatkhau.setBounds(133, 58, 261, 30);
		panel_1.add(txtMatkhau);
		
		txtNhaplaimk = new JTextField();
		txtNhaplaimk.setColumns(10);
		txtNhaplaimk.setBounds(133, 100, 261, 30);
		panel_1.add(txtNhaplaimk);
		
		JLabel lbThongtintk = new JLabel("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		lbThongtintk.setBounds(73, 166, 128, 25);
		lbThongtintk.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(lbThongtintk);
		
		JPanel panel_line = new JPanel();
		panel_line.setBounds(195, 175, 255, 1);
		panel.add(panel_line);
		
		JPanel panel_line1 = new JPanel();
		panel_line1.setBounds(20, 175, 50, 1);
		panel.add(panel_line1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Th\u00F4ng tin c\u00E1 nh\u00E2n");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(73, 351, 128, 25);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_line3 = new JPanel();
		panel_line3.setBounds(185, 361, 270, 1);
		panel.add(panel_line3);
		
		JPanel panel_line2 = new JPanel();
		panel_line2.setBounds(20, 361, 50, 1);
		panel.add(panel_line2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(28, 371, 427, 103);
		panel.add(panel_2);
		
		JLabel lbHoten = new JLabel("H\u1ECD t\u00EAn");
		lbHoten.setHorizontalAlignment(SwingConstants.RIGHT);
		lbHoten.setFont(new Font("Calibri", Font.BOLD, 12));
		lbHoten.setBounds(10, 22, 95, 22);
		panel_2.add(lbHoten);
		
		JLabel lbSdt = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lbSdt.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSdt.setFont(new Font("Calibri", Font.BOLD, 12));
		lbSdt.setBounds(10, 64, 95, 22);
		panel_2.add(lbSdt);
		
		txtHoten = new JTextField();
		txtHoten.setColumns(10);
		txtHoten.setBounds(133, 16, 261, 30);
		panel_2.add(txtHoten);
		
		txtSdt = new JTextField();
		txtSdt.setColumns(10);
		txtSdt.setBounds(133, 58, 261, 30);
		panel_2.add(txtSdt);
		
		JButton btnDangky = new JButton("\u0110\u0103ng k\u00FD");
		btnDangky.setForeground(SystemColor.desktop);
		btnDangky.setBackground(new Color(220, 20, 60));
		btnDangky.setBorder(null);
		btnDangky.setFont(new Font("Calibri", Font.BOLD, 21));
		btnDangky.setBounds(157, 492, 154, 35);
		panel.add(btnDangky);
		
		ImageIcon SigninIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\registration_80px.png");
		JLabel lbIcon = new JLabel(SigninIcon);
		lbIcon.setBounds(172, 11, 142, 90);
		panel.add(lbIcon);
	}
}
