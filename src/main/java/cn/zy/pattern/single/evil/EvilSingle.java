/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: EvilSingle.java
 * packageName: cn.zy.pattern.single.evil
 * date: 2018-12-09 0:06
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.single.evil;

/**
 * @version: V1.0
 * @author: ending
 * @className: EvilSingle
 * @packageName: cn.zy.pattern.single.evil
 * @description: 饿汉单例模式
 * @data: 2018-12-09 0:06
 **/
public class EvilSingle {

    private static final EvilSingle evilSingle = new EvilSingle();

    private EvilSingle() {}

    public static EvilSingle getInstance(){
        return evilSingle;
    }
}
