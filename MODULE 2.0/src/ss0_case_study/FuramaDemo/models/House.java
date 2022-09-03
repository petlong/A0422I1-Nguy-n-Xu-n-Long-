package ss0_case_study.FuramaDemo.models;

public class House extends Facility {
    private int floor;     //Số tầng
    private boolean fullyFurnished; //Full nội thất
    private String otherUtilities; //Tiện ích khác

    public House(int floor, boolean fullyFurnished, String otherUtilities) {
        this.floor = floor;
        this.fullyFurnished = fullyFurnished;
        this.otherUtilities = otherUtilities;
    }

    public House(String id, String serviceName, float area, float price, int maxPeople, String rentType,
                 int rentTime, int floor, boolean fullyFurnished, String otherUtilities) {
        super(id, serviceName, area, price, maxPeople, rentType, rentTime);
        this.floor = floor;
        this.fullyFurnished = fullyFurnished;
        this.otherUtilities = otherUtilities;
    }

    public House() {
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isFullyFurnished() {
        return fullyFurnished;
    }

    public void setFullyFurnished(boolean fullyFurnished) {
        this.fullyFurnished = fullyFurnished;
    }

    public String getOtherUtilities() {
        return otherUtilities;
    }

    public void setOtherUtilities(String otherUtilities) {
        this.otherUtilities = otherUtilities;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + super.getIdFacility() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", area=" + super.getArea() +
                ", price=" + super.getPrice() +
                ", maxPeople=" + super.getMaxPeople() +
                ", rentType='" + super.getRentType() + '\'' +
                ", rentTime=" + super.getRentTime() +
                ", otherUtilities=" + this.otherUtilities +
                ", floor=" + this.floor +
                ", fullyFurnished=" + this.fullyFurnished +
                '}';
    }
}
