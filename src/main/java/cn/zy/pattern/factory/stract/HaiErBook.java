/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HaiErBook.java
 * packageName: cn.zy.pattern.factory.stract
 * date: 2018-12-09 19:52
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.stract;

/**
 * @version: V1.0
 * @author: ending
 * @className: HaiErBook
 * @packageName: cn.zy.pattern.factory.stract
 * @description: 海尔书籍
 * @data: 2018-12-09 19:52
 **/
public class HaiErBook implements AbstractBook {

    @Override
    public void getHandle() {
        System.out.println("我是海尔书籍");
    }
}