/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Control.java
 * packageName: cn.zy.pattern.observer
 * date: 2018-12-27 20:25
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: Control
 * @packageName: cn.zy.pattern.observer
 * @description:
 * @data: 2018-12-27 20:25
 **/
public abstract class Control {

    protected List<Observer> list = new ArrayList<>();

    public void add(Observer observer){
        list.add(observer);
    }

    public void remove(Observer observer){
        list.remove(observer);
    }

    public abstract void startNotify();
}