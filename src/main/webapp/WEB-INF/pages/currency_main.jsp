<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Currency</title>
</head>
<body>
<div>
    <div>
<%--        <form:form action="/" method="post" modelAttribute="currency">--%>
        <form>
            <table>
                <tbody>
                    <tr>
                        <td>
                            <select name="from" id="from">
                                <option value="EUR">EUR</option>
                                <option value="USD">USD</option>
                            </select>
                        </td>
                        <td><input type="text" id="amount" /></td>
                    </tr>
<%--                    <tr>--%>
    <%--                    <td><form:label path="amount">0</form:label></td>--%>
    <%--                    <td><form:input path="amount" /></td>--%>

<%--                    </tr>--%>
                    <tr>
                        <td>
                            <select name="to" id="to">
                                <option value="EUR">EUR</option>
                                <option value="USD">USD</option>
                            </select>
                        </td>
                        <td>
                            <p id="result">0</p>
                            <p id="error"></p>
                        </td>
                    </tr>
                </tbody>
                <tfoot>
                <tr>
                    <td><input type="submit" value="Submit" id="submit" /></td>
                </tr>
                </tfoot>
            </table>
        </form>
<%--        </form:form>--%>
    </div>
</div>
<div>
    ${result}
</div>


<script src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/public/js/currency.js"></script>
</body>
</html>