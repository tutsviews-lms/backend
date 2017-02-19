package tutsviews.lms.domain.enums;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */


public enum PlanType {

    BASIC(1,"Basic"),
    PRO(2,"Pro");

    private final int id;
    private final String namePlan;


    PlanType(int id, String namePlan) {
        this.id = id;
        this.namePlan = namePlan;
    }

    public int getId() {
        return id;
    }

    public String getNamePlan() {
        return namePlan;
    }
}