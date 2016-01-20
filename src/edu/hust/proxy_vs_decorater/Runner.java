package edu.hust.proxy_vs_decorater;

/**
 * 2，实现接口的实际类
 * 
 * @author liangjian
 *
 */
public class Runner implements IRunner {

	@Override
	public void run() {
		System.out.println("运动员跑步。");
	}

}
