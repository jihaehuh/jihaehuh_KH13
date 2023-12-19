package oop.method8;

public class Student {
    //멤버 변수 - 학년, 반, 이름, 국어, 영어, 수학
    int level;
    int group;
    String name;
    int korean, english, math;
    
    //멤버 메소드
    void data(int level, int group, String name, int korean, int english, int math) {
        this.level = level;
        this.group = group;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    //보조 계산을 수행하는 메소드 생성
    //-**return키워드**를 사용하여 값을 반환하도록 작성해야한다
    //-형태를 맞춰줘야함 int=>int  /if=>boolean /double=>double
    int getTotal() {//int 가 사용결과로 남는 getTotal 메소드
    	return this.korean +this.english +this.math;
    }
    
    double getAverage() {//double 이 사용결과로 남는 getAverage 메소드
    	return this.getAverage()/3d; 
    }
   
    boolean getPass() {//boolean 이 사용결과로 남는 getPass메소드
    	return this.korean >=40 && this.english >=40 && 
    			this.math >=40 && this.getAverage() >=60;
    }
    
    
    void information() {
        System.out.println("<학생 정보>");
        System.out.println(this.level+"학년 " +this.group+"반 "+this.name);
        System.out.println("국어 : " + this.korean+"점");
        System.out.println("영어 : " + this.english + "점");
        System.out.println("수학 : " + this.math + "점");
        
       // int total = this.korean + this.english + this.math; 
        //위에서 계산해서 get으로 불러로오기
        System.out.println("총점 : " + this.getTotal() + "점");
        //double average = total / 3d;
        //위에서 계산해서 get으로 불러오기
        System.out.println("평균 : " + this.getAverage() + "점");
        
       // if(this.korean >= 40 && this.english >= 40 
       //                 && this.math >= 40 && average >= 60) {
       //   System.out.println("당신은 통과하였습니다");
       // }//위에서 계산해서 get으로 불러오기
        if(this.getPass()/*==true*/) {
        	System.out.println("당신은 통과하였습니다");
        }
        else {
            System.out.println("당신은 재평가 대상자입니다");
        }
    }
}