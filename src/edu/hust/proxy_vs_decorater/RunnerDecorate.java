package edu.hust.proxy_vs_decorater;

/**
 * 3.2 装饰者模式对实际类的功能的增强
 * 
 * @author liangjian
 *
 */
public class RunnerDecorate implements IRunner { // 也需要实现接口

	private IRunner runner;
	public RunnerDecorate(IRunner runner) {
		this.runner = runner;
	}
	
	@Override
	public void run() {
		System.out.println("加快运动员的速度：为运动员增加喷气装置");
		runner.run();
	}

}
