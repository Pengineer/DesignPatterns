package edu.hust.prototype;

public class User implements Cloneable {
	
	//克隆对象在内存中生成，因此不执行构造函数
	public User() {
		this.age=20;
		System.out.println("....");
	}

	String studentNum;
	String className;
	int age; //基本数据类型进行浅拷贝，构造函数也不执行，为什么拷贝出来的对象的age都有值？
	
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public User clone()  {
		User user = null;
		try {
			user = (User)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return user;
	}
	
}
