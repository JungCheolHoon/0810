import java.util.Comparator;

public class Product{
	int price;
	private String name;
	public Product(String name, int price) {
		this.price = price;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "이름 = " +this.name + ", 가격 = " +this.price;
	}
	
}
