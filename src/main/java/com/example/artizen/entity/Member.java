package com.example.artizen.entity;

import com.example.artizen.util.TimeStamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Member extends TimeStamped {

    @Id
    private String id;

    @Column(nullable = false)
    private String nickname;

    private String profileImgUrl;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String age_range;

    private String location;

    @Column(nullable = false)
    private String authority;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Comment> commentList;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Heart> heartList;

}
