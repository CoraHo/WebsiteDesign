package cora.ho.websitedesign_spring.domian.aboutUs;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staff_id;
    @NotBlank(message = "Last name of staff cannot be empty!")
    private String lastName;
    @NotBlank(message = "First name of staff cannot be empty!")
    private String firstName;
    @NotBlank(message = "Position of staff cannot be empty!")
    private String position;
    @NotBlank(message = "Info of staff cannot be empty!")
    private String info;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", updatable = false)
    private Company company;

    public Staff() {
    }

    public Staff(String lastName, String firstName, String position, String info, Company company) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.info = info;
        this.company = company;
    }

    public long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(long staff_id) {
        this.staff_id = staff_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
