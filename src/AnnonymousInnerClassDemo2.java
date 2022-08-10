
public class AnnonymousInnerClassDemo2 {
	public static void main(String[] args) {
//		Thread t = new MyThread();					//쓰레드의 자식을 만들어 재정의
//		t.run();
//		System.out.println("나는 메인 메소드");
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("나는 쓰레드");
			}
		};
		t.run();
		
	}
}

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("나는 쓰레드");
//	}
//}
