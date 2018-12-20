/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: CommandQueue.java
 * packageName: cn.zy.pattern.command.queue
 * date: 2018-12-19 23:24
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.queue;

import cn.zy.pattern.command.simple.SimpleCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: CommandQueue
 * @packageName: cn.zy.pattern.command.queue
 * @description: 队列命令
 * @data: 2018-12-19 23:24
 **/
public class CommandQueue {

    private List<SimpleCommand> commandList = new ArrayList<>();

    public void add(SimpleCommand simpleCommand){
        commandList.add(simpleCommand);
    }

    public void remove(SimpleCommand simpleCommand){
        commandList.remove(simpleCommand);
    }

    public void execute(){
        commandList.forEach(simpleCommand -> simpleCommand.execute());
    }
}