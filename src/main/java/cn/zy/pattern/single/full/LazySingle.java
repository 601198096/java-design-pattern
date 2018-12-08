/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: LazySingle.java
 * packageName: cn.zy.pattern.single.full
 * date: 2018-12-09 0:15
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.single.full;

/**
 * @version: V1.0
 * @author: ending
 * @className: LazySingle
 * @packageName: cn.zy.pattern.single.full
 * @description: 饱汉单例模式
 * @data: 2018-12-09 0:15
 **/
public class LazySingle {

    private volatile static LazySingle lazySingle = null;

    private LazySingle(){}

    public static LazySingle getInstance(){
        if(null == lazySingle){
            synchronized (LazySingle.class){
                if(null == lazySingle){
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}