/*
 * member는 static에 연결할 수 있으나,
 * static은 member에 연결할 수 없다. 연결하려면
 * 주소를 이용해서 member에 연결할 수 있다.
 */
public class StaticInnerClassDemo {
	public static void main(String[] args) {
//		OuterClass.print();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		System.out.println(inner.avg);							//맴버 (변수,메소드,클래스) 는 주소가 있어야함
//		System.out.println(OuterClass.InnerClass.flag);	//static는 주소없이 접근
		inner.show();
	}
}
