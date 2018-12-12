/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: BlueColor.java
 * packageName: cn.zy.pattern.bridge
 * date: 2018-12-12 22:14
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.bridge;

/**
 * @version: V1.0
 * @author: ending
 * @className: BlueColor
 * @packageName: cn.zy.pattern.bridge
 * @description:
 * @data: 2018-12-12 22:14
 **/
public class BlueColor extends Color {

    @Override
    public void getColor() {
        this.getSex().getSex();
        System.out.println("蓝色的");
    }
}