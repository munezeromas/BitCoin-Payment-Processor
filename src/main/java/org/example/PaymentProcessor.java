        package org.example;

        public class PaymentProcessor {

        public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Payment with " + creditCard.toString());
        }

        public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment - " + bitcoin.toString());
        }
        }

