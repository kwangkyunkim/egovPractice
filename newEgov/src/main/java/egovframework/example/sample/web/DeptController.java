package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.impl.DeptService;
import egovframework.example.sample.service.impl.DeptVO;

@Controller
public class DeptController {
	
	@Resource(name = "deptService")
	private DeptService deptService;
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	// 생성 
	@RequestMapping(value = "/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) throws Exception {
		String result = deptService.InsertDept(vo);
			if( result == null ) {
			 System.out.println("저장완료");
			} else {
				 System.out.println("저장실패");
			}
		return "";
	}
	// 삭제 
	@RequestMapping(value = "/deptDelete.do")
	public String deptDelete(int deptno) throws Exception {
		int result = deptService.DeleteDept(deptno);
			if(result == 1) {
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제실패");
			}
		return "";
	}
	
	// 전체 리스트 조회
	@RequestMapping(value = "/deptList.do")
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception {
		List<?> list = deptService.SelectDeptList(vo);
		model.addAttribute("resultList", list);
		System.out.println(list);
		return "dept/deptList";
	}
	// 상세 내역 조회
	@RequestMapping(value = "/deptDetail.do")
	public String selectDeptDetail(int deptno, ModelMap model) throws Exception {
		DeptVO vo = deptService.SelectDeptDetail(deptno);
		System.out.println("부서번호 =" + vo.getDeptno());
		model.addAttribute("deptVO", vo);
		return "dept/deptDetail";
	}
	
	// 수정 화면 출력 
	@RequestMapping(value = "/deptModifyWrite.do")
	public String selectDeptModify(int deptno, ModelMap model) throws Exception {
		DeptVO vo = deptService.SelectDeptDetail(deptno);
		System.out.println("부서번호 =" + vo.getDeptno());
		model.addAttribute("vo", vo);
		return "dept/deptModifyWrite";
	}
	// 수정 확인 
	@RequestMapping(value = "/deptModifySave.do")
	public String updateDept(DeptVO vo) throws Exception {
		return "";
	}
	
	
}
