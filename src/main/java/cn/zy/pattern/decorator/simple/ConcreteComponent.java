/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ConcreteComponent.java
 * packageName: cn.zy.pattern.decorator.simple
 * date: 2018-12-17 19:48
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.decorator.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: ConcreteComponent
 * @packageName: cn.zy.pattern.decorator.simple
 * @description: 具体构件
 * @data: 2018-12-17 19:48
 **/
public class ConcreteComponent implements Component{

    @Override
    public void component() {
        System.out.println("具体实现类");
    }
}