import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("����ð���");
		System.out.print(now.get(Calendar.YEAR)+"��   ");
		System.out.print(now.get(Calendar.MONTH)+1+"��  ");
		System.out.print(now.get(Calendar.DAY_OF_MONTH)+"��  ");
		System.out.print(now.get(Calendar.HOUR_OF_DAY)+"��  ");
		System.out.print(now.get(Calendar.MINUTE)+"��  ");
		System.out.print(now.get(Calendar.SECOND)+"��  ");
		System.out.println(" �Դϴ�");
	}

}
