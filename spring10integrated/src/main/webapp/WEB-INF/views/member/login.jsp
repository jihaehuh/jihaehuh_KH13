<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>



<!-- jquery cdn -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
    <!-- 내가 만든 스크립트 추가(jQuery를 사용했으니 jQuery CDN 아래 작성) -->
    <script src="commons.js"></script>
    <!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
<script type="text/javascript">
        $(function(){
            //해야할 일
            //1. 아이디 입력창에서 입력이 완료될 경우 형식 검사하여 결과 기록
            //2. 비밀번호 입력창에서 입력이 완료될 경우 형식 검사하여 결과 기록
            //3. 비밀번호 확인창에서 입력이 완료될 경우 비밀번호와 비교하여 결과 기록
            //4. form의 전송이 이루어질 때 모든 검사결과가 유효한지 판단하여 전송

            //상태객체(React의 state로 개념이 이어짐)
            var state = {
                //key : value
                memberIdValid : false,
                memberPwValid : false,
                memberPwCheckValid : false,
                //객체에 함수를 변수처럼 생성할 수 있다
                //- this는 객체 자신(자바와 동일하지만 생략이 불가능)
                ok : function(){
                    return this.memberIdValid && this.memberPwValid && this.memberPwCheckValid;
                },
            };

            $("[name=memberId]").on("blur", function(){
                var regex = /^[a-z][a-z0-9]{7,19}$/;
                state.memberIdValid = regex.test($(this).val());
                $(this).removeClass("success fail")
                            .addClass(state.memberIdValid ? "success" : "fail");
            });
            $("[name=memberPw]").on("blur", function(){
                var regex = /^[A-Za-z0-9!@#$]{6,15}$/;
                state.memberPwValid = regex.test($(this).val());
                $(this).removeClass("success fail")
                            .addClass(state.memberPwValid ? "success" : "fail");
            });
            $("#pw-reinput").blur(function(){
                var memberPw = $("[name=memberPw]").val();
                state.memberPwCheckValid = memberPw == $(this).val();
                
                if(memberPw.length == 0) {
                    $(this).removeClass("success fail fail2").addClass("fail2");
                }
                else {
                    $(this).removeClass("success fail fail2")
                                .addClass(state.memberPwCheckValid ? "success" : "fail");
                }
            });

            //form 전송시에는 미리 설정해둔 상태변수만 확인하면 된다
            //- 검사 효과까지 보고싶다면 blur이벤트를 강제로 발생시킨다(trigger)
            //- $(대상).on("blur") 또는 $(대상).blur()
            $(".check-form").submit(function(){
                //$("[name=memberId]").on("input");
                //$("[name=memberPw]").on("input");
                //$("#pw-reinput").on("input");
                $("[name=memberId]").blur();
                $("[name=memberPw]").blur();
                $("#pw-reinput").blur();
                
                // return state.memberIdValid 
                //             && state.memberPwValid 
                //             && state.memberPwCheckValid;
                return state.ok();
            });
        });
    </script>



<div class="container w-500">
        <div class="cell center">
            <h1>로그인 </h1>
        </div>
<div align="center">
<form action ="login" method ="post">
	<div class="cell left">
            아이디
             <input type ="text" name="memberId" placeholder="아이디를 입력해주세요" class="tool w-100">
	</div>
 	 <div class="cell left">
            비밀번호
             <input type ="text" name="memberPw" placeholder="비밀번호를 입력해주세요" class="tool w-100">
 	</div>
 	<div>
	 	<c:if test="${param.error != null}">
			<h3 style ="color:red">로그인 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
		</c:if>
	</div>
 	<button class="btn w-100">로그인</button>
</form>
</div>
</div>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>