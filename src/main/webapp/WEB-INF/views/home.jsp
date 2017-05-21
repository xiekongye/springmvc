<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div>
    <h2>Home Content</h2>
    <h3>hello tiles</h3>
    <ol class="customer-list">
        <c:forEach var="customer" items="${customers}">
            <s:url value="/customer/{name}" var="customer_url">
                <s:param name="name" value="${customer.name}"/>
            </s:url>
        </c:forEach>
    </ol>
</div>
