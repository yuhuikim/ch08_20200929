package com.ch.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ch.ch08.model.Dept;
import com.ch.ch08.model.Emp;
import com.ch.ch08.service.DeptService;
import com.ch.ch08.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService es;
	@Autowired
	private DeptService ds;

	@RequestMapping("empList")
	public String empList(int deptno, Model model) {
		Dept dept = ds.select(deptno);
		List<Emp> empList = es.empList(deptno);
		model.addAttribute("dept", dept);
		model.addAttribute("empList", empList);
		return "/emp/empList";
	}

	@RequestMapping("empSelect")
	public String empSelect(int empno, Model model) {
		Emp emp = es.empSelect(empno);
		model.addAttribute("emp", emp);
		return "/emp/empSelect";
	}

	@RequestMapping("empInsertForm")
	public String empInsertForm(int deptno, Model model) {
		List<Dept> deptList = ds.list(); // 부서코드 선택
		List<Emp> empList = es.empAllList(); // 관리자 선택
		model.addAttribute("deptList", deptList);
		model.addAttribute("empList", empList);
		model.addAttribute("deptno", deptno);
		return "/emp/empInsertForm";
	}

	@RequestMapping("empInsert")
	public String empInsert() {
		return "/emp/empInsert";
	}

	@RequestMapping(value = "empNoChk", produces = "text/html; charset=utf-8")
	@ResponseBody
	public String empNoChk(int empno) {
		String msg = "";
		Emp emp = es.empSelect(empno);
		if (emp == null)
			msg = "사용 가능한 사번입니다.";
		else
			msg = "사용 중인 사번이므로 다른 사번을 사용하시오.";
		return msg;
	}
}