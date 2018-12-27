/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Play.java
 * packageName: cn.zy.pattern.observer
 * date: 2018-12-27 20:25
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.observer;

/**
 * @version: V1.0
 * @author: ending
 * @className: Play
 * @packageName: cn.zy.pattern.observer
 * @description: 具体观察者
 * @data: 2018-12-27 20:25
 **/
public class Play implements Observer{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Play(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(name + "前来救援");
    }

    @Override
    public void beattacket(Control control) {
        System.out.println(name + "受到攻击");
        control.startNotify();
    }
}