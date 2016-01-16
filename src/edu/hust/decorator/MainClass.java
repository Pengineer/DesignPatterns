package edu.hust.decorator;

/**
 * 6，场景类
 * 
 * @author liangjian
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component = new ConcreteDecorator1(component); //component已经被装饰
		component = new ConcreteDecorator2(component); //如果我们想去掉某个装饰，只需要在场景业务中去掉某个装饰封装即可。
		component.operator();
	}
}
