package demo.entity;

import org.easyframework.persistence.annotation.Column;

public class User {

	private Long id;

	@Column("user_name")
	private String username;

	@Column("user_age")
	private int age;

	@Column("user_city")
	private String city;

	@Column("user_company")
	private String company;

	@Column("user_sex")
	private int sex;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
