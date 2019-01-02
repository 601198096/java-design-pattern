/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: VisitTest.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:45
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

import org.junit.Test;

/**
 * @version: V1.0
 * @author: ending
 * @className: VisitTest
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:45
 **/
public class VisitTest {

    @Test
    public void simpleTest(){
        Employee fullTimeEmployee1 = new FullTimeEmployee("小红" , 11 ,14);
        Employee partTimeEmployee1 = new PartTimeEmployee("小白" , 12 ,13);
        Employee fullTimeEmployee2 = new FullTimeEmployee("小明" , 13 ,12);
        Employee partTimeEmployee2 = new PartTimeEmployee("小黄" , 14 ,11);

        EmployeeList employeeList = new EmployeeList();
        employeeList.add(fullTimeEmployee1);
        employeeList.add(partTimeEmployee2);
        employeeList.add(fullTimeEmployee2);
        employeeList.add(partTimeEmployee1);

        HRDepartment hrDepartment = new HRDepartment();
        employeeList.handle(hrDepartment);
    }
}