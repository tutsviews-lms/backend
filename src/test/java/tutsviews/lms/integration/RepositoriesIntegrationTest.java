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
import tutsviews.lms.domain.util.PlanEnum;
import tutsviews.lms.domain.util.Role;
import tutsviews.lms.domain.util.RoleEnum;
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

        Plan basicPlan = createBasicPlan(PlanEnum.BASIC);
        planRepository.save(basicPlan);
        Plan retrievedPlan = planRepository.findOne(PlanEnum.BASIC.getId());
        Assert.assertNotNull(retrievedPlan);

    }

    @Test
    public void test_create_new_role(){

        Role basicRole = createBasicRole(RoleEnum.BASIC);
        roleRepository.save(basicRole);
        Role retrievedRole = roleRepository.findOne(RoleEnum.BASIC.getId());
        Assert.assertNotNull(retrievedRole);

    }

    @Test
    public void createUser(){

        Author basicAuthor = AuthorUtils.createBasicAuthor();

        Plan plan = new Plan(PlanEnum.BASIC);
        planRepository.save(plan);

        basicAuthor.setPlan(plan);


        Role role = new Role(RoleEnum.BASIC);
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

    private Plan createBasicPlan(PlanEnum planEnum){
        return new Plan(planEnum);
    }

    private Role createBasicRole(RoleEnum roleEnum){
        return new Role(roleEnum);
    }


}
