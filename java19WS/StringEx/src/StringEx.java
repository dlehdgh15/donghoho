import java.util.StringTokenizer;

public class StringEx {

	public static void main(String[] args) {
		String name ="홍길동";
		if(name.equals("홍길동")){
			System.out.println("홍길동입니다");
		}
	    String goodscode="E0001"; //E는 Electronic의 약자,전자제품
	    String orderNumber="20190228000001";
	    // 문자열의 길이
	    System.out.println(goodscode.length());
	    //연결
	    System.out.println(orderNumber.concat(goodscode));
        //문자(char)추출
	    if(goodscode.charAt(0)=='E') {
	    	System.out.println("전자제품입니다");
	    }
	    //문자열 치환
	    System.out.println(goodscode.replace("E","EL"));
	    //문자열 부분 추출
	    System.out.println(orderNumber.substring(0,8));
	    //구분자를 기준으로 분리하기
	    String tel="010-1234-5678";
	    String[] result=tel.split("-");
        for(String item:result) {
        	System.out.println(item);
        }
        //확장자구하기
        String fileName="a.b.c.doc";
        String[] parts=fileName.split("\\.");
        for(String part:parts) {
        	System.out.println(part);
        }  
        System.out.println(fileName.indexOf(".")); //첫번째문자 위치 찾아주는 메서드 indexOf()
        System.out.println(fileName.substring(fileName.indexOf(".")+1));
        System.out.println(fileName.substring(fileName.lastIndexOf(".")+1)); // 마지막 문자 위치 찾아주는 메서드 lastindexOf()
        	
        //String vs StringBuffer
        String s1="my";
        String s2="java";
        System.out.println(s1.concat(s2));
        System.out.println(s1); //s1은 그대로 원본이 안바뀜
        
        StringBuffer sb1=new StringBuffer("my");
        StringBuffer sb2=new StringBuffer("java");
        System.out.println(sb1.append(sb2));
        System.out.println(sb1); //sb1도 같이 변한다 원본변함
        
        String[] file=fileName.split("\\.");
       for(int i=0; i<file.length;i++) {       	
        if(i==file.length-1) {
        	System.out.println("###"+file[i]);
        }
       }
       StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
       while(st.hasMoreTokens()) {
    	   System.out.println(st.nextToken());
       }
      String query="name=홍길동&addr=서울&age=50";
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
