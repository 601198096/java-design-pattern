/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: adapterTest.java
 * packageName: cn.zy.pattern.adapter.simple
 * date: 2018-12-12 21:02
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.adapter;

import cn.zy.pattern.adapter.clazz.ClazzAdapter;
import cn.zy.pattern.adapter.simple.ScoreOperation;
import cn.zy.pattern.adapter.simple.SimpleAdapter;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: adapterTest
 * @packageName: cn.zy.pattern.adapter.simple
 * @description: 适配器测试类
 * @data: 2018-12-12 21:02
 **/
public class adapterTest {

    /**
     * @title: simpleTest
     * @description: 对象适配器
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/12 21:15
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void simpleTest(){
        ScoreOperation simpleAdapter = new SimpleAdapter();
        simpleAdapter.getEvenNumber();
        simpleAdapter.getOddNumber();
    }

    /**
     * @title: clazzTest
     * @description: 类适配器
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/12 21:21
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void clazzTest(){
        ClazzAdapter clazzAdapter = new ClazzAdapter();
        clazzAdapter.add(1 , 2);
    }
}