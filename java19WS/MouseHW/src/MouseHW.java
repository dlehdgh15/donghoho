class Mouse{
int rightbt;//������ ��ư �ʵ����
int leftbt; // ���� ��ư �ʵ����
protected String name;

public Mouse() {}
public Mouse(String name) {
       this.name=name;
       System.out.println(name+"���콺�� �����Ǿ����ϴ�");
}
void set (int rightbt, int leftbt) {
	this.rightbt=rightbt;
	this.leftbt=leftbt;
	
}
	  public void mouseMove() {             //���콺���� �޼������
		  System.out.println("�Ϲݸ��콺�� ���������� " + rightbt + "��ŭ��������" + leftbt + "��ŭ ���������ϴ�");
	  }
}

class whill extends Mouse{  //�ٸ��콺 Ŭ��������
	int whills; //�� �ʵ����
	
	public whill(String name) {
           	super(name);
           	System.out.println(name + "���콺�� �����Ǿ����ϴ�");
	}

	
       public void move() {
    	   if(whills<50) {
    		   
    		   System.out.println("���� �� ����̼���");
    	   }
    		   else {
    			   System.out.println("���� �� ����̼���");
    		   }
    		   }
        	        	
	}
	
	


class Laser extends Mouse{  //���������콺 Ŭ��������
    String lasecolor; //������  �ʵ����
    
    public Laser(String name) {
    	this.name=name;
    	System.out.println(name+"���콺�� �����Ǿ����ϴ�");
    }
     void setcolor(String lasecolor) {
    	 this.lasecolor=lasecolor;
     }
     void showcolor() {
    	 System.out.println("�������� ������"+ lasecolor +"�Դϴ�");
     }
}






public class MouseHW {

	public static void main(String[] args) {
		Mouse m = new Mouse("�Ϲ�");
		whill n= new whill("��");
		Laser k= new Laser("������");
		m.set(20,30);
		m.mouseMove();
		
		whill [] wi = new whill[3];
		for(int i =0; i<wi.length; i++) {
			wi[i]=new whill("����");
			
		}
		
		k.lasecolor="blue";
		k.showcolor();
		
		n.move();
		
		
	}

}

