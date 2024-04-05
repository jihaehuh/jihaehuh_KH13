<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!--  for each 쓰려면 tag등록 해야함-->
 <!--  jQuery CDN -->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
	
	<h1>결제 상세 정보 </h1>
	${paymentDto}
	<hr>
	${detailList}
	<hr>
	${responseVO}