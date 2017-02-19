package tutsviews.lms.domain.enums;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
public enum RoleType {

    BASIC(1,"ROLE_BASIC"),
    PRO(2,"ROLE_PRO"),
    ADMIN(3,"ROLE_ADMIN");


    private final int id;
    private final String name;


    private RoleType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
