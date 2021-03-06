package com.tech552.redditclone.controller;

import com.tech552.redditclone.domain.Link;
import com.tech552.redditclone.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by makerofapps on 2/2/20.
 */
@RestController
@RequestMapping("/links")
public class LinkController {

    LinkRepository linkRepository;

    //Constructor based DI
    public LinkController(LinkRepository linkRepository){
        this.linkRepository = linkRepository;
    }

    // list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    // CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
            linkRepository.deleteById(id);
    }
}
