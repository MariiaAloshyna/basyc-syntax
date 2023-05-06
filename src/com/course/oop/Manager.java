package com.course.oop;

public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String firstName, String lastName, RoleType roleType, String email, String position) {
        super();
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("Position: " + position);
        System.out.println("Responsibility District: " + responsibilityDistrict);
        System.out.println("Work Phone Number: " + workPhoneNumber);
    }
}
