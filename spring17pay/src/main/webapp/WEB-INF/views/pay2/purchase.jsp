<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!--  for each 쓰려면 tag등록 해야함-->
<h1>간단한 결제</h1>

<c:forEach var="productDto" items="${list}">
<div>
[${productDto.type}]
${productDto.name }
(${productDto.price }원)

<form action ="purchase" method="post">
<!-- 최소한의 정보를 주고 구매하려고 하면 번호를 넘겨주기 -->
<input type="hidden" name="no" value="${productDto.no }">
<button type="submit">구매하기 </button>
</form>

</div>
</c:forEach>