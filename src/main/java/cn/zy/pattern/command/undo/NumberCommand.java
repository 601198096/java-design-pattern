/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: NumberCommand.java
 * packageName: cn.zy.pattern.command.undo
 * date: 2018-12-19 23:35
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.command.undo;

/**
 * @version: V1.0
 * @author: ending
 * @className: NumberCommand
 * @packageName: cn.zy.pattern.command.undo
 * @description:
 * @data: 2018-12-19 23:35
 **/
public class NumberCommand extends AbstractCommand {

    private NumberOperation numberOperation = new NumberOperation();

    private Integer value;

    @Override
    public Integer execute(int num) {
        this.value = num;
        return numberOperation.add(num);
    }

    @Override
    public Integer undo() {
        return numberOperation.add(- this.value);
    }
}