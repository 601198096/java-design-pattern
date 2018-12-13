/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: TextFile.java
 * packageName: cn.zy.pattern.combination
 * date: 2018-12-13 22:10
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.combination;

/**
 * @version: V1.0
 * @author: ending
 * @className: TextFile
 * @packageName: cn.zy.pattern.combination
 * @description: 文本构件
 * @data: 2018-12-13 22:10
 **/
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("暂不支持此功能");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("暂不支持此功能");
    }

    @Override
    public void effect() {
        System.out.println(name + ":text文件存储");
    }
}