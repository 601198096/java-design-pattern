/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: FlyweightFactory.java
 * packageName: cn.zy.pattern.flyweight.simple
 * date: 2018-12-17 23:24
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version: V1.0
 * @author: ending
 * @className: FlyweightFactory
 * @packageName: cn.zy.pattern.flyweight.simple
 * @description: 享元工厂类
 * @data: 2018-12-17 23:24
 **/
public class FlyweightFactory {

    private Map<String , IgoChessman> chessmanMap = new ConcurrentHashMap<>();

    static class SingleClazz{
        static FlyweightFactory flyweightFactory = new FlyweightFactory();
    }

    private FlyweightFactory() {
        IgoChessman igoChessman = new WhiteIgoChessman();
        igoChessman.before(new Coordinates(1,2));

        IgoChessman blackIgoChessman = new BlackIgoChessman();
        blackIgoChessman.before(new Coordinates(3,5));

        chessmanMap.put("white" , igoChessman);
        chessmanMap.put("black" , blackIgoChessman);
    }

    public static FlyweightFactory getInstance(){
        return SingleClazz.flyweightFactory;
    }

    public IgoChessman getIgoChessmanMap(String key){
        return chessmanMap.get(key);
    }
}