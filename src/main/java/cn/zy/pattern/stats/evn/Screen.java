/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Screen.java
 * packageName: cn.zy.pattern.stats.evn
 * date: 2018-12-28 23:07
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.stats.evn;

/**
 * @version: V1.0
 * @author: ending
 * @className: Screen
 * @packageName: cn.zy.pattern.stats.evn
 * @description:
 * @data: 2018-12-28 23:07
 **/
public class Screen {

    private Evn currentEvn;

    private DevEvn devEvn;

    private TestEvn testEvn;

    private ProEvn proEvn;

    public Evn getCurrentEvn() {
        return currentEvn;
    }

    public void setCurrentEvn(Evn currentEvn) {
        this.currentEvn = currentEvn;
    }

    public Screen() {
        this.devEvn = new DevEvn();
        this.testEvn = new TestEvn();
        this.proEvn = new ProEvn();
        this.currentEvn = this.devEvn;
        this.currentEvn.display();
    }

    public void onClick(){
        if(this.currentEvn.getClass() == DevEvn.class){
            this.setCurrentEvn(testEvn);
        }else if(this.currentEvn.getClass() == TestEvn.class){
            this.setCurrentEvn(proEvn);
        }else{
            this.setCurrentEvn(devEvn);
        }
        this.currentEvn.display();
    }
}