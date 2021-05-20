package com.kindsonthegenius.composeapi.services;

import com.kindsonthegenius.composeapi.models.Friend;
import com.kindsonthegenius.composeapi.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendRepository friendRepository;

    public  List<Friend> findAll(){
        return friendRepository.findAll();
    }
}
