/*
 * api.lang.string.Test07욕설필터링
사용자가 임의의 문자열을 입력했을 때 이 안에 포함된 욕설을 모두 마스킹 처리하세요

이번에는 사용자가 띄어쓰기가 있는 문자열을 입력해야 합니다.

String input = sc.nextLine();


욕설 샘플은 다음과 같습니다.
수박, 조카, 시베리아, 개나리, 신발끈, 
지옥, 주옥, 십장생, 십자수, 게불
 */
package api.lang.string;



public class Test07욕설필터링 {
	public static void main(String[] args) {
		
	
		//1.난이도를 떨어뜨려서 수박만 **로 만들어 보자!
		
		//String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
		//String filter ="신발끈";
		//System.out.println(input.replaceAll(filter, "**"));

		//2.난이도를 떨어뜨려서..단어 여러개중 하나만 **로 바꾸자!
		/*
		String[]words = new String[]{
				"수박", "조카"," 시베리아", "개나리"," 신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"
		};
		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
		//String filter =words[7];
		//System.out.println(input.replaceAll(filter, "**"));
		
		//filter =words[3];
		//System.out.println(input.replaceAll(filter, "**"));
		//System.out.println(input.replace(words[3],"**").replace(words[7], "**"));
		
		
		for(int i=0;i<words.length;i++) {
			input =input.replace(words[i],"**");
		}
		/*
		input =input.replace(words[0],"**");
		input =input.replace(words[1],"**");
		input =input.replace(words[2],"**");
		input =input.replace(words[3],"**");
		input =input.replace(words[4],"**");
		input =input.replace(words[5],"**");
		input =input.replace(words[6],"**");
		input =input.replace(words[7],"**");
		input =input.replace(words[8],"**");
		input =input.replace(words[9],"**");
		*/
		/*
		System.out.println(input);
		*/
		
		/*
		//3. 모든 단어의 글자수를 지켜가면서 마스킹 처리를 하도록 업그레이드 하자
		String[]words = new String[]{
				"수박", "조카"," 시베리아", "개나리"," 신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"
		};
		
	    String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
	    
	    String star="*";
	    for(int i=0;i<words.length;i++) {
			//input =input.replace(words[i],"**");
	    	//input =input.replace(words[i],star.repeat(2));//별표찍기를 변수 처리
	    	int size =words[i].length(); //글자수 확인
	    	input =input.replace(words[i],star.repeat(size)); //글자수 만큼 별 반복 시키기(java11 이후)
		}
	    System.out.println(input);
	*/
		//4.감각적으로 프로그래밍
		String[]words = new String[]{
				"수박", "조카"," 시베리아", "개나리"," 신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"
		};
		
	    String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";
	   /* 
	    String []star=new String[] {//배열로 만들기
	    		"",
	    		"*",
	    		"**",
	    		"***",
	    		"****",
	    		"*****",
	    		"*******",
	    		"********",
	    		"*********",
	    		"***********"
	    };
	    */
	  //별찍기
	    String star ="";
	    for(int k=1;k<=10;k++) {
	    	star +="*";
	    }
	    for(int i=0;i<words.length;i++) {
			//input =input.replace(words[i],"**");
	    	//input =input.replace(words[i],star.repeat(2));//별표찍기를 변수 처리
	    	//int size =words[i].length(); //글자수 확인
	    	//input =input.replace(words[i],star[size]); //글자수 만큼 별 반복 시키기(java11 이후)
	    	input =input.replace(words[i],star); 
	    }
	    System.out.println(input);
	}
	
}

