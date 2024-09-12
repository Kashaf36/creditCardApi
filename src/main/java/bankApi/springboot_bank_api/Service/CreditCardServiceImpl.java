package bankApi.springboot_bank_api.Service;

import bankApi.springboot_bank_api.Entity.CreditCard;
import bankApi.springboot_bank_api.Repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    @Autowired
    private CreditCardRepository creditCardRepository;
    @Override
    public CreditCard createCreditcard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);

    }

    @Override
    public void deleteCreditCard(Long Id) {
        CreditCard card = getCreditCard(Id);
        creditCardRepository.delete(card);

    }

    @Override
    public CreditCard getCreditCard(Long Id) {
      Optional<CreditCard> optionalCreditCard = creditCardRepository.findById(Id);
      if(optionalCreditCard.isPresent()){
          return optionalCreditCard.get();
      }
       throw new RuntimeException("card with the" + Id + "not avaliable");
    }

    @Override
    public CreditCard updateCreditCard(Long Id, CreditCard creditCard) {
        CreditCard card = getCreditCard(Id);
        card.setCardHolderName(creditCard.getCardHolderName());
        card.setExpiration(creditCard.getExpiration());
        card.setCardType(creditCard.getCardType());
        card.setSecurityCode(creditCard.getSecurityCode());
        creditCardRepository.save(card);
        return card;
    }
}
