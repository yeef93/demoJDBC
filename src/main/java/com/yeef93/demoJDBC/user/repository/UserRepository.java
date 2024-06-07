package com.yeef93.demoJDBC.user.repository;

import com.yeef93.demoJDBC.user.entity.User;
import com.yeef93.demoJDBC.user.entity.rowmapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll(){
        String sql = "SELECT * FROM tbl_user";
        RowMapper<User> rowMapper = new UserRowMapper();
        return jdbcTemplate.query(sql,rowMapper).stream().toList();
    }

    public Optional<User> findById(Long id){
        String sql = "SELECT * FROM tbl_user where id= ?";
        return  jdbcTemplate.queryForList(sql, User.class).stream().findFirst();
    }

    public int save(User user){
        String sql = "INSERT INTO tbl_user (username, email, create_at) VALUES (?,?,NOW())";
        return jdbcTemplate.update(sql, user.getUsername(), user.getEmail());
    }

    public int update(User user){
        String sql = "UPDATE users SET username = ?, email =?, update_at =NOW() where id = ? ";
        return  jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getId());
    }

    public int deleteById(Long id){
        String sql = "DELETE FROM tbl_user where id = ?";
        return jdbcTemplate.update(sql,id);
    }


}
