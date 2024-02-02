<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>판매 상품 등록</h1>

<%--
	파일을 전송하려는 form 은 다음과 같이 설정해야한다
		- method =post, 
		- encType= multipart/form-data
 --%>
<form action ="add" method="post" enctype="multipart/form-data">
	상품명<input type="text" name="itemName" required><br><br>
	판매액<input type="number" name="itemPrice" required> <br><br>
	충전액<input type="number" name="itemCharge" required><br><br>
	<%--
		파일 선택은 input[type =file]로 한다
		-accept를 통해 원하는 우형만 선택할 수 있다
	 --%>
	 이미지
	<%--이미지<input type="file" name="attach" required accept=".jpg,.png,.gif"><br><br>--%>
	<input type="file" name="attach" accept="image/"><br><br> <%-- required --%>
	<button>신규 등록</button>
</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>