package pxu.edu.lthdt.baitap01;

public class SinhVien extends Nguoi {
    private String maSV;

    public SinhVien(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String maGV, String maSV) {
    	super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.maSV = maSV;
    }

    // Getters and setters

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}