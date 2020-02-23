<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <div>
            <form:form action="/" method="post" modelAttribute="task">
                <table>
                    <tbody>
                        <tr>
                            <td><form:label path="name">Title</form:label></td>
                            <td><form:input path="name" /></td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td><input type="submit" value="Submit" /></td>
                        </tr>
                    </tfoot>
                </table>
            </form:form>
        </div>
        <div>
            <p>${derp}</p>
        </div>
        <div>
            <c:if test="${empty tasks}">
                <p>Empty</p>
            </c:if>

            <c:if test="${not empty tasks}">
                <p>Not Empty</p>

                <c:forEach var="task" items="${tasks}">
                    <p>${task.name}</p>
                </c:forEach>

            </c:if>
        </div>
    </body>
</html>