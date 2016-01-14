package edu.hust.template;

/**
 * 模板方法模式采用抽象的父类，把认为是不变的部分的算法封装到父类中实现，而具体可变部分则使用抽象方法让子类去实现。
 * 
 * 优点：行为由父类控制，具体实现由子类完成，扩展性强；提取公共部分，便于维护；
 * 缺点：子类的执行结果影响到了父类的结果，增加了代码的阅读难度。（优点类似于父类调用了子类，不符合正常的逻辑思维）
 * @author liangjian
 *
 */
public class Test {

	public static void main(String[] args) {
		SubClass t3= new SubClass();
		t3.method1();
	}
	
}
