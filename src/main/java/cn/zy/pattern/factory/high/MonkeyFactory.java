/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MonkeyFactory.java
 * packageName: cn.zy.pattern.factory.deep
 * date: 2018-12-09 18:38
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.high;

/**
 * @version: V1.0
 * @author: ending
 * @className: MonkeyFactory
 * @packageName: cn.zy.pattern.factory.deep
 * @description: 猴子工厂类
 * @data: 2018-12-09 18:38
 **/
public class MonkeyFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new MonkeyAnimal();
    }
}