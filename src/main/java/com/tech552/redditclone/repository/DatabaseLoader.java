package com.tech552.redditclone.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by makerofapps on 2/2/20.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        //do some database work
        System.out.println("Database Loader .....");

    }
}
