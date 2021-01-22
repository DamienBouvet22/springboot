package com.avatar.microservice.dao;

import com.avatar.microservice.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AvatarDao extends JpaRepository<Avatar, Integer> {

    Avatar findById(int id);

//
//    public int save(Avatar avatar);
//
//    public int deleteOne(int id);
//
//    public int put(Avatar updatedAvatar, int id);

}
