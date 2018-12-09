/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: CoinProduct.java
 * packageName: cn.zy.pattern.factory.simple
 * date: 2018-12-09 18:13
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: CoinProduct
 * @packageName: cn.zy.pattern.factory.simple
 * @description: 金币实现类
 * @data: 2018-12-09 18:13
 **/
public class CoinProduct implements Product{

    @Override
    public void handle(String name) {
        System.out.println("金币逻辑处理" + name);
    }
}