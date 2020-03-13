package service;


import model.CreditCard;

public class CreditCardService {
    public boolean creditCardValidation(CreditCard creditCard) {
        String CVVCode = creditCard.getCVVCode();
        String creditCardNumber = creditCard.getCreditCardNumber();
        String date = creditCard.getDate();
if(CVVCode.length() != 3) {
    return false;
}
if(   CVVCode.charAt(0) < 47 ||CVVCode.charAt(0)  >57||
        CVVCode.charAt(1) <47 || CVVCode.charAt(1) > 57 ||
        CVVCode.charAt(2) < 47 || CVVCode.charAt(2) >57 ) {

}
if(){
    return false
}
return true;

    }
}