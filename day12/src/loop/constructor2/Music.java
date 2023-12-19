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
		this.play = play;
	}
	
	void setLikes(double likes) {
		this.likes = likes;
	}
	
	Music(String title, String singer,double play,double likes){
		this.setTitle(title);
		this.setSinger(singer);
		this.setPlay(play);
		this.setLikes(likes);
	}
	void information() {
		System.out.println("<음원 차트>");
		System.out.println("가수 : " +this.singer);
	}
	
	
	
	
	
}
