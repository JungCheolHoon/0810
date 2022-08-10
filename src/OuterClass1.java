/*
 *	1. 생성법 : 바깥클래스의 주소.new 안쪽클래스 생성자() 
 * 	2. 제한사항 : Member inner class는 static 변수와 static method를 가질 수 없다(static클래스는 static을 가질 수 있음)
 */
public class OuterClass1 extends DeprecationDemo{
	private String name = "한지민";			//Outer class Member variable
	private static int age = 26;				//Outer static variable
	private void display() {						//Outer class member method
		System.out.println("name = " + this.name);
	}
	public static void print() {					//Outer class static method
		System.out.println("Age = " + age);
	}
	
	public class InnerClass1 extends Main{					//Member class
		public double avg = 89.5;				//Inner class member variable
//		public static boolean flag = true;	//Inner class static variable
		public void show() {						//Inner class member method
			print();
			display();
//			System.out.println("나이 = " + age);
//			System.out.println("이름 = " +name);	//static은 member에 접근할 수 없다.
		}
//		public static void 출력하다() {		//Inner class static method
//			System.out.println("나이 = " +age);
//			System.out.println("이름 = " +name);	//<static 클래스 Inner> <맴버 변수 name> name 접근불가
//		}
	}
}
