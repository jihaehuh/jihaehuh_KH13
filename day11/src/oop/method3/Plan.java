package oop.method3;

public class Plan {
	
		String telecom;
		String name;
		int monthPrice;
		int dataAmount;
		int call;
		int sms;
		
		
		//초기화
			void data(String telecom, String name, int  monthPrice, 
					int dataAmount, int call, int sms) {
				this.telecom =telecom;
				this.name= name;
				this. monthPrice = monthPrice;
				this.dataAmount =dataAmount;
				this.call=call;
				this.sms=sms;
				
			}
			//출력
			void information() {
				System.out.println("<요금제 정보>");
				System.out.println("통신사 :"+ this.telecom);
				System.out.println("상품명 : "+ this.name);
				System.out.println("월정액 : "+ this. monthPrice +"원");
				System.out.println("데이터(GB) : "+ this.dataAmount+"GB");
				System.out.println("통화  : "+ this.call+"분");
				System.out.println("문자 : "+ this.sms+"건");
			}
		}
	


