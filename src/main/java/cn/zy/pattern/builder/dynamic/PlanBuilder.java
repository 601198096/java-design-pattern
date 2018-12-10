/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PlanBuilder.java
 * packageName: cn.zy.pattern.builder
 * date: 2018-12-10 22:15
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder.dynamic;

/**
 * @version: V1.0
 * @author: ending
 * @className: PlanBuilder
 * @packageName: cn.zy.pattern.builder
 * @description:
 * @data: 2018-12-10 22:15
 **/
public abstract class PlanBuilder {

    protected Plan plan = new Plan();

    public Plan getResult(){
        plan.start();
        this.doContent();
        plan.end();
        return plan;
    }

    public abstract void doContent();

    public abstract void setBrief(String brief);

    public abstract void setName(String name);
}