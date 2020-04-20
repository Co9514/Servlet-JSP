<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%!
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://220.69.74.168:3306/hoseo_bus";
        String uid = "test_1";
        String upw = "hoseobus";
        String query = "select * from STUDENTS_INFO;";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, uid, upw);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
 
            while(resultSet.next()){
                String id = resultSet.getString("STUDENT_ID");
                String pw = resultSet.getString("STUDENT_PW");
                String phone = resultSet.getString("STUDENT_PHONE");
                out.println(id + pw + phone + "<br/>");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{ //모든 자원 해제
            try{
                if(resultSet != null) resultSet.close();
                if(statement != null) statement.close();
                if(connection != null) connection.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    %>
</body>
</html>