package net.softengine.security.model;

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
@Table(name = "SEC_TOKEN")
public class Token implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String userName;

    private String password;

    @OneToOne(mappedBy = "token")
    private User user;
}
