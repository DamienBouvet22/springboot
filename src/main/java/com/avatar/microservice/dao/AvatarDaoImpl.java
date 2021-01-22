//package com.avatar.microservice.dao;
//
//import com.avatar.microservice.model.Avatar;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//
//@Repository
//public class AvatarDaoImpl implements AvatarDao{
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public List<Avatar> findAll() {
//        return jdbcTemplate.query(
//                "select * from Avatars",
//                (rs, rowNum) ->
//                        new Avatar(
//                                rs.getInt("id"),
//                                rs.getString("name"),
//                                rs.getString("type")
//                        )
//        );
//    }
//
//    @Override
//    public Optional<Avatar> findById(int id) {
//        return jdbcTemplate.queryForObject(
//                "select * from Avatars where id = ?",
//                new Object[]{id},
//                (rs, rowNum) ->
//                        Optional.of(new Avatar(
//                                rs.getInt("id"),
//                                rs.getString("name"),
//                                rs.getString("type")
//                        ))
//        );
//    }
//
//    @Override
//    public int save(Avatar avatar) {
//        return jdbcTemplate.update(
//                "insert into Avatars (name, type) values(?,?)",
//                avatar.getName(), avatar.getType());
//    }
//
//    @Override
//    public int deleteOne(int id) {
//        return jdbcTemplate.update(
//                "delete from Avatars where id = ?",
//                id);
//    }
//
//    @Override
//    public int put(Avatar updatedAvatar, int id) {
//        return jdbcTemplate.update(
//                "update Avatars set name = ?, type = ? where id = ?",
//                updatedAvatar.getName(), updatedAvatar.getType(), id);
//    }
//}
