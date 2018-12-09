/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: FactoryTest.java
 * packageName: cn.zy.pattern.factory.simple
 * date: 2018-12-09 18:18
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory;

import cn.hutool.core.util.ObjectUtil;
import cn.zy.pattern.factory.evolution.AppleFactory;
import cn.zy.pattern.factory.high.Factory;
import cn.zy.pattern.factory.high.MonkeyFactory;
import cn.zy.pattern.factory.high.PandaFactory;
import cn.zy.pattern.factory.simple.Product;
import cn.zy.pattern.factory.simple.ProductTypeEnum;
import cn.zy.pattern.factory.simple.SimpleFactory;
import cn.zy.pattern.factory.stract.AbstractFactory;
import cn.zy.pattern.factory.stract.HaiErFactory;
import cn.zy.pattern.factory.stract.XiaoMiFactory;
import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: FactoryTest
 * @packageName: cn.zy.pattern.factory.simple
 * @description: 工厂模式测试类
 * @data: 2018-12-09 18:18
 **/
public class FactoryTest {

    /**
     * @title: simpleTest
     * @description: simple工厂测试方法
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 18:23
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void simpleFactoryTest(){
        Product product = SimpleFactory.getProduct(ProductTypeEnum.VIP);
        if(ObjectUtil.isNotNull(product)){
            product.handle("续约VIP");
        }
    }

    /**
     * @title: highFactoryTest
     * @description: TODO
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 18:43
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void highFactoryTest(){
        Factory monkeyFactory = new MonkeyFactory();
        monkeyFactory.createAnimal().eat("香蕉");

        Factory pandaFactory = new PandaFactory();
        pandaFactory.createAnimal().eat("竹子");
    }

    /**
     * @title: evolutionFactoryTest
     * @description: 隐藏业务逻辑的调用
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 18:58
     * @param
     * @return: void
     * @throws:
     */
    @Test
    public void evolutionFactoryTest(){
        new AppleFactory().getPhoneBrand();
    }

    /**
     * @title: abstractFactoryTest
     * @description: 抽象工厂和产品
     * @author: ending
     * @version: V1.0.0
     * @date: 2018/12/9 19:59
     * @param 
     * @return: void
     * @throws: 
     */
    @Test
    public void abstractFactoryTest(){
        AbstractFactory abstractFactory = new HaiErFactory();
        abstractFactory.createBook().getHandle();
        abstractFactory.createPhone().getHandle();

        abstractFactory = new XiaoMiFactory();
        abstractFactory.createPhone().getHandle();
        abstractFactory.createBook().getHandle();
    }
}