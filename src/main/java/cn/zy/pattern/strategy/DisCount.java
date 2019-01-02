/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: DisCount.java
 * packageName: cn.zy.pattern.strategy
 * date: 2019-01-02 20:40
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.strategy;

/**
 * @version: V1.0
 * @author: ending
 * @className: DisCount
 * @packageName: cn.zy.pattern.strategy
 * @description:
 * @data: 2019-01-02 20:40
 **/
public abstract class DisCount {

    public abstract Float handle(Float price);
}