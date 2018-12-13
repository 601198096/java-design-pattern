/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Folder.java
 * packageName: cn.zy.pattern.combination
 * date: 2018-12-13 22:11
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: Folder
 * @packageName: cn.zy.pattern.combination
 * @description: 容器构件
 * @data: 2018-12-13 22:11
 **/
public class Folder extends AbstractFile {

    private List<AbstractFile> abstractFiles = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        abstractFiles.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        abstractFiles.remove(abstractFile);
    }

    @Override
    public void effect() {
//        abstractFiles.forEach(AbstractFile::effect);
        for(AbstractFile abstractFile : abstractFiles){
            abstractFile.effect();
        }
    }
}