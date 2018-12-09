/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Product.java
 * packageName: cn.zy.pattern.factory.simple
 * date: 2018-12-09 18:10
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: Product
 * @packageName: cn.zy.pattern.factory.simple
 * @description: 产品抽象类
 * @data: 2018-12-09 18:10
 **/
public interface Product {

    /**
     * @title: handle
     * @description: 产品逻辑处理
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 18:11
     * @param name
     * @return: void
     * @throws:
     */
    void handle(String name);
}
