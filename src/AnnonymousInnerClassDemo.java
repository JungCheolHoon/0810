
public class AnnonymousInnerClassDemo {
	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.print();
//		Car car = new Car() {
//			@Override
//			public void print() {
//				System.out.println("Hello, java World!!!!");
//			}
//		};			//어나니머스 클래스는 원래 클래스를 재정의 할때 사용하며 끝에 ; 입력
		MyInterface mi = new MyInterface() {
			@Override
			public int calculate(int a,int b) {
				return a + b;
			}
		};
		int result = mi.calculate(5, 7);
		System.out.println("result = " + result);
		mi = new MyInterface() {
			@Override
			public int calculate(int a,int b) {
				return a * b;
			}
		};
		result = mi.calculate(5, 7);
		System.out.println("result = " + result);
	}

}
