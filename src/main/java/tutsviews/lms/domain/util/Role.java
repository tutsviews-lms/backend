package tutsviews.lms.domain.util;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ALadin Zaier PC IBS on 17/02/2017.
 */
@Entity
public class Role implements Serializable{

    /** The Serial Version of the Serializable classes. */
    private static final Long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    public Role() {
    }

    public Role(RoleEnum roleEnum){
        this.id=roleEnum.getId();
        this.name=roleEnum.getName();
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

        Role role = (Role) o;

        return id == role.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
