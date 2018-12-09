/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AppleFactory.java
 * packageName: cn.zy.pattern.factory.evolution
 * date: 2018-12-09 18:57
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.evolution;

/**
 * @version: V1.0
 * @author: ending
 * @className: AppleFactory
 * @packageName: cn.zy.pattern.factory.evolution
 * @description: 苹果工厂
 * @data: 2018-12-09 18:57
 **/
public class AppleFactory extends Factory {

    @Override
    Phone createPhone() {
        return new ApplePhone();
    }
}