package edu.hust.visitor.application;

import java.io.File;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;

/**
 * 访问者设计模式相对其他模式来说结构有点复杂，edu.hust.visitor包是访问者模式的模拟实现，为了利于学习找了个真实的例子。
 * dom4j里面利用访问者模式来对xml文档进行逐个节点顺序访问（遍历），所有文档的对象的父类接口都是Node，对于不同类型的文档对象（Element，
 * Attribute等等）又做了不同的抽象，所有可能访问的节点如Visitor类中所示，dom4j中定义的Visitor接口参见<code>org.dom4j.Visitor</code>
 * 
 * dom4j里面有个缺省的访问者（Visitor）的实现VisitorSupport类，该类所有的方法均为空，我们解析一个文档只需继承这个类，然后重写对应的visit方法
 * 即可（这里使用了适配器模式）。一个简单的类图表示dom4j是怎么利用visitor设计模式的。
 * （图中Node的继承接口和实现类 还有很多这里就只标示了CharacterData及其他的子类。我只需要写XXX_Visitor就可以了。接下来我们写个例子看看）
 * 
 * 可以看出把xml节点顺序的访问了一边。每个人可以根据不同的xml来实现自己的Visitor，不论怎么写都可以遍历出你所有的节点，这就是visitor的厉害之处。
 * 访问者模式也不是万能的，他的缺点是当数据结构变化时，他的visitor接口及其实现都要改变。所以访问者模式不能使用在经常变化的数据接口上。在Gof的
 * 设计模式中,有以下情形可以考虑使用设计模式：
 * 
 * 1、一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
 * 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。Visitor使得你可以将相关的操作集中起来定义在一个类中。
 * 3、当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
 * 4、 定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。改变对象结构类需要重定义对所有访问者的接口，这可能需要很大的代价。如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。
 * 这些个人看来都是建议，项目中还要具体问题具体分析了。
 * 
 * @author liangjian
 *
 */
@SuppressWarnings("unused")
public class MainClass {
	
	public class MyVisitor extends VisitorSupport {
		//访问所有的属性
//		public void visit(Attribute node){
//			System.out.println("属性 : " + node.getName() + " = " + node.getValue());
//		}

		//访问所有的结点
		public void visit(Element node) {
			if(node.isTextOnly()) {
				System.out.println("节点: " + node.getName() + " = " + node.getText());
			} else {
				System.out.println("节点：" + node.getName());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		SAXReader saxReader=new SAXReader();
		File file=new File("E:\\myeclipse10.0\\DesignPatterns\\src\\edu\\hust\\visitor\\application\\test.xml");
		try{
			Document doc=saxReader.read(file); //产生结构对象Document
			doc.accept(new MainClass().new MyVisitor());
		}catch(DocumentException de){
			de.printStackTrace();
		}
	}

}
