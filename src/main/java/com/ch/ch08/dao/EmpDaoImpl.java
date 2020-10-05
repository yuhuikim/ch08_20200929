package com.ch.ch08.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.ch08.model.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private SqlSessionTemplate sst;

	public List<Emp> empList(int deptno) {
		return sst.selectList("empns.empList", deptno);
	}

	public Emp empSelect(int empno) {
		return sst.selectOne("empns.empSelect", empno);
	}

	@Override
	public int empInsert(Emp emp) {
		return sst.insert("empns.empInsert", emp);
	}

	@Override
	public int empUpdate(Emp emp) {
		return sst.update("empns.empUpdate", emp);
	}

	@Override
	public int empDelete(int empno) {
		return sst.delete("empns.empDelete", empno);
	}	
	
	@Override
	public List<Emp> empAllList() {
		return sst.selectList("empns.empAllList");
	}

	@Override
	public List<Emp> empJoinList() {
		return sst.selectList("empns.empJoinList");
	}
}