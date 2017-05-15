package alizbeo.apaw24.prototype;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.OptionalDataException;

import org.junit.Before;
import org.junit.Test;

public class WeekLogAttachmentTest {

    private WeekLogAttachment weekLogAttachment;

    @Before
    public void init() {
        weekLogAttachment = new WeekLogAttachment();
        weekLogAttachment.setName("week log with attachment");
        weekLogAttachment.setContent("content");
        weekLogAttachment.setDate("5/15/2017");
        Attachment attachment = new Attachment();
        attachment.setName("i am attachment");
        weekLogAttachment.setAttachment(attachment);
    }

    @Test
    public void testDeepClone() throws OptionalDataException, ClassNotFoundException, IOException {
        WeekLogAttachment weekLogDeepClone = weekLogAttachment.deepClone();
        assertEquals(weekLogDeepClone.getName(), weekLogAttachment.getName());
        assertEquals(weekLogDeepClone.getContent(), weekLogAttachment.getContent());
        assertEquals(weekLogDeepClone.getDate(), weekLogAttachment.getDate());
        assertNotSame(weekLogDeepClone, weekLogAttachment);
        assertEquals(weekLogDeepClone.getAttachment().getName(), weekLogAttachment.getAttachment().getName());
        assertNotEquals(weekLogDeepClone.getAttachment(), weekLogAttachment.getAttachment());
    }
}
