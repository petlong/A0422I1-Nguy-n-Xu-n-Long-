package ss0_case_study.FuramaDemo.models;

public class Customer extends Person {
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id, String name, int age, String address, String typeCustomer) {
        super(id, name, age, address);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id: " + super.getId() +
                ", Tên: " + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Địa chỉ: " + super.getAddress() + '\'' +
                ", Loại khách hàng : " + this.typeCustomer + '\'' +
                '}';
    }
}
