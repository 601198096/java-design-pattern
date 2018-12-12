/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SimpleAdapter.java
 * packageName: cn.zy.pattern.adapter.simple
 * date: 2018-12-12 21:11
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.adapter.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: SimpleAdapter
 * @packageName: cn.zy.pattern.adapter.simple
 * @description: 简单的适配器
 * @data: 2018-12-12 21:11
 **/
public class SimpleAdapter implements ScoreOperation {

    @Override
    public void getOddNumber() {
        new OddOperation().getOddNumber();
    }

    @Override
    public void getEvenNumber() {
        new EvenOperation().getEvenNumber();
    }
}