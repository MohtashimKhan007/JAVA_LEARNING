package in.strikes.transactionDemo.service;

import in.strikes.transactionDemo.entity.Order;
import in.strikes.transactionDemo.entity.PaymentAudit;
import in.strikes.transactionDemo.repository.PaymentAuditRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentAuditService {

   private PaymentAuditRepository paymentAuditRepository;
    public PaymentAuditService(PaymentAuditRepository paymentAuditRepository){
        this.paymentAuditRepository = paymentAuditRepository;
    }
    public void audit(Order order){

        PaymentAudit paymentAudit = new PaymentAudit(order.getAmount(),order.getId(),true);
        paymentAuditRepository.save(paymentAudit);
    }

}
