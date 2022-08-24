package ss00_case_study.furama_resort.models;

public abstract class Facility {
    private String nameFacility;
    private double areaUse;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String typeRent;

    public Facility(){}

    public Facility(String nameFacility, double areaUse, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.nameFacility = nameFacility;
        this.areaUse = areaUse;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }


}
