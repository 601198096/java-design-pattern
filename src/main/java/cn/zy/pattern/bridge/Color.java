/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Color.java
 * packageName: cn.zy.pattern.bridge.Color
 * date: 2018-12-12 22:09
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.bridge;

/**
 * @version: V1.0
 * @author: ending
 * @className: Color
 * @packageName: cn.zy.pattern.bridge.Color
 * @description:
 * @data: 2018-12-12 22:09
 **/
public abstract class Color{

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public abstract void getColor();
}