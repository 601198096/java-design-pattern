/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: FullTimeEmployee.java
 * packageName: cn.zy.pattern.visit
 * date: 2019-01-02 22:36
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.visit;

/**
 * @version: V1.0
 * @author: ending
 * @className: FullTimeEmployee
 * @packageName: cn.zy.pattern.visit
 * @description:
 * @data: 2019-01-02 22:36
 **/
public class FullTimeEmployee implements Employee {

    private String name;

    private Integer workTime;

    private Integer weeklyWage;

    public FullTimeEmployee(String name, Integer workTime, Integer weeklyWage) {
        this.name = name;
        this.workTime = workTime;
        this.weeklyWage = weeklyWage;
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

    public Integer getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(Integer weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    @Override
    public void accept(Department department) {
        department.accept(this);
    }


}