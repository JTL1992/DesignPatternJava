package alizbeo.apaw24.singleton;

public class LoadBalancerHungry {

    private static LoadBalancerHungry instance = new LoadBalancerHungry();

    private LoadBalancerHungry() {

    }

    public static LoadBalancerHungry getInstance() {
        return instance;
    }
}
