/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: GreenColor.java
 * packageName: cn.zy.pattern.bridge
 * date: 2018-12-12 22:10
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.bridge;

/**
 * @version: V1.0
 * @author: ending
 * @className: GreenColor
 * @packageName: cn.zy.pattern.bridge
 * @description:
 * @data: 2018-12-12 22:10
 **/
public class GreenColor extends Color {

    @Override
    public void getColor() {
        this.getSex().getSex();
        System.out.println("绿色的");
    }
}