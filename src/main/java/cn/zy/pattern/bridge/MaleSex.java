/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MaleSex.java
 * packageName: cn.zy.pattern.bridge
 * date: 2018-12-12 22:15
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.bridge;

/**
 * @version: V1.0
 * @author: ending
 * @className: MaleSex
 * @packageName: cn.zy.pattern.bridge
 * @description:
 * @data: 2018-12-12 22:15
 **/
public class MaleSex implements Sex {

    @Override
    public void getSex() {
        System.out.println("雄性");
    }
}