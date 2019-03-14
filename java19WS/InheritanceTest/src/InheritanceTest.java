class person{
	public void speak() {
		System.out.println("speak");
	}
	public void eat() {
		System.out.println("eat");
	}
	public void walk() {
		System.out.println("walk");
	}
	public void sleep() {
		System.out.println("sleep");
	}
	
	
}

class Student extends person {
	public void study() {
		System.out.println("study");
	}
	
}

class studentWorker extends Student{
	public void work() {
		System.out.println("work");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		person dong = new person();
		dong.eat();
		Student lss = new Student();
		lss.sleep();
		studentWorker ldh = new studentWorker();
		ldh.eat();
		ldh.work();

	}

}
