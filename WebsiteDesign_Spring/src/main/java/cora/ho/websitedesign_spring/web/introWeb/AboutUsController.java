package cora.ho.websitedesign_spring.web.introWeb;

import cora.ho.websitedesign_spring.domian.aboutUs.AboutUs;
import cora.ho.websitedesign_spring.services.introServices.AboutUsService;
import jakarta.validation.Valid;
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
    private AboutUsService aboutUsService;

    @GetMapping("")
    public ResponseEntity<?> getEmpty() {
        return new ResponseEntity<>("routes works fine", HttpStatus.OK);
    }

    @GetMapping("/{companyName}")
    public ResponseEntity<?> getAboutByName(@PathVariable String companyName) {
        aboutUsService.addAboutUs();
        AboutUs aboutUs = aboutUsService.fineAboutUsByName(companyName);
        return new ResponseEntity<>(aboutUs, HttpStatus.OK);
    }

}
