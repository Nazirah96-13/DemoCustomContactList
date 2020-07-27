package sg.edu.rp.c346.id17032457.democustomcontactlist;

public class Contact {
    private String name;
    private Integer countryCode;
    private Integer phoneNum;
    private Character gender;

    public Contact(String name, Integer countryCode, Integer phoneNum, Character gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
