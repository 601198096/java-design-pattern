/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: Beer.java
 * packageName: cn.zy.pattern.prototype.simple.deep
 * date: 2018-12-09 22:06
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.prototype.deep;

import java.io.*;

/**
 * @version: V1.0
 * @author: ending
 * @className: Beer
 * @packageName: cn.zy.pattern.prototype.deep
 * @description: 深克隆原型
 * @data: 2018-12-09 22:06
 **/
public class Beer implements Serializable {

    private static final long serialVersionUID = -1048870604590241595L;

    private String name;

    private Integer type;

    private Peanut peanut;

    public Peanut getPeanut() {
        return peanut;
    }

    public void setPeanut(Peanut peanut) {
        this.peanut = peanut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Beer deepClone() throws IOException , ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Beer)objectInputStream.readObject();
    }
}