package designpattern.strategy.implementation;

public class CashSuperImplNormal extends CashSuper {
    @Override
    void algorithmInterface() {
        System.out.println("正常收费");
    }
}
