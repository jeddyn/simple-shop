package service;

import model.CreditCard;

public class CreditCardService {

    //    private String CVVCode; // 3 cyfry
    //    private String creditCardNumber; //19 cyfr
    //    private String date; // format 2000-03-12

    public boolean checkCardValidation(CreditCard creditCard){

        String cvvCode = creditCard.getCVVCode();
        String creditCardNumber = creditCard.getCreditCardNumber();
        String date = creditCard.getDate();

        if(cvvCode.length() != 3){
            return false;
        }
//        if()


        return true;
    }
}
