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
    
    void information() {
        System.out.println("<학생 정보>");
        System.out.println(this.level+"학년 " +this.group+"반 "+this.name);
        System.out.println("국어 : " + this.korean+"점");
        System.out.println("영어 : " + this.english + "점");
        System.out.println("수학 : " + this.math + "점");
        
        int total = this.korean + this.english + this.math;
        System.out.println("총점 : " + total + "점");
        double average = total / 3d;
        System.out.println("평균 : " + average + "점");
        
        if(this.korean >= 40 && this.english >= 40 
                        && this.math >= 40 && average >= 60) {
            System.out.println("당신은 통과하였습니다");
        }
        else {
            System.out.println("당신은 재평가 대상자입니다");
        }
    }
}