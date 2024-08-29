public class VatPham {
    private final String ten;
    private final int chiSoSucManh;
    private final double heSoSucManh;
    private final int sucCongPha;

    public VatPham(String ten, int chiSoSucManh, double heSoSucManh) {
        this.ten = ten;
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
        this.sucCongPha = (int) (chiSoSucManh * heSoSucManh);
    }

    public String getTen() {
        return ten;
    }

//    public int getSucCongPha() {
//        return sucCongPha;
//    }

    public int getChiPhiXuVang() {
        return sucCongPha * 10;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-15d | %-10.2f | %-15d | %-10d",
                ten, chiSoSucManh, heSoSucManh, sucCongPha, getChiPhiXuVang());
    }
}
