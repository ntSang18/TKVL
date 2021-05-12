package PBL3_DA.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DTO.DiaChi;
import PBL3_DA.DTO.ViecLam;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Create the frame.
	 */
	public ManageFrame() 
	{
		initalize();
		model = (DefaultTableModel) table.getModel();
		ShowViecLam(BLL_Timviec.Instance().GetListViecLam(0));
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
	
	
	
	
	public void initalize()
	{
		this.setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane txtSearch = new JTextPane();
		JComboBox cbbSort = new JComboBox();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(10, 11, 964, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD C\u00D4NG VI\u1EC6C CH\u1EDC DUY\u1EC6T");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 11, 310, 24);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 68, 693, 382);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 693, 382);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e)
			{
				if(e.getClickCount() == 2)
				{
					int id = (int) table.getValueAt(table.getSelectedRow(), 0);
					DetailFrame dt = new DetailFrame(id, 0);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(713, 68, 261, 218);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("T\u00ECm ki\u1EBFm");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().SearchByTxtAdmin(txtSearch.getText()));
			}
		});
		btnNewButton_2_1.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBounds(10, 11, 89, 30);
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("S\u1EAFp x\u1EBFp");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cv = cbbSort.getSelectedIndex();
				ShowViecLam(BLL_Timviec.Instance().SortByTxtAdmin(cv, txtSearch.getText()));
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1_1.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1_1.setBorder(null);
		btnNewButton_2_1_1.setBounds(10, 52, 89, 30);
		panel_2.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Refresh");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(0));
			}
		});
		btnNewButton_2_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1_2.setBorder(null);
		btnNewButton_2_1_2.setBounds(10, 93, 241, 30);
		panel_2.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("Duy\u1EC7t vi\u1EC7c l\u00E0m");
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = (int) table.getValueAt(table.getSelectedRow(), 0);
				BLL_Timviec.Instance().UpdateDuyet(id);
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(0));
			}
		});
		btnNewButton_2_1_3.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1_3.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1_3.setBorder(null);
		btnNewButton_2_1_3.setBounds(10, 134, 241, 30);
		panel_2.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_2_1_4 = new JButton("X\u00F3a ");
		btnNewButton_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = (int) table.getValueAt(table.getSelectedRow(), 0);
				BLL_Timviec.Instance().DeleteVieclLamById(id);
				ShowViecLam(BLL_Timviec.Instance().GetListViecLam(0));
			}
		});
		btnNewButton_2_1_4.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1_4.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1_4.setBorder(null);
		btnNewButton_2_1_4.setBounds(10, 175, 241, 30);
		panel_2.add(btnNewButton_2_1_4);
		
		
		txtSearch.setBounds(109, 11, 142, 30);
		panel_2.add(txtSearch);
		
		
		cbbSort.setBounds(109, 52, 142, 30);
		panel_2.add(cbbSort);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBounds(713, 297, 261, 153);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("QU\u1EA2N L\u00DD C\u00D4NG VI\u1EC6C \u0110\u00C3 DUY\u1EC6T ");
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 11, 241, 26);
		panel_3.add(lblNewLabel_1);
		
		JButton btnNewButton_2_1_3_1 = new JButton("X\u00F3a c\u00F4ng vi\u1EC7c h\u1EBFt h\u1EA1n");
		btnNewButton_2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BLL_Timviec.Instance().DeleteViecLamHetHan();
			}
		});
		btnNewButton_2_1_3_1.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1_3_1.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1_3_1.setBorder(null);
		btnNewButton_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_3_1.setBounds(10, 48, 241, 30);
		panel_3.add(btnNewButton_2_1_3_1);		
			}
}
