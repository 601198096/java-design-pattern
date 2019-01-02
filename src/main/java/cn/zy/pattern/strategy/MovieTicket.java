/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: MovieTicket.java
 * packageName: cn.zy.pattern.strategy
 * date: 2019-01-02 20:40
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.strategy;

/**
 * @version: V1.0
 * @author: ending
 * @className: MovieTicket
 * @packageName: cn.zy.pattern.strategy
 * @description:
 * @data: 2019-01-02 20:40
 **/
public class MovieTicket {

    private DisCount disCount;

    private Float price;

    public DisCount getDisCount() {
        return disCount;
    }

    public void setDisCount(DisCount disCount) {
        this.disCount = disCount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float calculate(){
        return this.disCount.handle(this.price);
    }
}