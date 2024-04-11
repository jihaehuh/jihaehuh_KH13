<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!--  for each 쓰려면 tag등록 해야함-->
<h1> chatbot예제</h1>

<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>

<div class="question-wrapper"></div>


 <!--  jQuery CDN -->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
   <script type="text/javascript">
   $(function(){
	   $(".btn-connect").click(function(){
		   window.socket = new WebSocket("ws://localhost:8080/ws/chatbot");
		   
		   //웹소켓을 생성하고 나서 예상되는 각종 상황에 대해미리 콜백함수를 정의
		   //-onopen (연결 완료시 ),onclose(연결종료시 ),onerror(오류 발생시)
		   //-onmessage(메세지 수시신시 )
		   window.socket.onmessage = function(e) {
			   //console.log(e.data); //서버에서 전송된 내용(문자열)
			   var json =JSON.parse(e.data);
			  // console.log(json);
			  
			  //json에 들어있는 데이터 개수만큼 버튼을 생성
			   $(".question-wrapper").empty();
			  $(json).each(function(){
				  //console.log(this);
				  var button =$("<button>").text(this.chatbotQuestion)
				  														.addClass("btn-question");
				  $(".question-wrapper").append(button);
			  });
		   };
	   });
	   $(".btn-disconnect").click(function(){
		   window.socket .close();
	   });
	   
   });
 
   </script>