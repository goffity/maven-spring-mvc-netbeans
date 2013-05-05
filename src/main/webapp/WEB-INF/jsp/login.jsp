<%-- 
    Document   : login
    Created on : 5 พ.ค. 2556, 16:12:55
    Author     : goffity
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC - login</title>
    </head>
    <body>
        <div>
            <form:form method="post" action="login.do">
                <div>
                    <form:label path="username">Username</form:label>
                    <form:input path="username"></form:input>
                    </div>
                    <div>
                    <form:label path="password">Password</form:label>
                    <form:password path="password"></form:password>
                    </div>
                    <div>
                        <input type="submit" name="smt" value="Submit">
                    </div>
            </form:form>
        </div>
    </body>
</html>
