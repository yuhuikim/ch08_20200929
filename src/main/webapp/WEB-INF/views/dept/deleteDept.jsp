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
	<c:if test="${result > 0 }">
		<script type="text/javascript">
			alert("삭제되었습니다.");
			location.href = "deptList.html";
		</script>
	</c:if>

	<c:if test="${result == 0 }">
		<script type="text/javascript">
			alert("에러 발생");
			history.go(-1);
		</script>
	</c:if>

</body>
</html>