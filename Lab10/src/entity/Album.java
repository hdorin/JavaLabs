package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "albums")
public class Album implements Serializable {


    public Album(String albumName, String radiohead) {
        this.name = albumName;
    }

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


    @Id
    @Column(name = "ID")
    private int id;

    public Album() {
    }

    public Album(String albumName) {
        this.name = albumName;
    }

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "ARTIST_ID")
    private Integer artist_id = 58;

    @Basic
    @Column(name = "release_year")
    private Integer release_year = 100;

//
//    @OneToMany(mappedBy="artist", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//    private Set<Album> albums;


}
