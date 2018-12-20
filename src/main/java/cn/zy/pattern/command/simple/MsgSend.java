/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MsgSend.java
 * packageName: cn.zy.pattern.command.simple
 * date: 2018-12-19 22:31
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: MsgSend
 * @packageName: cn.zy.pattern.command.simple
 * @description: 发送者
 * @data: 2018-12-19 22:31
 **/
public class MsgSend {

    private SimpleCommand simpleCommand;

    public MsgSend(SimpleCommand simpleCommand) {
        this.simpleCommand = simpleCommand;
    }

    public void click(){
        simpleCommand.execute();
    }
}