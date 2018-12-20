/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: LogCommandImpl.java
 * packageName: cn.zy.pattern.command.log
 * date: 2018-12-20 21:23
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.log;

/**
 * @version: V1.0
 * @author: ending
 * @className: LogCommandImpl
 * @packageName: cn.zy.pattern.command.log
 * @description:
 * @data: 2018-12-20 21:23
 **/
public class LogCommandImpl extends LogCommand {

    private LogReceive logReceive = new LogReceive();

    @Override
    public void execute(String name) {
        System.out.println(name + "执行操作");
        logReceive.add();
    }
}