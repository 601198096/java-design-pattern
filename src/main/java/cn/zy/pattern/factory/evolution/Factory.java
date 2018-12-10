/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Factory.java
 * packageName: cn.zy.pattern.factory.deep
 * date: 2018-12-09 18:33
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.evolution;

import cn.hutool.core.util.ObjectUtil;

/**
 * @version: V1.0
 * @author: ending
 * @className: Factory
 * @packageName: cn.zy.pattern.factory.deep
 * @description: 抽象工厂
 * @data: 2018-12-09 18:33
 **/
public abstract class Factory {

    public void getPhoneBrand(){
        Phone phone = this.createPhone();
        if(ObjectUtil.isNotNull(phone)){
            phone.brand();
        }
    }

    abstract Phone createPhone();
}
