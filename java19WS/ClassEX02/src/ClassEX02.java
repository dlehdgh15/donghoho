class Book{
	 private String title;
	 private String author;
	
	public Book() {
		//�������(�ʵ�)�� �ʱ�ȭ
		this.title="�⺻å����";
		this.author="�⺻���ڸ�";
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
		//instance����.�⺻������
		Book book1=new Book();
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		
		Book book2=new Book("��ü���ⰳ��","�̼���");
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		
		book2.setTitle("��ü���ⰳ��2");
		book2.setAuthor("�̼��ſ� 1��");
		
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());

	}

}
