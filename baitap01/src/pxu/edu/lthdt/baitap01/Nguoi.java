package pxu.edu.lthdt.baitap01;

public class Nguoi {
	 protected String hoTen;
	    protected int ngaySinh;
	    protected String gioiTinh;
	    protected String diaChi;

	    public Nguoi(String hoTen, int ngaySinh, String gioiTinh, String diaChi) {
	        this.hoTen = hoTen;
	        this.ngaySinh = ngaySinh;
	        this.gioiTinh = gioiTinh;
	        this.diaChi = diaChi;
	    }

	    // Getters and setters

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public int getNgaySinh() {
	        return ngaySinh;
	    }

	    public void setNgaySinh(int ngaySinh) {
	        this.ngaySinh = ngaySinh;
	    }

	    public String getGioiTinh() {
	        return gioiTinh;
	    }

	    public void setGioiTinh(String gioiTinh) {
	        this.gioiTinh = gioiTinh;
	    }

	    public String getDiaChi() {
	        return diaChi;
	    }

	    public void setDiaChi(String diaChi) {
	        this.diaChi = diaChi;
	    }

	    @Override
	    public String toString() {
	        return "Nguoi{" +
	                "hoTen='" + hoTen + '\'' +
	                ", ngaySinh=" + ngaySinh +
	                ", gioiTinh='" + gioiTinh + '\'' +
	                ", diaChi='" + diaChi + '\'' +
	                '}';
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
