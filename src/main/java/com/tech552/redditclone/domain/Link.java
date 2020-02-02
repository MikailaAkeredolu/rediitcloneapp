package com.tech552.redditclone.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by makerofapps on 2/2/20.
 */
@Entity
//@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;
    @NonNull
    private String url;

    //ONE link to MANY comments | map it by link
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

}
