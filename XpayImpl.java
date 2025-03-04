import com.teamrocket.Xpay;

public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String cutomerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amounnt;
    @Override
    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return this.cutomerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.amounnt;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.cutomerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amounnt = amounnt;
    }
}