/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: VipProduct.java
 * packageName: cn.zy.pattern.factory.simple
 * date: 2018-12-09 18:12
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.factory.simple;

import cn.hutool.core.util.StrUtil;

/**
 * @version: V1.0
 * @author: ending
 * @className: VipProduct
 * @packageName: cn.zy.pattern.factory.simple
 * @description: Vip实现类
 * @data: 2018-12-09 18:12
 **/
public class VipProduct implements Product{

    @Override
    public void handle(String name) {
        if(StrUtil.isNotBlank(name)){
            System.out.println("VIP逻辑处理" + name);
        }
    }
}