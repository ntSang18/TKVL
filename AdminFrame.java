package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DTO.DiaChi;
import PBL3_DA.DTO.ViecLam;

import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminFrame {

	private JFrame frame;
	private JTable table;
	private JTextField txtTimKiem;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame window = new AdminFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminFrame() {
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
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 1000, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JComboBox CbbSort1 = new JComboBox();
		JComboBox CbbSort2 = new JComboBox();
		JComboBox cbbHinhThuc = new JComboBox();
		JComboBox cbbNganhNghe = new JComboBox();
		JComboBox cbbGioiTinh = new JComboBox();
		JComboBox cbbKinhNghiem = new JComboBox();
		JComboBox cbbLuong = new JComboBox();
		JComboBox cbbTinh = new JComboBox();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 161, 158, 351);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_head = new JPanel();
		panel_head.setBackground(new Color(70, 130, 180));
		panel_head.setBounds(0, 0, 158, 150);
		frame.getContentPane().add(panel_head);
		panel_head.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(0, 50, 155, 26);
		panel_head.add(lblNewLabel);
		
		
		
		JButton btnQunTrCng = new JButton("Qu\u1EA3n tr\u1ECB c\u00F4ng vi\u1EC7c");
		btnQunTrCng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageFrame mng = new ManageFrame();
				mng.setVisible(true);
			}
		});
		btnQunTrCng.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQunTrCng.setBackground(new Color(204, 204, 255));
		btnQunTrCng.setBorder(null);
		btnQunTrCng.setBounds(0, 37, 157, 75);
		panel.add(btnQunTrCng);
		
		JButton btnQunTrCng_1_1 = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnQunTrCng_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQunTrCng_1_1.setBackground(new Color(204, 204, 255));
		btnQunTrCng_1_1.setBorder(null);
		btnQunTrCng_1_1.setBounds(0, 156, 157, 69);
		panel.add(btnQunTrCng_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(168, 0, 816, 59);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng ng\u01B0\u1EDDi d\u00F9ng:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(466, 11, 151, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSoLuongUser = new JLabel("");
		lblSoLuongUser.setForeground(new Color(255, 255, 255));
		lblSoLuongUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoLuongUser.setText(String.valueOf(BLL_Timviec.Instance().GetCountUser()));
		lblSoLuongUser.setBounds(624, 11, 122, 34);
		panel_1.add(lblSoLuongUser);
		
		JLabel lblSoLuongCV = new JLabel("");
		lblSoLuongCV.setForeground(new Color(255, 255, 255));
		lblSoLuongCV.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoLuongCV.setText(String.valueOf(BLL_Timviec.Instance().GetCountViecLam(1)));
		lblSoLuongCV.setBackground(new Color(255, 255, 255));
		lblSoLuongCV.setBounds(301, 11, 122, 34);
		panel_1.add(lblSoLuongCV);
		
		JLabel lblNewLabel_1_3 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng c\u00F4ng vi\u1EC7c:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(158, 11, 142, 34);
		panel_1.add(lblNewLabel_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(168, 70, 595, 442);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 59, 585, 372);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e)
			{
				if(e.getClickCount() == 2)
				{
					int id = (int) table.getValueAt(table.getSelectedRow(), 0);
					DetailFrame dt = new DetailFrame(id, 1);
				}
			}
		});
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
		
		JButton btnRh_1 = new JButton("Refresh");
		btnRh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//model.fireTableDataChanged();
				lblSoLuongCV.setText(String.valueOf(BLL_Timviec.Instance().GetCountViecLam(1)));
				lblSoLuongUser.setText(String.valueOf(BLL_Timviec.Instance().GetCountUser()));
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(1));
			}
		});
		btnRh_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRh_1.setBorder(null);
		btnRh_1.setBackground(new Color(220, 20, 60));
		btnRh_1.setBounds(489, 11, 96, 37);
		panel_2.add(btnRh_1);
		
		
		JButton btnSpXp = new JButton("S\u1EAFp x\u1EBFp");
		btnSpXp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cv = CbbSort1.getSelectedIndex();
				if(CbbSort2.getSelectedIndex() == 0)
				{
					ShowViecLam(BLL_Timviec.Instance().Sort(cv, txtTimKiem.getText(), 
							(String)cbbHinhThuc.getSelectedItem(), (String)cbbNganhNghe.getSelectedItem(), 
							(String)cbbGioiTinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
							(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1));
				}
				else
				{
					ArrayList<ViecLam> l = BLL_Timviec.Instance().Sort(cv, txtTimKiem.getText(), 
							(String)cbbHinhThuc.getSelectedItem(), (String)cbbNganhNghe.getSelectedItem(), 
							(String)cbbGioiTinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
							(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1);
					Collections.reverse(l);
					ShowViecLam(l);
				}
			}
		});
		btnSpXp.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSpXp.setBorder(null);
		btnSpXp.setBackground(new Color(220, 20, 60));
		btnSpXp.setBounds(10, 11, 96, 37);
		panel_2.add(btnSpXp);
		
		
		CbbSort1.setModel(new DefaultComboBoxModel(new String[] {"Ti\u00EAu \u0111\u1EC1", "H\u00ECnh th\u1EE9c", "Ng\u00E0nh ngh\u1EC1", "L\u01B0\u01A1ng", "Kinh nghi\u1EC7m", "Ng\u00E0y h\u1EBFt h\u1EA1n"}));
		CbbSort1.setBounds(116, 11, 126, 37);
		panel_2.add(CbbSort1);
		
		
		CbbSort2.setModel(new DefaultComboBoxModel(new String[] {"T\u0103ng d\u1EA7n", "Gi\u1EA3m d\u1EA7n"}));
		CbbSort2.setBounds(252, 11, 119, 37);
		panel_2.add(CbbSort2);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = (int) table.getValueAt(table.getSelectedRow(), 0);
				BLL_Timviec.Instance().DeleteVieclLamById(id);
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(1));
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBorder(null);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(383, 11, 96, 37);
		panel_2.add(btnDelete);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBounds(765, 70, 219, 442);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("T\u00ECm ki\u1EBFm ");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(73, 11, 68, 39);
		panel_3.add(lblNewLabel_1_3_1);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(10, 61, 199, 30);
		panel_3.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		
		cbbHinhThuc.setModel(new DefaultComboBoxModel(new String[] {"", "Gi\u1EDD h\u00E0nh ch\u00EDnh", "Vi\u1EC7c l\u00E0m thu nh\u1EADp cao", "Vi\u1EC7c l\u00E0m th\u00EAm/L\u00E0m vi\u1EC7c ngo\u00E0i gi\u1EDD", "Th\u1EA7u d\u1EF1 \u00E1n/Freelance/Vi\u1EC7c l\u00E0m t\u1EF1 do", "Vi\u1EC7c l\u00E0m online", "Kinh doanh m\u1EA1ng l\u01B0\u1EDBi", "Gi\u00FAp vi\u1EC7c gia \u0111\u00ECnh", "H\u1EE3p t\u00E1c lao \u0111\u1ED9ng n\u01B0\u1EDBc ngo\u00E0i", "Vi\u1EC7c l\u00E0m ng\u01B0\u1EDDi khuy\u1EBFt t\u1EADt", "Vi\u1EC7c l\u00E0m theo ca/\u0110\u1ED5i ca", "Vi\u1EC7c l\u00E0m cho tri th\u1EE9c l\u1EDBn tu\u1ED5i (tr\u00EAn 50 tu\u1ED5i)"}));
		cbbHinhThuc.setBounds(10, 102, 199, 33);
		panel_3.add(cbbHinhThuc);
		
		
		cbbNganhNghe.setModel(new DefaultComboBoxModel(new String[] {"", "B\u00E1n h\u00E0ng", "T\u01B0 v\u1EA5n b\u1EA3o hi\u1EC3m", "B\u00E1o ch\u00ED/Bi\u00EAn t\u1EADp vi\u00EAn", "B\u1EA5t \u0111\u1ED9ng s\u1EA3n", "Bi\u00EAn d\u1ECBch/Phi\u00EAn d\u1ECBch", "B\u01B0u ch\u00EDnh vi\u1EC5n th\u00F4ng ", "C\u01A1 kh\u00ED/K\u0129 thu\u1EADt \u1EE9ng d\u1EE5ng", "C\u00F4ng ngh\u1EC7 th\u00F4ng tin", "D\u1EA7u kh\u00ED/\u0110\u1ECBa ch\u1EA5t", "D\u1EC7t may", "B\u1EA3o v\u1EC7/V\u1EC7 s\u0129/An ninh", "Ch\u0103m s\u00F3c kh\u00E1ch h\u00E0ng", "\u0110i\u1EC7n/\u0110i\u1EC7n t\u1EED/\u0110i\u1EC7n l\u1EA1nh", "Du l\u1ECBch/Nh\u00E0 h\u00E0ng/Kh\u00E1ch s\u1EA1n", "D\u01B0\u1EE3c/H\u00F3a ch\u1EA5t/Sinh h\u00F3a", "Gi\u1EA3i tr\u00ED/Vui ch\u01A1i", "Gi\u00E1o d\u1EE5c/\u0110\u00E0o t\u1EA1o/Th\u01B0 vi\u1EC7n", "Giao th\u00F4ng/V\u1EADn t\u1EA3i/Th\u1EE7y l\u1EE3i/C\u1EA7u \u0111\u01B0\u1EDDng", "Gi\u00E0y da/Thu\u1ED9c gia", "H\u00E0nh ch\u00EDnh/Th\u01B0 k\u00ED/Tr\u1EE3 l\u00FD", "Kho v\u1EADn/V\u1EADt t\u01B0/Thu mua", "Ki\u1EBFn tr\u00FAc/N\u1ED9i th\u1EA5t", "Kinh doanh", "Lao \u0111\u1ED9ng ph\u1ED5 th\u00F4ng", "Lu\u1EADt/Ph\u00E1p l\u00FD", "M\u00F4i tr\u01B0\u1EDDng/X\u1EED l\u00FD ch\u1EA5t th\u1EA3i", "M\u1EF9 ph\u1EA9m/Th\u1EDDi trang/Trang s\u1EE9c", "Ng\u00E2n h\u00E0ng/Ch\u1EE9ng kho\u00E1ng/\u0110\u1EA7u t\u01B0", "Ngh\u1EC7 thu\u1EADt/\u0110i\u1EC7n \u1EA3nh", "Nh\u00E2n s\u1EF1", "N\u00F4ng/L\u00E2m/Ng\u01B0 nghi\u1EC7p", "Quan h\u1EC7 \u0111\u1ED1i ngo\u1EA1i", "Th\u1EA9m \u0111\u1ECBnh/Gi\u00E1m \u0111\u1ECBnh/Qu\u1EA3n l\u00FD ch\u1EA5t l\u01B0\u1EE3ng", "Qu\u1EA3n l\u00FD \u0111i\u1EC1u h\u00E0nh", "Qu\u1EA3ng c\u00E1o/Marketing/PR", "S\u1EA3n xu\u1EA5t/V\u1EADn h\u00E0nh s\u1EA3n xu\u1EA5t", "T\u00E0i ch\u00EDnh/K\u1EBF to\u00E1n/Ki\u1EC3m to\u00E1n", "Th\u1EC3 d\u1EE5c/Th\u1EC3 thao", "Thi\u1EBFt k\u1EBF/M\u1EF9 thu\u1EADt", "Th\u1EDDi v\u1EE5/B\u00E1n th\u1EDDi gian", "Th\u1EF1c ph\u1EA9m/D\u1ECBch v\u1EE5 an u\u1ED1ng", "X\u00E2y d\u1EF1ng", "Xu\u1EA5t - Nh\u1EADp kh\u1EA9u/Ngo\u1EA1i th\u01B0\u01A1ng", "Y t\u1EBF", "Ngo\u1EA1i ng\u1EEF", "Khu ch\u1EBF xu\u1EA5t/Khu c\u00F4ng nghi\u1EC7p", "L\u00E0m \u0111\u1EB9p/Th\u1EC3 l\u1EF1c/Spa", "T\u00E0i x\u1EBF/L\u00E1i xe/Giao nh\u1EADn", "Trang thi\u1EBFt b\u1ECB c\u00F4ng nghi\u1EC7p", "Trang thi\u1EBFt b\u1ECB gia d\u1EE5ng", "Trang thi\u1EBFt b\u1ECB v\u0103n ph\u00F2ng", "PG/PB/L\u1EC5 t\u00E2n", "Ph\u00E1t tri\u1EC3n th\u1ECB tr\u01B0\u1EDDng", "Ph\u1EE5c v\u1EE5/T\u1EA1p v\u1EE5/Gi\u00FAp vi\u1EC7c"}));
		cbbNganhNghe.setBounds(10, 146, 199, 33);
		panel_3.add(cbbNganhNghe);
		
		
		cbbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"", "Kh\u00F4ng y\u00EAu c\u1EA7u", "Nam", "N\u1EEF"}));
		cbbGioiTinh.setBounds(10, 190, 199, 33);
		panel_3.add(cbbGioiTinh);
		
		
		cbbKinhNghiem.setModel(new DefaultComboBoxModel(new String[] {"", "Kh\u00F4ng y\u00EAu c\u1EA7u", "D\u01B0\u1EDBi 1 n\u0103m", "Tr\u00EAn 1 n\u0103m", "Tr\u00EAn 2 n\u0103m", "Tr\u00EAn 3 n\u0103m", "Tr\u00EAn 4 n\u0103m", "Tr\u00EAn 5 n\u0103m"}));
		cbbKinhNghiem.setBounds(10, 234, 199, 33);
		panel_3.add(cbbKinhNghiem);
		
		
		cbbLuong.setModel(new DefaultComboBoxModel(new String[] {"", "0 - 3 tri\u1EC7u", "3 - 5 tri\u1EC7u", "5 - 7 tri\u1EC7u", "7 - 10 tri\u1EC7u", "10 - 12 tri\u1EC7u", "12 - 15 tri\u1EC7u", "15 - 20 tri\u1EC7u", "20 - 25 tri\u1EC7u", "25 - 30 tri\u1EC7u", "30 - 40 tri\u1EC7u", "40 - 50 tri\u1EC7u ", "Tr\u00EAn 50 tri\u1EC7u"}));
		cbbLuong.setBounds(10, 278, 199, 33);
		panel_3.add(cbbLuong);
		
		
		cbbTinh.setModel(new DefaultComboBoxModel(new String[] {"", "H\u00E0 N\u1ED9i", "TP H\u1ED3 Ch\u00ED Minh", "An Giang", "B\u00E0 R\u1ECBa - V\u0169ng T\u00E0u", "B\u1EAFc C\u1EA1n", "B\u1EAFc Giang", "B\u1EA1c Li\u00EAu", "B\u1EAFc Ninh", "B\u1EBFn Tre", "B\u00ECnh D\u01B0\u01A1ng", "B\u00ECnh Ph\u01B0\u1EDBc", "B\u00ECnh Thu\u1EADn", "B\u00ECnh \u0110\u1ECBnh", "C\u00E0 Mau", "C\u1EA7n Th\u01A1", "Cao B\u1EB1ng", "Gia Lai", "H\u00E0 Giang", "H\u00E0 Nam", "H\u00E0 T\u0129nh", "H\u1EA3i D\u01B0\u01A1ng", "H\u1EA3i Ph\u00F2ng", "H\u1EADu Giang", "H\u00F2a B\u00ECnh", "H\u01B0ng Y\u00EAn", "Kh\u00E1nh H\u00F2a", "Ki\u00EAn Giang", "Kon Tum", "Lai Ch\u00E2u", "L\u00E2m \u0110\u1ED3ng", "L\u1EA1ng S\u01A1n", "L\u00E0o Cai", "Long An", "Nam \u0110\u1ECBnh", "Ngh\u1EC7 An", "Ninh B\u00ECnh", "Ninh Thu\u1EADn", "Ph\u00FA Th\u1ECD", "Ph\u00FA Y\u00EAn", "Qu\u1EA3ng B\u00ECnh", "Qu\u1EA3ng Nam", "Qu\u1EA3ng Ng\u00E3i", "Qu\u1EA3ng Ninh", "Qu\u1EA3ng Tr\u1ECB", "S\u00F3c Tr\u0103ng", "S\u01A1 La", "T\u00E2y Ninh", "Th\u00E1i B\u00ECnh", "Th\u00E1i Nguy\u00EAn", "Thanh H\u00F3a", "Th\u1EEBa Thi\u00EAn Hu\u1EBF", "Ti\u1EC1n Giang", "Tr\u00E0 Vinh", "Tuy\u00EAn Quang", "V\u0129nh Long", "V\u0129nh Ph\u00FAc", "Y\u00EAn B\u00E1i", "\u0110\u00E0 N\u0103ng", "\u0110\u1EAFk L\u1EAFk", "\u0110i\u1EC7n Bi\u00EAn", "\u0110\u1ED3ng Nai", "\u0110\u1ED3ng Th\u00E1p"}));
		cbbTinh.setBounds(10, 322, 199, 33);
		panel_3.add(cbbTinh);
		
		JButton btnTimKim = new JButton("T\u00ECm Ki\u1EBFm");
		btnTimKim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.fireTableDataChanged();
				ShowViecLam(BLL_Timviec.Instance().ListViecLam(txtTimKiem.getText(), 
						(String)cbbHinhThuc.getSelectedItem(), (String)cbbNganhNghe.getSelectedItem(), 
						(String)cbbGioiTinh.getSelectedItem(), (String)cbbKinhNghiem.getSelectedItem(), 
						(String)cbbLuong.getSelectedItem(), (String)cbbTinh.getSelectedItem(), 1));
			}
		});
		btnTimKim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTimKim.setBorder(null);
		btnTimKim.setBackground(new Color(220, 20, 60));
		btnTimKim.setBounds(60, 383, 96, 37);
		panel_3.add(btnTimKim);
	}
}
