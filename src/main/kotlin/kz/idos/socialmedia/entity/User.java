package kz.idos.socialmedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntityAudit {

    @Column
    private String userName;

    @Column
    private String email;
}
