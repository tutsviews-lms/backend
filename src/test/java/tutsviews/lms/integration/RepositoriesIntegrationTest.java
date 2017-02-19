package tutsviews.lms.integration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.util.Plan;
import tutsviews.lms.domain.enums.PlanType;
import tutsviews.lms.domain.util.Role;
import tutsviews.lms.domain.enums.RoleType;
import tutsviews.lms.repository.AuthorRepository;
import tutsviews.lms.repository.PlanRepository;
import tutsviews.lms.repository.RoleRepository;
import tutsviews.lms.utils.AuthorUtils;

/**
 * Created by ALadin Zaier PC IBS on 18/02/2017.
 */
public class RepositoriesIntegrationTest extends AbstractTest{


    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Before
    public void init(){
        Assert.assertNotNull(authorRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(planRepository);

    }


    @Test
    public void test_create_new_plan(){

        Plan basicPlan = createBasicPlan(PlanType.BASIC);
        planRepository.save(basicPlan);
        Plan retrievedPlan = planRepository.findOne(PlanType.BASIC.getId());
        Assert.assertNotNull(retrievedPlan);

    }

    @Test
    public void test_create_new_role(){

        Role basicRole = createBasicRole(RoleType.BASIC);
        roleRepository.save(basicRole);
        Role retrievedRole = roleRepository.findOne(RoleType.BASIC.getId());
        Assert.assertNotNull(retrievedRole);

    }

    @Test
    public void createUser(){

        Author basicAuthor = AuthorUtils.createBasicAuthor();

        Plan plan = new Plan(PlanType.BASIC);
        planRepository.save(plan);

        basicAuthor.setPlan(plan);


        Role role = new Role(RoleType.BASIC);
        roleRepository.save(role);

        List<Role> roles = new ArrayList<>();
        roles.add(role);

        basicAuthor.setRoles(roles);

        authorRepository.save(basicAuthor);

        Author newlyCreatedUser = authorRepository.findOne(basicAuthor.getId());

        Assert.assertNotNull(newlyCreatedUser);
        Assert.assertNotNull(newlyCreatedUser.getId());

        Assert.assertNotNull(newlyCreatedUser.getPlan());
        Assert.assertNotNull(newlyCreatedUser.getPlan().getId());

        List<Role> newRoles = newlyCreatedUser.getRoles();

        for ( Role rolesElement : newRoles ) {
            Assert.assertNotNull(rolesElement);
            Assert.assertNotNull(rolesElement.getId());
        }


    }







//    private methods


/* Private methods */

    private Plan createBasicPlan(PlanType planEnum){
        return new Plan(planEnum);
    }

    private Role createBasicRole(RoleType roleEnum){
        return new Role(roleEnum);
    }


}
