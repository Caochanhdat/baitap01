package pxu.edu.lthdt.baitap01;

public class GiangVien extends Nguoi {
    private String maGV;

    public GiangVien(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String maGV) {
    	super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.maGV = maGV;
    }

    // Getters and setters

    public String getMaGV() {
        return maGV;
    }

    public void setMaSV(String maGV) {
        this.maGV = maGV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maGV + '\'' +
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
