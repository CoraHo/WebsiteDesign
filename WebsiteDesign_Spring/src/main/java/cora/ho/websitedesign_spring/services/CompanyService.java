package cora.ho.websitedesign_spring.services;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import cora.ho.websitedesign_spring.exceptions.CompanyNameException;
import cora.ho.websitedesign_spring.exceptions.NotFoundException;
import cora.ho.websitedesign_spring.repositories.introRepositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    public Company addOrUpdateCompany(Company company) {
        try {
            company.setCompanyName(company.getCompanyName().toUpperCase());
            return companyRepo.save(company);
        }catch (Exception e) {
            throw new CompanyNameException("Company Name: " + company.getCompanyName() + " already exists.");
        }
    }

    public Company findCompanyByName(String companyName) {
        Company company = companyRepo.findByCompanyName(companyName.toUpperCase());
        if (company == null) {
            throw new NotFoundException("Company: " + companyName + " does not found.");
        }
        return company;
    }
}
