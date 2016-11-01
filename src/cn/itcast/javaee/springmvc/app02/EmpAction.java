package cn.itcast.javaee.springmvc.app02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 员工管理模块
 * 控制器
 * @author AdminTC
 */
@Controller
public class EmpAction extends ActionSupport{
	private EmpService empService;//业务层
	public void setEmpService(EmpService empService) {//springioc自动注入实现类
		this.empService = empService;
	}
	private Emp emp;//模型
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	/**
	 * 注册员工
	 */
	@RequestMapping(value="/testadd.action")
	public String registerMethod() throws Exception{
		empService.addEmp(emp);
		return "success";
	}

}





