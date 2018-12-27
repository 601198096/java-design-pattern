/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AllControl.java
 * packageName: cn.zy.pattern.observer
 * date: 2018-12-27 20:26
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.observer;

/**
 * @version: V1.0
 * @author: ending
 * @className: AllControl
 * @packageName: cn.zy.pattern.observer
 * @description:
 * @data: 2018-12-27 20:26
 **/
public class AllControl extends Control{

    @Override
    public void startNotify() {
        list.forEach(Observer::help);
    }
}