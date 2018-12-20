/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: CommandTest.java
 * packageName: cn.zy.pattern.command.simple
 * date: 2018-12-19 22:37
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command;

import cn.zy.pattern.command.log.LogCommand;
import cn.zy.pattern.command.log.LogCommandImpl;
import cn.zy.pattern.command.log.LogSend;
import cn.zy.pattern.command.queue.CommandQueue;
import cn.zy.pattern.command.queue.QueueSend;
import cn.zy.pattern.command.simple.AddCommand;
import cn.zy.pattern.command.simple.DeleteCommand;
import cn.zy.pattern.command.simple.MsgSend;
import cn.zy.pattern.command.simple.SimpleCommand;
import cn.zy.pattern.command.undo.AbstractCommand;
import cn.zy.pattern.command.undo.ClientSend;
import cn.zy.pattern.command.undo.NumberCommand;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: CommandTest
 * @packageName: cn.zy.pattern.command.simple
 * @description: 命令模式测试类
 * @data: 2018-12-19 22:37
 **/
public class CommandTest {

    /**
     * @title: simpleTest
     * @description: TODO
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/19 23:44
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void simpleTest(){
        SimpleCommand addCommand = new AddCommand();
        MsgSend msgSend = new MsgSend(addCommand);
        msgSend.click();
    }

    /**
     * @title: queueTest
     * @description: 队列操作
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/19 23:44
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void queueTest(){
        SimpleCommand addCommand = new AddCommand();
        SimpleCommand deleteCommand = new DeleteCommand();
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.add(addCommand);
        commandQueue.add(deleteCommand);

        QueueSend queueSend = new QueueSend();
        queueSend.setCommandQueue(commandQueue);
        queueSend.execute();
    }

    /**
     * @title: undo
     * @description: 撤销操作
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/19 23:44
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void undo(){
        AbstractCommand abstractCommand = new NumberCommand();
        ClientSend clientSend = new ClientSend();
        clientSend.setAbstractCommand(abstractCommand);
        System.out.println(clientSend.execute(6));
        System.out.println(abstractCommand.undo());
    }

    @Test
    public void logOperation() {
        LogCommand logCommand = new LogCommandImpl();
        LogSend logSend = new LogSend();
        logSend.setLogCommand(logCommand);
        logSend.execute("小明");
    }
}