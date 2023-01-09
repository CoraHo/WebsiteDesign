package cora.ho.websitedesign_spring.services.introServices;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.repositories.introRepositories.CompanyRepo;
import cora.ho.websitedesign_spring.repositories.introRepositories.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private CompanyRepo companyRepo;

    public void addStaff() {
        Company company = companyRepo.findByCompanyName("NAMI");

        Staff chairman = new Staff("John", "Smith", "chairman", "Prof.Smith pursued his studies at the University of Liverpool, United Kingdom", company);
        Staff staff1 = new Staff("Kwan Ann", "Chor", "staff", "staff info", company);
        Staff staff2 = new Staff("Kwan Ann", "Chor", "staff", "staff info", company);
        Staff staff3 = new Staff("Kwan Ann", "Chor", "staff", "staff info", company);
        Staff staff4 = new Staff("Kwan Ann", "Chor", "staff", "staff info", company);
        Staff staff5 = new Staff("Kwan Ann", "Chor", "staff", "staff info", company);

        List<Staff> staffs = Arrays.asList(chairman, staff1, staff2, staff3, staff4, staff5);
        staffRepo.saveAll(staffs);
    }
    public List<Staff> findStaffForBoardOfDirector(String companyName) {
        Company company = companyRepo.findByCompanyName(companyName.toUpperCase());
        Long id = company.getId();
        List<Staff> allStaff = staffRepo.findAllByCompany_Id(id);
        List<Staff> staffOnBoard = new ArrayList<>();

        for (Staff s : allStaff) {
            if (s.getPosition().equals("chairman") || s.getPosition().equals("staff")) {
                staffOnBoard.add(s);
            }
        }
        return staffOnBoard;
    }
}
