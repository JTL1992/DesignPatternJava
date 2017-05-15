package alizbeo.apaw24.prototype;

public class WeekLog implements Cloneable {

    private String name;

    private String date;

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    protected WeekLog clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (WeekLog) super.clone();
    }
}
