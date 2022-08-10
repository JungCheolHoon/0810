import java.util.Calendar;
import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println(now.getYear()+1900);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
	}
}
