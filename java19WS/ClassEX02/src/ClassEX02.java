class Book{
	 private String title;
	 private String author;
	
	public Book() {
		//멤버변수(필드)를 초기화
		this.title="기본책제목";
		this.author="기본저자명";
	}
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}







public class ClassEX02 {

	public static void main(String[] args) {
		//instance생성.기본생성자
		Book book1=new Book();
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		
		Book book2=new Book("객체지향개론","이순신");
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		
		book2.setTitle("객체지향개론2");
		book2.setAuthor("이순신외 1인");
		
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());

	}

}
