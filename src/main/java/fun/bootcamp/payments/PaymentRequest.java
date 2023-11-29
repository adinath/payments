package fun.bootcamp.payments;

import jakarta.validation.constraints.Size;

public record PaymentRequest(@Size(min = 16, max = 16) String cardNumber, @Size(min = 3, max = 3)String cvv, String expiryDate, Double amount) {
}
