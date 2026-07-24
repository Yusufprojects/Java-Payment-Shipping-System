# Java-Payment-Shipping-System
A Java-based Payment and Order Tracking system demonstrating core OOP concepts like Abstract Classes, Interfaces, and Polymorphism
# 💳 Payment & Tracking System (Java OOP Demo)

A clean, object-oriented Java application that simulates an e-commerce payment and shipment tracking pipeline. This project is built to demonstrate the practical usage of **Abstract Classes**, **Interfaces**, and **Polymorphism**.

## 🚀 Features

- **Payment Module:**
  - `PaymentMethod` (Abstract Class): Holds shared data like `amount` and `transactionID`.
  - `CreditPayment` & `CryptoPayment` (Subclasses): Implement custom payment processing logic.
- **Shipment Tracking Module:**
  - `ITrackable` (Interface): Defines a contract for trackable items.
  - `ExpressShipment` & `DigitalDelivery` (Classes): Provide specialized tracking methods for physical and digital products.

## 🛠️ Concepts Demonstrated

- **Abstraction & Inheritance:** Encapsulating shared payment fields and enforcing `processPayment()` in child classes.
- **Interfaces:** Decoupling physical and digital shipments via `ITrackable`.
- **Polymorphism:** Iterating over heterogeneous objects using `PaymentMethod[]` and `ITrackable[]` arrays.

## 💻 Output Example

```text
=== 1. PAYMENT SYSTEM (Abstract Class / Polymorphism) ===
[LOG] Transaction TR-101 recorded.
[CREDIT CARD] Payment of $1500.0 charged to card 4543-XXXX-XXXX-1234.

[LOG] Transaction TR-102 recorded.
[CRYPTO] Payment of $2500.5 transferred from wallet 0x71C...39A.

=== 2. SHIPPING & TRACKING SYSTEM (Interface / Polymorphism) ===
[EXPRESS SHIPMENT] Package with code EXPRESS-987 is on the way.
[DIGITAL DELIVERY] Code sent to your email address: STEAM-GAME-KEY-882
