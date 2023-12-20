/*

package loop.constructor2;

public class Music {
	private String title;
	private String singer;
	private long play;
	private int likes;
	

	
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setPlay(long play) {
		if(play>=0) { 
		}
		this.play = play;
	}
	
	void setLikes(int likes) {
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
		
		Music(String title, String singer,long play,int likes){
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
*/
package loop.constructor2;

//클래스는 객체를 생성하기 위한 도구이다
public class Music {
	//멤버 필드(변수) - 데이터
	private String title;
	private String artist;
	private long playCount;
	private int likeCount;

	//생성자 - 초기화
	Music(String title, String artist) {
		this(title, artist, 0, 0);
	}
	Music(String title, String artist, long playCount, int likeCount){
		this.setTitle(title);
		this.setArtist(artist);
		this.setPlayCount(playCount);
		this.setLikeCount(likeCount);
	}

	//멤버 메소드 - 주요 기능
	void setTitle(String title) {
		this.title = title;
	}
	void setArtist(String artist) {
		this.artist = artist;
	}
	void setPlayCount(long playCount) {
		if(playCount < 0L) return;
		this.playCount = playCount;
	}
	void setLikeCount(int likeCount) {
		if(likeCount < 0) return;
		this.likeCount = likeCount;
	}
	String getTitle() {
		return this.title;
	}
	String getArtist() {
		return this.artist;
	}
	long getPlayCount() {
		return this.playCount;
	}
	int getLikeCount() {
		return this.likeCount;
	}

	long getRankingPoint() {
		return this.playCount * 2 + this.likeCount / 2;
		//return this.getPlayCount() * 2 + this.getLikeCount() / 2;
	}

	String getBestText() {
		if(this.playCount > 100000L) {
			return "(베스트)";
		}
		return "";
	}
	String getFavoriteText() {
		if(this.likeCount > 100000) {
			return "(인기곡)";
		}
		else {
			return "";
		}
	}

	void information() {
		System.out.println("<음원 정보>");
		System.out.println("제목 : " + this.title 
						+ this.getBestText() + this.getFavoriteText());//(베스트) (인기곡)
		System.out.println("가수 : " + this.artist);
		System.out.println("재생 수 : " + this.playCount+"회");
		System.out.println("좋아요 : " + this.likeCount);
		System.out.println("랭킹 포인트 : "+this.getRankingPoint()+" point");
	}
}