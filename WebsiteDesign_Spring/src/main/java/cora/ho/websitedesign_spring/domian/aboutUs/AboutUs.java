package cora.ho.websitedesign_spring.domian.aboutUs;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
public class AboutUs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "The Company name cannot be enpty!")
    private String companyName;
    @NotBlank(message = "The Introduction cannot be empty!")
    private String introduction;
    @NotBlank(message = "The Mission cannot be empty!")
    private String mission;
    @NotBlank(message = "The Guiding Principles cannot be empty!")
    private String guidingPrinciples;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AboutUs() {
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
}
