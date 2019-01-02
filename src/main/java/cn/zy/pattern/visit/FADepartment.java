/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: FADepartment.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:40
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

/**
 * @version: V1.0
 * @author: ending
 * @className: FADepartment
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:40
 **/
public class FADepartment implements Department {

    @Override
    public void accept(FullTimeEmployee fullTimeEmployee) {
        System.out.println(fullTimeEmployee.getName() + "全职财务职位");
    }

    @Override
    public void accept(PartTimeEmployee partTimeEmployee) {
        System.out.println(partTimeEmployee.getName() + "临时财务职位");
    }
}