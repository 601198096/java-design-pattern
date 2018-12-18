/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Coordinates.java
 * packageName: cn.zy.pattern.flyweight.simple
 * date: 2018-12-18 20:58
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.flyweight;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: Coordinates
 * @packageName: cn.zy.pattern.flyweight.simple
 * @description: 外部状态类
 * @data: 2018-12-18 20:58
 **/
public class Coordinates implements Serializable {

    private static final long serialVersionUID = -5561838481149382583L;

    private Integer x;

    private Integer y;

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}