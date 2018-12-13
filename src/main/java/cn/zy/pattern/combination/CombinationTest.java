/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: CombinationTest.java
 * packageName: cn.zy.pattern.combination
 * date: 2018-12-13 22:15
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.combination;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: CombinationTest
 * @packageName: cn.zy.pattern.combination
 * @description: 组合模式测试类
 * @data: 2018-12-13 22:15
 **/
public class CombinationTest {

    @Test
    public void simpleTest(){
        AbstractFile imageFile = new ImageFile("钢铁侠.img");
        AbstractFile textFile = new TextFile("九阴真经.txt");
        AbstractFile folder = new Folder("奇思妙想");
        folder.add(imageFile);
        folder.add(textFile);

        AbstractFile newTextFile = new TextFile("降龙十八掌.txt");
        AbstractFile parentFolder = new Folder("天龙");
        parentFolder.add(newTextFile);
        parentFolder.add(folder);

        parentFolder.effect();
    }
}