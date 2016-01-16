package edu.hust.decorator;

/**
 * 5，具体的装饰者2
 * 
 * @author liangjian
 *
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	private void method2() {
		System.out.println("method2 装饰");
	}

	@Override
	public void operator() {
		method2();
		super.operator();
	}
	
}
