package Day03.Adapter;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Long exercises Adapter Design
 */
public class XpayToPayDAdapter implements PayD {

    private Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }
    @Override
    public String getCustCardNo() {
        return xpay.getCreditCardNo();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        xpay.setCreditCardNo(custCardNo);
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthDate() {
        return xpay.getCardExpMonth();
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        xpay.setCardExpMonth(cardExpMonthDate);
    }

    @Override
    public Integer getCVVNo() {
        return (int) xpay.getCardCVVNo();
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}
