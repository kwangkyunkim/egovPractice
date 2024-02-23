package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {

	public String InsertDept(DeptVO vo) {
		return (String) insert("deptDAO.InsertDept",vo);
	}

	public List<?> SelectDeptList(DeptVO vo) {
		return (List<?>) list("deptDAO.SelectDeptList", vo);
	}
	
	public DeptVO SelectDeptDetail(int deptno) {
		return (DeptVO) select("deptDAO.SelectDeptDetail", deptno);
	}

	public int DeleteDept(int deptno) {
		return (int) delete("deptDAO.DeleteDept", deptno);
	}
}
