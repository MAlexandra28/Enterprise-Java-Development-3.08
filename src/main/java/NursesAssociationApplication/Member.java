package NursesAssociationApplication;
import jakarta.persistence.*;
import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String  status;
    private LocalDate renwaldate;
    @ManyToOne
    private Chapter chapter;

    public Member(Long id, String name, String status, LocalDate renwaldate, Chapter chapter) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renwaldate = renwaldate;
        this.chapter = chapter;
    }

    public Member( ) {

    }


    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus( ) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getRenwaldate( ) {
        return renwaldate;
    }

    public void setRenwaldate(LocalDate renwaldate) {
        this.renwaldate = renwaldate;
    }

}

