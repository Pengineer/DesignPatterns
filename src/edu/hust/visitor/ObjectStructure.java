package edu.hust.visitor;

import java.util.Random;

/**
 * 结构对象
 * 
 * @author liangjian
 *
 */
public class ObjectStructure {

	public static Element createElement() {
		Random rand = new Random();
		if(rand.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
