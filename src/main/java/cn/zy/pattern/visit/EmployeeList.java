/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: EmployeeList.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:43
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: ending
 * @className: EmployeeList
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:43
 **/
public class EmployeeList {

    private List<Employee> list = new ArrayList<>();

    public void add(Employee employee){
        list.add(employee);
    }

    public void handle(Department department){
        list.forEach(employee -> employee.accept(department));
    }
}