package cora.ho.websitedesign_spring.web;


import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.services.CompanyService;
import cora.ho.websitedesign_spring.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/{companyName}")
public class CompanyInfoController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private StaffService staffService;

    @GetMapping("/about")
    public ResponseEntity<?> getCompanyByName(@PathVariable String companyName) {
        Company company = companyService.findCompanyByName(companyName);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @GetMapping("/board_of_directors")
    public ResponseEntity<?> getBoardStaff(@PathVariable String companyName) {
        List<Staff> staffForBoard = staffService.findStaffForBoardOfDirector(companyName);


        return new ResponseEntity<>(staffForBoard, HttpStatus.OK);
    }

    @GetMapping("/management")
    public ResponseEntity<?> getManagementPage(@PathVariable String companyName) {
        List<Staff> staffForManagement = staffService.findStaffForManagement(companyName);
        return new ResponseEntity<>(staffForManagement, HttpStatus.OK);
    }
}
