package driver;

import jdk.jfr.Category;

import java.util.Locale;

public abstract class Driver <C extends Category> {

    private String name;
    private boolean hasDriverLicence;
    private int experienceInYears;
    private C category;

    public Driver(String name, boolean hasDriverLicence, int experienceInYears) {
        this.name = name;
        this.hasDriverLicence = hasDriverLicence;
        this.experienceInYears = experienceInYears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public abstract void startMove();

    public abstract void finischMove();

    public abstract void refill();

    @Override
    public String toString() {
        return name + " стаж вождения" + experienceInYears + " лет категория" + category;

    }
}





