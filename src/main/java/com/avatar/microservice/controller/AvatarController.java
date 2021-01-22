package com.avatar.microservice.controller;

import com.avatar.microservice.dao.AvatarDao;
import com.avatar.microservice.model.Avatar;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AvatarController {

    @Autowired
    private AvatarDao avatarDao;

    //Get Avatars
    @Operation(summary = "Get a list of avatars")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the avatar",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Avatar.class)) }),
            @ApiResponse(responseCode = "404", description = "List of avatars not found",
                    content = @Content) })
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
    public void deleteOne(Avatar avatar) {
        avatarDao.delete(avatar);
    }

    //Put Avatar
    @PutMapping("/Avatar")
    public void put(@RequestBody Avatar avatar) {
        avatarDao.save(avatar);
    }

    //Get Avatar by Id
    @GetMapping(value = "Avatar/{id}")
    public Avatar displayAvatar(@PathVariable int id) {
        return avatarDao.findById(id);
    }
}
