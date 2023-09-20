package AdrianParra.nequiunab;

public class Account {

    private String name;
    private String typeAccount;
    private Double currentValue;
    private String imageUrl;

    public Account(String name, String typeAccount, Double currentValue, String imageUrl) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
    }

    public String getName() {
        return name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
