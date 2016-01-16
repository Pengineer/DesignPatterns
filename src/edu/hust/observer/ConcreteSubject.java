package edu.hust.observer;

/**
 * 2，具体的主题（具体的被观察者）
 * 
 * @author liangjian
 *
 */
public class ConcreteSubject extends Subject {

	private int state;
	
	public int getState() {
		return state;
	}
	
	public void change(int state) {
		System.out.println("do business...");
		this.state = state;
		super.notifyObserver(state); //带具体主题信息的通知 ———— 推模式
	}
	
}
