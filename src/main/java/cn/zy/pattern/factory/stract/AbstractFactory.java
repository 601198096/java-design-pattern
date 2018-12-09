/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AbstractFactory.java
 * packageName: cn.zy.pattern.factory.stract
 * date: 2018-12-09 19:44
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.stract;

/**
 * @version: V1.0
 * @author: ending
 * @className: AbstractFactory
 * @packageName: cn.zy.pattern.factory.stract
 * @description: 抽象工厂
 * @data: 2018-12-09 19:44
 **/
public abstract class AbstractFactory {

    public abstract AbstractPhone createPhone();

    public abstract AbstractBook createBook();
}