package net.softengine.security.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SEC_GROUP")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @OneToMany
    private List<User> userList = new ArrayList<User>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
