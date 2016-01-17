package edu.hust.visitor;

/**
 * 具体可被访问的元素2
 * 
 * @author liangjian
 *
 */
public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("el2 do business");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
