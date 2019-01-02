/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: PartTimeEmployee.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:38
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

/**
 * @version: V1.0
 * @author: ending
 * @className: PartTimeEmployee
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:38
 **/
public class PartTimeEmployee implements Employee {

    private String name;

    private Integer workTime;

    private Integer hourlyWage;

    public PartTimeEmployee(String name, Integer workTime, Integer hourlyWage) {
        this.name = name;
        this.workTime = workTime;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public Integer getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Integer hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void accept(Department department) {
        department.accept(this);
    }
}