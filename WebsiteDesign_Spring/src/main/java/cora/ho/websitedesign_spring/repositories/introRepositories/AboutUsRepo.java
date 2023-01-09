package cora.ho.websitedesign_spring.repositories.introRepositories;

import cora.ho.websitedesign_spring.domian.aboutUs.AboutUs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AboutUsRepo extends CrudRepository<AboutUs, Long> {

    AboutUs findByCompanyName(String companyName);
}
