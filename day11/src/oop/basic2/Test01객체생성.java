/*
package oop.basic2;

public class Test02 {
 public static void main(String[]args) {
	 
	 Data a = new Data();
	 a.name ="뽀로로";
	 a.grade = 1;
	 a.score = 70;
	 
	 System.out.print("이름 : "+a.name+"," );
	 System.out.print("학년 : "+a.grade+"," );
	 System.out.println("점수 : "+a.score );
	 
	 Data b =new Data();
	 b.name ="크롱";
	 b.grade = 1;
	 b.score = 55;
	 
	 System.out.print("이름 : "+b.name+"," );
	 System.out.print("학년 : "+b.grade+"," );
	 System.out.println("점수 : "+b.score  );
	 
	 Data c =new Data();
	 c.name ="포비";
	 c.grade = 2;
	 c.score = 80;
	 
	 System.out.print("이름 : "+ c.name +"," );
	 System.out.print("학년 : "+ c.grade+"," );
	 System.out.println("점수 : "+c.score  );
	 
	 Data d =new Data();
	 d.name ="해리";
	 d.grade = 1;
	 d.score = 75;
	 
	 System.out.print("이름 : "+ d.name+"," );
	 System.out.print("학년 : "+d.grade+"," );
	 System.out.print("점수 : "+d.score );

 }
}
*/
package oop.basic2;

public class Test01객체생성 {
 public static void main(String[]args) {
	  //4명의 학생 데이터를 생성
	 Data s1 =new Data();
	 Data s2 =new Data();
	 Data s3 =new Data();
	 Data s4 =new Data();
	 
	 
	 s1.name= "뽀로로";
	 s1.level =1;
	 s1.score =70;
	 
	 s2.name= "크롱";
	 s2.level =1;
	 s2.score =55;
	 
	 s3.name= "포비";
	 s3.level =2;
	 s3.score =80;
	 
	 
	 s4.name= "해리";
	 s4.level =1;
	 s4.score =75;
	 
	 System.out.println("<학생정보>");
	 System.out.print("이름 : "+s1.name+"," );
	 System.out.print("학년 : "+s1.level+"," );
	 System.out.println("점수 : "+s1.score );
	 
	 System.out.println("<학생정보>");
	 System.out.print("이름 : "+s2.name+"," );
	 System.out.print("학년 : "+s2.level+"," );
	 System.out.println("점수 : "+s2.score );
	 
	 System.out.println("<학생정보>");
	 System.out.print("이름 : "+s3.name+"," );
	 System.out.print("학년 : "+s3.level+"," );
	 System.out.println("점수 : "+s3.score );
	 
	 System.out.println("<학생정보>");
	 System.out.print("이름 : "+s4.name+"," );
	 System.out.print("학년 : "+s4.level+"," );
	 System.out.println("점수 : "+s4.score );
	 
 }
}
