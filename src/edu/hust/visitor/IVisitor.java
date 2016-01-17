package edu.hust.visitor;

public interface IVisitor {

	//可以访问哪些对象（使用重载的方式列出）
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
