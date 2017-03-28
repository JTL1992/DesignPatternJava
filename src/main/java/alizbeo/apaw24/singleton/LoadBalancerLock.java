package alizbeo.apaw24.singleton;

public class LoadBalancerLock {

    private static LoadBalancerLock instance = null;

    private LoadBalancerLock() {

    }

    public synchronized static LoadBalancerLock getInstance() {
        if (instance == null) {
            instance = new LoadBalancerLock();
        }
        return instance;
    }
}
