package ss0_case_study.FuramaDemo.models;

public class Villa extends Facility {
    private String otherUtilities; //Các tiện ích khác
    private int amount;             //Số lượng

    public Villa(String otherUntilities, int amount) {
        this.otherUtilities = otherUntilities;
        this.amount = amount;
    }

    public Villa(String id, String serviceName, float area, float price, int maxPeople, String rentType, int rentTime,
                 String otherUtilities, int amount) {
        super(id, serviceName, area, price, maxPeople, rentType, rentTime);
        this.otherUtilities = otherUtilities;
        this.amount = amount;
    }

    public Villa() {

    }

    public String getOtherUntilities() {
        return otherUtilities;
    }

    public void setOtherUntilities(String otherUntilities) {
        this.otherUtilities = otherUntilities;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
                ", amount=" + this.amount +
                '}';
    }

}
