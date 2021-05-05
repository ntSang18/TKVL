package PBL3_DA.GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.JLayeredPane;


public class MainFrame {

	private JFrame MainFrame;
	private JTextField txtTimkiemNC;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame("Finding Job Application");
		MainFrame.getContentPane().setBackground(new Color(230, 230, 250));
		MainFrame.setBounds(100, 100, 1080, 697);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel1
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 204));
		
		ImageIcon HotlineIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\phone_26px.png");
		JLabel lbHotLine = new JLabel("Hotline:", HotlineIcon, SwingConstants.LEFT);
		lbHotLine.setForeground(Color.WHITE);
		lbHotLine.setFont(new Font("Calibri", Font.BOLD, 15));
		// End Panel1
		
		// Panel2
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		
		JLabel lbKinhdoanh = new JLabel("Kinh doanh");
		lbKinhdoanh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbKinhdoanh.setForeground(Color.WHITE);
		
		JLabel lbBanhang = new JLabel("B\u00E1n h\u00E0ng");
		lbBanhang.setForeground(Color.WHITE);
		lbBanhang.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbLaodong = new JLabel("Lao \u0111\u1ED9ng ");
		lbLaodong.setForeground(Color.WHITE);
		lbLaodong.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbTaichinhNH = new JLabel("T\u00E0i ch\u00EDnh/Ng\u00E2n h\u00E0ng");
		lbTaichinhNH.setForeground(Color.WHITE);
		lbTaichinhNH.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbCNTT = new JLabel("C\u00F4ng ngh\u1EC7 th\u00F4ng tin");
		lbCNTT.setForeground(Color.WHITE);
		lbCNTT.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbCoKhiKT = new JLabel("C\u01A1 kh\u00ED/K\u1EF9 thu\u1EADt");
		lbCoKhiKT.setForeground(Color.WHITE);
		lbCoKhiKT.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbAllNganhnghe = new JLabel("T\u1EA5t c\u1EA3 ng\u00E0nh ngh\u1EC1 kh\u00E1c");
		lbAllNganhnghe.setForeground(Color.WHITE);
		lbAllNganhnghe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lbIcon1_2 = new JLabel(">>");
		lbIcon1_2.setForeground(Color.WHITE);
		lbIcon1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbIcon1_3 = new JLabel(">>");
		lbIcon1_3.setForeground(Color.WHITE);
		lbIcon1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbIcon1_4 = new JLabel(">>");
		lbIcon1_4.setForeground(Color.WHITE);
		lbIcon1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbIcon1_5 = new JLabel(">>");
		lbIcon1_5.setForeground(Color.WHITE);
		lbIcon1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbIcon1_6 = new JLabel(">>");
		lbIcon1_6.setForeground(Color.WHITE);
		lbIcon1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbIcon1_1 = new JLabel(">>");
		lbIcon1_1.setForeground(Color.WHITE);
		lbIcon1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		//panel_2
		
		ImageIcon Job = new ImageIcon("C:\\Users\\minht\\Java\\PBL3\\src\\PBL3\\image\\job_seeker_100px.png");
		JLabel lbIcon = new JLabel(Job,JLabel.CENTER);
		
		JLabel lbTitle = new JLabel("VN FIND JOB\r\n");
		lbTitle.setForeground(Color.WHITE);
		lbTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lbTitle.setToolTipText("VN Find Job\r\nFor goodlife");
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lbKinhdoanh, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbIcon1_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lbBanhang, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbIcon1_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbLaodong, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbIcon1_3, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbTaichinhNH, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(lbIcon1_4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lbCNTT, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbIcon1_5, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(lbCoKhiKT, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(lbIcon1_6, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lbAllNganhnghe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(41))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbKinhdoanh, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_1))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbBanhang, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_2))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbLaodong, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_3))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbTaichinhNH, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_4))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbCNTT, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_5))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbCoKhiKT, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lbIcon1_6))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lbAllNganhnghe, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(230, 230, 250));
		panel_5.setAlignmentY(1.0f);
		panel_5.setAlignmentX(1.0f);
		scrollPane.setViewportView(panel_5);
		
		ImageIcon TaoHoSoIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\red_file_50px.png");
		JButton btnTaohs = new JButton("T\u1EA1o h\u1ED3 s\u01A1", TaoHoSoIcon);
		btnTaohs.setBackground(new Color(51, 102, 204));
		btnTaohs.setBorder(null);
		btnTaohs.setForeground(Color.WHITE);
		btnTaohs.setFont(new Font("Calibri", Font.BOLD, 21));
		
		ImageIcon DangTinTDIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\paper_plane_50px.png");
		JButton btnDangTin = new JButton("\u0110\u0103ng tin \r\ntuy\u1EC3n d\u1EE5ng", DangTinTDIcon);
		btnDangTin.setBackground(new Color(51, 102, 204));
		btnDangTin.setBorder(null);
		btnDangTin.setForeground(new Color(255, 255, 255));
		btnDangTin.setFont(new Font("Calibri", Font.BOLD, 21));
		
		ImageIcon DangNhapIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\enter_30px.png");
		JButton btnDangXuat = new JButton("\u0110\u0103ng xu\u1EA5t", DangNhapIcon);
		btnDangXuat.setBackground(new Color(51, 102, 204));
		btnDangXuat.setBorder(null);
		btnDangXuat.setForeground(new Color(255, 255, 255));
		btnDangXuat.setFont(new Font("Calibri", Font.BOLD, 18));
		
		ImageIcon DangKyIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\registration_30px.png");
		JButton btnTaikhoancn = new JButton("T\u00E0i kho\u1EA3n", DangKyIcon);
		btnTaikhoancn.setBackground(new Color(51, 102, 204));
		btnTaikhoancn.setBorder(null);
		btnTaikhoancn.setForeground(new Color(255, 255, 255));
		btnTaikhoancn.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		
		ImageIcon TuhosoIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\document_28px.png");
		JButton btnTuhs = new JButton("T\u1EE7 h\u1ED3 s\u01A1", TuhosoIcon);
		btnTuhs.setBounds(0, 0, 121, 45);
		btnTuhs.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTuhs.setBorder(null);
		btnTuhs.setBackground(new Color(135, 206, 250));
		
		ImageIcon DaluuIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\download_30px.png");
		JButton btnVLDaluu = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 l\u01B0u", DaluuIcon);
		btnVLDaluu.setBounds(396, 0, 170, 45);
		btnVLDaluu.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLDaluu.setBorder(null);
		btnVLDaluu.setBackground(new Color(135, 206, 250));
		
		ImageIcon UngtuyenIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\set_as_resume_27px.png");
		JButton btnVLUngtuyen = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 \u1EE9ng tuy\u1EC3n", UngtuyenIcon);
		btnVLUngtuyen.setBounds(576, 0, 190, 45);
		btnVLUngtuyen.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLUngtuyen.setBorder(null);
		btnVLUngtuyen.setBackground(new Color(135, 206, 250));
		
		
		ImageIcon TaikhoanIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\user_30px.png");
		JButton btnTaikhoan = new JButton("T\u00E0i kho\u1EA3n", TaikhoanIcon);
		btnTaikhoan.setBounds(265, 0, 121, 45);
		btnTaikhoan.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTaikhoan.setBorder(null);
		btnTaikhoan.setBackground(new Color(135, 206, 250));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(70, 130, 180));
		
		JComboBox cbbNganhngheNC = new JComboBox();
		cbbNganhngheNC.setBounds(46, 97, 266, 32);
		
		JComboBox cbbTinhthanhNC = new JComboBox();
		cbbTinhthanhNC.setBounds(46, 140, 266, 32);
		
		JComboBox cbbMucluongNC = new JComboBox();
		cbbMucluongNC.setBounds(46, 183, 266, 32);
		
		JComboBox cbbTrinhdoNC = new JComboBox();
		cbbTrinhdoNC.setBounds(46, 226, 266, 32);
		
		JComboBox cbbGioitinhNC = new JComboBox();
		cbbGioitinhNC.setBounds(46, 269, 266, 32);
		
		JComboBox comboBox_2_1_4_1 = new JComboBox();
		comboBox_2_1_4_1.setBounds(46, 312, 266, 32);
		
		txtTimkiemNC = new JTextField();
		txtTimkiemNC.setBounds(46, 54, 266, 32);
		txtTimkiemNC.setColumns(10);
		
		JLabel lbTimkiemNC = new JLabel("T\u00CCM KI\u1EBEM N\u00C2NG CAO");
		lbTimkiemNC.setBounds(76, 11, 215, 32);
		lbTimkiemNC.setFont(new Font("Calibri", Font.BOLD, 21));
		
		JButton btnNewButton_1_2 = new JButton("T\u00ECm ki\u1EBFm");
		btnNewButton_1_2.setBounds(99, 405, 167, 40);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 19));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.RED);
		
		JComboBox comboBox_2_1_5_1 = new JComboBox();
		comboBox_2_1_5_1.setBounds(46, 355, 266, 32);
		
		JButton btnTimkiemhs = new JButton("T\u00ECm h\u1ED3 s\u01A1", null);
		btnTimkiemhs.setBounds(131, 0, 121, 45);
		btnTimkiemhs.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTimkiemhs.setBorder(null);
		btnTimkiemhs.setBackground(new Color(135, 206, 250));
		
		JComboBox cbbSXPhobien = new JComboBox();
		cbbSXPhobien.setBounds(294, 11, 140, 22);
		
		JComboBox cbbSXLuong = new JComboBox();
		cbbSXLuong.setBounds(144, 11, 140, 22);
		
		JButton btnSapxep = new JButton("S\u1EAFp x\u1EBFp");
		btnSapxep.setBounds(22, 1, 112, 44);
		btnSapxep.setForeground(SystemColor.desktop);
		btnSapxep.setBackground(new Color(220, 20, 60));
		btnSapxep.setBorder(null);
		btnSapxep.setFont(new Font("Calibri", Font.BOLD, 19));
		panel_3.setLayout(null);
		panel_3.add(cbbSXPhobien);
		panel_3.add(cbbSXLuong);
		panel_3.add(btnSapxep);
		panel_3_1.setLayout(null);
		panel_3_1.add(cbbNganhngheNC);
		panel_3_1.add(cbbTinhthanhNC);
		panel_3_1.add(cbbMucluongNC);
		panel_3_1.add(cbbTrinhdoNC);
		panel_3_1.add(cbbGioitinhNC);
		panel_3_1.add(comboBox_2_1_4_1);
		panel_3_1.add(txtTimkiemNC);
		panel_3_1.add(lbTimkiemNC);
		panel_3_1.add(comboBox_2_1_5_1);
		panel_3_1.add(btnNewButton_1_2);
		panel_2.setLayout(null);
		panel_2.add(btnTuhs);
		panel_2.add(btnVLDaluu);
		panel_2.add(btnVLUngtuyen);
		panel_2.add(btnTaikhoan);
		panel_2.add(btnTimkiemhs);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JPanel panel_4 = new JPanel();
		scrollPane_1.setViewportView(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_4.add(table);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
							.addGap(33)
							.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 849, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(btnTaohs, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
									.addGap(10)
									.addComponent(btnDangTin, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
									.addGap(19)
									.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_5.createSequentialGroup()
											.addGap(152)
											.addComponent(btnTaikhoancn, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))))
							.addGap(133)))
					.addGap(26))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTaohs, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangTin, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTaikhoancn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
						.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)))
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout groupLayout = new GroupLayout(MainFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(65)
					.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lbTitle, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(642)
							.addComponent(lbHotLine, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
					.addGap(21))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(38)
							.addComponent(lbTitle, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbHotLine)))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		MainFrame.getContentPane().setLayout(groupLayout);
	}
}
