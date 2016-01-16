package edu.hust.decorator;

/**
 * 2，具体的构建者
 * 
 * @author liangjian 2016-01-16
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operator() {
		System.out.println("do business.");
	}

}
