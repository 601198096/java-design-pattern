/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Account.java
 * packageName: cn.zy.pattern.template
 * date: 2019-01-02 20:55
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.template;

/**
 * @version: V1.0
 * @author: ending
 * @className: Account
 * @packageName: cn.zy.pattern.template
 * @description:
 * @data: 2019-01-02 20:55
 **/
public abstract class Account {

    public boolean validate(String username , String pwd){
        if("xiaohong".equals(username) && "123456".equals(pwd)){
            return true;
        }
        return false;
    }

    public void add(String username , String pwd){
        if(this.validate(username , pwd)){
            this.method();
        }
        this.display();
    }

    public abstract void method();

    public void display(){
        System.out.println("利息计算");
    }
}