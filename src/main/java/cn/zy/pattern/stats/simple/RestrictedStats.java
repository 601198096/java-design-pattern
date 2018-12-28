/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: RestrictedStats.java
 * packageName: cn.zy.pattern.stats
 * date: 2018-12-28 21:59
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: RestrictedStats
 * @packageName: cn.zy.pattern.stats
 * @description: 受限状态
 * @data: 2018-12-28 21:59
 **/
public class RestrictedStats extends AccountStats {

    public RestrictedStats(Account account) {
        this.account = account;
    }

    public RestrictedStats(AccountStats accountStats) {
        this.account = accountStats.account;
    }

    @Override
    public void addMonny(Long num) {
        account.setMonny(account.getMonny() + num);
        this.commonHandle();
    }

    @Override
    public void removeMonny(Long num) {
        System.out.println("拒绝取钱");
    }

    @Override
    public void computeInterst() {
        System.out.println("利息计算");
    }

    @Override
    public void commonHandle() {
        if(account.getMonny() >= 0){
            account.setAccountStats(new NormalStats(account));
            System.out.println(String.format("正常状态，目前金额%d元" , account.getMonny()));
        }else if(account.getMonny() > -2000 && account.getMonny() < 0){
            account.setAccountStats(new OverdraftStats(account));
            System.out.println(String.format("透支状态，目前金额%d元" , account.getMonny()));
        }
    }
}