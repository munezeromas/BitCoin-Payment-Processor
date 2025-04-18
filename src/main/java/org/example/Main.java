            package org.example;

            public class Main {
            public static void main(String[] args) {

            PaymentProcessor processor = new PaymentProcessor();


            CreditCard creditCard = new CreditCard("6753334589088865", "09/13");
            Bitcoin bitcoin = new Bitcoin("MAS65758987213");

            System.out.println("\n--- Payment Processor Output ---\n");
            processor.processPayment(creditCard);
            processor.processPayment(bitcoin);
            }
            }
