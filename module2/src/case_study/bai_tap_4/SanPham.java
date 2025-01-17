package case_study.bai_tap_4;

public abstract class SanPham {
    private int id;
    private String maSanPham;
    private String tenSanPham;
    private String giaSanPham;
    private String soLuongSanPham;
    private String nhaSanXuat;

    public SanPham() {
    }

    public SanPham(int id, String maSanPham, String tenSanPham, String giaSanPham, String soLuongSanPham, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuongSanPham = soLuongSanPham;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(String giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(String soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public abstract String toString();
}
