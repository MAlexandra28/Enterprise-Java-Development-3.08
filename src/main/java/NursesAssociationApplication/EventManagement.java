package NursesAssociationApplication;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class EventManagement {

    @Column(name = "data")
    private int data;

    @Column(name = "duration")
    private int duration;

    @Column(name = "location")
    private String location;

    @Column(name = "title")
    private String title;

    @Column(name = "list")
    private String list;
    @Id
    private Long id;

    public EventManagement(int data, int duration, String location, String title, String list) {
        this.data = data;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.list = list;
    }
    public EventManagement(){

    }
    public int getData( ) {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDuration( ) {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation( ) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle( ) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getList( ) {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId( ) {
        return id;
    }
}
