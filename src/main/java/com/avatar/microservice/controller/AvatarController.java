package com.avatar.microservice.controller;

import com.avatar.microservice.dao.AvatarDao;
import com.avatar.microservice.model.Avatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AvatarController {

    @Autowired
    private AvatarDao avatarDao;

    //Get Avatar
    @GetMapping(value = "Avatar")
    public List<Avatar> avatarsList() {
        return avatarDao.findAll();
    }

    //Post Avatar
    @PostMapping(value = "Avatar")
    public void addAvatar(@RequestBody Avatar avatar) {
        avatarDao.save(avatar);
    }

    //Delete Avatar
    @DeleteMapping(value = "Avatar/{id}")
    public Avatar deleteOne(@PathVariable int id) {
        return avatarDao.deleteOne(id);
    }

    //Put Avatar
    @PutMapping("/Avatar/{id}")
    public Avatar put(@RequestBody Avatar updatedAvatar, @PathVariable int id) {
        return avatarDao.put(updatedAvatar, id);
    }

    //Avatar/{id}
    @GetMapping(value = "Avatar/{id}")
    public Avatar displayAvatar(@PathVariable int id) {
        return avatarDao.findById(id);
    }
}
