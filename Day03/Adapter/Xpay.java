package Day03.Adapter;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Adapter
 */
public interface Xpay {
    String getCreditCardNo();

    void setCreditCardNo(String creditCardNo);

    String getCustomerName();

    void setCustomerName(String customerName);

    String getCardExpMonth();

    void setCardExpMonth(String cardExpMonth);

    String getCardExpYear();

    void setCardExpYear(String cardExpYear);

    Short getCardCVVNo();

    void setCardCVVNo(Short cardCVVNo);

    Double getAmount();

    void setAmount(Double amount);
}
