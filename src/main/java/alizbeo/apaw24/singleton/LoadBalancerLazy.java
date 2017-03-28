package alizbeo.apaw24.singleton;

public class LoadBalancerLazy {

    private static LoadBalancerLazy instance = null;

    private LoadBalancerLazy() {

    }

    public static LoadBalancerLazy getInstance() {
        if (instance == null) {
            instance = new LoadBalancerLazy();
        }
        return instance;
    }

}
