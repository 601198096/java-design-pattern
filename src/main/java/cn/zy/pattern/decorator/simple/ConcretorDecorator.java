/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ConcretorDecorator.java
 * packageName: cn.zy.pattern.decorator.simple
 * date: 2018-12-17 19:51
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.decorator.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: ConcretorDecorator
 * @packageName: cn.zy.pattern.decorator.simple
 * @description: 具体装饰类
 * @data: 2018-12-17 19:51
 **/
public class ConcretorDecorator extends Decorator {

    public ConcretorDecorator(Component component) {
        super(component);
    }

    public void component() {
        super.component();
        this.incre();
    }

    public void incre(){
        System.out.println("装饰后的结果类");
    }
}