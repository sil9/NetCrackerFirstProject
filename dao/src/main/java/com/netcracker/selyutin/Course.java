package com.netcracker.selyutin;


import java.util.Objects;

public class Course {

    private int id;
    private String name;
    private String trainerSurname;
    private String trainerName;
    private String trainerPatronymic;
    private int hourCount;

    public Course() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id &&
                hourCount == course.hourCount &&
                Objects.equals(name, course.name) &&
                Objects.equals(trainerSurname, course.trainerSurname) &&
                Objects.equals(trainerName, course.trainerName) &&
                Objects.equals(trainerPatronymic, course.trainerPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, trainerSurname, trainerName, trainerPatronymic, hourCount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerSurname() {
        return trainerSurname;
    }

    public void setTrainerSurname(String trainerSurname) {
        this.trainerSurname = trainerSurname;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerPatronymic() {
        return trainerPatronymic;
    }

    public void setTrainerPatronymic(String trainerPatronymic) {
        this.trainerPatronymic = trainerPatronymic;
    }

    public int getHourCount() {
        return hourCount;
    }

    public void setHourCount(int hourCount) {
        this.hourCount = hourCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", trainerSurname='").append(trainerSurname).append('\'');
        sb.append(", trainerName='").append(trainerName).append('\'');
        sb.append(", trainerPatronymic='").append(trainerPatronymic).append('\'');
        sb.append(", hourCount=").append(hourCount);
        sb.append('}');
        return sb.toString();
    }
}
