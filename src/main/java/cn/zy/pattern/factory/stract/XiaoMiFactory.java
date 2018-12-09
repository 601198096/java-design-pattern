/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HaiErFactory.java
 * packageName: cn.zy.pattern.factory.stract
 * date: 2018-12-09 19:48
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.stract;

/**
 * @version: V1.0
 * @author: ending
 * @className: HaiErFactory
 * @packageName: cn.zy.pattern.factory.stract
 * @description: 小米工厂
 * @data: 2018-12-09 19:48
 **/
public class XiaoMiFactory extends AbstractFactory {

    @Override
    public AbstractPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public AbstractBook createBook() {
        return new XiaoMiBook();
    }
}