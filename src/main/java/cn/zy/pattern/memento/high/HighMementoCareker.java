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
package cn.zy.pattern.memento.high;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: HighMementoCareker
 * @packageName: cn.zy.pattern.memento.simple
 * @description: 负责任人
 * @data: 2018-12-26 22:04
 **/
public class HighMementoCareker implements Serializable {

    private static final long serialVersionUID = -8859714795895089019L;

    private List<HighMemento> highMementoList = new ArrayList<>();

    public HighMemento getHighMemento(Integer i) {
        return highMementoList.get(i);
    }

    public void setHighMemento(int i , HighMemento highMemento) {
        highMementoList.add(i , highMemento);
    }

    public List<HighMemento> getHighMementoList() {
        return highMementoList;
    }

    public void setHighMementoList(List<HighMemento> highMementoList) {
        this.highMementoList = highMementoList;
    }
}