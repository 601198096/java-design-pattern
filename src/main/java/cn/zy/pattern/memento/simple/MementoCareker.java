/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: HighMementoCareker.java
 * packageName: cn.zy.pattern.memento.simple
 * date: 2018-12-26 22:04
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.memento.simple;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: HighMementoCareker
 * @packageName: cn.zy.pattern.memento.simple
 * @description: 负责任人
 * @data: 2018-12-26 22:04
 **/
public class MementoCareker implements Serializable {

    private static final long serialVersionUID = -8859714795895089019L;

    private SimpleMemento simpleMemento;

    public SimpleMemento getSimpleMemento() {
        return simpleMemento;
    }

    public void setSimpleMemento(SimpleMemento simpleMemento) {
        this.simpleMemento = simpleMemento;
    }
}