package oop.poly2;



public class Test01다형성 {
	public static void main(String[] args) {
		
		int type =1;
		int action=3;
		
		NoteBook notebook;
		if(type==1) { //갤럭시북
			notebook = new GalaxyBook();  //GalaxyBook->NoteBook 업캐스팅
			}
		else {//맥북
			notebook = new MacBook();  //MacBook->NoteBook 업캐스팅
		}
		
		
		
		//notebook 에 뭐가 들어 있던 기능을 실행하도록 구현
		if(action==1) {
			notebook.power();
		}
		else if (action ==2) {
			notebook.video();
		}
		else {
			notebook.typing();
		}
	}
	
}
