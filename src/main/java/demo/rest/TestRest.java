package demo.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easyframework.web.mvc.annotation.Controller;
import org.easyframework.web.mvc.annotation.Request;
import org.easyframework.web.mvc.annotation.field.Param;
import org.easyframework.web.mvc.result.View;
import org.springframework.beans.BeanUtils;

import com.alibaba.fastjson.JSONObject;

import demo.entity.User;
import demo.service.UserService;
import demo.vo.UserVo;

@Controller
public class TestRest {

	@Resource
	private UserService userService;

	@Request(value = "/test/page")
	public View testPage() {
		return new View("test");
	}

	@Request(value = "/test/page/reqparam")
	public View testPageRequestParam(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("id = " + request.getParameter("id"));
		return new View("test");
	}

	@Request(value = "/test/page/autoparam")
	public View testPageAutoParam(@Param("id") String id) {
		System.out.println("id = " + id);
		return new View("test");
	}

	@Request(value = "/test/json", ajax = true)
	public String testJson() {
		return "test json";
	}

	@Request(value = "/test/json/reqparam", ajax = true)
	public String testJsonRequestParam(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("id"));
		return "test json";
	}

	@Request(value = "/test/json/autoparam", ajax = true)
	public String testJsonAutoParam(@Param("id") String id) {
		System.out.println("id = " + id);
		return "test json";
	}

	@Request(value = "/test/getUserCount", ajax = true)
	public String getUserCount() {
		int count = userService.getUserCount();
		return "count = " + count;
	}

	@Request(value = "/test/getUserById", ajax = true)
	public String getUserById(@Param("id") Long id) {
		User user = userService.getUserById(id);
		return JSONObject.toJSONString(user);
	}

	@Request(value = "/test/saveUser", ajax = true)
	public String saveUser(UserVo vo) {
		User user = new User();
		BeanUtils.copyProperties(vo, user);
		userService.saveUser(user);
		return "ok";
	}

	@Request(value = "/test/testTransactional", ajax = true)
	public String testTransactional(UserVo vo) {
		User user = new User();
		BeanUtils.copyProperties(vo, user);
		userService.testTransactional(user);
		return "ok";
	}

	@Request(value = "/test/string", ajax = true)
	public String testString(@Param("s") String s) {
		byte[] ss = s.getBytes();
		return "ok";
	}

}
