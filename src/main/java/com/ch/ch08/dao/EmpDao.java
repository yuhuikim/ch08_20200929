package com.ch.ch08.dao;

import java.util.List;
import com.ch.ch08.model.Emp;

public interface EmpDao {
	List<Emp> empList(int deptno);

	Emp empSelect(int empno);

	int empInsert(Emp emp);

	int empUpdate(Emp emp);

	int empDelete(int empno);
	
	List<Emp> empAllList();
	
	List<Emp> empJoinList();

}