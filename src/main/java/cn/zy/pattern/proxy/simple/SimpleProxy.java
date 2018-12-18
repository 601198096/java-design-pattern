/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SimpleProxy.java
 * packageName: cn.zy.pattern.proxy.simple
 * date: 2018-12-18 21:15
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: SimpleProxy
 * @packageName: cn.zy.pattern.proxy.simple
 * @description: 代理类
 * @data: 2018-12-18 21:15
 **/
public class SimpleProxy implements Subject {

    private Subject subject = new SubjectImpl();

    @Override
    public void before() {
        subject.before();
        this.after();
    }

    public void after(){
        System.out.println("业务代码处理完毕。。。");
    }
}