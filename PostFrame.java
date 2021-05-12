package PBL3_DA.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DAL.DBHelper;
import PBL3_DA.DTO.DiaChi;
import PBL3_DA.DTO.ViecLam;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;

public class PostFrame {

	private JFrame frmTuynDng;
	private JTextField textTieuDe;
	private JTextField textSoLuongTuyen;
	private JTextField textTGThuViec;
	private JTextField textTenCT;
	private JTextField textDC;
	private JTextField textSDT;
	private JTextField textNhanSu;
	private JTextField textLinhVucHD;
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
		//frmTuynDng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTuynDng.getContentPane().setLayout(null);
		frmTuynDng.setVisible(true);
		
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
		
		textTieuDe = new JTextField();
		textTieuDe.setColumns(10);
		
		JLabel lbSoluongtuyen = new JLabel("S\u1ED1 l\u01B0\u1EE3ng c\u1EA7n tuy\u1EC3n");
		lbSoluongtuyen.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSoluongtuyen.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textSoLuongTuyen = new JTextField();
		textSoLuongTuyen.setColumns(10);
		
		JLabel lbGioitinh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lbGioitinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lbGioitinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbGioitinh = new JComboBox();
		cbbGioitinh.setModel(new DefaultComboBoxModel(new String[] {"Không yêu cầu", "Nam", "Nữ"}));
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
		cbbLoaihinhcv.setModel(new DefaultComboBoxModel(new String[] {"Giờ hành chính", "Việc làm thu nhập cao", "Việc làm thêm/Làm việc ngoài giờ", "Thầu dự án/Freelance/Việc làm tự do", "Việc làm online", "Kinh doanh mạng lưới", "Giúp việc gia đình", "Hợp tác lao động nước ngoài", "Việc làm người khuyết tật", "Việc làm theo ca/Đổi ca", "Việc làm cho tri thức lớn tuổi (trên 50 tuổi)"}));
		
		JLabel lbKinhnghiemyc = new JLabel("Kinh nghi\u1EC7m y\u00EAu c\u1EA7u");
		lbKinhnghiemyc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbKinhnghiemyc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbKinhnghiem = new JComboBox();
		cbbKinhnghiem.setModel(new DefaultComboBoxModel(new String[] {"Không yêu cầu", "Dưới 1 năm", "Trên 1 năm", "Trên 2 năm", "Trên 3 năm", "Trên 4 năm", "Trên 5 năm"}));
		
		JLabel lbThoigianthuviec = new JLabel("Th\u1EDDi gian th\u1EED vi\u1EC7c");
		lbThoigianthuviec.setHorizontalAlignment(SwingConstants.RIGHT);
		lbThoigianthuviec.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textTGThuViec = new JTextField();
		textTGThuViec.setColumns(10);
		
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
		cbbNganhnghe.setModel(new DefaultComboBoxModel(new String[] {"Bán hàng", "Tư vấn bảo hiểm", "Báo chí/Biên tập viên", "Bất động sản", "Biên dịch/Phiên dịch", "Bưu chính viễn thông ", "Cơ khí/Kĩ thuật ứng dụng", "Công nghệ thông tin", "Dầu khí/Địa chất", "Dệt may", "Bảo vệ/Vệ sĩ/An ninh", "Chăm sóc khách hàng", "Điện/Điện tử/Điện lạnh", "Du lịch/Nhà hàng/Khách sạn", "Dược/Hóa chất/Sinh hóa", "Giải trí/Vui chơi", "Giáo dục/Đào tạo/Thư viện", "Giao thông/Vận tải/Thủy lợi/Cầu đường", "Giày da/Thuộc gia", "Hành chính/Thư kí/Trợ lý", "Kho vận/Vật tư/Thu mua", "Kiến trúc/Nội thất", "Kinh doanh", "Lao động phổ thông", "Luật/Pháp lý", "Môi trường/Xử lý chất thải", "Mỹ phẩm/Thời trang/Trang sức", "Ngân hàng/Chứng khoáng/Đầu tư", "Nghệ thuật/Điện ảnh", "Nhân sự", "Nông/Lâm/Ngư nghiệp", "Quan hệ đối ngoại", "Thẩm định/Giám định/Quản lý chất lượng", "Quản lý điều hành", "Quảng cáo/Marketing/PR", "Sản xuất/Vận hành sản xuất", "Tài chính/Kế toán/Kiểm toán", "Thể dục/Thể thao", "Thiết kế/Mỹ thuật", "Thời vụ/Bán thời gian", "Thực phẩm/Dịch vụ an uống", "Xây dựng", "Xuất - Nhập khẩu/Ngoại thương", "Y tế", "Ngoại ngữ", "Khu chế xuất/Khu công nghiệp", "Làm đẹp/Thể lực/Spa", "Tài xế/Lái xe/Giao nhận", "Trang thiết bị công nghiệp", "Trang thiết bị gia dụng", "Trang thiết bị văn phòng", "PG/PB/Lễ tân", "Phát triển thị trường", "Phục vụ/Tạp vụ/Giúp việc"}));
		
		JLabel lbLuongCoBan = new JLabel("L\u01B0\u01A1ng c\u01A1 b\u1EA3n ");
		lbLuongCoBan.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLuongCoBan.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbLuongcoban = new JComboBox();
		cbbLuongcoban.setModel(new DefaultComboBoxModel(new String[] {"0 - 3 triệu", "3 - 5 triệu", "5 - 7 triệu", "7 - 10 triệu", "10 - 12 triệu", "12 - 15 triệu", "15 - 20 triệu", "20 - 25 triệu", "25 - 30 triệu", "30 - 40 triệu", "40 - 50 triệu ", "Trên 50 triệu"}));
		
		JLabel lbHethan = new JLabel("H\u1EBFt h\u1EA1n");
		lbHethan.setHorizontalAlignment(SwingConstants.RIGHT);
		lbHethan.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JDateChooser DateHetHan = new JDateChooser();
		
		JLabel lblThngTinDoanh = new JLabel("Th\u00F4ng tin doanh nghi\u1EC7p");
		lblThngTinDoanh.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lbDoanhnghiepcty = new JLabel("T\u00EAn c\u00F4ng ty/Doanh nghi\u1EC7p");
		lbDoanhnghiepcty.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDoanhnghiepcty.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textTenCT = new JTextField();
		textTenCT.setColumns(10);
		
		JLabel lbDiachi = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lbDiachi.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDiachi.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textDC = new JTextField();
		textDC.setColumns(10);
		
		JLabel lbSdt = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lbSdt.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSdt.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textSDT = new JTextField();
		textSDT.setColumns(10);
		
		JLabel lbNhansu = new JLabel("Nh\u00E2n s\u1EF1");
		lbNhansu.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNhansu.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textNhanSu = new JTextField();
		textNhanSu.setColumns(10);
		
		JLabel lbTinhtp = new JLabel("T\u1EC9nh th\u00E0nh ph\u1ED1");
		lbTinhtp.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTinhtp.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbTinhtp = new JComboBox();
		cbbTinhtp.setModel(new DefaultComboBoxModel(new String[] {"Hà Nội", "TP Hồ Chí Minh", "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Cạn", "Bắc Giang", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Phước", "Bình Thuận", "Bình Định", "Cà Mau", "Cần Thơ", "Cao Bằng", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơ La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Đà Năng", "Đắk Lắk", "Điện Biên", "Đồng Nai", "Đồng Tháp"}));
		
		JLabel lbLinhvuchoatdong = new JLabel("L\u0129nh v\u1EF1c ho\u1EA1t \u0111\u1ED9ng");
		lbLinhvuchoatdong.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLinhvuchoatdong.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textLinhVucHD = new JTextField();
		textLinhVucHD.setColumns(10);
		
		JLabel lbSoluoc = new JLabel("S\u01A1 l\u01B0\u1EE3c c\u00F4ng ty");
		lbSoluoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSoluoc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JScrollPane scrollPane_5 = new JScrollPane();
		
		JTextArea txtareaSoluoc = new JTextArea();
		scrollPane_5.setViewportView(txtareaSoluoc);
		JComboBox cbbtrinhdo = new JComboBox();
		
		JButton btnDangbai = new JButton("\u0110\u0103ng b\u00E0i");
		btnDangbai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try 
				{
					DiaChi d = new DiaChi();
					d.SetTinh((String)cbbTinhtp.getSelectedItem());
					d.SetDCCT(textDC.getText());
					BLL_Timviec.Instance().AddDiaChi(d);
					ViecLam v = new ViecLam();
					v.SetIdUser(1);
					v.SetTieuDe(textTieuDe.getText());
					if(BLL_Timviec.Instance().Isnumber(textSoLuongTuyen.getText()) == false)
					{
						JOptionPane.showMessageDialog(frmTuynDng, "Số lượng tuyển không hợp lệ");
					}
					v.SetSoLuongTuyen(Integer.parseInt(textSoLuongTuyen.getText()));
					v.SetGioiTinhTuyen((String)cbbGioitinh.getSelectedItem());
					v.SetMoTaCV(txtareaMotacv.getText());
					v.SetYeuCauCV(txtareaYeucaucv.getText());
					v.SetHinhThuc((String)cbbLoaihinhcv.getSelectedItem());
					v.SetKinhNghiemTuyen((String)cbbKinhnghiem.getSelectedItem());
					v.SetTGThuViec(textTGThuViec.getText());
					v.SetQuyenLoi(txtareaQuyenloi.getText());
					v.SetNganhNghe((String)cbbNganhnghe.getSelectedItem());
					v.SetLuongCoBan((String)cbbLuongcoban.getSelectedItem());
					Date date = new Date(DateHetHan.getDate().getTime());
					v.SetNgayHetHan(date);
					// Sử lý Date
					Long millis = System.currentTimeMillis();
					Date datecompare = new Date(millis);
					if(date.compareTo(datecompare) < 0)
					{
						JOptionPane.showMessageDialog(frmTuynDng, "Ngày hết hạn không hợp lệ");
						throw new Exception("Date không hợp lệ");
					}
					v.SetTenCT(textTenCT.getText());
					d.SetId((BLL_Timviec.Instance().GetDiaChi(d.GetTinh(), d.GetDCCT())).GetId());
					v.SetIdDC(d.GetId());
					if(BLL_Timviec.Instance().Isnumber(textSDT.getText()) == false || textSDT.getText().trim().length() < 10 || textSDT.getText().trim().length() > 12)
					{
						JOptionPane.showMessageDialog(frmTuynDng, "Số điện thoại không hợp lệ");
						throw new Exception("SDT không hợp lệ");
					}
					v.SetSDT(Integer.parseInt(textSDT.getText()));
					v.SetQuyMoNhanSu(textNhanSu.getText());
					v.SetLinhVucHD(textLinhVucHD.getText());
					v.SetSoLuocCT(txtareaSoluoc.getText());
					v.SetTrangThai(false);
					v.SetTrinhDo((String)cbbtrinhdo.getSelectedItem());
					BLL_Timviec.Instance().AddViecLam(v);
					JOptionPane.showMessageDialog(frmTuynDng, "Đăng thành công!!!");
					frmTuynDng.setVisible(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frmTuynDng, "LỖI!!!, Vui lòng kiểm tra lại");
				}
			}
		});
		btnDangbai.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDangbai.setBorder(null);
		btnDangbai.setBackground(new Color(220, 20, 60));
		
		JLabel lblTrnh = new JLabel("Trình độ");
		lblTrnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrnh.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		cbbtrinhdo.setModel(new DefaultComboBoxModel(new String[] {"Không yêu cầu", "Cao học", "Đại học", "Cao đẳng", "Trung cấp", "Trung học", "Chứng chỉ", "Lao dộng phổ thông"}));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
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
							.addComponent(textTGThuViec, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
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
							.addComponent(lbLuongCoBan, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(cbbLuongcoban, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addComponent(lbHethan, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(DateHetHan, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblThngTinDoanh, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbDoanhnghiepcty)
							.addGap(19)
							.addComponent(textTenCT, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbDiachi, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(textDC, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbSdt, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbNhansu, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(textNhanSu, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbTinhtp, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(cbbTinhtp, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbLinhvuchoatdong, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(textLinhVucHD, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lbSoluoc, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(239)
							.addComponent(btnDangbai, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbThongtintuyendung, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbSoluongtuyen, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbTieude, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbGioitinh, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTrnh, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(cbbtrinhdo, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbGioitinh, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addComponent(textSoLuongTuyen, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTieuDe, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(110, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lbThongtintuyendung, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbTieude, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTieuDe, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbSoluongtuyen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textSoLuongTuyen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbGioitinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbbGioitinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbbtrinhdo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTrnh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
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
							.addComponent(textTGThuViec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
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
						.addComponent(lbLuongCoBan, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbbLuongcoban, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbHethan, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(DateHetHan, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addComponent(lblThngTinDoanh, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDoanhnghiepcty, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTenCT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDiachi, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textDC, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbSdt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbNhansu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textNhanSu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
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
							.addComponent(textLinhVucHD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lbSoluoc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(btnDangbai, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		panel_1.setLayout(gl_panel_1);
	}
}
