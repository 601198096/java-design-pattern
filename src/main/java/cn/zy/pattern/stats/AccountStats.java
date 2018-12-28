/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AccountStats.java
 * packageName: cn.zy.pattern.stats
 * date: 2018-12-28 21:57
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats;

/**
 * @version: V1.0
 * @author: ending
 * @className: AccountStats
 * @packageName: cn.zy.pattern.stats
 * @description: 帐户状态抽象类
 * @data: 2018-12-28 21:57
 **/
public abstract class AccountStats {

    protected Account account;

    public abstract void addMonny(Long num);

    public abstract void removeMonny(Long num);

    public abstract void computeInterst();

    public abstract void commonHandle();
}