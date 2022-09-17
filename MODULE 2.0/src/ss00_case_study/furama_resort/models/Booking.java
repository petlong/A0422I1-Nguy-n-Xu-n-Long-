package ss00_case_study.furama_resort.utils;

import ss00_case_study.furama_resort.models.Customer;
import ss00_case_study.furama_resort.models.Facility;

public class Booking {
    private Integer idBooking;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;

    public Booking(){}

    public Booking(Integer idBooking, String startDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
