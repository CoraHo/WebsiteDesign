package cora.ho.websitedesign_spring.domian;

import cora.ho.websitedesign_spring.domian.aboutUs.AboutUs;
import cora.ho.websitedesign_spring.domian.aboutUs.BoardOfDirectors;
import cora.ho.websitedesign_spring.domian.aboutUs.Management;
import jakarta.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long staff_id;

    private String fullName;

    private String position;

    private String info;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="boardOfDirectors_id", updatable = false, nullable = false)
    private BoardOfDirectors boardOfDirectors;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="management_id", updatable = false, nullable = false)
    private Management management;

    public Staff() {
    }

    public long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(long staff_id) {
        this.staff_id = staff_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public BoardOfDirectors getBoardOfDirectors() {
        return boardOfDirectors;
    }

    public void setBoardOfDirectors(BoardOfDirectors boardOfDirectors) {
        this.boardOfDirectors = boardOfDirectors;
    }
}
