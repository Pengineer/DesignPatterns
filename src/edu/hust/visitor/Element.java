package edu.hust.visitor;

/**
 * 抽象元素
 * 
 * @author liangjian
 *
 */
public abstract class Element {

	//定义实际的业务逻辑
	public abstract void doSomething();
	
	//允许谁来访问
	public abstract void accept(IVisitor visitor); 
}
