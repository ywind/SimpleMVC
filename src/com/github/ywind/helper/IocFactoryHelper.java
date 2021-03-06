package com.github.ywind.helper;

import com.github.ywind.ioc.IocFactory;
import com.github.ywind.ioc.SpringIocFactory;

/**
 * @author Ywind E-mail:guoshukang@vip.qq.com
 * @version 创建时间：2015年5月27日 下午4:53:47 类说明
 * 
 */
public class IocFactoryHelper {
	private static class IocF {
		private static final IocFactory INSTANCE_FACTORY = new SpringIocFactory();
	}

	private IocFactoryHelper() {
	}

	public static IocFactory getIocFactory() {
		return IocF.INSTANCE_FACTORY;
	}
}
