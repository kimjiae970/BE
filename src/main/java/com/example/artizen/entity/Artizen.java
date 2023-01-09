package com.example.artizen.entity;

import com.example.artizen.util.TimeStamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Artizen extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String posterUrl;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String content;

    @Column(nullable = false)
    private String staff;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String category;

    private String tag;

    @Column(nullable = false)
    private String status;

    private String location;

    @OneToMany(mappedBy = "artizen",cascade = CascadeType.REMOVE)
    private List<Image> imageList;

    @OneToMany(mappedBy = "artizen",cascade = CascadeType.REMOVE)
    private List<Time> timeList;

    @OneToMany(mappedBy = "artizen",cascade = CascadeType.REMOVE)
    private List<Heart> heartList;

    @OneToMany(mappedBy = "artizen",cascade = CascadeType.REMOVE)
    private List<Comment> commentList;

}
