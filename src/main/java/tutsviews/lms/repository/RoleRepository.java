package tutsviews.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.util.Role;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role,Integer>{
}
