/**
 * original(c) zhuoyan company
 * projectName: java-design-pattern
 * fileName: IUserService.java
 * packageName: cn.zy.pattern.proxy.dynamic
 * date: 2018-12-18 21:49
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间        版本号             描述
 */
package cn.zy.pattern.proxy.dynamic;

/**
 * @version: V1.0
 * @author: ending
 * @className: IUserService
 * @packageName: cn.zy.pattern.proxy.dynamic
 * @description: 业务实现类
 * @data: 2018-12-18 21:49
 **/
public class IUserService implements UserService {

    @Override
    public String add() {
        System.out.println("添加用户成功");
        return "hello";
    }
}