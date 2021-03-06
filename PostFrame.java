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
		cbbGioitinh.setModel(new DefaultComboBoxModel(new String[] {"Kh??ng y??u c???u", "Nam", "N???"}));
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
		cbbLoaihinhcv.setModel(new DefaultComboBoxModel(new String[] {"Gi??? h??nh ch??nh", "Vi???c l??m thu nh???p cao", "Vi???c l??m th??m/L??m vi???c ngo??i gi???", "Th???u d??? ??n/Freelance/Vi???c l??m t??? do", "Vi???c l??m online", "Kinh doanh m???ng l?????i", "Gi??p vi???c gia ????nh", "H???p t??c lao ?????ng n?????c ngo??i", "Vi???c l??m ng?????i khuy???t t???t", "Vi???c l??m theo ca/?????i ca", "Vi???c l??m cho tri th???c l???n tu???i (tr??n 50 tu???i)"}));
		
		JLabel lbKinhnghiemyc = new JLabel("Kinh nghi\u1EC7m y\u00EAu c\u1EA7u");
		lbKinhnghiemyc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbKinhnghiemyc.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbKinhnghiem = new JComboBox();
		cbbKinhnghiem.setModel(new DefaultComboBoxModel(new String[] {"Kh??ng y??u c???u", "D?????i 1 n??m", "Tr??n 1 n??m", "Tr??n 2 n??m", "Tr??n 3 n??m", "Tr??n 4 n??m", "Tr??n 5 n??m"}));
		
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
		cbbNganhnghe.setModel(new DefaultComboBoxModel(new String[] {"B??n h??ng", "T?? v???n b???o hi???m", "B??o ch??/Bi??n t???p vi??n", "B???t ?????ng s???n", "Bi??n d???ch/Phi??n d???ch", "B??u ch??nh vi???n th??ng ", "C?? kh??/K?? thu???t ???ng d???ng", "C??ng ngh??? th??ng tin", "D???u kh??/?????a ch???t", "D???t may", "B???o v???/V??? s??/An ninh", "Ch??m s??c kh??ch h??ng", "??i???n/??i???n t???/??i???n l???nh", "Du l???ch/Nh?? h??ng/Kh??ch s???n", "D?????c/H??a ch???t/Sinh h??a", "Gi???i tr??/Vui ch??i", "Gi??o d???c/????o t???o/Th?? vi???n", "Giao th??ng/V???n t???i/Th???y l???i/C???u ???????ng", "Gi??y da/Thu???c gia", "H??nh ch??nh/Th?? k??/Tr??? l??", "Kho v???n/V???t t??/Thu mua", "Ki???n tr??c/N???i th???t", "Kinh doanh", "Lao ?????ng ph??? th??ng", "Lu???t/Ph??p l??", "M??i tr?????ng/X??? l?? ch???t th???i", "M??? ph???m/Th???i trang/Trang s???c", "Ng??n h??ng/Ch???ng kho??ng/?????u t??", "Ngh??? thu???t/??i???n ???nh", "Nh??n s???", "N??ng/L??m/Ng?? nghi???p", "Quan h??? ?????i ngo???i", "Th???m ?????nh/Gi??m ?????nh/Qu???n l?? ch???t l?????ng", "Qu???n l?? ??i???u h??nh", "Qu???ng c??o/Marketing/PR", "S???n xu???t/V???n h??nh s???n xu???t", "T??i ch??nh/K??? to??n/Ki???m to??n", "Th??? d???c/Th??? thao", "Thi???t k???/M??? thu???t", "Th???i v???/B??n th???i gian", "Th???c ph???m/D???ch v??? an u???ng", "X??y d???ng", "Xu???t - Nh???p kh???u/Ngo???i th????ng", "Y t???", "Ngo???i ng???", "Khu ch??? xu???t/Khu c??ng nghi???p", "L??m ?????p/Th??? l???c/Spa", "T??i x???/L??i xe/Giao nh???n", "Trang thi???t b??? c??ng nghi???p", "Trang thi???t b??? gia d???ng", "Trang thi???t b??? v??n ph??ng", "PG/PB/L??? t??n", "Ph??t tri???n th??? tr?????ng", "Ph???c v???/T???p v???/Gi??p vi???c"}));
		
		JLabel lbLuongCoBan = new JLabel("L\u01B0\u01A1ng c\u01A1 b\u1EA3n ");
		lbLuongCoBan.setHorizontalAlignment(SwingConstants.RIGHT);
		lbLuongCoBan.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox cbbLuongcoban = new JComboBox();
		cbbLuongcoban.setModel(new DefaultComboBoxModel(new String[] {"0 - 3 tri???u", "3 - 5 tri???u", "5 - 7 tri???u", "7 - 10 tri???u", "10 - 12 tri???u", "12 - 15 tri???u", "15 - 20 tri???u", "20 - 25 tri???u", "25 - 30 tri???u", "30 - 40 tri???u", "40 - 50 tri???u ", "Tr??n 50 tri???u"}));
		
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
		cbbTinhtp.setModel(new DefaultComboBoxModel(new String[] {"H?? N???i", "TP H??? Ch?? Minh", "An Giang", "B?? R???a - V??ng T??u", "B???c C???n", "B???c Giang", "B???c Li??u", "B???c Ninh", "B???n Tre", "B??nh D????ng", "B??nh Ph?????c", "B??nh Thu???n", "B??nh ?????nh", "C?? Mau", "C???n Th??", "Cao B???ng", "Gia Lai", "H?? Giang", "H?? Nam", "H?? T??nh", "H???i D????ng", "H???i Ph??ng", "H???u Giang", "H??a B??nh", "H??ng Y??n", "Kh??nh H??a", "Ki??n Giang", "Kon Tum", "Lai Ch??u", "L??m ?????ng", "L???ng S??n", "L??o Cai", "Long An", "Nam ?????nh", "Ngh??? An", "Ninh B??nh", "Ninh Thu???n", "Ph?? Th???", "Ph?? Y??n", "Qu???ng B??nh", "Qu???ng Nam", "Qu???ng Ng??i", "Qu???ng Ninh", "Qu???ng Tr???", "S??c Tr??ng", "S?? La", "T??y Ninh", "Th??i B??nh", "Th??i Nguy??n", "Thanh H??a", "Th???a Thi??n Hu???", "Ti???n Giang", "Tr?? Vinh", "Tuy??n Quang", "V??nh Long", "V??nh Ph??c", "Y??n B??i", "???? N??ng", "?????k L???k", "??i???n Bi??n", "?????ng Nai", "?????ng Th??p"}));
		
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
						JOptionPane.showMessageDialog(frmTuynDng, "S??? l?????ng tuy???n kh??ng h???p l???");
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
					// S??? l?? Date
					Long millis = System.currentTimeMillis();
					Date datecompare = new Date(millis);
					if(date.compareTo(datecompare) < 0)
					{
						JOptionPane.showMessageDialog(frmTuynDng, "Ng??y h???t h???n kh??ng h???p l???");
						throw new Exception("Date kh??ng h???p l???");
					}
					v.SetTenCT(textTenCT.getText());
					d.SetId((BLL_Timviec.Instance().GetDiaChi(d.GetTinh(), d.GetDCCT())).GetId());
					v.SetIdDC(d.GetId());
					if(BLL_Timviec.Instance().Isnumber(textSDT.getText()) == false || textSDT.getText().trim().length() < 10 || textSDT.getText().trim().length() > 12)
					{
						JOptionPane.showMessageDialog(frmTuynDng, "S??? ??i???n tho???i kh??ng h???p l???");
						throw new Exception("SDT kh??ng h???p l???");
					}
					v.SetSDT(Integer.parseInt(textSDT.getText()));
					v.SetQuyMoNhanSu(textNhanSu.getText());
					v.SetLinhVucHD(textLinhVucHD.getText());
					v.SetSoLuocCT(txtareaSoluoc.getText());
					v.SetTrangThai(false);
					v.SetTrinhDo((String)cbbtrinhdo.getSelectedItem());
					BLL_Timviec.Instance().AddViecLam(v);
					JOptionPane.showMessageDialog(frmTuynDng, "????ng th??nh c??ng!!!");
					frmTuynDng.setVisible(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frmTuynDng, "L???I!!!, Vui l??ng ki???m tra l???i");
				}
			}
		});
		btnDangbai.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDangbai.setBorder(null);
		btnDangbai.setBackground(new Color(220, 20, 60));
		
		JLabel lblTrnh = new JLabel("Tr??nh ?????");
		lblTrnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrnh.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		cbbtrinhdo.setModel(new DefaultComboBoxModel(new String[] {"Kh??ng y??u c???u", "Cao h???c", "?????i h???c", "Cao ?????ng", "Trung c???p", "Trung h???c", "Ch???ng ch???", "Lao d???ng ph??? th??ng"}));
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
