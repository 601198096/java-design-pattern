/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: IgoChessman.java
 * packageName: cn.zy.pattern.flyweight.simple
 * date: 2018-12-17 23:30
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.flyweight;

/**
 * @version: V1.0
 * @author: ending
 * @className: IgoChessman
 * @packageName: cn.zy.pattern.flyweight.simple
 * @description: 享元抽象类
 * @data: 2018-12-17 23:30
 **/
public abstract class IgoChessman {

    public void before(Coordinates coordinates){
        System.out.println("位置x: " + coordinates.getX() + " 位置Y:" + coordinates.getY());
        System.out.println("处理前..." + this.after());
    }

    abstract String after();
}