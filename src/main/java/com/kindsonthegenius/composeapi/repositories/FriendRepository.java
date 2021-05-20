package com.kindsonthegenius.composeapi.repositories;

import com.kindsonthegenius.composeapi.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
