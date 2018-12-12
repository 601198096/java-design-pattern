/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ClazzAdapter.java
 * packageName: cn.zy.pattern.adapter.clazz
 * date: 2018-12-12 21:19
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.adapter.clazz;

/**
 * @version: V1.0
 * @author: ending
 * @className: ClazzAdapter
 * @packageName: cn.zy.pattern.adapter.clazz
 * @description: 类适配器
 * @data: 2018-12-12 21:19
 **/
public class ClazzAdapter extends OperationUnit implements TargetOperation{

    @Override
    public void add(int a, int b) {
        System.out.println(this.addNumber(a , b));
    }
}