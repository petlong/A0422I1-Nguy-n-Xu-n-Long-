package ss0_case_study.FuramaDemo.models;

public abstract class Facility {
    private String idFacility;    //ID Dịch vụ
    private String serviceName;   //Tên dịch vụ
    private float area;           //Diện tích sử dụng
    private float price;          //Chi phí thuê
    private int maxPeople;        //Số người tối đa
    private String rentType;      //Thuê theo năm - tháng - ngày - giờ
    private int rentTime;         //Thời gian thuê

    public Facility() {
    }

    public Facility(String idFacility, String serviceName, float area, float price,
                    int maxPeople, String rentType, int rentTime) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.rentTime = rentTime;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public int getRentTime() {
        return rentTime;
    }

    public void setRentTime(int rentTime) {
        this.rentTime = rentTime;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + idFacility + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                ", rentTime=" + rentTime +
                '}';
    }
}
