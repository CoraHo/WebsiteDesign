package cora.ho.websitedesign_spring.web.introWeb;

import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import cora.ho.websitedesign_spring.services.introServices.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("webDesign/management")
public class ManagementController {

    @Autowired
    private StaffService staffService;

    @GetMapping("")
    public ResponseEntity<?> getTest() {
        return new ResponseEntity<>("management get ok", HttpStatus.OK);
    }

    @GetMapping("/{companyName}")
    public ResponseEntity<?> getManagementPage(@PathVariable String companyName) {
        staffService.addManagementStaff();
        List<Staff> staffForManagement = staffService.findStaffForManagement(companyName);
        return new ResponseEntity<>(staffForManagement, HttpStatus.OK);
    }
}
