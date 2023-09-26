package com.amit.annualScienceFair.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.amit.annualScienceFair.model.LogIn;
import com.amit.annualScienceFair.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplete(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean registerUser(User user) {

		String sql = "INSERT INTO SCIENCE_FAIR_REG VALUES(?,?,?,?,?,?)";

		int rowUpdate = jdbcTemplate.update(sql, new Object[] { user.getStudentId(), user.getUniversityName(),
				user.getStudentName(), user.getProjectArea(), user.getEmail(), Objects.hash(user.getPassword()) });

		return rowUpdate > 0;
	}

	@Override
	public User userLogin(LogIn login) {

		String sql = "SELECT * FROM SCIENCE_FAIR_REG WHERE STUDENT_ID= " + login.getStudentId() + "AND PASSWORD = '"
				+ Objects.hash(login.getPassword()) + "'";

		List<User> user = jdbcTemplate.query(sql, new UserMapper());

		return user.size() > 0 ? user.get(0) : null;
	}

	private static class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setStudentId(rs.getInt(1));
			user.setUniversityName(rs.getString(2));
			user.setStudentName(rs.getString(3));
			user.setProjectArea(rs.getString(4));
			user.setEmail(rs.getString(5));
			user.setPassword(rs.getString(6));

			return user;
		}

	}

	@Override
	public boolean doesEmailExist(String email) {
		String sql = "SELECT EMAIL FROM SCIENCE_FAIR_REG";
		List<String> mail = jdbcTemplate.queryForList(sql, String.class);

		for (String retrivedEmail : mail) {

			if (retrivedEmail.toLowerCase().equals(email.toLowerCase())) {

				return true;

			}
		}

		return false;
	}

	@Override
	public boolean doesIdExist(int id) {

		String sql = "SELECT STUDENT_ID FROM SCIENCE_FAIR_REG";
		List<Integer> ids = jdbcTemplate.queryForList(sql, Integer.class);

		for (Integer retrivedIds : ids) {

			if (retrivedIds.equals(id)) {

				return true;

			}
		}
		
		return false;
	}

}
