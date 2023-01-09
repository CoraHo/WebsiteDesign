package cora.ho.websitedesign_spring.repositories.introRepositories;

import cora.ho.websitedesign_spring.domian.aboutUs.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepo extends CrudRepository<Staff, Long> {

    List<Staff> findAllByCompany_Id(Long id);
}
