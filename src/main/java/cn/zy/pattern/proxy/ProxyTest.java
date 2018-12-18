/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ProxyTest.java
 * packageName: cn.zy.pattern.proxy.simple
 * date: 2018-12-18 21:19
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy;

import cn.zy.pattern.proxy.dynamic.*;
import cn.zy.pattern.proxy.simple.SimpleProxy;
import cn.zy.pattern.proxy.simple.Subject;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @version: V1.0
 * @author: ending
 * @className: ProxyTest
 * @packageName: cn.zy.pattern.proxy.simple
 * @description: 代理模式测试类
 * @data: 2018-12-18 21:19
 **/
public class ProxyTest {

    @Test
    public void simpleTest(){
        Subject subject = new SimpleProxy();
        subject.before();
    }

    @Test
    public void dynamicTest() throws Exception{
        UserService userService = new IUserService();
        ProxyHandle proxyHandle = new ProxyHandle(userService);

        UserService userService1 = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader()
                , new Class[]{UserService.class}, proxyHandle);
        userService1.add();

        TopicService topicService = new ITopicService();
        proxyHandle = new ProxyHandle(topicService);

        TopicService topicService1 = (TopicService) Proxy.newProxyInstance(TopicService.class.getClassLoader()
                , new Class[]{TopicService.class}, proxyHandle);
        topicService1.add();
    }
}