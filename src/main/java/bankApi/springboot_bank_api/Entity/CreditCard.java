package bankApi.springboot_bank_api.Entity;


import bankApi.springboot_bank_api.Entity.validation.ValidCardType;
import bankApi.springboot_bank_api.Entity.validation.ValidExpirationDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank(message = "Cardholder name is required")
    private String cardHolderName;
  @ValidExpirationDate
    private String expiration;
  @NotBlank(message = "Security code is required")
  @Size(min =3,max =4 , message = "Security code must be at least 3 digits")
  @Pattern(regexp = "^[0-9]+$",message = "Security can contain only numbers")
    private String securityCode;
    @ValidCardType
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "Card type is required")
    private CardType cardType;

    public CreditCard(String cardHolderName, String expiration, String securityCode, CardType cardType) {
        this.cardHolderName = cardHolderName;
        this.expiration = expiration;
        this.securityCode = securityCode;
        this.cardType = cardType;
    }

    public CreditCard() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
