/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: BridgeTest.java
 * packageName: cn.zy.pattern.bridge
 * date: 2018-12-12 22:16
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.bridge;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: BridgeTest
 * @packageName: cn.zy.pattern.bridge
 * @description: 桥接模式测试
 * @data: 2018-12-12 22:16
 **/
public class BridgeTest {

    @Test
    public void simpleTest(){
        Sex sex = new MaleSex();
        Color greenColor = new GreenColor();
        greenColor.setSex(sex);
        greenColor.getColor();
    }
}