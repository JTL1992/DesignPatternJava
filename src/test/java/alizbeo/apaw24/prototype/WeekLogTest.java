package alizbeo.apaw24.prototype;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeekLogTest {

    public WeekLog weekLog;

    @Before
    public void init() {
        weekLog = new WeekLog();
        weekLog.setContent("content");
        weekLog.setName("name");
        weekLog.setDate("5/15/2017");
    }

    @Test
    public void testClone() {
        try {
            WeekLog weekLogClone = weekLog.clone();
            assertEquals("content", weekLogClone.getContent());
            assertEquals("name", weekLogClone.getName());
            assertEquals("5/15/2017", weekLogClone.getDate());
            assertNotSame(weekLogClone, weekLog);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
