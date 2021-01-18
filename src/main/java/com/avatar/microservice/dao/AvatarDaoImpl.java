package com.avatar.microservice.dao;

import com.avatar.microservice.model.Avatar;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AvatarDaoImpl implements AvatarDao{

    public static List<Avatar> avatars = new ArrayList<>();

    static {
        avatars.add(new Avatar(1, "Darth Vader", "Sith"));
        avatars.add(new Avatar(2, "Luke Skywalker", "Jedi"));
        avatars.add(new Avatar(3, "Chewbacca", "Wookie"));
    }

    @Override
    public List<Avatar> findAll() {
        return avatars;
    }

    @Override
    public Avatar findById(int id) {
        for (Avatar avatar : avatars) {
            if (avatar.getId() == id) {
                return avatar;
            }
        }
        return null;
    }

    @Override
    public Avatar save(Avatar avatar) {
        avatars.add(avatar);
        return avatar;
    }

    @Override
    public Avatar deleteOne(int id) {
        for (Avatar avatar : avatars) {
            if (avatar.getId() == id) {
                avatars.remove(avatar);
                return avatar;
            }
        }
        return null;
    }

    @Override
    public Avatar put(Avatar updatedAvatar, int id) {
        for (Avatar avatar : avatars) {
            if (avatar.getId() == id) {
                avatar.setName(updatedAvatar.getName());
                avatar.setType(updatedAvatar.getType());
                return avatar;
            }
        }
        return null;
    }

}
