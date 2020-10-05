package com.ch.ch08.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.ch08.dao.EmpDao;
import com.ch.ch08.model.Emp;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao ed;

	public List<Emp> empList(int deptno) {
		return ed.empList(deptno);
	}

	public Emp empSelect(int empno) {
		return ed.empSelect(empno);
	}

	@Override
	public int empInsert(Emp emp) {
		return ed.empInsert(emp);
	}

	@Override
	public int empUpdate(Emp emp) {
		return ed.empUpdate(emp);
	}

	@Override
	public int empDelete(int empno) {
		return ed.empDelete(empno);
	}

	@Override
	public List<Emp> empJoinList() {
		return ed.empJoinList();
	}
	@Override
	public List<Emp> empAllList() {
		return ed.empAllList();
	}
}