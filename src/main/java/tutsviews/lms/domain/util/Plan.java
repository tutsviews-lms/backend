package tutsviews.lms.domain.util;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
@Entity
public class Plan implements Serializable {

    /** The Serial Version of the Serializable classes. */
    private static final Long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;


    public Plan() {

    }

    /**
     *  Full Constructor
     * @param planEnum
     */
    public Plan(PlanEnum planEnum){
        this.id = planEnum.getId();
        this.name = planEnum.getNamePlan();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plan plan = (Plan) o;

        return id == plan.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
