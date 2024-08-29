import java.util.List;

public class VatPhamService {

    // Câu 3: Cho biết vật phẩm nào cần tốn nhiều xu vàng nhất
    public VatPham timVatPhamTonNhieuXuVangNhat(List<VatPham> danhSachVatPham) {
        VatPham vatPhamMax = danhSachVatPham.getFirst();
        for (VatPham vatPham : danhSachVatPham) {
            if (vatPham.getChiPhiXuVang() > vatPhamMax.getChiPhiXuVang()) {
                vatPhamMax = vatPham;
            }
        }
        return vatPhamMax;
    }

    // Câu 4: Kiểm tra Spon có đủ số xu vàng để giải cứu đồng đội
    public boolean kiemTraSponGiaiCuuDongDoi(int soXuVang, List<VatPham> danhSachVatPham) {
        int tongChiPhi = 0;
        for (VatPham vatPham : danhSachVatPham) {
            tongChiPhi += vatPham.getChiPhiXuVang();
        }
        return soXuVang >= tongChiPhi;
    }

    // Câu 3: Tính tổng số xu vàng cần thiết để mua tất cả vật phẩm
    public int tinhTongChiPhi(List<VatPham> danhSachVatPham) {
        int tongChiPhi = 0;
        for (VatPham vatPham : danhSachVatPham) {
            tongChiPhi += vatPham.getChiPhiXuVang();
        }
        return tongChiPhi;
    }
}
