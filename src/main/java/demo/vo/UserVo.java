package demo.vo;

import org.easyframework.web.mvc.annotation.field.Digit;
import org.easyframework.web.mvc.annotation.field.Enums;
import org.easyframework.web.mvc.annotation.field.Require;

public class UserVo {

	@Require(msg = "参数'username'不能为空")
	private String username;

	@Digit(msg = "参数'age'必须为数字")
	private Integer age;

	private String city;

	private String company;

	@Enums(value = { "0", "1" }, msg = "参数'sex'的值只能为0,1")
	private Integer sex;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
