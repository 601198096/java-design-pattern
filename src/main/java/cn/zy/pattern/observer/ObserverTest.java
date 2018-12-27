/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ObserverTest.java
 * packageName: cn.zy.pattern.observer
 * date: 2018-12-27 20:34
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.observer;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: ObserverTest
 * @packageName: cn.zy.pattern.observer
 * @description: 观察者测试类
 * @data: 2018-12-27 20:34
 **/
public class ObserverTest {

    @Test
    public void simpleTest(){
        Play play = new Play("小红");
        Play play1 = new Play("小黑");
        Play play2 = new Play("小黄");
        Play play3 = new Play("小蓝");

        AllControl allControl = new AllControl();
        allControl.add(play);
        allControl.add(play1);
        allControl.add(play2);
        allControl.add(play3);

        play3.beattacket(allControl);
    }
}