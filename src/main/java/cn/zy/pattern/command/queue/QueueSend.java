/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: QueueSend.java
 * packageName: cn.zy.pattern.command.queue
 * date: 2018-12-19 23:27
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.queue;

/**
 * @version: V1.0
 * @author: ending
 * @className: QueueSend
 * @packageName: cn.zy.pattern.command.queue
 * @description:
 * @data: 2018-12-19 23:27
 **/
public class QueueSend {

    private CommandQueue commandQueue;

    public CommandQueue getCommandQueue() {
        return commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void execute(){
        commandQueue.execute();
    }
}