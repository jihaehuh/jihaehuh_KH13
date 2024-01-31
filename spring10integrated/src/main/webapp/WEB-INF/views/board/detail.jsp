<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>${boardDto.boardNo} 번 게시글 상세</h1>

<table border="1" width="800">
	<tbody>
		<tr>
			<td>${boardDto.boardTitle}</td>
		</tr>
		<tr> 
			<td>
			<%--탈퇴한 사용자 일때와 아닐때 나오는 정보가 다르게 구현 --%>
			<c:choose><%-- 목록에서 사용자를 구별하기엔 아직 문제가 있어서 여기서 함 --%>
				<c:when test="${boardDto.boardWriter =null}">
					${boardDto.boardWriterStr}
				</c:when>
				<c:otherwise>
				<%-- <td>${boardDto.boardwriter}</td>--%>
				${memberDto.memberNick}
				(${memberDto.memberLevel})	
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr height="200" valign="top">
			<td>${boardDto.boardContent}</td>
		</tr>
		<tr>
			<td>조회수${boardDto.boardReadcount} 댓글 ?<br>
			<fmt:formatDate value="${boardDto.boardWriter}"
				pattern="yyyy-MM-dd HH:mm:ss"/>
			 </td>
		</tr>
		<tr>
			<td align ="right">
				<a href="write">글쓰기</a>
				<a href="#">답글쓰기</a>
				<a href="#">글 수정</a>
				<a href="#">글 삭제</a>
				<a href="list">글 목록</a>
				
			</td>
		</tr>
	</tbody>	
	</table>
<h3> <a href="#">게시글 삭제하기</a></h3>	
<h3> <a href="#">게시글 새로 작성하기</a></h3>
	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>