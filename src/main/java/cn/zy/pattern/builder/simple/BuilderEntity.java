/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: BuilderEntity.java
 * packageName: cn.zy.pattern.builder.simple
 * date: 2018-12-10 22:39
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder.simple;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: BuilderEntity
 * @packageName: cn.zy.pattern.builder.simple
 * @description:
 * @data: 2018-12-10 22:39
 **/
public class BuilderEntity implements Serializable {

    private static final long serialVersionUID = -3373188326869556482L;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}