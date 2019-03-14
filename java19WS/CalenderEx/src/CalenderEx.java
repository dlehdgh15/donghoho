import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("현재시간은");
		System.out.print(now.get(Calendar.YEAR)+"년   ");
		System.out.print(now.get(Calendar.MONTH)+1+"월  ");
		System.out.print(now.get(Calendar.DAY_OF_MONTH)+"일  ");
		System.out.print(now.get(Calendar.HOUR_OF_DAY)+"시  ");
		System.out.print(now.get(Calendar.MINUTE)+"분  ");
		System.out.print(now.get(Calendar.SECOND)+"초  ");
		System.out.println(" 입니다");
	}

}
