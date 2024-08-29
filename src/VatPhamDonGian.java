public class VatPhamDonGian extends VatPham {
    public VatPhamDonGian(String ten, int chiSoSucManh, double heSoSucManh) {
        super(ten, chiSoSucManh, heSoSucManh);
    }

    @Override
    public int getSucCongPha() {
        return (int) (chiSoSucManh * heSoSucManh);
    }
}
