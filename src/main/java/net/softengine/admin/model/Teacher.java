package net.softengine.admin.model;

import net.softengine.security.model.User;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */



@Entity
@DiscriminatorValue("teacher")
public class Teacher extends User implements Serializable {

    private String type;

    private String designation;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
