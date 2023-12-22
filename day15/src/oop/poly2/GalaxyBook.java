package oop.poly2;

public  class GalaxyBook extends NoteBook {

	@Override
	public void power() {
		System.out.println("갤럭시 북 전원 기능 실행");
		
	}

	@Override
	public void video() {
		System.out.println("갤럭시 북 동영상 재생 기능 실행");
		
	}

	@Override
	public void typing() {
		System.out.println("갤럭시 북 타이핑 기능 실행");
		
	}

	
}
