package petit.jochem.demo__orm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String naam;
    private String soort;

    public Beest() {
        //geen parameters is net zelfde als leeg

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }
}
