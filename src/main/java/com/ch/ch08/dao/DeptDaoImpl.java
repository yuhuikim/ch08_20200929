package com.ch.ch08.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.ch08.model.Dept;

@Repository
public class DeptDaoImpl implements DeptDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<Dept> list() {
		return sst.selectList("deptns.deptList");
	}

	@Override
	public Dept select(int deptno) {
		return sst.selectOne("deptns.select", deptno);
	}

	@Override
	public int insertDept(Dept dept) {
		return sst.insert("deptns.insertDept", dept);
	}

	@Override
	public int updateDept(Dept dept) {
		return sst.update("deptns.updateDept", dept);
	}

	@Override
	public int deleteDept(int deptno) {
		return sst.delete("deptns.deleteDept", deptno);
	}
}