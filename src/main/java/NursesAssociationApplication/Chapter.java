package NursesAssociationApplication;

import jakarta.persistence.*;

@Table(name="Chapter")
public class Chapter {

    @Column(name = "name")
    private String name;

    @Column(name = "district")
    private int district;

    @Column(name = "president")
    private String president;

    @Column(name = "list")
    private String list;



    public Chapter(String name, int district, String president, String list) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.list = list;
    }



}
