<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>

<!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
        function checkMenuNameKor() {
            var inputTarget = document.querySelector("[name=menuNameKor]");
            

           //한글인지 + 한글자라도 써졌는지 검사
           var regex=/^[가-힣a-zA-Z0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkMenuNameEng() {
            var inputTarget = document.querySelector("[name=menuNameEng]");

            var isValid = empDept.length > 0;

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkMenuType() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=menuType]");

            var isValid = empDept.length > 0;
            
            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkMenuPrice() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=menuPrice]");

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);
        
            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkForm() {
            var isValid1 = checkMenuNameKor();
            var isValid2 = checkMenuNameEng();
            var isValid3 = checkMenuType();
            var isValid4 = checkMenuPrice();

            return isValid1 && isValid2 && isValid3 && isValid4;
        }
    </script>

<form action="insert" method="post" autocomplete="off"
                                            onsubmit="return checkForm();">
    <div class="container w-400">
        <div class="cell center">
            <h1>메뉴 등록</h1>
        </div>
        <div class="cell">
            <label>
                한글 메뉴명
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="menuNameKor" 
                        placeholder="(ex)김치찌개" class="tool w-100"
                        onblur="checkMenuNameKor();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">한글로 작성하세요</div>
        </div>  
        <div class="cell">
            <label>
               영문 메뉴명
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="menuNameEng" 
                            placeholder="(ex) kimchiZiigae" class="tool w-100"
                            onblur="checkMenuNameEng();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">영어로 작성하세요</div>
        </div>
        <div class="cell">
            <label>
                메뉴유형 
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <select name="menuType" class="tool w-100"
            oninput="checkMenuType();">
            <option value="">선택하세요</option>
            <option value="음료">음료</option>
            <option value="한식">한식</option>
            <option value="분식">분식</option>
            <option value="양식">양식</option>
            <option value="중식">중식</option>
            <option value="디저트">디저트</option>

        </select>
            <div class="fail-feedback">반드시 선택하세요</div>
        </div>
        <div class="cell">
            <label>
                메뉴가격
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="number" name="menuPrice" class="tool w-100"
                                        oninput="checkMenuPrice();">
            <div class="fail-feedback">숫자로만 입력하세요</div>
        </div>
        <div class="cell">
            <button class="btn positive w-100">
                <i class="fa-solid fa-floppy-disk"></i>
                메뉴 등록
            </button>
        </div>
        <div class="cell">
            <a href="list">목록 보기</a>
        </div>
    </div>
    </form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>





