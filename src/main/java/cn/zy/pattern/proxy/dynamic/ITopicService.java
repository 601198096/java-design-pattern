/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ITopicService.java
 * packageName: cn.zy.pattern.proxy.dynamic
 * date: 2018-12-18 22:01
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy.dynamic;

/**
 * @version: V1.0
 * @author: ending
 * @className: ITopicService
 * @packageName: cn.zy.pattern.proxy.dynamic
 * @description:
 * @data: 2018-12-18 22:01
 **/
public class ITopicService implements TopicService{

    @Override
    public void add() {
        System.out.println("主题添加成功");
    }
}