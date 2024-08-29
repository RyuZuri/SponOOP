public class VatPhamNangCao extends VatPham {
    private int bonusSucManh;

    public VatPhamNangCao(String ten, int chiSoSucManh, double heSoSucManh, int bonusSucManh) {
        super(ten, chiSoSucManh, heSoSucManh);
        this.bonusSucManh = bonusSucManh;
    }

    @Override
    public int getSucCongPha() {
        return (int) ((chiSoSucManh + bonusSucManh) * heSoSucManh);
    }
}
