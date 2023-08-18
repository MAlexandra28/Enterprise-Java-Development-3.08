package NursesAssociationApplication;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
@DiscriminatorValue("Conference")
public class Conference extends EventManagement {

    @ManyToMany
    private List<Speaker> speakers;
    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Conference( ) {

    }

    public List<Speaker> getSpeakers( ) {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}