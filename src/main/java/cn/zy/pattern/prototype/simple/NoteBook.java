/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: NoteBook.java
 * packageName: cn.zy.pattern.prototype.simple.deep
 * date: 2018-12-09 21:54
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.prototype.simple;

/**
 * @version: V1.0
 * @author: ending
 * @className: NoteBook
 * @packageName: cn.zy.pattern.prototype.simple.deep
 * @description: 浅复制原型
 * @data: 2018-12-09 21:54
 **/
public class NoteBook implements Cloneable{

    private String name;

    private Integer wight;

    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWight() {
        return wight;
    }

    public void setWight(Integer wight) {
        this.wight = wight;
    }

    @Override
    public NoteBook clone()  {
        NoteBook noteBook = null;
        try{
            noteBook = (NoteBook) super.clone();
        }catch (CloneNotSupportedException e){
            System.err.println("复制异常");
        }
        return noteBook;
    }
}