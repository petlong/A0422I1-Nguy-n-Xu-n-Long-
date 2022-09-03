package ss0_case_study.FuramaDemo.models;

public class Room extends Facility {
    private String covenientService;  //Dịch vụ tiện ích (massage, gọi thức ăn đồ uống, support)

    public Room(String covenientService) {
        this.covenientService = covenientService;
    }

    public Room(String id, String serviceName, float area, float price, int maxPeople, String rentType,
                int rentTime, String covenientService) {
        super(id, serviceName, area, price, maxPeople, rentType, rentTime);
        this.covenientService = covenientService;
    }
    public Room(){
    }

    public String getCovenientService() {
        return covenientService;
    }

    public void setCovenientService(String covenientService) {
        this.covenientService = covenientService;
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
                ", covenientService=" + this.covenientService +
                '}';
    }
}
