import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnnonymousInnerClassDemo1 {
	public static void main(String[] args) {
		List<Product> list =
				Arrays.asList ( new Product("볼펜",200),
						new Product("키보드",10000),
						new Product("연필",100),
						new Product("마우스",5000));
//		Collections.sort(list,);
//		List<Integer> list = Arrays.asList(3,4,1,2,8,9,2,3,6,3);
		Collections.sort(list, new Comparator<Product>() {		//<Product> 제너릭은 인터페이스 또는 클래스 내의 메소드를 재정의할때만 사용, 인터페이스나 클래스 생성시 타입설정X
			@Override
			public int compare(Product front, Product back) {
				return back.price - front.price;
			}
		});
		System.out.println(list);
	}
}
