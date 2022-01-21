package Entities;

import java.time.LocalDate;

public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String nationaltyId;

    public Player(){}

    public Player(int id, String firstName, String lastName, int birthOfYear, String nationaltyId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.nationaltyId = nationaltyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfDate() {
        return birthOfYear;
    }

    public void setBirthOfDate(int birthOfDate) {
        this.birthOfYear = birthOfYear;
    }

    public String getNationaltyId() {
        return nationaltyId;
    }

    public void setNationaltyId(String nationaltyId) {
        this.nationaltyId = nationaltyId;
    }
}
