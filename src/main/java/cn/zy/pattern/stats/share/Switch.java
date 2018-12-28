/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Switch.java
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
 * @className: Switch
 * @packageName: cn.zy.pattern.stats.share
 * @description:
 * @data: 2018-12-28 22:47
 **/
public class Switch {

    private static Stats stats;

    private static OnStats onStats;

    private static OffStats offStats;

    public Switch() {
        this.onStats = new OnStats();
        this.offStats = new OffStats();
        this.stats = this.onStats;
    }

    public static Stats getStats(String s){
        if("on".equals(s)){
            return new OnStats();
        }else{
            return new OffStats();
        }
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        Switch.stats = stats;
    }

    public void onStats(){
        stats.on(this);
    }

    public void offStats(){
        stats.off(this);
    }
}