/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AddCommand.java
 * packageName: cn.zy.pattern.command.simple
 * date: 2018-12-19 22:32
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: AddCommand
 * @packageName: cn.zy.pattern.command.simple
 * @description: 增加命令
 * @data: 2018-12-19 22:32
 **/
public class AddCommand extends SimpleCommand {

    @Override
    public void execute() {
        new AddOperation().add();
    }
}