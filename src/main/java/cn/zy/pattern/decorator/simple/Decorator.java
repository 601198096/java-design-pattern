/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Decorator.java
 * packageName: cn.zy.pattern.decorator.simple
 * date: 2018-12-17 19:49
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.decorator.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: Decorator
 * @packageName: cn.zy.pattern.decorator.simple
 * @description: 抽象装饰类
 * @data: 2018-12-17 19:49
 **/
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void component() {
        component.component();
    }
}
