package oop.modifier2;

public class Classfee {

	
	//-기타 메소드[4]
	
	
	//멤버 필드(변수) [1]
	private String name;
	private int time;
	private int price;
	private String type;
	
	//멤버 메소드[2]
	//-세터/게터 변수[3]_ 과정 계산은 세터에서만 한다 
	void setName(String name){
		this.name=name;
		}
	
	//시간은 0보다 크고 30의 배수 일 경우만 설정한다
//	void setTime(int time){
//		if(time%30 ==0 && time>0) {//0시간 이상 30의 배수 
//		this.time=time;
//		}
//	}
	//'시간은 0 이하거나 30의 배수가 아니라면 설정하지 않는다'  위의 말과 같은 이야기임
	void setTime(int time) {   //int 변수를 set에 넣어서 조건이 만족해서 가능하면 this에 넣어라
		if(time <=0) {   //조건 하나 쓰고 리턴 가능 
			return;  //그만해
		}
		if(time %30!=0) {
			return;  //그만해
		}
		this.time=time;
	}
	//price 가 0이상일 경우 설정하세요(화이트리스트 방식)
//	void setPrice(int price){
//		if(price >=0) {
//			this.price=price;
//			}
//		}
	//price 가 0미만일 경우 설정하지마세요(블랙리스트 방식)
		void setPrice(int price){
			if(price<0) {
				return;
			}
			this.price=price;
		}
		//(주의) 문자열과 객체 등은 비교연산을 쓰지 않는다
		//			(비교연산은 원시형을 위한 연산)
		//(해결) 별도의 비교명령을 쓰거나 switch구문을 사용
		void setType(String type){
//		if(type == "온라인" || type == "오프라인" ||type == "혼합" ) {//지금은 우연히 가능함
//			this.type=type;
//		}
		switch(type) {
		case "온라인":
		case "오프라인":
		case"혼합":
				this.type=type;
			}
		}
//게터함수 _ 출입문 예시_클럽| 들어가는게 안됨
	String getName() {
		return this.name;
	}
	int getTime() {
		return this.time;
		
	}
	int getPrice() {
		
		return this.price;
	}
	String getType() {
		return this.type;
	}
	//1시간 당 수강료를 계산하는 메소드가 추가로 필요하다(가상의 getter)
	int getTimePrice() {
		return this.price/ this.time;
	}
	
	//가급적이면 세터나 게터를 사용해라
	void data(String name,int time,int price, String type) {
		this.setName(name); //만들어 놓은 세터로 전달시켜라
		this.setTime(time);  
		this.setPrice(price);
		this.setType(type);
	}
	void information() {
		System.out.println("<과정 정보>");
		System.out.println("강좌 이름 : "+ this.getName());
		System.out.println("수강 시간: "+this.getTime());
		System.out.println("수강료 : "+this.getPrice()+ 
				"원 (1시간당 : "+this.getTimePrice()+"원)");
		System.out.println("온/ 오프라인 중 : "+ this.getType());
	
	}
	
	
	
	
}
