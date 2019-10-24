package designpattern.strategy.implementation;

public class CashSuperImplReturn extends CashSuper {
    @Override
    void algorithmInterface() {
        System.out.println("满300返100");
    }
}
