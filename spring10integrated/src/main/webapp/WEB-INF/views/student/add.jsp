<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
        function checkName() {
            var inputTarget = document.querySelector("[name=name]");

            //한글인지 검사
            var regex= /^[가-힣]{2,7}$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkKoreanScore() {
            var inputTarget = document.querySelector("[name=koreanScore]");
            

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEnglishScore() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=englishScore]");
            

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkMathScore() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=mathScore]");

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkForm() {
            var isValid1 = checkName();
            var isValid2 = checkKoreanScore();
            var isValid3 = checkEnglishScore();
            var isValid4 = checkMathScore();

            return isValid1 && isValid2 && isValid3 && isValid4;
        }
    </script>

<form action="add" method="post" autocomplete="off"
                                            onsubmit="return checkForm();">
    <div class="container w-400">
        <div class="cell center">
            <h1>학생 등록</h1>
        </div>
        <div class="cell">
            <label>
               이름
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="name" 
                        placeholder="(ex)홍길동" class="tool w-100"
                        onblur="checkName();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">이름을 반드시 작성하세요</div>
        </div>  
        <div class="cell">
            <label>
               국어 점수 
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="koreanScore" 
                            placeholder="(ex) 95" class="tool w-100"
                            onblur="checkKoreanScore();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">숫자로 작성하세요</div>
        </div>
        <div class="cell">
            <label>
                영어 점수
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="englishScore" 
                                placeholder="(ex) 95" class="tool w-100"
                                 onblur="checkEnglishScore();">
            <div class="fail-feedback">숫자로 입력하세요</div>
        </div>
        <div class="cell">
            <label>
                수학 점수 
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="number" name="mathScore" class="tool w-100"
                                        oninput="checkMathScore();">
            <div class="fail-feedback">숫자로 입력하세요</div>
        </div>
        <div class="cell">
            <button class="btn w-100">
                <i class="fa-solid fa-plus"></i>
                학생 등록
            </button>
        </div>
    </div>
    </form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>