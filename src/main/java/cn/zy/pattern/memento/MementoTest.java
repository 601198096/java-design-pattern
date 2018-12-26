/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MementoTest.java
 * packageName: cn.zy.pattern.memento
 * date: 2018-12-26 22:00
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.memento;

import cn.zy.pattern.memento.high.HighChessman;
import cn.zy.pattern.memento.high.HighMemento;
import cn.zy.pattern.memento.high.HighMementoCareker;
import cn.zy.pattern.memento.simple.Chessman;
import cn.zy.pattern.memento.simple.MementoCareker;
import cn.zy.pattern.memento.simple.SimpleMemento;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: MementoTest
 * @packageName: cn.zy.pattern.memento
 * @description: 备忘录测试类
 * @data: 2018-12-26 22:00
 **/
public class MementoTest {

    @Test
    public void simpleTest(){
        MementoCareker mementoCareker = new MementoCareker();

        Chessman chessman = new Chessman();
        chessman.setName("马");
        chessman.setX(1);
        chessman.setY(2);

        SimpleMemento simpleMemento = chessman.getMemento();
        mementoCareker.setSimpleMemento(simpleMemento);
        System.out.println(JSON.toJSONString(chessman));

        chessman.setY(7);
        System.out.println(JSON.toJSONString(chessman));

        /** 悔棋 */
        chessman.restore(mementoCareker.getSimpleMemento());
        System.out.println(JSON.toJSONString(chessman));
    }

    @Test
    public void high(){
        int index = 0;

        HighMementoCareker highMementoCareker = new HighMementoCareker();

        HighChessman chessman = new HighChessman();
        chessman.setName("马");
        chessman.setX(1);
        chessman.setY(2);

        HighMemento memento = chessman.getMemento();
        highMementoCareker.setHighMemento(index++ , memento);
        System.out.println("当前位置" + JSON.toJSONString(chessman.getMemento()));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        chessman.setX(2);
        memento = chessman.getMemento();
        highMementoCareker.setHighMemento(index++, memento);
        System.out.println("当前位置" + JSON.toJSONString(chessman.getMemento()));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        chessman.setX(3);
        memento = chessman.getMemento();
        highMementoCareker.setHighMemento(index++, memento);
        System.out.println("当前位置" + JSON.toJSONString(chessman.getMemento()));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        /** 悔棋 */
        HighMemento highMemento = highMementoCareker.getHighMemento(--index - 1);
        chessman.restore(highMemento);
        System.out.println("当前位置" + JSON.toJSONString(chessman));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        highMemento = highMementoCareker.getHighMemento(--index - 1);
        chessman.restore(highMemento);
        System.out.println("当前位置" + JSON.toJSONString(chessman));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        /** 撤销悔棋 */
        highMemento = highMementoCareker.getHighMemento(index++);
        chessman.restore(highMemento);
        System.out.println("当前位置" + JSON.toJSONString(chessman));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));

        highMemento = highMementoCareker.getHighMemento(index++);
        chessman.restore(highMemento);
        System.out.println("当前位置" + JSON.toJSONString(chessman));
        System.out.println(JSON.toJSONString(highMementoCareker.getHighMementoList()));
    }
}