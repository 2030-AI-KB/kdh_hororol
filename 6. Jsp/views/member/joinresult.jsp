
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = (String) request.getAttribute("name");
%>
<%= name%>님, 어서와라!
<button onclick="location.href='/main.do'">홈으로</button>
<button onclick="location.href='/login.do'">로그인하기</button>