package cora.ho.websitedesign_spring.repositories.introRepositories;

import cora.ho.websitedesign_spring.domian.aboutUs.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepo extends CrudRepository<Company, Long> {

    Company findByCompanyName(String companyName);
}
