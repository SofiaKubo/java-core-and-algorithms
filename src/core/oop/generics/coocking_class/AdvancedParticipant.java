package core.oop.generics.coocking_class;

public class AdvancedParticipant extends Participant implements HasCertificate, HasCard {
    private final String certificateId;
    private final String cardNumber;

    public AdvancedParticipant(String name, String certificateId, String cardNumber) {
        super(name);
        this.certificateId = certificateId;
        this.cardNumber = cardNumber;
    }

    @Override
    public String getCertificateId() {
        return certificateId;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }
}
