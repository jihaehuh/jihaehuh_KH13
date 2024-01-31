<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    <h1>게시글 수정</h1>
    
    
    <from action ="edit" method="post">
    	<input type="hidden" name="boardNo" value="${boardDto.boardNo}">
    	
    	제목<input type="text" value="boardTitle" value="${boardDto.boardTitle}">
    	<%--textarea 는 시작태그와 종료태그 사이에 내용을 작성 --%>
    	내용 
    	<textarea name ="boardContent" value="${boardDto.boardContent}"></textarea><br><br>
    <button>수정</button>
    
    
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>