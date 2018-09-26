package itheima.entity;

public class Contact {
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private String telephone;
    private String city;
    private String userid;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", 姓名'" + name + '\'' +
                ", 性别'" + gender + '\'' +
                ", 生日'" + birthday + '\'' +
                ", 电话号码'" + telephone + '\'' +
                ", 城市'" + city + '\'' +
                '}';
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
