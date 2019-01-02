/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: StudentDisCount.java
 * packageName: cn.zy.pattern.strategy
 * date: 2019-01-02 20:43
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.strategy;

/**
 * @version: V1.0
 * @author: ending
 * @className: StudentDisCount
 * @packageName: cn.zy.pattern.strategy
 * @description:
 * @data: 2019-01-02 20:43
 **/
public class StudentDisCount extends DisCount{

    @Override
    public Float handle(Float price) {
        return price * 0.8F;
    }
}