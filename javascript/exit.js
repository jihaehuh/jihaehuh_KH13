/*
    페이지 이탈 방지 처리 라이브러리 
    다음 두 가지 유형을 제외한 모든 이탈을 방지 
    - <form>에 .free-pass가 붙어있으면 submit시 beforeunload제거
    - <a>에.free-pass가 붙어있으면 click시 beforeunload제거

*/
$(function(){
    //창에 beforeunload 이벤트 설정
    $(window).on("beforeunload",function(){//자바스크립트에서 윈도우란 최상위 객체
        return false;
    }); 

    //<form>에 .free-pass가 붙어있으면 submit시 beforeunload제거
     $("form.free-pass").submit(function(){
        $(window).off("beforeunload");
        return true;
     });

    //<a>에.free-pass가 붙어있으면 click시 beforeunload제거
        $("a.free-pass").click(function(){
        $(window).off("beforeunload");
        return true;
     });
   

});