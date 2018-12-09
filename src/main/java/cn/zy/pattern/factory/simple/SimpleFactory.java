/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SimpleFactory.java
 * packageName: cn.zy.pattern.factory.simple
 * date: 2018-12-09 18:07
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: SimpleFactory
 * @packageName: cn.zy.pattern.factory.simple
 * @description: 简单工厂类
 * @data: 2018-12-09 18:07
 **/
public class SimpleFactory {

    public static Product getProduct(ProductTypeEnum productType){
        if(ProductTypeEnum.COIN == productType){
            return new CoinProduct();
        }else if(ProductTypeEnum.VIP ==  productType){
            return new VipProduct();
        }else{
            return null;
        }
    }
}