package com.yeef93.demoJDBC.user.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;

@Data
@Table("tbl_user")

public class User {
    @Id
    private Long id ;
    @Column("username")
    private String username;

    @Column("email")
    private String email;

    @Column("salt")
    private String salt;

    @Column("hash")
    private String hash;

    @Column("create_at")
    private Timestamp createAt;

    @Column("update_at")
    private Timestamp updateAt;

    @Column("delete_at")
    private Timestamp deleteAt;

    @Column("isfinish_onboarding")
    private char isFinishOnboarding;

    @Column("pin")
    private String pin;

    @Column("language")
    private String language;

    @Column("quotes")
    private String quotes;

    @Column("profilePict")
    private String profilePict;

}
