# Flight-Booking-System

A Flight Booking System for Fly Erbil based on the **Model View Controller (MVC) Architecture** made using **Java**. Moreover authentication and authorization for users is implemented.

## Roles

Following roles are implemented:
1. Airline Admin
2. Airline Manager
3. Airline Accountant
4. Airline Sales Person
5. Agency Admin
6. Agency Sales Person
7. Customer

## Functionalities
This is for just one airline who wants to sell seats to their customers via internet, or let the agencies sell them.

### 1. Airline Admin
1. Airline Admin can schedule flights on a particular dates or according to the source and destination.
2. Airline Admin will set the prices of the seats. There should be three types of seats:
* First Class
* Business
* Economy
3. The Airline Admin should be able to create and update the features of each type of seat.
4. The Airline Admin should be able to set the total number of seats for each flight.
5. The Airline Admin should be able to Read, Add, Remove and Edit, and Set Status of Flight Reservations as well.
6. Also the record of today’s flight, departed/arrived flights, and flight issues.


### 2. Airline Manager


1. Airline Manager should see a list of seats which the Admin has added or edited when he/she logs in
2. Airline Manager then needs to approve the new price or updates.
3. When the price and update is approved by the manager only then it should be available for the customer to buy.

### 3. Airline Accountant


1. Airline Accountant should be able to Manage and Track Transactions.
2. Airline Accountant should be able to Deposit/Withdraw balance to agencies’ wallets.
3. Block Agencies in case of too much debt.

### 4. Airline Sales Person


1. Can search for tickets as described in Customer Section.
2. Hold tickets for a period of time, and then buy or cancel the PNR.
3. See and Manage Agencies’ bookings.
4. Extend hold duration for agencies’ bookings on request.

### 5. Agency Admin


1. Manage and Manage their Sales Persons’ bookings.
2. Manage and see their transactions.
3. Ask for adding balance to their wallet.
4. Add/Remove Sales Persons accounts belonging to the agency.

### 6. Agency Sales Person


1. Can search for tickets as described in Customer Section.
2. Hold tickets for a period of time, and then buy or cancel the PNR.
3. See and manage their bookings.
4. Ask to extend hold duration.

### 7. Customer


1. The Customer should be able to buy seats based on availability.
2. When a customer buys a ticket, the system should be able to calculate how many seats are left. If all seats are bought the application should not let the customers buy more seats.
3. The Customer should be able to search for flights according to the following criteria:
   i. origin and destination cities
   ii. dates of travel
   iii. number of people traveling
   d. class of seat
   e. flight itinerary
4. Customers can book a ticket after signup/login into the application.
5. When the customer selects the seat and confirms the booking flight Itinerary should be shown to the customer.
6. When the customer approves the itinerary the customer should be taken to a payment page where the total price should be shown. When the customer presses the pay button consider the transaction done and mark the seat sold.
7. Once the seat is sold, send out an email to the customer with the flight itinerary.
8. Customers must have to register in the application to view their booking history or book a new ticket.
9. Customers can also cancel their tickets (under certain conditions).

## Authors
* Koshyar Abdulrahman
* Yousif Dhahir
* Zryan Mohammed
* Rawa Osman
* Blnd Fakhir
* Ary Mohammed
