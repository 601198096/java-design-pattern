/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Account.java
 * packageName: cn.zy.pattern.stats
 * date: 2018-12-28 21:56
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats;

/**
 * @version: V1.0
 * @author: ending
 * @className: Account
 * @packageName: cn.zy.pattern.stats
 * @description: 帐户
 * @data: 2018-12-28 21:56
 **/
public class Account {

    private AccountStats accountStats;

    private String name;

    private Long monny;

    public Account(String name, Long monny) {
        this.name = name;
        this.accountStats = new NormalStats(this);
        this.monny = monny;
        System.out.println(String.format("姓名为%s,存入%d元" , this.name , this.monny));
    }

    public AccountStats getAccountStats() {
        return accountStats;
    }

    public void setAccountStats(AccountStats accountStats) {
        this.accountStats = accountStats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMonny() {
        return monny;
    }

    public void setMonny(Long monny) {
        this.monny = monny;
    }

    public void addMonny(Long num){
        accountStats.addMonny(num);
    }

    public void removeMonny(Long num){
        accountStats.removeMonny(num);
    }
}