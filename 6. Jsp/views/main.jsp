<%@ page import="com.dto.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberDTO dto = (MemberDTO) session.getAttribute("mi");
%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.7.0.js"
            integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script>
        function searchSubmit() {
            var input = $('#keywordInput').val(); // id가 keywordInput의 값
            if (input == '') {
                alert('검색 키워드를 입력해 주세요.');
                return;
            }
            $('#searchForm').submit();
        }
    </script>
</head>
<body>

<%--<form action="/result.do" method="post"> &lt;%&ndash; localhost:8080/result &ndash;%&gt;--%>
    <%--이름--%>
    <%--<input type="text" name="myName"> &lt;%&ndash; 키 값 : myName, value 값 : 입력받은 값 &ndash;%&gt;--%>
    <%--나이--%>
    <%--<input type="text" name="myAge"> &lt;%&ndash; 키 값 : myAge, value 값 : 입력받은 값 &ndash;%&gt;--%>
    <%--<input type="submit" value="확인">--%>
<%--</form>--%>

<%--<form action="/search.do" method="post" id="searchForm"> &lt;%&ndash; localhost:8080/result &ndash;%&gt;--%>
    <%--검색--%>
    <%--<input type="text" name="myNameId" id="keywordInput"> &lt;%&ndash; 키 값 : myName, value 값 : 입력받은 값 &ndash;%&gt;--%>
    <%--<button type="button" onclick="searchSubmit()">확인</button>--%>

<%--</form>--%>
<%--&lt;%&ndash; form태그 안에 button태그 사용시 type을 button으로 설정해라. 안그러면 submit으로 자동으로 설정됨 &ndash;%&gt;--%>
<%
    if(dto == null){
%>
<a href="/member/join/form.do">회원가입</a>
<a href="/login.do">로그인</a>
<%
    }else{
%>
<%= dto.getName()%>님 안녕하시오.
<a href="/member/info.do">마이페이지</a>
<a href="/logout.do">로그아웃</a>
<%
    }
%>
</body>
</html>