package top.ninwoo.utils;

import org.springframework.jdbc.core.RowMapper;
import top.ninwoo.entity.StudentMarks;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMarksMapper implements RowMapper<StudentMarks> {
    public StudentMarks mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setAge(resultSet.getInt("age"));
        studentMarks.setId(resultSet.getInt("id"));
        studentMarks.setName(resultSet.getString("name"));
        studentMarks.setYear(resultSet.getInt("year"));
        studentMarks.setMarks(resultSet.getInt("marks"));

        return studentMarks;
    }
}
