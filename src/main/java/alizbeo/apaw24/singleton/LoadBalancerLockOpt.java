package alizbeo.apaw24.singleton;

public class LoadBalancerLockOpt {

    private volatile static LoadBalancerLockOpt instance = null;

    private LoadBalancerLockOpt() {

    }

    public static LoadBalancerLockOpt getInstance() {
        if (instance == null) {
            synchronized (LoadBalancerLockOpt.class) {
                if (instance == null) {
                    instance = new LoadBalancerLockOpt();
                }
            }
        }
        return instance;
    }
}
