package com.kindsonthegenius.composeapi.controllers;

import com.kindsonthegenius.composeapi.models.Friend;
import com.kindsonthegenius.composeapi.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {

    @Autowired
    private FriendService friendService;

    @GetMapping("/friends")
    private List<Friend> findAll(){
        return friendService.findAll();
    }
}

