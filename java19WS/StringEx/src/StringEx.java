import java.util.StringTokenizer;

public class StringEx {

	public static void main(String[] args) {
		String name ="ȫ�浿";
		if(name.equals("ȫ�浿")){
			System.out.println("ȫ�浿�Դϴ�");
		}
	    String goodscode="E0001"; //E�� Electronic�� ����,������ǰ
	    String orderNumber="20190228000001";
	    // ���ڿ��� ����
	    System.out.println(goodscode.length());
	    //����
	    System.out.println(orderNumber.concat(goodscode));
        //����(char)����
	    if(goodscode.charAt(0)=='E') {
	    	System.out.println("������ǰ�Դϴ�");
	    }
	    //���ڿ� ġȯ
	    System.out.println(goodscode.replace("E","EL"));
	    //���ڿ� �κ� ����
	    System.out.println(orderNumber.substring(0,8));
	    //�����ڸ� �������� �и��ϱ�
	    String tel="010-1234-5678";
	    String[] result=tel.split("-");
        for(String item:result) {
        	System.out.println(item);
        }
        //Ȯ���ڱ��ϱ�
        String fileName="a.b.c.doc";
        String[] parts=fileName.split("\\.");
        for(String part:parts) {
        	System.out.println(part);
        }  
        System.out.println(fileName.indexOf(".")); //ù��°���� ��ġ ã���ִ� �޼��� indexOf()
        System.out.println(fileName.substring(fileName.indexOf(".")+1));
        System.out.println(fileName.substring(fileName.lastIndexOf(".")+1)); // ������ ���� ��ġ ã���ִ� �޼��� lastindexOf()
        	
        //String vs StringBuffer
        String s1="my";
        String s2="java";
        System.out.println(s1.concat(s2));
        System.out.println(s1); //s1�� �״�� ������ �ȹٲ�
        
        StringBuffer sb1=new StringBuffer("my");
        StringBuffer sb2=new StringBuffer("java");
        System.out.println(sb1.append(sb2));
        System.out.println(sb1); //sb1�� ���� ���Ѵ� ��������
        
        String[] file=fileName.split("\\.");
       for(int i=0; i<file.length;i++) {       	
        if(i==file.length-1) {
        	System.out.println("###"+file[i]);
        }
       }
       StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
       while(st.hasMoreTokens()) {
    	   System.out.println(st.nextToken());
       }
      String query="name=ȫ�浿&addr=����&age=50";
       String[] name2=query.split("&");
       for(int j=0; j<name2.length;j++) {
    	   String[] name3 =name2[j].split("=");
    	   for(int k=0; k<name3.length;k++) {
    		   System.out.println(name3[k]);
    	   }
    	   
       }
       
       
//       StringTokenizer st2 = new StringTokenizer(query,"&");
//       while(st2.hasMoreTokens()) {
//    	   //System.out.println(st2.nextToken());
//    	   StringTokenizer st3=new StringTokenizer(st2.nextToken(),"=");
//    	   while(st3.hasMoreTokens()) {
//    		   System.out.println(st3.nextToken());
//    	   
//    		   
//    	   }
//       }
       
       
       
       
	}
	

}
