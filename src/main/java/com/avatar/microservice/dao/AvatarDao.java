package com.avatar.microservice.dao;

import com.avatar.microservice.model.Avatar;

import java.util.List;

public interface AvatarDao {

    public List<Avatar> findAll();

    public Avatar findById(int id);

    public Avatar save(Avatar avatar);

    public Avatar deleteOne(int id);

    public Avatar put(Avatar updatedAvatar, int id);
}
