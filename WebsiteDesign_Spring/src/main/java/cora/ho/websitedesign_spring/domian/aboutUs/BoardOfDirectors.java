package cora.ho.websitedesign_spring.domian.aboutUs;

import cora.ho.websitedesign_spring.domian.Staff;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BoardOfDirectors {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;
    private String chairMan;
    private String chairManInfo;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Staff> staffList;

    public BoardOfDirectors() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChairMan() {
        return chairMan;
    }

    public void setChairMan(String chairMan) {
        this.chairMan = chairMan;
    }

    public String getChairManInfo() {
        return chairManInfo;
    }

    public void setChairManInfo(String chairManInfo) {
        this.chairManInfo = chairManInfo;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> stafflist) {
        this.staffList = stafflist;
    }
}
