/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: OddOperation.java
 * packageName: cn.zy.pattern.adapter.simple
 * date: 2018-12-12 21:07
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.adapter.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: OddOperation
 * @packageName: cn.zy.pattern.adapter.simple
 * @description:
 * @data: 2018-12-12 21:07
 **/
public class OddOperation {

    public void getOddNumber(){
        int num = 0;
        for(int i = 0; i < 10 ; i++){
            if(i % 2 != 0){
                num = + i;
            }
        }
        System.out.println("奇数集合结果集:" + num);
    }
}