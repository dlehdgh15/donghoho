 class Book {
	
	String title;
	String author;
	
	public Book() {
//		this.title="";
//		this.author="";
		this("",""); //�ؿ� Ŭ���� ȣ��
	}
	
	public Book(String title) {
		this(title,"���ڹ̻�");
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
}




public class ClassEX03 {

	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1.title);
		System.out.println(book1.author);
		
		Book book2 = new Book("�ڹٿ�����");
		System.out.println(book2.title);
		System.out.println(book2.author);

	}

}
