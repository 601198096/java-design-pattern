/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PandaFactory.java
 * packageName: cn.zy.pattern.factory.high
 * date: 2018-12-09 18:36
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.high;

/**
 * @version: V1.0
 * @author: ending
 * @className: PandaFactory
 * @packageName: cn.zy.pattern.factory.high
 * @description: 熊猫工厂类
 * @data: 2018-12-09 18:36
 **/
public class PandaFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new PandaAnimal();
    }
}