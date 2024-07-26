package placement.training.day4;

//Parent Class
public class Citizen {

    private String name;
    private long aadharNo;
    private String city;
    private long phone;

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", aadharNo=" + aadharNo +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Citizen(String name, long aadharNo, String city, long phone) {
        super();
        this.name = name;
        this.aadharNo = aadharNo;
        this.city = city;
        this.phone = phone;
    }

    public Citizen() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
