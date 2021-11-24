package top.company.getters.pojo;

public class Letter {

    private long id;
    private String text;

    public Letter(long id, String text){
        this.id = id;
        this.text = text;
    }

    public long getId(){
        return id;
    }

    public String getText() {
        return text;
    }
}
