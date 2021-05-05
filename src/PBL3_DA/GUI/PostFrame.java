package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

public class PostFrame {

	private JFrame frmTuynDng;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostFrame window = new PostFrame();
					window.frmTuynDng.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PostFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTuynDng = new JFrame();
		frmTuynDng.setTitle("Tuy\u1EC3n d\u1EE5ng");
		frmTuynDng.setResizable(false);
		frmTuynDng.setBounds(100, 100, 630, 600);
		frmTuynDng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTuynDng.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 614, 561);
		frmTuynDng.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		JLabel lbThongtintuyendung = new JLabel("Th\u00F4ng tin tuy\u1EC3n d\u1EE5ng");
		lbThongtintuyendung.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lbTieude = new JLabel("Ti\u00EAu \u0111\u1EC1");
		lbTieude.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTieude.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lbSoluongtuyen = new JLabel("S\u1ED1 l\u01B0\u1EE3ng c\u1EA7n tuy\u1EC3n");
		lbSoluongtuyen.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSoluongtuyen.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lbGioitinh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lbGioitinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lbGioitinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbGioitinh = new JComboBox();
		
		JLabel lbMotacongviec = new JLabel("M\u00F4 t\u1EA3 c\u00F4ng vi\u1EC7c");
		lbMotacongviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMotacongviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JTextArea txtareaMotacv = new JTextArea();
		scrollPane_2.setViewportView(txtareaMotacv);
		
		JLabel lbYeucaucongviec = new JLabel("Y\u00EAu c\u1EA7u c\u00F4ng vi\u1EC7c");
		lbYeucaucongviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbYeucaucongviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		JTextArea txtareaYeucaucv = new JTextArea();
		scrollPane_3.setViewportView(txtareaYeucaucv);
		
		JLabel lbLoaihinhcongviec = new JLabel("Lo\u1EA1i h\u00ECnh c\u00F4ng vi\u1EC7c");
		lbLoaihinhcongviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLoaihinhcongviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbLoaihinhcv = new JComboBox();
		
		JLabel lbKinhnghiemyc = new JLabel("Kinh nghi\u1EC7m y\u00EAu c\u1EA7u");
		lbKinhnghiemyc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbKinhnghiemyc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbKinhnghiem = new JComboBox();
		
		JLabel lbThoigianthuviec = new JLabel("Th\u1EDDi gian th\u1EED vi\u1EC7c");
		lbThoigianthuviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbThoigianthuviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lbQuyenloi = new JLabel("Quy\u1EC1n l\u1EE3i");
		lbQuyenloi.setHorizontalAlignment(SwingConstants.RIGHT);
		lbQuyenloi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane_4 = new JScrollPane();
		
		JTextArea txtareaQuyenloi = new JTextArea();
		scrollPane_4.setViewportView(txtareaQuyenloi);
		
		JLabel lbNganhnghe = new JLabel("Ng\u00E0nh ngh\u1EC1 ");
		lbNganhnghe.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNganhnghe.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbNganhnghe = new JComboBox();
		
		JLabel lbNoilamviec = new JLabel("N\u01A1i l\u00E0m vi\u1EC7c");
		lbNoilamviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNoilamviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbNoilamviec = new JComboBox();
		
		JLabel lbHethan = new JLabel("H\u1EBFt h\u1EA1n");
		lbHethan.setHorizontalAlignment(SwingConstants.RIGHT);
		lbHethan.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel lblThngTinDoanh = new JLabel("Th\u00F4ng tin doanh nghi\u1EC7p");
		lblThngTinDoanh.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lbDoanhnghiepcty = new JLabel("T\u00EAn c\u00F4ng ty/Doanh nghi\u1EC7p");
		lbDoanhnghiepcty.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDoanhnghiepcty.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lbDiachi = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lbDiachi.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDiachi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lbSdt = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lbSdt.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSdt.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lbNhansu = new JLabel("Nh\u00E2n s\u1EF1");
		lbNhansu.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNhansu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lbTinhtp = new JLabel("T\u1EC9nh th\u00E0nh ph\u1ED1");
		lbTinhtp.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTinhtp.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbTinhtp = new JComboBox();
		
		JLabel lbLinhvuchoatdong = new JLabel("L\u0129nh v\u1EF1c ho\u1EA1t \u0111\u1ED9ng");
		lbLinhvuchoatdong.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLinhvuchoatdong.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lbSoluoc = new JLabel("S\u01A1 l\u01B0\u1EE3c c\u00F4ng ty");
		lbSoluoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSoluoc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane_5 = new JScrollPane();
		
		JTextArea txtareaSoluoc = new JTextArea();
		scrollPane_5.setViewportView(txtareaSoluoc);
		
		JButton btnLuutin = new JButton("L\u01B0u tin");
		btnLuutin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLuutin.setBorder(null);
		btnLuutin.setBackground(new Color(220, 20, 60));
		
		JButton btnDangbai = new JButton("\u0110\u0103ng b\u00E0i");
		btnDangbai.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDangbai.setBorder(null);
		btnDangbai.setBackground(new Color(220, 20, 60));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 595, Short.MAX_VALUE)
				.addGap(0, 595, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lbThongtintuyendung, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbTieude, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbSoluongtuyen, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbGioitinh, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(cbbGioitinh, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbMotacongviec, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbYeucaucongviec, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbLoaihinhcongviec, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(cbbLoaihinhcv, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbKinhnghiemyc, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(cbbKinhnghiem, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbThoigianthuviec, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbQuyenloi, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbNganhnghe, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(cbbNganhnghe, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbNoilamviec, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(cbbNoilamviec, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lbHethan, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblThngTinDoanh, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbDoanhnghiepcty)
					.addGap(19)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbDiachi, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbSdt, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbNhansu, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbTinhtp, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(cbbTinhtp, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbLinhvuchoatdong, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbSoluoc, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(185)
					.addComponent(btnLuutin, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(btnDangbai, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1347, Short.MAX_VALUE)
				.addGap(0, 1314, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addComponent(lbThongtintuyendung, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbTieude, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbSoluongtuyen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbGioitinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbGioitinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbMotacongviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbYeucaucongviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbLoaihinhcongviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbLoaihinhcv, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbKinhnghiemyc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbbKinhnghiem, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbThoigianthuviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbQuyenloi, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbNganhnghe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbbNganhnghe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbNoilamviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbbNoilamviec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbHethan, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addComponent(lblThngTinDoanh, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDoanhnghiepcty, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDiachi, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbSdt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbNhansu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbTinhtp, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbbTinhtp, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbLinhvuchoatdong, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbSoluoc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLuutin, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangbai, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
	}
}
