/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ResponsibilityTest.java
 * packageName: cn.zy.pattern.responsibility
 * date: 2018-12-18 23:32
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.responsibility;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: ResponsibilityTest
 * @packageName: cn.zy.pattern.responsibility
 * @description: 责任模式测试类
 * @data: 2018-12-18 23:32
 **/
public class ResponsibilityTest {

    @Test
    public void responsibilityTest(){
        Approver computerProduct = new ComputerProduct(1.2F);
        Approver phoneProduct = new PhoneProduct(5.2F);
        Approver rechargeProduct = new RechargeProduct(15.2F);
        Approver vipProduct = new VipProduct(90.2F);

        computerProduct.setApprover(phoneProduct);
        phoneProduct.setApprover(rechargeProduct);
        rechargeProduct.setApprover(vipProduct);

        computerProduct.getInfo(ProductEnums.COMPUTER);
        computerProduct.getInfo(ProductEnums.VIP);
        computerProduct.getInfo(ProductEnums.RECHARGE);
        computerProduct.getInfo(ProductEnums.PHONE);
    }
}