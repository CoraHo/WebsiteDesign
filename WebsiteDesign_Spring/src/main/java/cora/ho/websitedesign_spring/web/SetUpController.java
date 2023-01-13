package cora.ho.websitedesign_spring.web;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.services.CompanyService;
import cora.ho.websitedesign_spring.services.InputValidationService;
import cora.ho.websitedesign_spring.services.StaffService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setup")
public class SetUpController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private InputValidationService inputValidationService;

    @PostMapping("/company")
    public ResponseEntity<?> setUpCompanyInfo(@Valid @RequestBody Company company, BindingResult result) {
        ResponseEntity<?> errorMap = inputValidationService.InputValidation(result);
        if (errorMap != null) {
            return errorMap;
        }
        Company company1 = companyService.addOrUpdateCompany(company);
        return new ResponseEntity<>(company1, HttpStatus.CREATED);
    }

    @PostMapping("/staff/{companyName}")
    public ResponseEntity<?> setUpAllStaff(@Valid @RequestBody Staff staff, BindingResult result, @PathVariable String companyName) {
        ResponseEntity<?> errorMap = inputValidationService.InputValidation(result);
        if (errorMap != null) {
            return errorMap;
        }

        Staff staff1 = staffService.addOrUpdateStaff(companyName, staff);
        return new ResponseEntity<>(staff1, HttpStatus.CREATED);
    }

}
