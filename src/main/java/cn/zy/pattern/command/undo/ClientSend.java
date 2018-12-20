/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ClientSend.java
 * packageName: cn.zy.pattern.command.undo
 * date: 2018-12-19 23:39
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.undo;

/**
 * @version: V1.0
 * @author: ending
 * @className: ClientSend
 * @packageName: cn.zy.pattern.command.undo
 * @description: 客户端发送
 * @data: 2018-12-19 23:39
 **/
public class ClientSend {

    private AbstractCommand abstractCommand;

    public AbstractCommand getAbstractCommand() {
        return abstractCommand;
    }

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public Integer execute(int num){
        return abstractCommand.execute(num);
    }

    public Integer undo(){
        return abstractCommand.undo();
    }
}