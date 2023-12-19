package oop.method9;

//적금 통장 클래스
public class Deposit {
	//멤버 필드(변수) - 데이터
	String owner;//예금주
	float baseRate;//기본이율
	float plusRate;//우대이율
	int monthly;//월부금
	int period;//예치기간(년)

	//멤버 메소드 - 코드
	void data(String owner, float baseRate, int monthly, int period) {
		this.data(owner, baseRate, 0f, monthly, period);
	}
	void data(String owner, float baseRate, float plusRate, int monthly, int period) {
		this.owner = owner;
		this.baseRate = baseRate;
		this.plusRate = plusRate;
		this.monthly = monthly;
		this.period = period;
	}

	//총 적용 이율을 구하는 메소드
	float getTotalRate() {
		return this.baseRate + this.plusRate;
	}
	int getYearly() {
		return this.monthly * 12;
	}
	int getTotalDeposit() {
		return this.getYearly() * this.period;
	}
	int getInterest() {
		return (int) (this.getTotalDeposit() * this.getTotalRate() / 100);
	}
	int getTotalBalance() {
		return this.getTotalDeposit() + this.getInterest();
	}
	String getOwner() {
		return this.owner;
	}
	float getBaseRate() {
		return this.baseRate;
	}
	float getPlusRate() {
		return this.plusRate;
	}
	int getMonthly() {
		return this.monthly;
	}
	int getPeriod(){
		return this.period;
	}
	//모두 get.메소드로 고쳐줌
	void information() {
		System.out.println("<적금 계좌 정보>");
		System.out.println("예금주 : " + this.getOwner());
		System.out.println("예치 기간 : "+ this.getPeriod());
		System.out.print("적용이율 : 기본("+this.getBaseRate()+"%) + ");
		System.out.print("우대("+this.getPlusRate()+"%) = ");
		System.out.println("총("+this.getTotalRate()+"%)");
		System.out.println("월 입금액 : "+this.getMonthly()+"원");
		System.out.println("연 입금액 : "+this.getYearly()+"원");
		System.out.println("총 입금액 : "+this.getTotalDeposit()+"원");
		System.out.println("총 이자 : "+this.getInterest()+"원");
		System.out.println("최종 만기 시 예상 금액 : "+this.getTotalBalance()+"원");
	}
}