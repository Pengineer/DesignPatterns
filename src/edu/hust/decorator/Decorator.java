package edu.hust.decorator;

/**
 * 3，抽象装饰者
 * 
 * @author liangjian
 *
 */
public abstract class Decorator extends Component {

	//被装饰者
	private Component component = null;
	public Decorator(Component component) {
		this.component = component;
	}
	
	//委托给被装饰者执行
	@Override
	public void operator() {
		this.component.operator();
	}
	
}
