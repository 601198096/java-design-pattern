/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Peanut.java
 * packageName: cn.zy.pattern.prototype.deep
 * date: 2018-12-09 22:18
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: ending
 * @className: Peanut
 * @packageName: cn.zy.pattern.prototype.deep
 * @description:
 * @data: 2018-12-09 22:18
 **/
public class Peanut implements Serializable {

    private static final long serialVersionUID = -1075409569306086179L;

    private Boolean nice;

    public Boolean getNice() {
        return nice;
    }

    public void setNice(Boolean nice) {
        this.nice = nice;
    }
}