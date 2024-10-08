import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<VatPham> danhSachVatPham = new ArrayList<>();
        danhSachVatPham.add(new VatPhamDonGian("Chiếc búa thần", 25, 2));
        danhSachVatPham.add(new VatPhamDonGian("Bao tay sấm sét", 30, 1));
        danhSachVatPham.add(new VatPhamNangCao("Hòn đá kích nổ", 40, 2, 10));
        danhSachVatPham.add(new VatPhamDonGian("Cây rìu phép thuật", 30, 1.5));
        danhSachVatPham.add(new VatPhamDonGian("Cây gậy chiến thần", 20, 1));

        VatPhamService service = new VatPhamService();

        // Header cho đẹp nè
        System.out.println("+--------------------+-----------------+------------+-----------------+------------+");
        System.out.println("| Tên vật phẩm       | Chỉ số sức mạnh |  Hệ số SM  |   Sức công phá  |   Chi phí  |");
        System.out.println("+--------------------+-----------------+------------+-----------------+------------+");

        // Yêu cầu 2: Xuất thông tin vật phẩm kèm theo Sức công phá mỗi vật phẩm ra màn hình
        for (VatPham vatPham : danhSachVatPham) {
            System.out.println(vatPham);
        }

        // Footer cho đẹp
        System.out.println("+--------------------+-----------------+------------+-----------------+------------+");

        // Yêu cầu 3: Cho biết vật phẩm nào cần tốn nhiều xu vàng nhất
        VatPham vatPhamTonNhieuXuNhat = service.timVatPhamTonNhieuXuVangNhat(danhSachVatPham);
        System.out.println("Vật phẩm tốn nhiều xu vàng nhất: " + vatPhamTonNhieuXuNhat.getTen());

        // Yêu cầu 4: Nhập số xu vàng mà Spon thu được
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số xu vàng Spon thu được: ");
        int soXuVang = scanner.nextInt();

        // Tính tổng chi phí xu vàng cần thiết
        int tongChiPhi = service.tinhTongChiPhi(danhSachVatPham);
        System.out.println("Tổng số xu vàng cần để mua tất cả vật phẩm: " + tongChiPhi);

        // Kiểm tra xem Spon có đủ xu để giải cứu đồng đội không
        if (service.kiemTraSponGiaiCuuDongDoi(soXuVang, danhSachVatPham)) {
            System.out.println("GZ, Spon có thể giải cứu đồng đội.");
        } else {
            System.out.println("Lose, Spon không đủ xu để giải cứu đồng đội.");
        }
    }
}
