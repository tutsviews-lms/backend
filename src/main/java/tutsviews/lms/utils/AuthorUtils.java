package tutsviews.lms.utils;

import java.util.Date;

import tutsviews.lms.domain.author.Address;
import tutsviews.lms.domain.author.Author;

/**
 * Created by ALadin Zaier PC IBS on 18/02/2017.
 */
public class AuthorUtils {

    private AuthorUtils() {
        throw new AssertionError("Non instansiable");
    }

    /**
     * Creates a basic user with basic address
     * @return
     */
    public static Author createBasicAuthor(){


        Address basicAddress = new Address();
        basicAddress.setStreet("Place de la comédie");
        basicAddress.setCity("Montpellier");
        basicAddress.setState("France");
        basicAddress.setZipCode("34000");

        Author basicAuthor = new Author();
        basicAuthor.setCreatedAt(new Date());
        basicAuthor.setLastName("Zaier");
        basicAuthor.setFirstName("Alaeddine");
        basicAuthor.setEmail("zaier.alaeddine@gmail.com");
        basicAuthor.setPassword("secret");

        basicAuthor.setAddress(basicAddress);
        basicAuthor.setDescription("Alaeddine is a great code author");
        basicAuthor.setTel("0606060606");

        return basicAuthor;

    }
}




//package com.devops.utils;
//
//        import com.devops.backend.persistence.domain.backend.User;
//
///**
// * Created by ALadin Zaier PC IBS on 07/02/2017.
// */
//public class UserUtils {
//
//    private UserUtils() {
//        throw new AssertionError("Non instansiable");
//    }
//
//
//    /**
//     * Create a user with basic attributes set
//     * @return
//     */
//    public static User createBasicUser(String userName, String email){
//
//        User user = new User();
//        user.setUsername(userName);
//        user.setPassword("secret");
//        user.setEmail(email);
//        user.setFirstName("Aladin");
//        user.setLastName("Zaier");
//        user.setPhoneNumber("0606060606");
//        user.setCountry("FR");
//        user.setEnabled(true);
//        user.setDescription("A basic user");
//        user.setProfileImageUrl("https://blabla.images.com/123");
//
//        return user;
//    }
//}
