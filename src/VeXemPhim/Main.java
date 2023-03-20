package VeXemPhim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x;
		try (Scanner scanner = new Scanner(System.in)) {
			ListTicket listtk = new ListTicket();
			do {
				System.out.println("\n\t ---------------------------------- ");
			    System.out.println("\t0. Thoát");
			    System.out.println("\t1. Nhập danh sách vé");
			    System.out.println("\t2. Xuất danh sách vé");
			    System.out.println("\t3. Sắp xếp các vé theo thứ tự giảm dần mã vé");
			    System.out.println("\t4. Tìm kiếm vé theo vị trí index (Nhập từ người dùng)");
			    System.out.println("\t5. Xóa vé theo vị trí index (Nhập từ người dùng)");
			    System.out.println("\t------------------------------------");
			    x = scanner.nextInt();
			    System.out.println("--------------------End--------------------");
			    switch (x) {
			    case 1:
			    	listtk.list();
			    	break;
			    case 2:
			    	listtk.xuat();
			    	break;
			    case 3:
			    	listtk.price();
			    	break;
			    case 4:
			    	listtk.timKiem();
			    	break;
			    case 5:
			    	listtk.xoa();
			    }
			} while (x != 0);
		}
		System.out.println(" ");
	}
}
