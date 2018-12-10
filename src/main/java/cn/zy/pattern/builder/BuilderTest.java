/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: BuilderTest.java
 * packageName: cn.zy.pattern.builder
 * date: 2018-12-10 22:30
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.builder;

import cn.zy.pattern.builder.dynamic.Plan;
import cn.zy.pattern.builder.dynamic.XContentPlanBuilder;
import cn.zy.pattern.builder.simple.BuilderEntity;
import cn.zy.pattern.builder.simple.SimpleBuilder;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: BuilderTest
 * @packageName: cn.zy.pattern.builder
 * @description: 建造者模式
 * @data: 2018-12-10 22:30
 **/
public class BuilderTest {

    /**
     * @title: dymagic
     * @description: TODO
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/10 22:46
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void dymagic(){
        XContentPlanBuilder xContentPlanBuilder = new XContentPlanBuilder();
        xContentPlanBuilder.setName("B plan");
        xContentPlanBuilder.setBrief("NB");
        Plan result = xContentPlanBuilder.getResult();
        System.out.println(result.getName());
    }

    /**
     * @title: simpleTest
     * @description: TODO
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/10 22:47
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void simpleTest(){
        SimpleBuilder simpleBuilder = new SimpleBuilder();
        simpleBuilder.builAge(12);
        simpleBuilder.builName("name");
        BuilderEntity entity = simpleBuilder.build();
        System.out.println(entity.getName());
    }

}