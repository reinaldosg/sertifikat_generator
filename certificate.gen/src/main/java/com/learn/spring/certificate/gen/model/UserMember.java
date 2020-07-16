package com.learn.spring.certificate.gen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_MEMBER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMember {
    @Id
    @Column(name = "UUID_USER_MEMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int UuidUserMember;

    @Column(name = "FULL_NAME")
    private String FullName;

    @Column(name = "NICK_NAME")
    private String NickName;

    @Column(name = "LAST_LOGGED_IN")
    private Date LastLoggedIn;

    @Column(name = "CREATE_AT")
    private Date CreateAt;

    @Column(name = "UPDATE_AT")
    private Date UpdateAt;
}
