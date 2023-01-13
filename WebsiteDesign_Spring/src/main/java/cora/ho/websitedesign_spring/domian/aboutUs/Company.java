package cora.ho.websitedesign_spring.domian.aboutUs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;


@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "The Company name cannot be empty!")
    @Column(updatable = false, unique = true)
    private String companyName;
    @NotBlank(message = "The Introduction cannot be empty!")
    private String introduction;
    @NotBlank(message = "The Mission cannot be empty!")
    private String mission;
    @NotBlank(message = "The Guiding Principles cannot be empty!")
    private String guidingPrinciples;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, orphanRemoval = true, mappedBy = "company")
    @JsonIgnore
    private List<Staff> allStaff;

    public Company() {
    }

    public Company(String companyName, String introduction, String mission, String guidingPrinciples) {
        this.companyName = companyName;
        this.introduction = introduction;
        this.mission = mission;
        this.guidingPrinciples = guidingPrinciples;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getGuidingPrinciples() {
        return guidingPrinciples;
    }

    public void setGuidingPrinciples(String guidingPrinciples) {
        this.guidingPrinciples = guidingPrinciples;
    }

    public List<Staff> getAllStaff() {
        return allStaff;
    }

    public void setAllStaff(List<Staff> allStaff) {
        this.allStaff = allStaff;
    }
}
