package com.netcracker.homework2;


public class Car {
    private Integer id;
    private String name;
    private Double weight;
    private Integer speed;

    public Car() {
    }

    public Car(Integer id, String name, Double weight, Integer speed) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (weight != null ? !weight.equals(car.weight) : car.weight != null) return false;
        return speed != null ? speed.equals(car.speed) : car.speed == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }
}
