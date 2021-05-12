package PBL3_DA.GUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView.TableRow;


import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DTO.DiaChi;
import PBL3_DA.DTO.ViecLam;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OverviewFrame {

	private JFrame MainFrame;
	private JTextField txtTimkiemNC;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OverviewFrame window = new OverviewFrame();
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
	public OverviewFrame() {
		initialize();
		model = (DefaultTableModel) table.getModel();
		ShowViecLam(BLL_Timviec.Instance().GetListViecLam(1));
	}
	
	public void ShowViecLam(ArrayList<ViecLam> l)
	{
		try 
		{
			model.getDataVector().removeAllElements();
			model.fireTableDataChanged();
			for (ViecLam i : l) 
			{
				DiaChi a = BLL_Timviec.Instance().GetDiaChiById(i.GetIdDC());
				model.addRow(new Object[] {
						i.GetId(), i.GetTieuDe(), i.GetHinhThuc(), i.GetNganhNghe(), i.GetGioiTinhTuyen(), i.GetKinhNghiemTuyen(), i.GetLuongCoBan(), a.GetTinh(), i.GetNgayHetHan(), i.GetTenCT() 
				});
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
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
		
		JTextField txtTimKiem = new JTextField();
		txtTimKiem.setColumns(10);
		
		JComboBox cbbNganhNghe = new JComboBox();
		cbbNganhNghe.setModel(new DefaultComboBoxModel(new String[] {"", "B\u00E1n h\u00E0ng", "T\u01B0 v\u1EA5n b\u1EA3o hi\u1EC3m", "B\u00E1o ch\u00ED/Bi\u00EAn t\u1EADp vi\u00EAn", "B\u1EA5t \u0111\u1ED9ng s\u1EA3n", "Bi\u00EAn d\u1ECBch/Phi\u00EAn d\u1ECBch", "B\u01B0u ch\u00EDnh vi\u1EC5n th\u00F4ng ", "C\u01A1 kh\u00ED/K\u0129 thu\u1EADt \u1EE9ng d\u1EE5ng", "C\u00F4ng ngh\u1EC7 th\u00F4ng tin", "D\u1EA7u kh\u00ED/\u0110\u1ECBa ch\u1EA5t", "D\u1EC7t may", "B\u1EA3o v\u1EC7/V\u1EC7 s\u0129/An ninh", "Ch\u0103m s\u00F3c kh\u00E1ch h\u00E0ng", "\u0110i\u1EC7n/\u0110i\u1EC7n t\u1EED/\u0110i\u1EC7n l\u1EA1nh", "Du l\u1ECBch/Nh\u00E0 h\u00E0ng/Kh\u00E1ch s\u1EA1n", "D\u01B0\u1EE3c/H\u00F3a ch\u1EA5t/Sinh h\u00F3a", "Gi\u1EA3i tr\u00ED/Vui ch\u01A1i", "Gi\u00E1o d\u1EE5c/\u0110\u00E0o t\u1EA1o/Th\u01B0 vi\u1EC7n", "Giao th\u00F4ng/V\u1EADn t\u1EA3i/Th\u1EE7y l\u1EE3i/C\u1EA7u \u0111\u01B0\u1EDDng", "Gi\u00E0y da/Thu\u1ED9c gia", "H\u00E0nh ch\u00EDnh/Th\u01B0 k\u00ED/Tr\u1EE3 l\u00FD", "Kho v\u1EADn/V\u1EADt t\u01B0/Thu mua", "Ki\u1EBFn tr\u00FAc/N\u1ED9i th\u1EA5t", "Kinh doanh", "Lao \u0111\u1ED9ng ph\u1ED5 th\u00F4ng", "Lu\u1EADt/Ph\u00E1p l\u00FD", "M\u00F4i tr\u01B0\u1EDDng/X\u1EED l\u00FD ch\u1EA5t th\u1EA3i", "M\u1EF9 ph\u1EA9m/Th\u1EDDi trang/Trang s\u1EE9c", "Ng\u00E2n h\u00E0ng/Ch\u1EE9ng kho\u00E1ng/\u0110\u1EA7u t\u01B0", "Ngh\u1EC7 thu\u1EADt/\u0110i\u1EC7n \u1EA3nh", "Nh\u00E2n s\u1EF1", "N\u00F4ng/L\u00E2m/Ng\u01B0 nghi\u1EC7p", "Quan h\u1EC7 \u0111\u1ED1i ngo\u1EA1i", "Th\u1EA9m \u0111\u1ECBnh/Gi\u00E1m \u0111\u1ECBnh/Qu\u1EA3n l\u00FD ch\u1EA5t l\u01B0\u1EE3ng", "Qu\u1EA3n l\u00FD \u0111i\u1EC1u h\u00E0nh", "Qu\u1EA3ng c\u00E1o/Marketing/PR", "S\u1EA3n xu\u1EA5t/V\u1EADn h\u00E0nh s\u1EA3n xu\u1EA5t", "T\u00E0i ch\u00EDnh/K\u1EBF to\u00E1n/Ki\u1EC3m to\u00E1n", "Th\u1EC3 d\u1EE5c/Th\u1EC3 thao", "Thi\u1EBFt k\u1EBF/M\u1EF9 thu\u1EADt", "Th\u1EDDi v\u1EE5/B\u00E1n th\u1EDDi gian", "Th\u1EF1c ph\u1EA9m/D\u1ECBch v\u1EE5 an u\u1ED1ng", "X\u00E2y d\u1EF1ng", "Xu\u1EA5t - Nh\u1EADp kh\u1EA9u/Ngo\u1EA1i th\u01B0\u01A1ng", "Y t\u1EBF", "Ngo\u1EA1i ng\u1EEF", "Khu ch\u1EBF xu\u1EA5t/Khu c\u00F4ng nghi\u1EC7p", "L\u00E0m \u0111\u1EB9p/Th\u1EC3 l\u1EF1c/Spa", "T\u00E0i x\u1EBF/L\u00E1i xe/Giao nh\u1EADn", "Trang thi\u1EBFt b\u1ECB c\u00F4ng nghi\u1EC7p", "Trang thi\u1EBFt b\u1ECB gia d\u1EE5ng", "Trang thi\u1EBFt b\u1ECB v\u0103n ph\u00F2ng", "PG/PB/L\u1EC5 t\u00E2n", "Ph\u00E1t tri\u1EC3n th\u1ECB tr\u01B0\u1EDDng", "Ph\u1EE5c v\u1EE5/T\u1EA1p v\u1EE5/Gi\u00FAp vi\u1EC7c"}));
		
		JComboBox cbbTinhThanh = new JComboBox();
		cbbTinhThanh.setModel(new DefaultComboBoxModel(new String[] {"", "H\u00E0 N\u1ED9i", "TP H\u1ED3 Ch\u00ED Minh", "An Giang", "B\u00E0 R\u1ECBa - V\u0169ng T\u00E0u", "B\u1EAFc C\u1EA1n", "B\u1EAFc Giang", "B\u1EA1c Li\u00EAu", "B\u1EAFc Ninh", "B\u1EBFn Tre", "B\u00ECnh D\u01B0\u01A1ng", "B\u00ECnh Ph\u01B0\u1EDBc", "B\u00ECnh Thu\u1EADn", "B\u00ECnh \u0110\u1ECBnh", "C\u00E0 Mau", "C\u1EA7n Th\u01A1", "Cao B\u1EB1ng", "Gia Lai", "H\u00E0 Giang", "H\u00E0 Nam", "H\u00E0 T\u0129nh", "H\u1EA3i D\u01B0\u01A1ng", "H\u1EA3i Ph\u00F2ng", "H\u1EADu Giang", "H\u00F2a B\u00ECnh", "H\u01B0ng Y\u00EAn", "Kh\u00E1nh H\u00F2a", "Ki\u00EAn Giang", "Kon Tum", "Lai Ch\u00E2u", "L\u00E2m \u0110\u1ED3ng", "L\u1EA1ng S\u01A1n", "L\u00E0o Cai", "Long An", "Nam \u0110\u1ECBnh", "Ngh\u1EC7 An", "Ninh B\u00ECnh", "Ninh Thu\u1EADn", "Ph\u00FA Th\u1ECD", "Ph\u00FA Y\u00EAn", "Qu\u1EA3ng B\u00ECnh", "Qu\u1EA3ng Nam", "Qu\u1EA3ng Ng\u00E3i", "Qu\u1EA3ng Ninh", "Qu\u1EA3ng Tr\u1ECB", "S\u00F3c Tr\u0103ng", "S\u01A1 La", "T\u00E2y Ninh", "Th\u00E1i B\u00ECnh", "Th\u00E1i Nguy\u00EAn", "Thanh H\u00F3a", "Th\u1EEBa Thi\u00EAn Hu\u1EBF", "Ti\u1EC1n Giang", "Tr\u00E0 Vinh", "Tuy\u00EAn Quang", "V\u0129nh Long", "V\u0129nh Ph\u00FAc", "Y\u00EAn B\u00E1i", "\u0110\u00E0 N\u0103ng", "\u0110\u1EAFk L\u1EAFk", "\u0110i\u1EC7n Bi\u00EAn", "\u0110\u1ED3ng Nai", "\u0110\u1ED3ng Th\u00E1p"}));
		
		JLabel lbTimKiem = new JLabel("T\u00ECm ki\u1EBFm");
		lbTimKiem.setForeground(new Color(255, 255, 255));
		lbTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lbNganhNghe = new JLabel("Ng\u00E0nh ngh\u1EC1");
		lbNganhNghe.setForeground(new Color(255, 255, 255));
		lbNganhNghe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lbTinhThanh = new JLabel("T\u1EC9nh th\u00E0nh");
		lbTinhThanh.setForeground(new Color(255, 255, 255));
		lbTinhThanh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnTim = new JButton("T\u00ECm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().SearchSimp(txtTimKiem.getText(), (String)cbbNganhNghe.getSelectedItem(), (String)cbbTinhThanh.getSelectedItem(), 1));
			}
		});
		btnTim.setBorder(null);
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setForeground(new Color(0, 0, 0));
		btnTim.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		ImageIcon HotlineIcon = new ImageIcon("D:\\HP\\Pictures\\Saved Pictures\\phone_26px.png");
		JLabel lbHotLine = new JLabel("Hotline:", HotlineIcon, JLabel.CENTER);
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
		JButton btnDangnhap = new JButton("\u0110\u0103ng nh\u1EADp", DangNhapIcon);
		btnDangnhap.setBackground(new Color(51, 102, 204));
		btnDangnhap.setBorder(null);
		btnDangnhap.setForeground(new Color(255, 255, 255));
		btnDangnhap.setFont(new Font("Calibri", Font.BOLD, 18));
		
		ImageIcon DangKyIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\registration_30px.png");
		JButton btnDangky = new JButton("\u0110\u0103ng k\u00FD", DangKyIcon);
		btnDangky.setBackground(new Color(51, 102, 204));
		btnDangky.setBorder(null);
		btnDangky.setForeground(new Color(255, 255, 255));
		btnDangky.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		
		ImageIcon TuhosoIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\document_28px.png");
		JButton btnTuhs = new JButton("T\u1EE7 h\u1ED3 s\u01A1", TuhosoIcon);
		btnTuhs.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTuhs.setBorder(null);
		btnTuhs.setBackground(new Color(135, 206, 250));
		
		ImageIcon DaluuIcon = new ImageIcon("D:\\HP\\Pictures\\Saved Pictures\\download_30px.png");
		JButton btnVLDaluu = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 l\u01B0u", DaluuIcon);
		btnVLDaluu.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLDaluu.setBorder(null);
		btnVLDaluu.setBackground(new Color(135, 206, 250));
		
		ImageIcon UngtuyenIcon = new ImageIcon("D:\\HP\\Pictures\\Saved Pictures\\set_as_resume_27px.png");
		JButton btnVLUngtuyen = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 \u1EE9ng tuy\u1EC3n", UngtuyenIcon);
		btnVLUngtuyen.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLUngtuyen.setBorder(null);
		btnVLUngtuyen.setBackground(new Color(135, 206, 250));
		
		ImageIcon ThietlapIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\edit_file_28px.png");
		JButton btnThietlap = new JButton("Thi\u1EBFt l\u1EADp th\u00F4ng b\u00E1o vi\u1EC7c l\u00E0m",ThietlapIcon);
		btnThietlap.setFont(new Font("Calibri", Font.BOLD, 15));
		btnThietlap.setBorder(null);
		btnThietlap.setBackground(new Color(135, 206, 250));
		
		ImageIcon TaikhoanIcon = new ImageIcon("C:\\Users\\minht\\Java\\PBL3_DA\\src\\PBL3_DA\\IMAGE\\user_30px.png");
		JButton btnTaikhoan = new JButton("T\u00E0i kho\u1EA3n", TaikhoanIcon);
		btnTaikhoan.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTaikhoan.setBorder(null);
		btnTaikhoan.setBackground(new Color(135, 206, 250));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(btnTuhs, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(116)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnVLDaluu, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(168)
							.addComponent(btnVLUngtuyen, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addGap(203))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
							.addComponent(btnThietlap)))
					.addGap(51))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(118)
					.addComponent(btnTaikhoan, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(610, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTuhs, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVLUngtuyen, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThietlap, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnTaikhoan, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnVLDaluu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(70, 130, 180));
		
		JComboBox cbbHinhThuc = new JComboBox();
		cbbHinhThuc.setModel(new DefaultComboBoxModel(new String[] {"", "Gi\u1EDD h\u00E0nh ch\u00EDnh", "Vi\u1EC7c l\u00E0m thu nh\u1EADp cao", "Vi\u1EC7c l\u00E0m th\u00EAm/L\u00E0m vi\u1EC7c ngo\u00E0i gi\u1EDD", "Th\u1EA7u d\u1EF1 \u00E1n/Freelance/Vi\u1EC7c l\u00E0m t\u1EF1 do", "Vi\u1EC7c l\u00E0m online", "Kinh doanh m\u1EA1ng l\u01B0\u1EDBi", "Gi\u00FAp vi\u1EC7c gia \u0111\u00ECnh", "H\u1EE3p t\u00E1c lao \u0111\u1ED9ng n\u01B0\u1EDBc ngo\u00E0i", "Vi\u1EC7c l\u00E0m ng\u01B0\u1EDDi khuy\u1EBFt t\u1EADt", "Vi\u1EC7c l\u00E0m theo ca/\u0110\u1ED5i ca", "Vi\u1EC7c l\u00E0m cho tri th\u1EE9c l\u1EDBn tu\u1ED5i (tr\u00EAn 50 tu\u1ED5i)"}));
		
		JComboBox cbbnganhnghe2 = new JComboBox();
		cbbnganhnghe2.setModel(new DefaultComboBoxModel(new String[] {"", "B\u00E1n h\u00E0ng", "T\u01B0 v\u1EA5n b\u1EA3o hi\u1EC3m", "B\u00E1o ch\u00ED/Bi\u00EAn t\u1EADp vi\u00EAn", "B\u1EA5t \u0111\u1ED9ng s\u1EA3n", "Bi\u00EAn d\u1ECBch/Phi\u00EAn d\u1ECBch", "B\u01B0u ch\u00EDnh vi\u1EC5n th\u00F4ng ", "C\u01A1 kh\u00ED/K\u0129 thu\u1EADt \u1EE9ng d\u1EE5ng", "C\u00F4ng ngh\u1EC7 th\u00F4ng tin", "D\u1EA7u kh\u00ED/\u0110\u1ECBa ch\u1EA5t", "D\u1EC7t may", "B\u1EA3o v\u1EC7/V\u1EC7 s\u0129/An ninh", "Ch\u0103m s\u00F3c kh\u00E1ch h\u00E0ng", "\u0110i\u1EC7n/\u0110i\u1EC7n t\u1EED/\u0110i\u1EC7n l\u1EA1nh", "Du l\u1ECBch/Nh\u00E0 h\u00E0ng/Kh\u00E1ch s\u1EA1n", "D\u01B0\u1EE3c/H\u00F3a ch\u1EA5t/Sinh h\u00F3a", "Gi\u1EA3i tr\u00ED/Vui ch\u01A1i", "Gi\u00E1o d\u1EE5c/\u0110\u00E0o t\u1EA1o/Th\u01B0 vi\u1EC7n", "Giao th\u00F4ng/V\u1EADn t\u1EA3i/Th\u1EE7y l\u1EE3i/C\u1EA7u \u0111\u01B0\u1EDDng", "Gi\u00E0y da/Thu\u1ED9c gia", "H\u00E0nh ch\u00EDnh/Th\u01B0 k\u00ED/Tr\u1EE3 l\u00FD", "Kho v\u1EADn/V\u1EADt t\u01B0/Thu mua", "Ki\u1EBFn tr\u00FAc/N\u1ED9i th\u1EA5t", "Kinh doanh", "Lao \u0111\u1ED9ng ph\u1ED5 th\u00F4ng", "Lu\u1EADt/Ph\u00E1p l\u00FD", "M\u00F4i tr\u01B0\u1EDDng/X\u1EED l\u00FD ch\u1EA5t th\u1EA3i", "M\u1EF9 ph\u1EA9m/Th\u1EDDi trang/Trang s\u1EE9c", "Ng\u00E2n h\u00E0ng/Ch\u1EE9ng kho\u00E1ng/\u0110\u1EA7u t\u01B0", "Ngh\u1EC7 thu\u1EADt/\u0110i\u1EC7n \u1EA3nh", "Nh\u00E2n s\u1EF1", "N\u00F4ng/L\u00E2m/Ng\u01B0 nghi\u1EC7p", "Quan h\u1EC7 \u0111\u1ED1i ngo\u1EA1i", "Th\u1EA9m \u0111\u1ECBnh/Gi\u00E1m \u0111\u1ECBnh/Qu\u1EA3n l\u00FD ch\u1EA5t l\u01B0\u1EE3ng", "Qu\u1EA3n l\u00FD \u0111i\u1EC1u h\u00E0nh", "Qu\u1EA3ng c\u00E1o/Marketing/PR", "S\u1EA3n xu\u1EA5t/V\u1EADn h\u00E0nh s\u1EA3n xu\u1EA5t", "T\u00E0i ch\u00EDnh/K\u1EBF to\u00E1n/Ki\u1EC3m to\u00E1n", "Th\u1EC3 d\u1EE5c/Th\u1EC3 thao", "Thi\u1EBFt k\u1EBF/M\u1EF9 thu\u1EADt", "Th\u1EDDi v\u1EE5/B\u00E1n th\u1EDDi gian", "Th\u1EF1c ph\u1EA9m/D\u1ECBch v\u1EE5 an u\u1ED1ng", "X\u00E2y d\u1EF1ng", "Xu\u1EA5t - Nh\u1EADp kh\u1EA9u/Ngo\u1EA1i th\u01B0\u01A1ng", "Y t\u1EBF", "Ngo\u1EA1i ng\u1EEF", "Khu ch\u1EBF xu\u1EA5t/Khu c\u00F4ng nghi\u1EC7p", "L\u00E0m \u0111\u1EB9p/Th\u1EC3 l\u1EF1c/Spa", "T\u00E0i x\u1EBF/L\u00E1i xe/Giao nh\u1EADn", "Trang thi\u1EBFt b\u1ECB c\u00F4ng nghi\u1EC7p", "Trang thi\u1EBFt b\u1ECB gia d\u1EE5ng", "Trang thi\u1EBFt b\u1ECB v\u0103n ph\u00F2ng", "PG/PB/L\u1EC5 t\u00E2n", "Ph\u00E1t tri\u1EC3n th\u1ECB tr\u01B0\u1EDDng", "Ph\u1EE5c v\u1EE5/T\u1EA1p v\u1EE5/Gi\u00FAp vi\u1EC7c"}));
		
		JComboBox cbbGioitinh = new JComboBox();
		cbbGioitinh.setModel(new DefaultComboBoxModel(new String[] {"", "Kh\u00F4ng y\u00EAu c\u1EA7u", "Nam", "N\u1EEF"}));
		
		JComboBox cbbKinhNghiem = new JComboBox();
		cbbKinhNghiem.setModel(new DefaultComboBoxModel(new String[] {"", "Kh\u00F4ng y\u00EAu c\u1EA7u", "D\u01B0\u1EDBi 1 n\u0103m", "Tr\u00EAn 1 n\u0103m", "Tr\u00EAn 2 n\u0103m", "Tr\u00EAn 3 n\u0103m", "Tr\u00EAn 4 n\u0103m", "Tr\u00EAn 5 n\u0103m"}));
		
		JComboBox cbbLuong = new JComboBox();
		cbbLuong.setModel(new DefaultComboBoxModel(new String[] {"", "0 - 3 tri\u1EC7u", "3 - 5 tri\u1EC7u", "5 - 7 tri\u1EC7u", "7 - 10 tri\u1EC7u", "10 - 12 tri\u1EC7u", "12 - 15 tri\u1EC7u", "15 - 20 tri\u1EC7u", "20 - 25 tri\u1EC7u", "25 - 30 tri\u1EC7u", "30 - 40 tri\u1EC7u", "40 - 50 tri\u1EC7u ", "Tr\u00EAn 50 tri\u1EC7u"}));
		
		JComboBox cbbTinh = new JComboBox();
		cbbTinh.setModel(new DefaultComboBoxModel(new String[] {"", "H\u00E0 N\u1ED9i", "TP H\u1ED3 Ch\u00ED Minh", "An Giang", "B\u00E0 R\u1ECBa - V\u0169ng T\u00E0u", "B\u1EAFc C\u1EA1n", "B\u1EAFc Giang", "B\u1EA1c Li\u00EAu", "B\u1EAFc Ninh", "B\u1EBFn Tre", "B\u00ECnh D\u01B0\u01A1ng", "B\u00ECnh Ph\u01B0\u1EDBc", "B\u00ECnh Thu\u1EADn", "B\u00ECnh \u0110\u1ECBnh", "C\u00E0 Mau", "C\u1EA7n Th\u01A1", "Cao B\u1EB1ng", "Gia Lai", "H\u00E0 Giang", "H\u00E0 Nam", "H\u00E0 T\u0129nh", "H\u1EA3i D\u01B0\u01A1ng", "H\u1EA3i Ph\u00F2ng", "H\u1EADu Giang", "H\u00F2a B\u00ECnh", "H\u01B0ng Y\u00EAn", "Kh\u00E1nh H\u00F2a", "Ki\u00EAn Giang", "Kon Tum", "Lai Ch\u00E2u", "L\u00E2m \u0110\u1ED3ng", "L\u1EA1ng S\u01A1n", "L\u00E0o Cai", "Long An", "Nam \u0110\u1ECBnh", "Ngh\u1EC7 An", "Ninh B\u00ECnh", "Ninh Thu\u1EADn", "Ph\u00FA Th\u1ECD", "Ph\u00FA Y\u00EAn", "Qu\u1EA3ng B\u00ECnh", "Qu\u1EA3ng Nam", "Qu\u1EA3ng Ng\u00E3i", "Qu\u1EA3ng Ninh", "Qu\u1EA3ng Tr\u1ECB", "S\u00F3c Tr\u0103ng", "S\u01A1 La", "T\u00E2y Ninh", "Th\u00E1i B\u00ECnh", "Th\u00E1i Nguy\u00EAn", "Thanh H\u00F3a", "Th\u1EEBa Thi\u00EAn Hu\u1EBF", "Ti\u1EC1n Giang", "Tr\u00E0 Vinh", "Tuy\u00EAn Quang", "V\u0129nh Long", "V\u0129nh Ph\u00FAc", "Y\u00EAn B\u00E1i", "\u0110\u00E0 N\u0103ng", "\u0110\u1EAFk L\u1EAFk", "\u0110i\u1EC7n Bi\u00EAn", "\u0110\u1ED3ng Nai", "\u0110\u1ED3ng Th\u00E1p"}));
		
		txtTimkiemNC = new JTextField();
		txtTimkiemNC.setColumns(10);
		
		JLabel lbTimkiemNC = new JLabel("T\u00CCM KI\u1EBEM N\u00C2NG CAO");
		lbTimkiemNC.setFont(new Font("Calibri", Font.BOLD, 21));
		
		JButton btnTimkiem2 = new JButton("T\u00ECm ki\u1EBFm");
		btnTimkiem2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().ListViecLam(txtTimkiemNC.getText(), 
						(String)cbbHinhThuc.getSelectedItem(), (String)cbbnganhnghe2.getSelectedItem(), 
						(String)cbbGioitinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
						(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1));
			}
		});
		btnTimkiem2.setForeground(Color.WHITE);
		btnTimkiem2.setFont(new Font("Calibri", Font.BOLD, 19));
		btnTimkiem2.setBorder(null);
		btnTimkiem2.setBackground(Color.RED);
		GroupLayout gl_panel_3_1 = new GroupLayout(panel_3_1);
		gl_panel_3_1.setHorizontalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbHinhThuc, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbnganhnghe2, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbGioitinh, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbKinhNghiem, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbLuong, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(cbbTinh, 0, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addGap(46)
					.addComponent(txtTimkiemNC, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap(76, Short.MAX_VALUE)
					.addComponent(lbTimkiemNC, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addGap(68))
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addComponent(btnTimkiem2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
		);
		gl_panel_3_1.setVerticalGroup(
			gl_panel_3_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbTimkiemNC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtTimkiemNC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbHinhThuc, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbnganhnghe2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbGioitinh, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbKinhNghiem, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbLuong, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbbTinh, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(btnTimkiem2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_3_1.setLayout(gl_panel_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(btnTaohs, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(btnDangTin, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
							.addGap(19)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
									.addComponent(btnDangky, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(btnDangnhap, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE))))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(161))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTaohs, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangTin, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangky, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDangnhap, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrollPane_1)
						.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
					.addGap(39))
		);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Ti\u00EAu \u0111\u1EC1", "H\u00ECnh th\u1EE9c", "Ng\u00E0nh ngh\u1EC1", "Gi\u01A1i t\u00EDnh", "Kinh nghi\u1EC7m", "L\u01B0\u01A1ng", "\u0110\u1ECBa ch\u1EC9", "Ng\u00E0y h\u1EBFt h\u1EA1n", "T\u00EAn c\u00F4ng ty"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		table.getColumnModel().getColumn(1).setPreferredWidth(215);
		table.getColumnModel().getColumn(2).setPreferredWidth(128);
		table.getColumnModel().getColumn(3).setPreferredWidth(133);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(5).setPreferredWidth(129);
		table.getColumnModel().getColumn(6).setPreferredWidth(123);
		table.getColumnModel().getColumn(7).setPreferredWidth(114);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(9).setPreferredWidth(205);
		
		JComboBox cbbSort1 = new JComboBox();
		cbbSort1.setModel(new DefaultComboBoxModel(new String[] {"Ti\u00EAu \u0111\u1EC1", "H\u00ECnh th\u1EE9c", "Ng\u00E0nh ngh\u1EC1", "L\u01B0\u01A1ng", "Kinh nghi\u1EC7m", "Ng\u00E0y h\u1EBFt h\u1EA1n"}));
		
		JComboBox cbbSXGioLam = new JComboBox();
		cbbSXGioLam.setModel(new DefaultComboBoxModel(new String[] {"T\u0103ng d\u1EA7n", "Gi\u1EA3m d\u1EA7n"}));
		
		JButton btnSapxep = new JButton("Refresh ");
		btnSapxep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(1));
			}
		});
		btnSapxep.setForeground(SystemColor.desktop);
		btnSapxep.setBackground(new Color(220, 20, 60));
		btnSapxep.setBorder(null);
		btnSapxep.setFont(new Font("Calibri", Font.BOLD, 19));
		
		JButton btnSapxep_1 = new JButton("S\u1EAFp x\u1EBFp");
		btnSapxep_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cv = cbbSort1.getSelectedIndex();
				if(cbbSXGioLam.getSelectedIndex() == 0)
				{
					ShowViecLam(BLL_Timviec.Instance().Sort(cv, txtTimkiemNC.getText(), 
							(String)cbbHinhThuc.getSelectedItem(), (String)cbbnganhnghe2.getSelectedItem(), 
							(String)cbbGioitinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
							(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1));
				}
				else
				{
					ArrayList<ViecLam> l = BLL_Timviec.Instance().Sort(cv, txtTimkiemNC.getText(), 
							(String)cbbHinhThuc.getSelectedItem(), (String)cbbnganhnghe2.getSelectedItem(), 
							(String)cbbGioitinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
							(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1);
					Collections.reverse(l);
					ShowViecLam(l);
				}
			}
		});
		btnSapxep_1.setForeground(Color.BLACK);
		btnSapxep_1.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSapxep_1.setBorder(null);
		btnSapxep_1.setBackground(new Color(220, 20, 60));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(btnSapxep_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbSort1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbSXGioLam, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnSapxep, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(378, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSapxep_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbSort1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbSXGioLam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSapxep, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
					.addContainerGap())
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(65)
					.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lbTitle, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(86)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(216)
							.addComponent(lbHotLine, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
							.addGap(1))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtTimKiem, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
									.addGap(9))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lbTimKiem, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(cbbNganhNghe, 0, 177, Short.MAX_VALUE)
									.addGap(11))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lbNganhNghe, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(cbbTinhThanh, 0, 128, Short.MAX_VALUE)
									.addGap(10)
									.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
								.addComponent(lbTinhThanh, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(lbTitle, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lbHotLine)
					.addGap(1)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbTinhThanh, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbNganhNghe, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTimKiem, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTimKiem, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbNganhNghe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbTinhThanh, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		MainFrame.getContentPane().setLayout(groupLayout);
	}
}
