/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: StrategyTest.java
 * packageName: cn.zy.pattern.strategy
 * date: 2019-01-02 20:45
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.strategy;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: StrategyTest
 * @packageName: cn.zy.pattern.strategy
 * @description:
 * @data: 2019-01-02 20:45
 **/
public class StrategyTest {

    @Test
    public void test(){
        MovieTicket movieTicket = new MovieTicket();
        DisCount vipDisCount = new VipDisCount();

        movieTicket.setDisCount(vipDisCount);
        movieTicket.setPrice(85F);

        System.out.println(movieTicket.calculate());
    }
}