<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>
    <h1>메뉴 정보 변경</h1>
    
    <form action ="change" method ="post"><br>
    <input type ="hidden" name ="menuNo" required value ="${dto.menuNo}">
    한글 메뉴 이름 <input type ="text" name= "menuNameKor" required value ="${dto.menuNameKor}"><br>
    영문 메뉴 이름 <input type ="text" name= "menuNameEng" required value ="${dto.menuNameEng}"><br>
    메뉴 유형
     <select name="menuType" required value ="${dto.menuType}" >
		 	<option value ="">선택하세요</option>
			<option value ="커피">커피</option>
			<option value ="디저트">디저트</option>
			<option value ="스무디">스무디</option>
			<option value ="에이드">에이드</option>
			<option value ="음식">음식</option>
		</select><br>
    메뉴 가격 <input type ="text" name= "menuPrice" required value ="${dto.menuPrice}"><br>
    
    <button>정보 수정</button>
 
    </form>
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>