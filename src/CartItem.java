public class CartItem {
    // 변수
	
	private Book itemBook;
	private String bookID;
	private int quantity;
	private int totalPrice;
	// 생성자
	public CartItem() { }
	public CartItem(Book booklist) {
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.quantity = 1;
		updateTotalPrice();
	}
	// Getter 메서드
	public Book getItemBook() {return itemBook;}// 9장
	public String getBookID() {return bookID;}
	public int getQuantity() {return quantity;}
	public int getTotalPrice() {return totalPrice;}
	
	// Setter 메서드
	public void setItemBook(Book itemBook) {this.itemBook = itemBook;} // 9장
	public void setBookiD(String bookID) {this.bookID = bookID;}
	public void setQuantity(int quantity) {this.quantity = quantity;}
	public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;} // 9장
	public void updateTotalPrice() {
	    // totalPrice = Integer.parseInt(this.itemBook[2])* this.quantity;
		totalPrice = this.itemBook.getUnitPrice() * this.quantity; // 9장
	}
	
}