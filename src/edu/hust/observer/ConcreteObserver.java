package edu.hust.observer;

/**
 * 4，具体观察者
 * 
 * @author liangjian
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update(int state) {
		System.out.println("观察者汇报：被观察者的状态更新为 " + state);
	}
	
}
