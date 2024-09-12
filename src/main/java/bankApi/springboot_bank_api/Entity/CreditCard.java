package bankApi.springboot_bank_api.Entity;


import jakarta.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String cardHolderName;
    private String expiration;
    private String securityCode;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
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
