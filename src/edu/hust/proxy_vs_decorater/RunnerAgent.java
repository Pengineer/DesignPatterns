package edu.hust.proxy_vs_decorater;

import java.util.Random;

/**
 * 3.1，代理模式对实际类的"控制"
 * 
 * @author liangjian
 *
 */
public class RunnerAgent implements IRunner { // 需要实现接口

	private IRunner runner;
	public RunnerAgent(IRunner runner) {
		this.runner = runner;
	}
	
	@Override
	public void run() {
		Random rand = new Random();       // 代理模式强调的是对实际类执行的控制
		if(rand.nextBoolean()) {
			System.out.println("代理人同意安排运动员跑步。");
			runner.run();
		} else {
			System.out.println("代理人不同意安排运动员跑步。");
		}
	}

	
}
