package com.avatar.microservice.dao;

import com.avatar.microservice.model.Avatar;

import java.util.List;
import java.util.Optional;

public interface AvatarDao {

    public List<Avatar> findAll();

    public Optional<Avatar> findById(int id);

    public int save(Avatar avatar);

    public int deleteOne(int id);

    public int put(Avatar updatedAvatar, int id);

}
