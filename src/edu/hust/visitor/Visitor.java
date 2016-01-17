package edu.hust.visitor;

/**
 * 访问者
 * 
 * 数据的加载由Element子类自身完成，Visitor仅仅通过接口实现数据的展示
 * 
 * @author liangjian
 *
 */
public class Visitor implements IVisitor {

	//访问el1元素
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
		//还可以对获取到的el元素的属性进行本类自定义的各种处理
	}

	//访问el2元素
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
