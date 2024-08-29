public abstract class VatPham {
    protected String ten;
    protected int chiSoSucManh;
    protected double heSoSucManh;

    public VatPham(String ten, int chiSoSucManh, double heSoSucManh) {
        this.ten = ten;
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
    }

    public String getTen() {
        return ten;
    }

    public abstract int getSucCongPha();

    public int getChiPhiXuVang() {
        return getSucCongPha() * 10;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-15d | %-10.2f | %-15d | %-10d",
                ten, chiSoSucManh, heSoSucManh, getSucCongPha(), getChiPhiXuVang());
    }
}
