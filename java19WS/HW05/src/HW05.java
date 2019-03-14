import java.util.Scanner;



class Member{
	String name;
	String address;
	String job;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	
	public Member(String name,String address,String job,int age) {
		this.name=name;
		this.address=address;
		this.job=job;
		this.age=age;
	}
	public Member(String name) {
		this(name,"주소없음","무직",29);
	}
	
	

	void showInfo() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.job);
		System.out.println(this.age);
	}
}




public class HW05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member h1 = new Member("홍길동");
		Member h2 = new Member("이순신");
		System.out.println(h1.name);
		System.out.println(h2.name);
		
		System.out.print("이름 주소 직업 나이를 입력하시오: ");
		String name = scanner.next();
		String address = scanner.next();
		String job = scanner.next();
		int age = scanner.nextInt();
		
		Member Smember = new Member(name,address,job,age);
		Smember.showInfo();
		
		
		
		
        }
		
	   
	}


