package loop.constructor2;

public class Music {
	private String title;
	private String singer;
	private double play;
	private double likes;
	

	
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setPlay(double play) {
		if(play>=0) { 
		}
		this.play = play;
	}
	
	void setLikes(double likes) {
		if(likes>=0) {
		}
		this.likes = likes;
	}
	double getBest(){
		if(this.play >100000){//재생수가 10만이 넘을 때
		}
		else {
		
	}
		return this.getBest();
	}
	double getPopular() {//좋아요수가 10만이 넘을 때
		return this.getPopular();
	}
	//랭킹 점수 = 재생수 * 2 + 좋아요수 / 2
	double getRank() {
		return this.play *2 + this.likes /2;
	}
		
		Music(String title, String singer,double play,double likes){
		this.setTitle(title);
		this.setSinger(singer);
		this.setPlay(play);
		this.setLikes(likes);
	}
	
		void information() {
		System.out.println("<음원 차트>");
		System.out.println("제목 : " +this.title);
		if(this.play>100000) {
			System.out.print("(인기곡)");
		}
		if(this.likes>100000) {
			System.out.print("(베스트)");
		}
		System.out.println("가수 : "+ this.singer);
		System.out.println("재생수 : "+this.play);
		System.out.println("좋아요수 : "+this.likes);
		System.out.println("랭킹점수 : "+this.getRank());
	}
	
	
	
	
	
}
