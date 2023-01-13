package cora.ho.websitedesign_spring.services;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.exceptions.NotFoundException;
import cora.ho.websitedesign_spring.repositories.introRepositories.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StaffService {

    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private CompanyService companyService;

    public Staff addOrUpdateStaff(String companyName, Staff staff) {
        staff.setPosition(staff.getPosition().toLowerCase());
        Company company = companyService.findCompanyByName(companyName.toUpperCase());
        staff.setCompany(company);
        return staffRepo.save(staff);
    }

    public List<Staff> findStaffForBoardOfDirector(String companyName) {
        Company company = companyService.findCompanyByName(companyName.toUpperCase());
        Long id = company.getId();
        List<Staff> allStaff = staffRepo.findAllByCompany_Id(id);
        List<Staff> staffOnBoard = new ArrayList<>();

        for (Staff s : allStaff) {
            if (s.getPosition().equals("chairman") || s.getPosition().equals("staff")) {
                staffOnBoard.add(s);
            }
        }
        if (staffOnBoard.size() == 0) {
            throw new NotFoundException("Staff for Board of Directors does not found.");
        }
        return staffOnBoard;
    }

    public List<Staff> findStaffForManagement(String companyName) {
        Company company = companyService.findCompanyByName(companyName.toUpperCase());

        Long id = company.getId();
        List<Staff> allStaff = staffRepo.findAllByCompany_Id(id);
        List<Staff> staffOnManagement = new ArrayList<>();

        for (Staff s : allStaff) {
            String position = s.getPosition();
            if (position.contains("chief")) {
                staffOnManagement.add(s);
            }
        }
        if (staffOnManagement.size() == 0) {
            throw new NotFoundException("Staff for Management does not found.");
        }
        return staffOnManagement;
    }
}
