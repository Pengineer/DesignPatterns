package edu.hust.observer;

import java.util.Vector;

/**
 * 1，抽象的主体（被观察者）
 * 
 * @author liangjian
 *
 */
public abstract class Subject {

	private Vector<Observer> vector = new Vector<Observer>();  //Vector是线程安全的
	
	//将观察者加入到被观察主体的容器中（注册）
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
