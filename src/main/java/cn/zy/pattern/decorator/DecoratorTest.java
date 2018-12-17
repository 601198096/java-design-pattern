/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: DecoratorTest.java
 * packageName: cn.zy.pattern.decorator.simple
 * date: 2018-12-17 19:53
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.decorator;

import cn.zy.pattern.decorator.simple.Component;
import cn.zy.pattern.decorator.simple.ConcreteComponent;
import cn.zy.pattern.decorator.simple.ConcretorDecorator;
import cn.zy.pattern.decorator.simple.Decorator;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: DecoratorTest
 * @packageName: cn.zy.pattern.decorator.simple
 * @description: 装饰模式测试类
 * @data: 2018-12-17 19:53
 **/
public class DecoratorTest {

    @Test
    public void simpleTest(){
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcretorDecorator(component);
        decorator.component();
    }
}