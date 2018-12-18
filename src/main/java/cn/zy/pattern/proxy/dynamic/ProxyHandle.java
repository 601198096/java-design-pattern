/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ProxyHandle.java
 * packageName: cn.zy.pattern.proxy.dynamic
 * date: 2018-12-18 21:50
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @version: V1.0
 * @author: ending
 * @className: ProxyHandle
 * @packageName: cn.zy.pattern.proxy.dynamic
 * @description: 代理类
 * @data: 2018-12-18 21:50
 **/
public class ProxyHandle implements InvocationHandler {

    private Object object;

    public ProxyHandle(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        this.after();
        return invoke;
    }

    public void after(){
        System.out.println("处理完成。。。");
    }
}