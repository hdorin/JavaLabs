package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artists")
public class Artist implements Serializable {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Id
    @Column(name = "ID")
    private int id;

    public Artist() {}
    public Artist(String artistName, String country) {
        this.name = artistName;
        this.country = country;
    }

    @Basic
    @Column(name="NAME")
    private String name;

    @Basic
    @Column(name="COUNTRY")
    private String country;
//
//    @OneToMany(mappedBy="artist", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//    private Set<Album> albums;


}