package cora.ho.websitedesign_spring.web.introWeb;


import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
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
@RequestMapping("/webDesign/board_of_directors")
public class BoardOfDirectorsController {

    @Autowired
    private StaffService staffService;

    @GetMapping("")
    public ResponseEntity<?> getTest() {
        return new ResponseEntity<>("board get ok", HttpStatus.OK);
    }

    @GetMapping("/{companyName}")
    public ResponseEntity<?> getBoardPageStaff(@PathVariable String companyName) {
        List<Staff> staffForBoard = staffService.findStaffForBoardOfDirector(companyName);


        return new ResponseEntity<>(staffForBoard, HttpStatus.OK);
    }
}
