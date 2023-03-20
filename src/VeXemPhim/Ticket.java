package VeXemPhim;

public class Ticket {
	protected int maVe;
	protected String tenPhim;
	protected int room;
	protected String seat;
	protected String date;
	protected int price;
	
	
	public Ticket() {
}
	public Ticket(int maVe, String tenPhim, int room, String seat, String date, int price) {
		
		this.maVe = maVe;
		this.tenPhim = tenPhim;
		this.room = room;
		this.seat = seat;
		this.date = date;
		this.price = price;

	}

	public int getMaVe() {
		return maVe;
	}
	public void setMaVe(int maVe) {
		this.maVe = maVe;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	protected void xuatMaVe() {
        System.out.printf("%10d, %10s, %10d, %10s, %10s, %10d \n", maVe, tenPhim, room, seat, date, price);
    }
	
}

