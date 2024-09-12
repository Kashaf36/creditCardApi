package bankApi.springboot_bank_api.Repository;

import bankApi.springboot_bank_api.Entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
