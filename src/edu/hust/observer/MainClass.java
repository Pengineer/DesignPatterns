package edu.hust.observer;

/**
 * 观察者模式：对象间一种一对多的依赖关系，使得每当一个对象改变状态时，所有依赖与它的对象都会得到通知并被自动更新。
 * 	关键词：一对多（本模式使用的范围是一个被观察者和n/1个观察者）
 * 
 * 观察者模式被称为是模式中的皇后，而且java jdk（java.util.Observable和java.util.Observer）也对它做了实现，可见该设计模式的重 要位置。
 * 
 * 观察者模式所涉及的角色有：
 *
 *	●　抽象主体(Subject)角色：抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色。
 *
 *	●　具体主体(ConcreteSubject)角色：将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。具体主题角色又叫做具体被观察者(Concrete Observable)角色。
 *
 *	●　抽象观察者(Observer)角色：为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。
 *
 *	●　具体观察者(ConcreteObserver)角色：存储与主题的状态自恰的状态。具体观察者角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态 像协调。如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。
 * 
 * {@link http://www.cnblogs.com/java-my-life/archive/2012/05/16/2502279.html 观察者模式简介及其在Java API中的实现}
 * {@link http://www.cnblogs.com/machine/p/3262378.html  观察者模式在JavaSE 和 JavaEE 中的应用（已保存在印象笔记中）}
 * 
 * @author liangjian 2016-01-16
 *
 */
public class MainClass {
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		Observer o = new ConcreteObserver();
		s.addObserver(o);
		s.change(1);
	}

}
