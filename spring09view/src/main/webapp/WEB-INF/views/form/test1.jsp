<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>폼 예제</h1>
<%-- 
<form>
	- 정보를 제출하기 위한 도구 모음 (주소를 생성하는 도구)
	- 화면에 보이지 않음
	- action 속성으로 제출할 대상을 설정할 수 있다
	
	<input> 
	- 입력을 위한 도구
	<button>
	- 폼을 전송시키는 도구 
--%>
<h2>지니뮤직 검색창</h2>
<form action ="https://www.genie.co.kr/search/searchMain">
	<input name ="query">
	<button>검색</button>
</form>

<h2>쿠팡 검색창</h2>
<form action ="https://www.coupang.com/np/search">
	<input name="q">
	<button>검색</button>
</form>