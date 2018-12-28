/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: NormalStats.java
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
 * @className: NormalStats
 * @packageName: cn.zy.pattern.stats
 * @description: 正常状态
 * @data: 2018-12-28 21:57
 **/
public class NormalStats extends AccountStats {

    public NormalStats(Account account) {
        this.account = account;
    }

    public NormalStats(AccountStats accountStats) {
        this.account = accountStats.account;
    }

    @Override
    public void addMonny(Long num) {
        account.setMonny(account.getMonny() + num);
        this.commonHandle();
    }

    @Override
    public void removeMonny(Long num) {
        account.setMonny(account.getMonny() - num);
        this.commonHandle();
    }

    @Override
    public void computeInterst() {
        System.out.println("无利息计算");
    }

    @Override
    public void commonHandle() {
        if(account.getMonny() <= -2000){
            account.setAccountStats(new RestrictedStats(account));
            System.out.println(String.format("透支状态，目前金额%d元" , account.getMonny()));
        }else if(account.getMonny() > -2000 && account.getMonny() < 0){
            account.setAccountStats(new OverdraftStats(account));
            System.out.println(String.format("受限状态，目前金额%d元" , account.getMonny()));
        }
    }
}