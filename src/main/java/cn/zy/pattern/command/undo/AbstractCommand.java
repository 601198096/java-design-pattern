/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AbstractCommand.java
 * packageName: cn.zy.pattern.command.undo
 * date: 2018-12-19 23:32
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.undo;

/**
 * @version: V1.0
 * @author: ending
 * @className: AbstractCommand
 * @packageName: cn.zy.pattern.command.undo
 * @description: 命令抽象类
 * @data: 2018-12-19 23:32
 **/
public abstract class AbstractCommand {

    public abstract Integer execute(int num);

    public abstract Integer undo();
}