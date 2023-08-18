package NursesAssociationApplication;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue ("Exposition")
public class Exposition extends EventManagement {

private Long exposition;

    public Exposition(Long exposition) {
        this.exposition = exposition;
    }

    public Exposition( ) {

    }

    @Override
    public String toString( ) {
        return "Exposition{} " + super.toString ();
    }

    public Exposition(int data, int duration, String location, String title, String list) {
        super ( data, duration, location, title, list );
    }

    public void setExposition(Long exposition) {
        this.exposition = exposition;
    }

    public Long getExposition( ) {
        return exposition;
    }
}
