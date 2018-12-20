/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: LogCommand.java
 * packageName: cn.zy.pattern.command.log
 * date: 2018-12-20 21:21
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.log;

/**
 * @version: V1.0
 * @author: ending
 * @className: LogCommand
 * @packageName: cn.zy.pattern.command.log
 * @description:
 * @data: 2018-12-20 21:21
 **/
public abstract class LogCommand {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void execute(String name);
}