/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: AbstractFile.java
 * packageName: cn.zy.pattern.combination
 * date: 2018-12-13 22:06
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.combination;

/**
 * @version: V1.0
 * @author: ending
 * @className: AbstractFile
 * @packageName: cn.zy.pattern.combination
 * @description: 抽象构件
 * @data: 2018-12-13 22:06
 **/
public abstract class AbstractFile {

    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract void effect();
}