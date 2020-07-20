
public class DefaultBookService implements BookService {
	private String title;
	private int price;
	
	public DefaultBookService() {}
	
	
	public DefaultBookService(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("서적명 : " + title);
		System.out.println("판매가 : " + price);

	}


	@Override
	public void newPrint() {
		// TODO Auto-generated method stub
		System.out.println("서적명 :" + title + ", 판매가 : " + price);
		
	}

}
