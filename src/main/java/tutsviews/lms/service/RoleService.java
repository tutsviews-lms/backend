package tutsviews.lms.service;

import org.springframework.stereotype.Service;

import tutsviews.lms.domain.util.Role;

/**
 * Created by ALadin Zaier PC IBS on 18/02/2017.
 */
@Service
public interface RoleService {

    Role save (Role role);
}
