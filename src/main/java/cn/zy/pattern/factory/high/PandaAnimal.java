/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PandaAnimal.java
 * packageName: cn.zy.pattern.factory.high
 * date: 2018-12-09 18:39
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.high;

/**
 * @version: V1.0
 * @author: ending
 * @className: PandaAnimal
 * @packageName: cn.zy.pattern.factory.high
 * @description: 熊猫实现类
 * @data: 2018-12-09 18:39
 **/
public class PandaAnimal implements Animal {

    @Override
    public void eat(String food) {
        System.out.println("熊猫吃" + food);
    }
}