package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CD {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String title;

    @Column(length = 4)
    private String year;

    @Column(length = 50)
    private String artist;

    @Column
    Double price;

    public CD() {
    }

    public CD(String title, String year, String artist, Double price) {
        this.title = title;
        this.year = year;
        this.artist = artist;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
