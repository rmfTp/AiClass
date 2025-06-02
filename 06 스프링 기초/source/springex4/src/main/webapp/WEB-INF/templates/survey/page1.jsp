<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
${commonValue}
<c:url var="action" value="/survey/page2" />
<form:form action="${action}" modelAttribute="requestSurvey">
    문항1. <form:input path="q1"/><br/>
    문항2. <form:input path="q2"/><br/>
    문항3. <form:input path="q3"/><br/>
    <button type = "submit">다음페이지</button>
</form:form>