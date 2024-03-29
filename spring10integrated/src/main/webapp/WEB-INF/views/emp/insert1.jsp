<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%--
	절대경로
	<form action="/emp/insert2"></form>

	상대경로
	<form action="insert2"></form>	
 --%>
 
 <!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
        function checkEmpName() {
            var inputTarget = document.querySelector("[name=empName]");
           

            //한글인지 검사
            var regex= /^[가-힣]{2,7}$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDept() {
            var inputTarget = document.querySelector("[name=empDept]");
            

           //한글인지 + 한글자라도 써졌는지 검사
           var regex=/^[가-힣a-zA-Z0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDate() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=empDate]");
            

            //날짜 검사
            var regex=/^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$/;
            var isValid = regex.test(inputTarget.value);
            
            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpSal() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=empSal]");
            

            var regex = /^[0-9]+$/;
            var isValid = regex.test(empSal);
            //var isValid = empSal.length > 0;

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkForm() {
            var isValid1 = checkEmpName();
            var isValid2 = checkEmpDept();
            var isValid3 = checkEmpDate();
            var isValid4 = checkEmpSal();

            return isValid1 && isValid2 && isValid3 && isValid4;
        }
    </script>
 
 
 <form action="insert" method="post" autocomplete="off"
                                            onsubmit="return checkForm();">
    <div class="container w-400">
        <div class="cell center">
            <h1>사원 등록</h1>
        </div>
        <div class="cell">
            <label>
                사원명
            </label>
            <input type="text" name="empName" 
                        placeholder="(ex)홍길동" class="tool w-100"
                        onblur="checkEmpName();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">이름을 반드시 작성하세요</div>
        </div>  
        <div class="cell">
            <label>
                부서명
            </label>
            <input type="text" name="empDept" 
                            placeholder="(ex) 마케팅소속" class="tool w-100"
                            onblur="checkEmpDept();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">부서를 반드시 설정하세요</div>
        </div>
        <div class="cell">
            <label>
                입사일
            </label>
            <input type="date" name="empDate" class="tool w-100"
                                        oninput="checkEmpDate();">
            <div class="fail-feedback">잘못된 날짜 형식입니다</div>
        </div>
        <div class="cell">
            <label>
                급여액
            </label>
            <input type="text" name="empSal" class="tool w-100"
                   placeholder="(ex)500000"  oninput="checkEmpSal();">
            <div class="fail-feedback">급여는 숫자로 입력하세요</div>
        </div>
        <div class="cell">
            <button class="btn w-100">
                <i class="fa-solid fa-plus"></i>
                사원 등록
            </button>
        </div>
    </div>
    </form>	
 
 
 <%-- 템플릿 페이지를 불러오는 코드 --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
 
 
 
 