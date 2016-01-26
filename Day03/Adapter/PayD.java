package Day03.Adapter;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 adapter
 */
public interface PayD {
    String getCustCardNo();

    void setCustCardNo(String custCardNo);

    String getCardOwnerName();

    void setCardOwnerName(String cardOwnerName);

    String getCardExpMonthDate();

    void setCardExpMonthDate(String cardExpMonthDate);

    Integer getCVVNo();

    void setCVVNo(Integer cVVNo);

    Double getTotalAmount();

    void setTotalAmount(Double totalAmount);
}
