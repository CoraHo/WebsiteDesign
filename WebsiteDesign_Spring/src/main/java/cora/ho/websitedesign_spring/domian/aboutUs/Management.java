package cora.ho.websitedesign_spring.domian.aboutUs;

import cora.ho.websitedesign_spring.domian.Staff;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Management {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id", nullable = false)
    private long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Staff> staffList;


    public Management() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
