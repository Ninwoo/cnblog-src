package top.ninwoo.dao;

import top.ninwoo.entity.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void  setDataSource(DataSource dataSource);

    public void create(String name, Integer age, Integer marks, Integer year);

    public List<StudentMarks> listStudents();
}
