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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame {

	private JFrame LoginFrame;
	private JTextField txtDangnhap;
	private JTextField txtMatkhau;

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
		
		JLabel lbDangnhap = new JLabel("\u0110\u0103ng nh\u1EADp t\u00E0i kho\u1EA3n");
		lbDangnhap.setFont(new Font("Calibri", Font.BOLD, 21));
		lbDangnhap.setBounds(115, 94, 185, 35);
		panel.add(lbDangnhap);
		
		JLabel lbTendangnhap = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp");
		lbTendangnhap.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTendangnhap.setFont(new Font("Calibri", Font.BOLD, 12));
		lbTendangnhap.setBounds(28, 147, 85, 20);
		panel.add(lbTendangnhap);
		
		JLabel lbMatkhau = new JLabel("M\u1EADt kh\u1EA9u");
		lbMatkhau.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMatkhau.setFont(new Font("Calibri", Font.BOLD, 12));
		lbMatkhau.setBounds(28, 192, 85, 20);
		panel.add(lbMatkhau);
		
		txtDangnhap = new JTextField();
		txtDangnhap.setBounds(135, 140, 246, 30);
		panel.add(txtDangnhap);
		txtDangnhap.setColumns(10);
		
		txtMatkhau = new JTextField();
		txtMatkhau.setColumns(10);
		txtMatkhau.setBounds(135, 182, 246, 30);
		panel.add(txtMatkhau);
		
		JButton btnDangnhap = new JButton("\u0110\u0103ng nh\u1EADp");
		btnDangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDangnhap.setForeground(SystemColor.desktop);
		btnDangnhap.setBackground(new Color(220, 20, 60));
		btnDangnhap.setBorder(null);
		btnDangnhap.setFont(new Font("Calibri", Font.BOLD, 15));
		btnDangnhap.setBounds(135, 235, 105, 30);
		panel.add(btnDangnhap);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.setBackground(new Color(230, 230, 250));
		btnThoat.setForeground(new Color(220, 20, 60));
		btnThoat.setBorder(null);
		btnThoat.setFont(new Font("Calibri", Font.BOLD, 15));
		btnThoat.setBounds(276, 237, 105, 30);
		panel.add(btnThoat);
		
		ImageIcon LoginIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\person_80px.png");
		JLabel lbIcon = new JLabel(LoginIcon);
		lbIcon.setBounds(173, 11, 67, 80);
		panel.add(lbIcon);
	}
}
