package fr.steve.demo.entity;

public class Address {

    private int number;
    private String road;
    private String city;
    private int zipCode;
    private String land;

    public Address(int number, String road, String city, int zipCode, String land) {
        this.number = number;
        this.road = road;
        this.city = city;
        this.zipCode = zipCode;
        this.land = land;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoad() {
        return this.road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getLand() {
        return this.land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
