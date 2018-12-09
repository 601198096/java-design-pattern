/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HaiErPhone.java
 * packageName: cn.zy.pattern.factory.stract
 * date: 2018-12-09 19:46
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.stract;

/**
 * @version: V1.0
 * @author: ending
 * @className: HaiErPhone
 * @packageName: cn.zy.pattern.factory.stract
 * @description: 小米手机
 * @data: 2018-12-09 19:46
 **/
public class XiaoMiPhone implements AbstractPhone {

    @Override
    public void getHandle() {
        System.out.println("我是小米手机");
    }
}