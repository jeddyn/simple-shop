package service;


import model.CreditCard;

public class CreditCardService {
    public boolean creditCardValidation(CreditCard creditCard) {
        String CVVCode = creditCard.getCVVCode();
        String creditCardNumber = creditCard.getCreditCardNumber();
        String date = creditCard.getDate();
        String stringDate = date.replace("." ,"");

if(CVVCode.length() != 3) {
    return false;
}
if(   CVVCode.charAt(0) < 47 ||CVVCode.charAt(0)  >57||
        CVVCode.charAt(1) <47 || CVVCode.charAt(1) > 57 ||
        CVVCode.charAt(2) < 47 || CVVCode.charAt(2) >57 ) {

}
if(creditCardNumber.length() != 19){
    return false;
}
for(int i = 0;i < creditCardNumber.length();i++){
  if( creditCardNumber.charAt(i) < 47 || creditCardNumber.charAt(i) > 57) {
      return false;
  }
}
        for(int i = 0;i < stringDate.length();i++){
            if( stringDate.charAt(i) < 47 || stringDate.charAt(i) > 57) {
                return false;
            }
        }








return true;

    }
}

// 2009.3.12
// 1950 - 2020.1 -12.1-30



