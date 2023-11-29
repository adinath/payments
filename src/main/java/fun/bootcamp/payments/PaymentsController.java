package fun.bootcamp.payments;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController {

  @PostMapping("payment")
  public ResponseEntity<PaymentStatus> makePayment(@RequestBody @Valid PaymentRequest paymentRequest) {
    return ResponseEntity.ok(new PaymentStatus(Status.Successful));
  }
}
