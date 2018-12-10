/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Plan.java
 * packageName: cn.zy.pattern.builder
 * date: 2018-12-10 22:11
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder.dynamic;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: Plan
 * @packageName: cn.zy.pattern.builder
 * @description:
 * @data: 2018-12-10 22:11
 **/
public class Plan implements Serializable {

    private static final long serialVersionUID = 6409319379036244055L;

    private String name;

    private String brief;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public void start(){
        System.out.println("开始");
    }

    public void end(){
        System.out.println("结束");
    }
}