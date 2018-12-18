/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: WhiteIgoChessman.java
 * packageName: cn.zy.pattern.flyweight.simple
 * date: 2018-12-17 23:32
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.flyweight;

/**
 * @version: V1.0
 * @author: ending
 * @className: WhiteIgoChessman
 * @packageName: cn.zy.pattern.flyweight.simple
 * @description: 享元具体类
 * @data: 2018-12-17 23:32
 **/
public class WhiteIgoChessman extends IgoChessman {

    @Override
    String after() {
        return "白色";
    }
}