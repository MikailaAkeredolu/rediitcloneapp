package com.tech552.redditclone.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by makerofapps on 2/2/20.
 */
@Entity
@Data
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;
    @NonNull
    private String url;

}
