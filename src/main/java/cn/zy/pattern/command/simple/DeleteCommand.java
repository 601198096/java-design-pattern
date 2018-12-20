/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: DeleteCommand.java
 * packageName: cn.zy.pattern.command.simple
 * date: 2018-12-19 22:33
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: DeleteCommand
 * @packageName: cn.zy.pattern.command.simple
 * @description: 删除命令
 * @data: 2018-12-19 22:33
 **/
public class DeleteCommand extends SimpleCommand {

    @Override
    public void execute() {
        new DeleteOperation().delete();
    }
}