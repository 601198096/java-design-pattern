/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HighMemento.java
 * packageName: cn.zy.pattern.memento.simple
 * date: 2018-12-26 22:01
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.memento.high;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: HighMemento
 * @packageName: cn.zy.pattern.memento.simple
 * @description: 备忘录类
 * @data: 2018-12-26 22:01
 **/
public class HighMemento implements Serializable {

    private static final long serialVersionUID = -2369992657804891343L;

    private String name;

    private Integer x;

    private Integer y;

    public HighMemento(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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