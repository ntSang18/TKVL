package PBL3_DA.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DTO.DiaChi;
import PBL3_DA.DTO.ViecLam;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SaveFrame extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;
	private DefaultTableModel model;
	private int iduser;
	/**
	 * Create the frame.
	 */
	public SaveFrame() {
		initialize();
		model = (DefaultTableModel) table.getModel();
		iduser = 1;
		ShowViecLam(BLL_Timviec.Instance().GetListViecLamLuu(iduser));
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
	
	
	public void initialize()
	{
		this.setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(10, 11, 964, 43);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD C\u00D4NG VI\u1EC6C \u0110\u00C3 L\u01AFU");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 11, 256, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 65, 694, 385);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 684, 385);
		panel_1.add(scrollPane);
		
		table = new JTable();
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
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(714, 65, 260, 385);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		JButton btnNewButton = new JButton("Sort ");
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cv = comboBox.getSelectedIndex();
				ShowViecLam(BLL_Timviec.Instance().SortByTxtUser(cv, txtSearch.getText(), iduser));
			}
		});
		btnNewButton.setBounds(10, 52, 89, 30);
		panel_2.add(btnNewButton);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ti\u00EAu \u0111\u1EC1", "H\u00ECnh th\u1EE9c", "Ng\u00E0nh ngh\u1EC1", "L\u01B0\u01A1ng", "Kinh nghi\u1EC7m", "Ng\u00E0y h\u1EBFt h\u1EA1n"}));
		comboBox.setBounds(109, 52, 141, 30);
		panel_2.add(comboBox);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(new Color(220, 20, 60));
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRefresh.setBorder(null);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().GetListViecLamLuu(iduser));
			}
		});
		btnRefresh.setBounds(10, 93, 240, 30);
		panel_2.add(btnRefresh);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBorder(null);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idcv = (int) table.getValueAt(table.getSelectedRow(), 0);
				BLL_Timviec.Instance().DeleteViecLamLuu(1, idcv);
				ShowViecLam(BLL_Timviec.Instance().GetListViecLamLuu(iduser));
			}
		});
		btnDelete.setBounds(10, 134, 240, 30);
		panel_2.add(btnDelete);
		
		JButton btnNewButton_2_1 = new JButton("Search");
		btnNewButton_2_1.setBackground(new Color(220, 20, 60));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowViecLam(BLL_Timviec.Instance().SearchByTxtUser(txtSearch.getText(), iduser));
			}
		});
		btnNewButton_2_1.setBounds(10, 11, 89, 30);
		panel_2.add(btnNewButton_2_1);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(109, 11, 141, 30);
		panel_2.add(txtSearch);
		txtSearch.setColumns(10);
	}
}
