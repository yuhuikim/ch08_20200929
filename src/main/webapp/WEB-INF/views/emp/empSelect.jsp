<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function delConfirm(empno) {
		var con = confirm("정말로 삭제하겠습니까 ?");
		if (con) location.href="empDelete.html?empno="+empno; // 홈에서 넘어온 데이터 -- get 방식
		else alert("취소 되었습니다");
	}
	$(function() {
		$('#empDisp').load("empList.html","deptno=${emp.deptno}"); //컨트롤러에서 넘어온 데이터
	});
</script>
</head>
<body>
	<div class="container" align="center">
		<h2 class="text-primary">직원 상세 정보</h2>
		<table class="table table-striped table-hover">
			<tr>
				<td>사번</td>
				<td>${emp.empno }</td>
				<td>이름</td>
				<td>${emp.ename }</td>
			</tr>
			<tr>
				<td>업무</td>
				<td>${emp.job }</td>
				<td>관리자</td>
				<td>${emp.mgr }</td>
			</tr>
			<tr>
				<td>입사일</td>
				<td>${emp.hiredate}</td>
				<td>급여</td>
				<td>${emp.sal }</td>
			</tr>
			<tr>
				<td>COMM</td>
				<td>${emp.comm }</td>
				<td>부서코드</td>
				<td>${emp.deptno}</td>
			</tr>
			<tr>
				<td colspan="4"><a href="empList.html?deptno=${emp.deptno}"
					class="btn btn-info">직원목록</a> <a
					href="empUpdateForm.html?empno=${emp.empno}"
					class="btn btn-warning">수정</a> <!-- 한번 더 삭제하시겠습니까? 하면서 의견을 물어보기 위해 추가한 부분이다. -->
					<button onclick="delConfirm(${emp.empno})" class="btn btn-danger">삭제</button>
					<a href="deptList.html" class="btn btn-success">부서목록</a></td>
			</tr>
		</table>
		<div id="empDisp"></div>
</body>
</html>