package egovframework.example.sample.service.impl;

import java.util.List;

public interface DeptService {
	
	public String InsertDept(DeptVO vo) throws Exception;
	
	public DeptVO SelectDeptDetail(int deptno) throws Exception;
	
	public List<?> SelectDeptList(DeptVO vo) throws Exception;
	
	public int DeleteDept(int deptno) throws Exception;
	

}
