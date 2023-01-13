package cora.ho.websitedesign_spring.services;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.exceptions.CompanyNotFoundException;
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

    public Staff addOrUpdateStaff(String companyName, Staff staff) {
        Company company = companyRepo.findByCompanyName(companyName);
        if (company == null) {
            throw new CompanyNotFoundException("Company: " + companyName + " does not found.");
        }
        staff.setCompany(company);
        return staffRepo.save(staff);
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

    public List<Staff> findStaffForManagement(String companyName) {
        Company company = companyRepo.findByCompanyName(companyName.toUpperCase());

        Long id = company.getId();
        List<Staff> allStaff = staffRepo.findAllByCompany_Id(id);
        List<Staff> staffOnManagement = new ArrayList<>();

        for (Staff s : allStaff) {
            String position = s.getPosition();
            if (position.contains("chief")) {
                staffOnManagement.add(s);
            }
        }
        return staffOnManagement;
    }
}
