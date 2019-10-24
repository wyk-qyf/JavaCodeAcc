package designpattern.strategy.implementation;

/**
 * 客户端使用策略
 *
 * @author liu yuning
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        String type = "打8折";
        context = new Context(type);
        context.contextInterface();
    }
}
