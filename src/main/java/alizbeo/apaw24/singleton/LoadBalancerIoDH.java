package alizbeo.apaw24.singleton;

public class LoadBalancerIoDH {

    private LoadBalancerIoDH() {
    }

    private static class Holder {
        private final static LoadBalancerIoDH instance = new LoadBalancerIoDH();
    }

    public static LoadBalancerIoDH getInstance() {
        return Holder.instance;
    }

}
