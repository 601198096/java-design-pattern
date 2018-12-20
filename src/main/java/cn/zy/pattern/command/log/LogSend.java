/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: LogSend.java
 * packageName: cn.zy.pattern.command.log
 * date: 2018-12-20 21:21
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.log;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: LogSend
 * @packageName: cn.zy.pattern.command.log
 * @description:
 * @data: 2018-12-20 21:21
 **/
public class LogSend{

    private List<LogCommand> commands = new ArrayList<>();

    private LogCommand logCommand;

    public LogCommand getLogCommand() {
        return logCommand;
    }

    public void setLogCommand(LogCommand logCommand) {
        this.logCommand = logCommand;
    }

    public void execute(String name){
        logCommand.execute(name);
        commands.add(logCommand);
    }
}