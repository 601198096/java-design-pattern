/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: SimpleBuilder.java
 * packageName: cn.zy.pattern.builder.simple
 * date: 2018-12-10 22:40
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: SimpleBuilder
 * @packageName: cn.zy.pattern.builder.simple
 * @description:
 * @data: 2018-12-10 22:40
 **/
public class SimpleBuilder {

    private final BuilderEntity builderEntity = new BuilderEntity();

    public SimpleBuilder builName(String name) {
        builderEntity.setName(name);
        return this;
    }

    public SimpleBuilder builAge(Integer age) {
        builderEntity.setAge(age);
        return this;
    }

    public BuilderEntity build(){
        return builderEntity;
    }
}