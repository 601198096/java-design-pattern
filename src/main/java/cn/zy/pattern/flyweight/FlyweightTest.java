/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: FlyweightTest.java
 * packageName: cn.zy.pattern.flyweight.simple
 * date: 2018-12-18 21:04
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.flyweight;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: FlyweightTest
 * @packageName: cn.zy.pattern.flyweight.simple
 * @description: 享元测试类
 * @data: 2018-12-18 21:04
 **/
public class FlyweightTest {

    @Test
    public void test(){
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        IgoChessman igoChessmanMap = flyweightFactory.getIgoChessmanMap("white");
        IgoChessman igoChessmanMap1 = flyweightFactory.getIgoChessmanMap("black");
    }
}