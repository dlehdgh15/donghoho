class Mouse{
int rightbt;//오른쪽 버튼 필드생성
int leftbt; // 왼쪽 버튼 필드생성
protected String name;

public Mouse() {}
public Mouse(String name) {
       this.name=name;
       System.out.println(name+"마우스가 생성되었습니다");
}
void set (int rightbt, int leftbt) {
	this.rightbt=rightbt;
	this.leftbt=leftbt;
	
}
	  public void mouseMove() {             //마우스무브 메서드생성
		  System.out.println("일반마우스를 오른쪽으로 " + rightbt + "만큼왼쪽으로" + leftbt + "만큼 움직였습니다");
	  }
}

class whill extends Mouse{  //휠마우스 클래스생성
	int whills; //휠 필드생성
	
	public whill(String name) {
           	super(name);
           	System.out.println(name + "마우스가 생성되었습니다");
	}

	
       public void move() {
    	   if(whills<50) {
    		   
    		   System.out.println("휠을 더 기울이세요");
    	   }
    		   else {
    			   System.out.println("휠을 덜 기울이세요");
    		   }
    		   }
        	        	
	}
	
	


class Laser extends Mouse{  //레이저마우스 클래스생성
    String lasecolor; //레이저  필드생성
    
    public Laser(String name) {
    	this.name=name;
    	System.out.println(name+"마우스가 생성되었습니다");
    }
     void setcolor(String lasecolor) {
    	 this.lasecolor=lasecolor;
     }
     void showcolor() {
    	 System.out.println("레이저의 색깔은"+ lasecolor +"입니다");
     }
}






public class MouseHW {

	public static void main(String[] args) {
		Mouse m = new Mouse("일반");
		whill n= new whill("휠");
		Laser k= new Laser("레이저");
		m.set(20,30);
		m.mouseMove();
		
		whill [] wi = new whill[3];
		for(int i =0; i<wi.length; i++) {
			wi[i]=new whill("으악");
			
		}
		
		k.lasecolor="blue";
		k.showcolor();
		
		n.move();
		
		
	}

}

