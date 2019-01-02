/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Department.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:35
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

/**
 * @version: V1.0
 * @author: ending
 * @className: Department
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:35
 **/
public interface Department {

    public void accept(FullTimeEmployee fullTimeEmployee);

    public void accept(PartTimeEmployee partTimeEmployee);
}