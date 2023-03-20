package VeXemPhim;
import java.util.Scanner;

public class ListTicket extends Ticket {
	Scanner scanner = new Scanner(System.in);
	public int soLuongVe;
	public ListTicket() {
	}
	public ListTicket(int soLuongVe, Scanner scanner) {
		this.soLuongVe = soLuongVe;
		this.scanner = scanner;
	}
	
	public int getSoLuongVe() {
		return soLuongVe;
	}
	public void setSoLuongVe(int soLuongVe) {
		this.soLuongVe = soLuongVe;
	}
	public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    Ticket[] Ticket = Ticket();
	public void list() {
    		System.out.println("Nhập vào số lượng vé: ");
    		this.soLuongVe = scanner.nextInt();
    	for (int i = 1 ; i <= soLuongVe; i++) {
			Ticket [i] = new Ticket();
			System.out.println("Nhập mã số vé xem phim thứ " + i + ": ");
			Ticket[i].setMaVe(scanner.nextInt());
			System.out.println("Nhập tên phim: ");
			Ticket[i].setTenPhim(scanner.nextLine());
			System.out.println("Nhập phòng chiếu phim: ");
			Ticket[i].setRoom(scanner.nextInt());
			System.out.println("Nhập vị trí ghế ngồi: ");
			Ticket[i].setSeat(scanner.nextLine());
			System.out.println("Nhập ngày giờ chiếu phim: ");
			Ticket[i].setDate(scanner.nextLine());
			System.out.println("Nhập giá vé: ");
			Ticket[i].setPrice(scanner.nextInt());
    	}
    }
    private VeXemPhim.Ticket[] Ticket() {
		// TODO Auto-generated method stub
		return null;
	}
	public void xuat() {
    	System.out.printf("%15d, %15s, %15d, %15s, %15s, %15d \n", "Mã Vé", "Tên Phim", "Phòng chiếu", "Vị trí ghế ngồi", "Thời gian chiếu", "Giá vé" );
    	for (int i = 1; i < soLuongVe; i++) {
    		System.out.println("Vé thứ " + i + ": ");
    		Ticket[i].xuatMaVe();
    	}
    }
    public void price() {
		VeXemPhim.Ticket temp = null;
		for (int i = 1; i <= soLuongVe; i++) {
			for (int j = 1; j <= soLuongVe; j++) {
				if (Ticket[i].price > Ticket[j].price) {
					temp = Ticket[j];
					Ticket[j] = Ticket[i];
					Ticket[i] = temp;
				}
			}
		}
    }
    public void timKiem() {
    	System.out.println("Nhập vị trí của vé cần tìm kiếm: ");
    	int t = scanner.nextInt();
    	if (t > soLuongVe) {
    		System.out.println("Vị trí không tồn tại");
    	}
    	else {
    		Ticket[t].xuatMaVe();
    	}
    }
    public void xoa() {
    	int k = 1;
    	System.out.println("Nhập vào vị trí vé cần xóa: ");
    	int x = scanner.nextInt();
    	if (x > soLuongVe) {
    		System.out.println("Vị trí không tồn tại");
    	}
    	else {
    		for (int i = 1; i <= soLuongVe; i++) {
    			if (i != x) {
    				Ticket[k] = Ticket[i];
    				k++;
    			}
    		}
    	}
    	soLuongVe = k;
    }
}
