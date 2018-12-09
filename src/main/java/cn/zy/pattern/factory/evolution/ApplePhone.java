/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ApplePhone.java
 * packageName: cn.zy.pattern.factory.evolution
 * date: 2018-12-09 18:55
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.evolution;

/**
 * @version: V1.0
 * @author: ending
 * @className: ApplePhone
 * @packageName: cn.zy.pattern.factory.evolution
 * @description: 苹果手机
 * @data: 2018-12-09 18:55
 **/
public class ApplePhone implements Phone {

    @Override
    public void brand() {
        System.out.println("苹果手机");
    }
}