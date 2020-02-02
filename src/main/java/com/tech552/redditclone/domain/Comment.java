package com.tech552.redditclone.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by makerofapps on 2/2/20.
 */
@Entity
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String body;

    //MANY comments to ONE link |  //comments ->  private List<Comment> comments = new ArrayList<>();
    @ManyToOne
    private Link link;

}
