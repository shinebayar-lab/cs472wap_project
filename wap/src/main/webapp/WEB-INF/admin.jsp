<%--
  Created by IntelliJ IDEA.
  User: shinee
  Date: 2020.06.14
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    <script src="resources/js/admin_page.js" type="text/javascript"></script>
</head>
<body>

<fieldset>
    <legend>Course Registration System</legend>
    <form>
        Course Code <input type="text" id="course_code" name="course_code"><br>
        Course Name <input type="text" id="course_name" name="course_name"><br>
        Credits <input type="text" id="course_credits" name="course_credits"><br>
        Instructor <input type="text" id="course_instructor" name="course_instructor"><br>
        <br>
        <input type="button" value="Save Data" id="btnAdd">
        <input type="button" value="Save Edit Data" id="btnSaveEdit">
        <br>
    </form>
    <table id="tbl">
        <tr>
            <th>#</th>
            <th>Code</th>
            <th>Course Name</th>
            <th>Course Credits</th>
            <th>Couse Instructor</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

    </table>
</fieldset>
</body>
</html>
