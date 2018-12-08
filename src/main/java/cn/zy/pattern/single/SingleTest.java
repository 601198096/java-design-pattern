/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SingleTest.java
 * packageName: cn.zy.pattern.single
 * date: 2018-12-09 0:09
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.single;

import cn.zy.pattern.single.evil.EvilSingle;
import cn.zy.pattern.single.full.LazySingle;
import cn.zy.pattern.single.iodh.IoDHSingle;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: SingleTest
 * @packageName: cn.zy.pattern.single
 * @description: 单例测试类
 * @data: 2018-12-09 0:09
 **/
public class SingleTest {

    @Test
    public void evilTest(){
        EvilSingle evilSingleOne = EvilSingle.getInstance();
        EvilSingle evilSingleTwe = EvilSingle.getInstance();
        if(evilSingleOne.equals(evilSingleTwe)) System.out.println("success");
    }

    @Test
    public void lazyTest(){
        LazySingle lazySingleOne = LazySingle.getInstance();
        LazySingle lazySingleTwe = LazySingle.getInstance();
        if(lazySingleOne.equals(lazySingleTwe)) System.out.println("success");
    }

    @Test
    public void ioDHTest(){
        IoDHSingle ioDHSingleOne = IoDHSingle.getInstance();
        IoDHSingle ioDHSingleTwe = IoDHSingle.getInstance();
        if(ioDHSingleOne.equals(ioDHSingleTwe)) System.out.println("success");
    }
}