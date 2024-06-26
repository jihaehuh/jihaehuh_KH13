<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!--  for each 쓰려면 tag등록 해야함-->
   <!--  jQuery CDN -->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
   <script>
  /*  $(function () {
	   //form을 전송할 때 체크되지 않은 항목들이 전송되지 않도록 처리 
	$(".purchase-form").submit(function(){
		//하나도 체크가 안된 경우는 알림창 후 전송 중지
		var count = $(this).find("[name=no]:checked").length;//this=form  //체크된 박스 
		if(count == 0) {
			alert("체크 후 구매하세요");
			return false;
		}
		//체크되지 않은 항목의 수량 입력칸을 전송되지 않도록 처리 (disabled 처리)
		$(this).find(".product-wrapper").each(function(){
			//this = var
			var checked = $(this).find("[name=no]").prop("checked"); //체크여부 확인 
			if(checked == false) {
				$(this).find("[name=qty]").prop("disabled",true); //입력창 비활성화 
			}
		});		
		return true;
	});
}); */
   
$(function(){
	$(".purchase-form").submit(function(){
		var count = $(this).find("[name=no]:checked").length;
		if(count == 0) {
			return false;
		}
		
		//새로운 form을 만들어서 체크된 항목을 복사하고 전송하는 코드
		var action = $(this).attr("action");
		var method = $(this).attr("method");
		var newForm = $("<form>").attr("action", action).attr("method", method);
		
		//newForm에 항목 배치
		var index = 0;
		$(this).find(".product-wrapper").each(function(){//모든 항목을 찾아서
			var checkbox = $(this).find("[name=no]");//체크박스 추출
			var input = $(this).find("[name=qty]");//수량입력창 추출
			
			if(checkbox.prop("checked") == true) {//체크박스가 체크되어 있다면
				//input을 2개 만들어서 newForm에 배치
				$("<input>").attr("type", "hidden")
									.attr("name", "purchase["+index+"].no")
									.val(checkbox.val())
									.appendTo(newForm);
				$("<input>").attr("type", "hidden")
									.attr("name", "purchase["+index+"].qty")
									.val(input.val())
									.appendTo(newForm);
				index++;
			}
		});
		
		//newForm 전송
		$("body").append(newForm);//반드시 화면에 배치해야
		newForm.submit();//전송이 가능
		
		return false;//이 form은 전송을 안함
	});
});
   
   </script>
   
   
   
   <h1>복잡한결제 (진짜)</h1>
   
<form action ="purchase" method="post" class="purchase-form">
   <c:forEach var="productDto" items="${list}">
		<div class="product-wrapper">
		<input type="checkbox" name="no" value="${ productDto.no}">
			[${productDto.type}]
			${productDto.name }
			(${productDto.price }원)
			<input type="number" name="qty" value="1">
		</div>
</c:forEach>
<!-- 최소한의 정보를 주고 구매하려고 하면 번호를 넘겨주기
- 몇번 상품을 몇개인지 넘기기
ㅜㅐ=1 & qty =2 이렇게 넘기면 누가 누구랑 세트인지 모름...
-->
<input type="hidden" name="no" value="${productDto.no }">
<button type="submit">구매하기 </button>
</form>