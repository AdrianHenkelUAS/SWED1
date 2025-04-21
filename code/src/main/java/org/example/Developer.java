package org.example;

public class Developer {
    private String name;
    private int age;
    private String gender;
    private int experienceInYears;
    private String mainProgrLanguage;

    public Developer(String name, int age, String gender, int experienceInYears, String mainProgrLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experienceInYears = experienceInYears;
        this.mainProgrLanguage = mainProgrLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) return;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty()) return;
        if (!(gender.equals("male") || gender.equals("female"))) return;
        this.gender = gender;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        if (experienceInYears < 0 || experienceInYears > 80) return;
        this.experienceInYears = experienceInYears;
    }

    public String getMainProgrLanguage() {
        return mainProgrLanguage;
    }

    public void setMainProgrLanguage(String mainProgrLanguage) {
        if (mainProgrLanguage.trim().isEmpty()) return;
        this.mainProgrLanguage = mainProgrLanguage;
    }
}
