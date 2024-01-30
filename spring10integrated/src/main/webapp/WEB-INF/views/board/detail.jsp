<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>${boardDto.boardNo}게시글 상세</h1>

<table border="1" width="800">
	<tbody>
		<tr>
			<th width ="30%">게시글 번호</th>
			<td>${boardDto.boardNo}</td>
		</tr>
		<tr>
			<th>게시글 제목</th>
			<td>${boardDto.boardTitle}</td>
		</tr>
		<tr> 
			<th>게시글 내용</th>
			<td>${boardDto.boardContent}</td>
		</tr>
		<tr>
			<th>게시글 작성 시간</th>
			<td>${boardDto.boardWtime}</td>
		</tr>
		<tr>
			<th>게시글 마지막 수정 시간</th>
			<td>${boardDto.boardEtime}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDto.boardReadcount}</td>
		</tr>
	</tbody>	
	</table>
<h3> <a href="#">게시글 삭제하기</a></h3>	
<h3> <a href="#">게시글 새로 작성하기</a></h3>
	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>