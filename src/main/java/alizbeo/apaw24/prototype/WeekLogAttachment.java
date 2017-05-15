package alizbeo.apaw24.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class WeekLogAttachment implements Serializable {

    private String name;

    private String date;

    private String content;

    private Attachment attachment;

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    protected WeekLogAttachment deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        WeekLogAttachment weekLogAttachment = (WeekLogAttachment) ois.readObject();
        return weekLogAttachment;
    }
}
