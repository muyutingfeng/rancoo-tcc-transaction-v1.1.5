/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/course/view/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package org.mengyun.tcctransaction.support;

/**
 * Created by changmingxie on 11/20/15.
 */
public class BeanFactoryAdapter {

    private static BeanFactory beanFactory;

    public static Object getBean(Class<?> aClass) {
        return beanFactory.getBean(aClass);
    }

    public static void setBeanFactory(BeanFactory beanFactory) {
        BeanFactoryAdapter.beanFactory = beanFactory;
    }
}
