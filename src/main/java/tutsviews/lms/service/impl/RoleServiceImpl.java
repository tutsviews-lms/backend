package tutsviews.lms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutsviews.lms.domain.util.Role;
import tutsviews.lms.repository.RoleRepository;
import tutsviews.lms.service.RoleService;

/**
 * Created by ALadin Zaier PC IBS on 18/02/2017.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
