package bankApi.springboot_bank_api.Service;

import bankApi.springboot_bank_api.Entity.CreditCard;

public interface CreditCardService {
    CreditCard createCreditcard(CreditCard creditCard);
    void deleteCreditCard(Long Id);
    CreditCard getCreditCard(Long Id);
    CreditCard updateCreditCard(Long Id, CreditCard creditCard);

}
