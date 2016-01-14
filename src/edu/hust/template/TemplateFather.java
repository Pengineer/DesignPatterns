package edu.hust.template;

public abstract class TemplateFather {

	//本质是父类的method1()方法调用了子类具体的work()方法
	public void method1() {
		System.out.println("开始执行。。。。");
		work();
		System.out.println("结束执行。。。。");
	}

	public abstract void work();
	
}
