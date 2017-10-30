package com.netcracker.selyutin;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoImpl implements CourseDao {

    private final String FIND_ALL = "SELECT * FROM course";

    private final String GET_BY_ID = "SELECT * FROM course WHERE id=?";

    private final String INSERT = "INSERT INTO course (id, name, trainer_surname, trainer_name, trainer_patronymic, hour_count) VALUES (?,?,?,?,?,?)";

    private final String UPDATE = "UPDATE course SET name=?, trainer_surname=?, trainer_name=?, trainer_patronymic=?, hour_count=? WHERE id=?";

    private final String DELETE = "DELETE FROM course WHERE id=?";

    private CourseDaoImpl() {

    }

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        try (Connection connection = ConnectionDB.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
            while (resultSet.next()) {
                Course course = new Course();
                initCourse(course, resultSet);
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    @Override
    public Course findById(int id) {
        Course course = new Course();
        try {
            try (Connection connection = ConnectionDB.getInstance().getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
                preparedStatement.setInt(1, id);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        initCourse(course, resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return course;
    }

    @Override
    public void create(Course course) {
        try {
            try (Connection connection = ConnectionDB.getInstance().getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
                preparedStatement.setInt(1, course.getId());
                preparedStatement.setString(2, course.getName());
                preparedStatement.setString(3, course.getTrainerSurname());
                preparedStatement.setString(4, course.getTrainerName());
                preparedStatement.setString(5, course.getTrainerPatronymic());
                preparedStatement.setInt(6, course.getHourCount());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Course course) {
        try {
            try (Connection connection = ConnectionDB.getInstance().getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
                preparedStatement.setString(1, course.getName());
                preparedStatement.setString(2, course.getTrainerSurname());
                preparedStatement.setString(3, course.getTrainerName());
                preparedStatement.setString(4, course.getTrainerPatronymic());
                preparedStatement.setInt(5, course.getHourCount());
                preparedStatement.setInt(6, course.getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteById(int id) {
        try {
            try (Connection connection = ConnectionDB.getInstance().getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initCourse(Course course, ResultSet resultSet) throws SQLException {
        course.setId(resultSet.getInt("id"));
        course.setName(resultSet.getString("name"));
        course.setTrainerName(resultSet.getString("trainer_name"));
        course.setTrainerSurname(resultSet.getString("trainer_surname"));
        course.setTrainerPatronymic(resultSet.getString("trainer_patronymic"));
        course.setHourCount(resultSet.getInt("hour_count"));
    }

    private static class Holder {
        private final static CourseDaoImpl INSTANCE = new CourseDaoImpl();
    }

    public static CourseDaoImpl getInstance() {
        return Holder.INSTANCE;
    }

}
