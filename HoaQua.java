package HoaQua;

import java.util.ArrayList;
import java.util.Scanner;

import SinhVienPoly.SinhVienBiz;
import SinhVienPoly.SinhVienIT;
import SinhVienPoly.SinhVienPoly;

public abstract class HoaQua {
	public void Mua() {
	}
	public void Ban() {
	}
	int Soluong;
	int Giaban;
	String NguonGoc;
	String NgayNhap;
	String Loai;
	public HoaQua(int SoLuong,int GiaBan,String NguonGoc,String NgayNhap,String Loai) {
		this.Soluong=SoLuong;
		this.Giaban=GiaBan;
		this.NguonGoc=NguonGoc;
		this.NgayNhap=NgayNhap;
		this.Loai=Loai;
	}
	public String getLoai() {
		return Loai;
	}
	public int getSoluong()
	{
		return Soluong;
		}
	public int getGiaban()
	{
		return Giaban;
		}
	public String getNguonGoc()
	{
		return NguonGoc;
		}
	public String getNgayNhap()
	{
		return NgayNhap;
		}
	class QuaCam extends HoaQua{
		public QuaCam(int SoLuong, int GiaBan, String NguonGoc, String NgayNhap,String Loai) {
			super(SoLuong, GiaBan, NguonGoc, NgayNhap,Loai);
		}
		String Giong;
	}
	class QuaTao extends HoaQua{
		public QuaTao(int SoLuong, int GiaBan, String NguonGoc, String NgayNhap,String Loai) {
			super(SoLuong, GiaBan, NguonGoc, NgayNhap,Loai);
			// TODO Auto-generated constructor stub
		}

	}		
	class CamCaoPhong extends QuaCam{
		public CamCaoPhong(int SoLuong, int GiaBan, String NguonGoc, String NgayNhap,String Loai,String Giong) {
			super(SoLuong, GiaBan, NguonGoc, NgayNhap,Loai,Giong);
		}
		
	}
	class CamSanh extends QuaCam{

		public CamSanh(int SoLuong, int GiaBan, String NguonGoc, String NgayNhap,String Loai,String Giong) {
			super(SoLuong, GiaBan, NguonGoc, NgayNhap,Loai,Giong);
		}
	}
	public class DSHoaQua {
		ArrayList<HoaQua>list=new ArrayList<>();

		public void nhap() {
		
				Scanner sc=new Scanner(System.in);
				System.out.print("Nhập số lượng: ");
				String SoLuong= sc.nextLine();
			}
				System.out.print("nhập loại: ");
				int Loai=sc.nextLine();
				if(Loai.equalsIgnoreCase("Cam"))
			{
					HoaQua newHQ=new HoaQua(Soluong,Loai,Giaban,NguonGoc,NgayNhap);
					list.add(newSV);
			}else if(nganh.equalsIgnoreCase("Biz")) {
					System.out.print("điểm Marketing: ");
					double diemMarketing=sc.nextDouble();
					System.out.print("điểm Sales: ");
					double diemSales=sc.nextDouble();
					SinhVienPoly newSV=new SinhVienBiz(hoTen,nganh,diemMarketing,diemSales);
					list.add(newSV);
			}
			}while(true);
		}
		public void xuat() {
			for(SinhVienPoly sv: list) {
				System.out.printf("Họ Tên: %s |Ngành: %s | ĐiểmTB: %.2f | Học Lực: %s \n",sv.gethoTen(),sv.getnganh(),sv.getDiem(),sv.getHocLuc());
			}
		}
	
	public class main {
		public static void main(String[] args) {
			
		}
	}
}
