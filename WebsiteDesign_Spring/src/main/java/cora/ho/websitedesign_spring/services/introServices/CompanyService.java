package cora.ho.websitedesign_spring.services.introServices;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.repositories.introRepositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    public Company addCompany() {

        Company company1 = new Company();
        company1.setCompanyName("NAMI");
        company1.setIntroduction("NAMI, incorporated in 2006 as a subsidiary of the Hong Kong University of Science and Technology, is designated by the Innovation and Technology Commission of the Hong Kong Government.");
        company1.setMission("Act as the focal point for conducting market-driven, demand-led R&D in nanotechnology and advanced materials for technology upgrading of the industry and commercialization");
        company1.setGuidingPrinciples("Cultivate technology research talents to create innovative materials");
        return companyRepo.save(company1);
    }

    public Company findCompanyByName(String companyName) {
        return companyRepo.findByCompanyName(companyName);
    }
}
