/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: TemplateTest.java
 * packageName: cn.zy.pattern.template
 * date: 2019-01-02 21:01
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.template;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: TemplateTest
 * @packageName: cn.zy.pattern.template
 * @description:
 * @data: 2019-01-02 21:01
 **/
public class TemplateTest {

    @Test
    public void test(){
        Account savingAccount = new SavingAccount();
        savingAccount.add("xiaohong" , "123456");
    }
}