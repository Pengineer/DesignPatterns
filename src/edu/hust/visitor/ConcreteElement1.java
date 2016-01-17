package edu.hust.visitor;

/**
 * 具体可被访问的元素1
 * 
 * @author liangjian
 *
 */
public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() { //被访问者调用的业务方法
		System.out.println("el1 do business");
	}

	//核心代码
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);//核心中的灵魂：让访问者访问本类对象（谁调用accept方法，this就指向谁）
	}

}
