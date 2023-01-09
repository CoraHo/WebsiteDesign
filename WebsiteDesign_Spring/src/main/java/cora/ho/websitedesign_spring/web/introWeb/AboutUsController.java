package cora.ho.websitedesign_spring.web.introWeb;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.services.introServices.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("webDesign/about")
public class AboutUsController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("")
    public ResponseEntity<?> getTest() {
        return new ResponseEntity<>("routes works fine", HttpStatus.OK);
    }

    @GetMapping("/{companyName}")
    public ResponseEntity<?> getCompanyByName(@PathVariable String companyName) {
        companyService.addCompany();
        Company company = companyService.findCompanyByName(companyName);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

}
