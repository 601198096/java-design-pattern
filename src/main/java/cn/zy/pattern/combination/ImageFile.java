/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: ImageFile.java
 * packageName: cn.zy.pattern.combination
 * date: 2018-12-13 22:07
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.combination;

/**
 * @version: V1.0
 * @author: ending
 * @className: ImageFile
 * @packageName: cn.zy.pattern.combination
 * @description: 图片构件
 * @data: 2018-12-13 22:07
 **/
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
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
        System.out.println(name + ":图片存储");
    }
}