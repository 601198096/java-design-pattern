/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: VipDisCount.java
 * packageName: cn.zy.pattern.strategy
 * date: 2019-01-02 20:45
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.strategy;

/**
 * @version: V1.0
 * @author: ending
 * @className: VipDisCount
 * @packageName: cn.zy.pattern.strategy
 * @description:
 * @data: 2019-01-02 20:45
 **/
public class VipDisCount extends DisCount {

    @Override
    public Float handle(Float price) {
        return price * 0.5F;
    }
}