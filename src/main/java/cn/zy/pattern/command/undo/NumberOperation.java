/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: NumberOperation.java
 * packageName: cn.zy.pattern.command.undo
 * date: 2018-12-19 23:35
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.undo;

/**
 * @version: V1.0
 * @author: ending
 * @className: NumberOperation
 * @packageName: cn.zy.pattern.command.undo
 * @description:
 * @data: 2018-12-19 23:35
 **/
public class NumberOperation {

    private Integer num = 0;

    public Integer add(int i){
        num = num + i;
        return num;
    }
}