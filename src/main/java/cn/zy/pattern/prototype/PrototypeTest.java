/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PrototypeTest.java
 * packageName: cn.zy.pattern.prototype
 * date: 2018-12-09 21:57
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.prototype;

import cn.zy.pattern.prototype.deep.Beer;
import cn.zy.pattern.prototype.deep.Peanut;
import cn.zy.pattern.prototype.simple.NoteBook;
import cn.zy.pattern.prototype.simple.Pen;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: PrototypeTest
 * @packageName: cn.zy.pattern.prototype
 * @description: 原型模式测试类
 * @data: 2018-12-09 21:57
 **/
public class PrototypeTest {

    /**
     * @title: simpleTest
     * @description: 浅克隆
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 22:01
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void simpleTest(){
        NoteBook noteBook = new NoteBook();
        noteBook.setName("小红");
        noteBook.setWight(12);
        noteBook.setPen(new Pen());

        NoteBook clone = noteBook.clone();
        System.out.println(clone.getPen() == clone.getPen());
    }

    /**
     * @title: deepTest
     * @description: 深度克隆
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 22:19
     * @param 
     * @return: void
     * @throws: 
     */
    @Test
    public void deepTest() throws Exception{
        Beer beer = new Beer();
        beer.setName("雪花");
        beer.setType(11);
        beer.setPeanut(new Peanut());

        Beer clone = beer.deepClone();
        System.out.println(beer.getPeanut() == clone.getPeanut());
    }
}