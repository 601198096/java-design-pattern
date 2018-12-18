/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PhoneProduct.java
 * packageName: cn.zy.pattern.responsibility
 * date: 2018-12-18 23:27
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.responsibility;

/**
 * @version: V1.0
 * @author: ending
 * @className: PhoneProduct
 * @packageName: cn.zy.pattern.responsibility
 * @description:
 * @data: 2018-12-18 23:27
 **/
public class RechargeProduct extends Approver {

    public RechargeProduct(Float price) {
        super(price);
    }

    @Override
    public void getInfo(ProductEnums productEnums) {
        if(ProductEnums.RECHARGE == productEnums){
            System.out.println("充值商品价格是" + price);
        }else{
            approver.getInfo(productEnums);
        }
    }
}