/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: IoDHSingle.java
 * packageName: cn.zy.pattern.single.iodh
 * date: 2018-12-09 0:33
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.single.iodh;

/**
 * @version: V1.0
 * @author: ending
 * @className: IoDHSingle
 * @packageName: cn.zy.pattern.single.iodh
 * @description: IoDH单例模式
 * @data: 2018-12-09 0:33
 **/
public class IoDHSingle {

    private IoDHSingle() {}

    private static class Holders{
        private final static IoDHSingle ioDHSingle = new IoDHSingle();
    }

    public static IoDHSingle getInstance(){
        return Holders.ioDHSingle;
    }
}