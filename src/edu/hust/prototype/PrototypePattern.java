package edu.hust.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式：不通过new关键字来产生对象，而是通过对象复制来实现的模式。
 * 
 * @author liangjian
 *
 */
public class PrototypePattern {

	private static int STUDENTS = 20;
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		
		User u = new User();
		u.setClassName("电信科硕1002班");
		for(int i =0; i<STUDENTS; i++) {
			User u_tmp = u.clone();    //最关键的方法，需要User类实现Clonable接口覆写clone()方法
			u_tmp.setStudentNum("M2014718" + (i + 1));
			list.add(u_tmp);
		}
		
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			System.out.println(user.getClassName() + ": " + user.getAge() + ": " + user.getStudentNum());
		}
	}
}
