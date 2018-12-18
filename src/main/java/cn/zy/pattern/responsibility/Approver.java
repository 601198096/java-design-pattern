/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Approver.java
 * packageName: cn.zy.pattern.responsibility
 * date: 2018-12-18 23:25
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.responsibility;

/**
 * @version: V1.0
 * @author: ending
 * @className: Approver
 * @packageName: cn.zy.pattern.responsibility
 * @description: 抽象处理类
 * @data: 2018-12-18 23:25
 **/
public abstract class Approver {

    protected Approver approver;

    protected Float price;

    public Approver(Float price) {
        this.price = price;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void getInfo(ProductEnums productEnums);
}