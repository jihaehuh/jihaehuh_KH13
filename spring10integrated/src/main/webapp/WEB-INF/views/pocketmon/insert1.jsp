<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>


<%--
		생성해야하는 주소 형태
		http://localhost:8080/pocketmon/insert2
		?pocketmonNo=1&pocketmonName=피카츄&pocketmonType=전기
				
		폼 (절대 경로)
		<form action ="/pocketmon/insert2" >
		
		폼 (상대 경로)
		<form action ="insert2">

--%>

<!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
        function checkPocketmonNo() {
            var inputTarget = document.querySelector("[name=pocketmonNo]");
            var pocketmonNo = inputTarget.value;

            //있는지만 검사
            //var isValid = pocketmonNo.length > 0;

            //숫자인지 검사
            var regex = /^[0-9]+$/;
            var isValid = regex.test(pocketmonNo);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkPocketmonName() {
            var inputTarget = document.querySelector("[name=pocketmonName]");
            var pocketmonName = inputTarget.value;

            var isValid = pocketmonName.length > 0;

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkPocketmonType() {
            //select는 option이 있지만 select 자체로 제어하도록 권장
            var inputTarget = document.querySelector("[name=pocketmonType]");
            var pocketmonType = inputTarget.value;

            var isValid = pocketmonType.length > 0;

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkForm() {
            var isValid1 = checkPocketmonNo();
            var isValid2 = checkPocketmonName();
            var isValid3 = checkPocketmonType();
            return isValid1 && isValid2 && isValid3;
        }
    </script>


<form action="insert2" method="post" autocomplete="off"
                                            onsubmit="return checkForm();">
    <div class="container w-400">
        <div class="cell center">
            <h1>포켓몬스터 등록</h1>
        </div>
        <div class="cell">
            <label>
                번호
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="pocketmonNo" 
                        placeholder="(ex) 1" class="tool w-100"
                        onblur="checkPocketmonNo();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">번호를 반드시 작성하세요</div>
        </div>  
        <div class="cell">
            <label>
                이름
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="pocketmonName" 
                            placeholder="(ex) 이상해씨" class="tool w-100"
                            onblur="checkPocketmonName();">
            <!-- <div class="success-feedback"></div> -->
            <div class="fail-feedback">이름을 반드시 작성하세요</div>
        </div>
        <div class="cell">
            <label>
                속성
                <i class="fa-solid fa-asterisk red"></i>
            </label>
            <select name="pocketmonType" class="tool w-100"
                                        oninput="checkPocketmonType();">
                <option value="">선택하세요</option>
                <option value="풀">풀</option>
                <option value="불꽃">불꽃</option>
                <option value="물">물</option>
                <option value="전기">전기</option>
                <option value="독">독</option>
                <option value="비행">비행</option>
                <option value="무속성">무속성</option>
            </select>
            <div class="fail-feedback">반드시 속성을 선택해야 합니다</div>
        </div>
        <div class="cell">
            <button class="btn positive w-100">
                <i class="fa-solid fa-plus"></i>
                등록
            </button>
        </div>
    </div>
    </form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>