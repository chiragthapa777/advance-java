<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Palindrome Checker</title>
</head>
<body>
    <h1>Palindrome Checker</h1>
    <form method="post" action="palindrome.jsp">
        Enter a word: <input type="text" name="inputWord">
        <input type="submit" value="Check">
    </form>

    <%
        String inputWord = request.getParameter("inputWord");
        String reversedWord = new StringBuilder(inputWord).reverse().toString();
        boolean isPalindrome = inputWord.equalsIgnoreCase(reversedWord);
    %>

    <h2>Result:</h2>
    <p>Word: <%= inputWord %></p>
    <p>Reversed Word: <%= reversedWord %></p>
    <p><%= (isPalindrome ? "It is a palindrome!" : "It is NOT a palindrome!") %></p>
</body>
</html>
