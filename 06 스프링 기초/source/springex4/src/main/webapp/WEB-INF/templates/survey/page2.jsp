<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/survey/page3" />
<form:form action="${action}" modelAttribute="requestSurvey">
    문항4. <form:input path="q4"/><br/>
    문항5. <form:input path="q5"/><br/>
    문항6. <form:input path="q6"/><br/>
    <button type = "submit">다음페이지</button>
</form:form>