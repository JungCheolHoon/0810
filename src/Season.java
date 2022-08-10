/**
 * 
 * @author		<font size = '7' color = 'green'> Jung </font> 
 * @version	<b>1.0</b>
 * @since		<i>2022-08-10</i>
 *
 */
public enum Season {						//enum은 바운더리를 지정할때 사용, ex)봄,여름,가을,겨울
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);
	private int value;

	private Season(int value) {			//생성자
		this.value = value;
	}
	public int getvalue() {
		return this.value;
	}
}
