/*
 * 1. package
 * 	- 생성된 클래스나 인터페이스나 enum -->참조형 타입객체들을 분류해서 저장하는 방법
 * 	- javac -d <path>	: package의 시작 폴더는 -d 옵션의 경로에 생성된다.
 * 
 * 	2. import
 * 	- com을 찾는 위치 : 1)현재 디렉토리	2)Reference library에서 찾고	3)classpath에서 찾고		4)Class Not Found
 */
import com.example.libs.Car;
import com.example.product.Ballpen;

public class Main {
	public static void main(String[] args) {
		Car sonata = new Car("Sliver Sonata");
		java.util.Date now = new java.util.Date();	//FQDN(Fully Qualified Domain Name
		System.out.println(sonata.toString());		//sonata.toString()
		Ballpen monami = new Ballpen();
		System.out.println(monami.name);
		com.example.finance.Money money = new com.example.finance.Money();
		System.out.println(money.balance);
	}
}