<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<c:if test="${result>0 }">
		<script type="text/javascript">
			alert("입력 성공!");
			location.href = "deptList.html";
		</script>
	</c:if>
	<c:if test="${result==0 }">
		<script type="text/javascript">
			alert("다시!");
			history.back();
		</script>

		<c:if test="${result==-1}">
			<script type="text/javascript">
				alert("중복된 부서입니다.");
				history.back();
			</script>
		</c:if>
	</c:if>
</body>
</html>