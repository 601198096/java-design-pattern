/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: OnStats.java
 * packageName: cn.zy.pattern.stats.share
 * date: 2018-12-28 22:47
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats.share;

/**
 * @version: V1.0
 * @author: ending
 * @className: OnStats
 * @packageName: cn.zy.pattern.stats.share
 * @description:
 * @data: 2018-12-28 22:47
 **/
public class OnStats extends Stats{

    @Override
    public void on(Switch s) {
        System.out.println("已经开灯");
        s.setStats(Switch.getStats("off"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("早就已经关灯");
    }
}