import java.util.List;

public class VatPhamService {
    public int tinhTongChiPhi(List<VatPham> vatPhams) {
        int tongChiPhi = 0;
        for (VatPham vatPham : vatPhams) {
            tongChiPhi += vatPham.getChiPhiXuVang();
        }
        return tongChiPhi;
    }

    public VatPham timVatPhamTonNhieuXuVangNhat(List<VatPham> vatPhams) {
        VatPham vatPhamTonNhieuXuNhat = vatPhams.get(0);
        for (VatPham vatPham : vatPhams) {
            if (vatPham.getChiPhiXuVang() > vatPhamTonNhieuXuNhat.getChiPhiXuVang()) {
                vatPhamTonNhieuXuNhat = vatPham;
            }
        }
        return vatPhamTonNhieuXuNhat;
    }

    public boolean kiemTraSponGiaiCuuDongDoi(int soXuVang, List<VatPham> vatPhams) {
        return soXuVang >= tinhTongChiPhi(vatPhams);
    }
}
