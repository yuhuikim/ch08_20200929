package com.ch.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.ch08.dao.DeptDao;
import com.ch.ch08.model.Dept;
import com.ch.ch08.model.Emp;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao dd;

	@Override
	public List<Dept> list() {
		return dd.list();
	}

	@Override
	public Dept select(int deptno) {
		return dd.select(deptno);
	}

	@Override
	public int insertDept(Dept dept) {
		return dd.insertDept(dept);
	}

	@Override
	public int updateDept(Dept dept) {
		return dd.updateDept(dept);
	}

	@Override
	public int deleteDept(int deptno) {
		return dd.deleteDept(deptno);
	}
}