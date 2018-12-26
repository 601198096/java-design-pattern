/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HighChessman.java
 * packageName: cn.zy.pattern.memento.simple
 * date: 2018-12-26 22:03
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.memento.high;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: HighChessman
 * @packageName: cn.zy.pattern.memento.simple
 * @description: 原发器
 * @data: 2018-12-26 22:03
 **/
public class HighChessman implements Serializable {

    private static final long serialVersionUID = 218680934494209612L;

    private String name;

    private Integer x;

    private Integer y;

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

    public HighMemento getMemento(){
        return new HighMemento(this.name , this.x , this.y);
    }

    public void restore(HighMemento simpleMemento){
        this.name = simpleMemento.getName();
        this.x = simpleMemento.getX();
        this.y = simpleMemento.getY();
    }
}