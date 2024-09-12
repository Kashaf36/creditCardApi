package bankApi.springboot_bank_api.Controller;

import bankApi.springboot_bank_api.Entity.CreditCard;
import bankApi.springboot_bank_api.Service.CreditCardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/card")
public class CreditCardController {
    private final CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }
    @PostMapping
    public ResponseEntity<CreditCard> createCreditCard(@RequestBody CreditCard creditCard){
        return new ResponseEntity<>(creditCardService.createCreditcard(creditCard), HttpStatus.CREATED);
    }
    @GetMapping("/{Id}")
    public ResponseEntity<CreditCard> getCreditCard(@PathVariable Long Id){
        return new ResponseEntity<>(creditCardService.getCreditCard(Id), HttpStatus.OK);


    }
@DeleteMapping("/{Id}")
    public ResponseEntity<Void>deleteCreditCard(@PathVariable Long Id){
      creditCardService.deleteCreditCard(Id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
