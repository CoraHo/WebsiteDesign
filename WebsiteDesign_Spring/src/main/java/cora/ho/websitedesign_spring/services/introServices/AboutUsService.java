package cora.ho.websitedesign_spring.services.introServices;

import cora.ho.websitedesign_spring.domian.aboutUs.AboutUs;
import cora.ho.websitedesign_spring.repositories.introRepositories.AboutUsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AboutUsService {

    @Autowired
    private AboutUsRepo aboutUsRepo;

    public AboutUs addAboutUs() {

        AboutUs aboutUs1 = new AboutUs();
        aboutUs1.setCompanyName("NAMI");
        aboutUs1.setIntroduction("NAMI, incorporated in 2006 as a subsidiary of the Hong Kong University of Science and Technology, is designated by the Innovation and Technology Commission of the Hong Kong Government.");
        aboutUs1.setMission("Act as the focal point for conducting market-driven, demand-led R&D in nanotechnology and advanced materials for technology upgrading of the industry and commercialization");
        aboutUs1.setGuidingPrinciples("Cultivate technology research talents to create innovative materials");
        return aboutUsRepo.save(aboutUs1);
    }

    public AboutUs fineAboutUsByName(String companyName) {
        return aboutUsRepo.findByCompanyName(companyName);
    }
}
