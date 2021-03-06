package com.github.ywind.interceptor;

/**
 * @author Ywind E-mail:guoshukang@vip.qq.com
 * @version 创建时间：2015年4月12日 下午4:09:39 拦截器接口
 * 
 */
public interface Interceptor {
	/*
	 * 获取权重
	 */
	int getWeight();

	/*
	 * 设置权重
	 */
	void setWeight(int weight);

	/*
	 * 初始化
	 */
	void init();

	/*
	 * 销毁
	 */
	void destory();

	/*
	 * 仅在处理之前拦截
	 */
	boolean doInterceptor();

	/*
	 * controlle执行之后的拦截
	 */

	void postInterceptor();
}
