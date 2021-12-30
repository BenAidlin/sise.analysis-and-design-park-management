public class BillingAccount {
    private int creditCardNumber;
    private String expirationDate;
    private String password;
    private float limitLeft;
    public BillingAccount(int creditCardNumber, String expirationDate, String password, float limit) {
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.password = password;
        this.limitLeft = limit;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getLimitLeft() {
        return limitLeft;
    }

    public void setLimitLeft(float limitLeft) {
        this.limitLeft = limitLeft;
    }
}
