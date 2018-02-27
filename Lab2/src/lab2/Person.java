package lab2;

class Person {

	private String name, email, sex;

	private int age;

	public Person(String name, String email, String sex, Integer age) {
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}
}