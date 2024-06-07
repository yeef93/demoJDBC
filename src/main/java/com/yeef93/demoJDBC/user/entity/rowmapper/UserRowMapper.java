package com.yeef93.demoJDBC.user.entity.rowmapper;

import com.yeef93.demoJDBC.user.entity.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("username"));
        user.setEmail(rs.getString("email"));
        user.setSalt(rs.getString("salt"));
        user.setHash(rs.getString("hash"));
        user.setCreateAt(rs.getTimestamp("create_at"));
        user.setUpdateAt(rs.getTimestamp("update_at"));
        user.setDeleteAt(rs.getTimestamp("delete_at"));
        user.setIsFinishOnboarding(rs.getString("isfinish_onboarding").charAt(0));
        user.setPin(rs.getString("pin"));
        user.setLanguage(rs.getString("language"));
        user.setQuotes(rs.getString("quotes"));
        user.setProfilePict(rs.getString("profilepict"));
        return user;
    }
}
