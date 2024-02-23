package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl 
							 implements DeptService {
	
	// deptDAO를 사용하려면 Resource를 선언해주어야 함 
	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;

	@Override
	public String InsertDept(DeptVO vo) throws Exception {
		
		return deptDAO.InsertDept(vo);
	}

	@Override
	public List<?> SelectDeptList(DeptVO vo) throws Exception {
		
		return deptDAO.SelectDeptList(vo);
	}

	@Override
	public DeptVO SelectDeptDetail(int deptno) throws Exception {

		return deptDAO.SelectDeptDetail(deptno);
	}

	@Override
	public int DeleteDept(int deptno) throws Exception {
		return deptDAO.DeleteDept(deptno);
	}
	
}
