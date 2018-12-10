/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MonkeyAnimal.java
 * packageName: cn.zy.pattern.factory.deep
 * date: 2018-12-09 18:39
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.high;

/**
 * @version: V1.0
 * @author: ending
 * @className: MonkeyAnimal
 * @packageName: cn.zy.pattern.factory.deep
 * @description: 猴子实现类
 * @data: 2018-12-09 18:39
 **/
public class MonkeyAnimal implements Animal{

    @Override
    public void eat(String food) {
        System.out.println("猴子吃" + food);
    }
}