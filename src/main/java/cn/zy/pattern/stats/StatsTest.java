/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: StatsTest.java
 * packageName: cn.zy.pattern.stats
 * date: 2018-12-28 21:56
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: StatsTest
 * @packageName: cn.zy.pattern.stats
 * @description: 状态模式
 * @data: 2018-12-28 21:56
 **/
public class StatsTest {

    @Test
    public void test(){
        Account account = new Account("小红", 500L);
        account.removeMonny(2000L);

        account.removeMonny(2000L);
        account.removeMonny(2000L);
    }
}