package edu.hust.observer;

import java.util.Vector;

/**
 * 1，抽象的主题（被观察者）
 * 
 * @author liangjian
 *
 */
public abstract class Subject {

	private Vector<Observer> vector = new Vector<Observer>();
	
	public void addObserver(Observer o) {
		this.vector.add(o);
	}
	
	public void deleteObserver(Observer o) {
		this.vector.remove(o);
	}
	
	//通知所有观察者
	public void notifyObserver(int state) {
		for (Observer o : vector) {
			o.update(state);
		}
	}

}
