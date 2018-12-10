/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: XContentPlanBuilder.java
 * packageName: cn.zy.pattern.builder
 * date: 2018-12-10 22:29
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder.dynamic;

/**
 * @version: V1.0
 * @author: ending
 * @className: XContentPlanBuilder
 * @packageName: cn.zy.pattern.builder
 * @description:
 * @data: 2018-12-10 22:29
 **/
public class XContentPlanBuilder extends PlanBuilder{

    @Override
    public void doContent() {
        System.out.println("中间内容");
    }

    @Override
    public void setBrief(String brief) {
        plan.setBrief(brief);
    }

    @Override
    public void setName(String name) {
        plan.setName(name);
    }
}