package edu.hust.decorator;

/**
 * 4，具体的装饰者1
 * 
 * @author liangjian
 *
 */
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	private void method1() {
		System.out.println("method1 装饰");
	}

	@Override
	public void operator() {
		method1();
		super.operator();
	}
	
}
