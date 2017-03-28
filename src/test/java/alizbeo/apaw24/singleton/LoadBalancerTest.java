package alizbeo.apaw24.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoadBalancerTest {

    private final static long NUM = 100000000;

    private LoadBalancerLock loadBalancerLock = null;

    private LoadBalancerLazy loadBalancerLazy = null;

    private LoadBalancerLockOpt loadBalancerLockOpt = null;

    private LoadBalancerHungry loadBalancerHungry = null;

    private LoadBalancerIoDH loadBalancerIoDH = null;

    @Before
    public void init() {
        loadBalancerLock = LoadBalancerLock.getInstance();
        loadBalancerLazy = LoadBalancerLazy.getInstance();
        loadBalancerLockOpt = LoadBalancerLockOpt.getInstance();
        loadBalancerHungry = LoadBalancerHungry.getInstance();
        loadBalancerIoDH = LoadBalancerIoDH.getInstance();
    }

    @Test
    public void testSingleton() {
        assertEquals(loadBalancerHungry, LoadBalancerHungry.getInstance());
        assertEquals(loadBalancerIoDH, LoadBalancerIoDH.getInstance());
        assertEquals(loadBalancerLazy, LoadBalancerLazy.getInstance());
        assertEquals(loadBalancerLock, LoadBalancerLock.getInstance());
        assertEquals(loadBalancerLockOpt, LoadBalancerLockOpt.getInstance());
    }

    @Test
    public void testHungryCreationSpeed() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < NUM; i++) {
            loadBalancerHungry = LoadBalancerHungry.getInstance();
        }
        long time = (System.currentTimeMillis() - now) / 1000;
        System.out.println("<----------Hungry use seconds: " + time + "---------->");
    }

    @Test
    public void testIoDHCreationSpeed() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < NUM; i++) {
            loadBalancerIoDH = LoadBalancerIoDH.getInstance();
        }
        long time = (System.currentTimeMillis() - now);
        System.out.println("<----------IoDH use seconds: " + time + "---------->");
    }

    @Test
    public void testLazyCreationSpeed() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < NUM; i++) {
            loadBalancerLazy = LoadBalancerLazy.getInstance();
        }
        long time = (System.currentTimeMillis() - now);
        System.out.println("<----------Lazy use seconds: " + time + "---------->");
    }

    @Test
    public void testLockCreationSpeed() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < NUM; i++) {
            loadBalancerLock = LoadBalancerLock.getInstance();
        }
        long time = (System.currentTimeMillis() - now);
        System.out.println("<----------Lock use seconds: " + time + "---------->");
    }

    @Test
    public void testLockProCreationSpeed() {
        long now = System.currentTimeMillis();
        for (int i = 0; i < NUM; i++) {
            loadBalancerLockOpt = LoadBalancerLockOpt.getInstance();
        }
        long time = (System.currentTimeMillis() - now);
        System.out.println("<----------Lock pro use seconds: " + time + "---------->");
    }

}
