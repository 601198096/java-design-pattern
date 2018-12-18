/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SubjectImpl.java
 * packageName: cn.zy.pattern.proxy.simple
 * date: 2018-12-18 21:16
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: SubjectImpl
 * @packageName: cn.zy.pattern.proxy.simple
 * @description: 具体业务类
 * @data: 2018-12-18 21:16
 **/
public class SubjectImpl implements Subject{

    @Override
    public void before() {
        System.out.println("业务核心代码。。。");
    }
}