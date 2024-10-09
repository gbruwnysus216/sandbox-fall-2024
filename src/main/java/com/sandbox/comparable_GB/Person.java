package com.sandbox.comparable_GB;


public class Person implements Comparable<Person> {
    private String firstName;
    private int age;
    private String lastName;

    // Constructors
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person that){

        int lastNameComparison = this.lastName.compareTo(that.lastName);
        if(lastNameComparison != 0){
            return lastNameComparison;
        }

        int firstNameComparison = this.firstName.compareTo(that.firstName);
        if(firstNameComparison != 0){
            return firstNameComparison;
        }

        return Integer.compare(this.age,that.age);
    }
}

