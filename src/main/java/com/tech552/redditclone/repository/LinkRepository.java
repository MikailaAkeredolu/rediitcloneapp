package com.tech552.redditclone.repository;

import com.tech552.redditclone.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by makerofapps on 2/2/20.
 */
public interface LinkRepository extends JpaRepository<Link, Long>{
}
