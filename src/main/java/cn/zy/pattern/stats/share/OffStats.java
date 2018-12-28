/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: OffStats.java
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
 * @className: OffStats
 * @packageName: cn.zy.pattern.stats.share
 * @description:
 * @data: 2018-12-28 22:47
 **/
public class OffStats extends Stats{

    @Override
    public void on(Switch s) {
        System.out.println("早就已经开灯");
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关灯");
        s.setStats(Switch.getStats("on"));
    }
}