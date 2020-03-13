package service;

import model.CreditCard;

public class CreditCardService {
    private String CVVCode;
    private String creditCardNumber;
    private String data;
    public boolean checkCardValidation(CreditCard creditCard) {
        String cvvCode = creditCard.getCVVCode();
        String CredictCardNumber = creditCard.getCreditCardNumber();
        String date = creditCard.getDate();
        if (cvvCode.length() != 3) {
            return false;
        }
        if(cvvCode.charAt(0) > 47 || cvvCode.charAt(0) < 57 || cvvCode.charAt(1) < 47 || cvvCode.charAt(1) > 57 ||
                cvvCode.charAt(2) < 47 || cvvCode.charAt(2) < 57){
            return false;

        }
        return true;
    }

}
