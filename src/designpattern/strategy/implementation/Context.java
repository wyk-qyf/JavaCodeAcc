package designpattern.strategy.implementation;


/**
 * 上下文
 *
 * @author liu yuning
 */
public class Context {
    CashSuper cashSuper;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                this.cashSuper = new CashSuperImplNormal();
                break;
            case "满300返100":
                this.cashSuper = new CashSuperImplReturn();
                break;
            case "打8折":
                this.cashSuper = new CashSuperImplRebate();
                break;
        }
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        cashSuper.algorithmInterface();
    }

}