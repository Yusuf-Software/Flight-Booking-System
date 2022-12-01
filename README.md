# Flight-Booking-System

A Flight Reservation System is a software program based on the **Model View Controller (MVC) Architecture** made using **Java**.
The program helps airline companies manage flight reservation processes such as flight reservations, cancellations, scheduling, etc.
And lets Agencies and Customers reserve flight tickets online.
Moreover authentication and authorization for users is implemented.

## Table of Contents
* [Goals](#goals)
* [Roles](#roles)
* [Functionalities](#functionalities)
* [Room for Improvement](#room-for-improvement)
* [Milestone & Deadline](#milestone--deadline)
* [Team](#team)


## Goals
1. Flight Reservation System plays an important role in airline companies to maximize sales of tickets, increased the number of valuable customers and also improving the brand image of the company.
2. Help airline companies manage flight reservation processes such as flight reservations, cancellations, scheduling and so on.
3. Facilitate Airline-Agency communication.
4. Let Agencies book flights, see booking history, and and financial reports.
5. Make flight reservation directly accessible to customers through internet.


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
6. Also the see record of today’s flight, departed/arrived flights, and flight issues.


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
1. See their Sales Persons’ bookings.
2. Manage and see their transactions.
3. Ask for adding balance to their wallet.
4. Add/Remove Sales Persons accounts belonging to the agency.

### 6. Agency Sales Person
1. Can search for tickets as described in Customer Section, with having an amount of commission for particular itineraries.
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
8. Customers must have to register in the application to badViews their booking history or book a new ticket.
9. Customers can also cancel their tickets (under certain conditions).


## Room for Improvement
The following content will be provided in the next phases:
* Content Structure
* UI/UX Design (If Possible)


## Milestone & Deadline
This project is supervised by Dr. Polla Fattah, and the development period is 10 Weeks.
Every week we will cover a request from him and at the end of each phase he reviews the progress and we'll proceed with the next requirement.


### System Development Life Cycle
The waterfall model is used in developing this project, which is a breakdown of project activities into linear sequential phases, where each phase depends on the deliverables of the previous one and corresponds to a specialization of tasks.

The list of tasks are as follows:
1. Requirement Gathering and Analysis.
2. Creating Models using classes and records.
3. Creating containers and data structures to hold the data.
4. Persisting data in the files
5. Create user interface using terminal.
6. Create a client-server application so the server can answer clients' requests.
7. Adding Multithreading Capability so the server can respond to multiple clients.
8. Persist your data in a DBMS
9. Test your program using JUnit.
10. Creating Documentation for your application


## Team
- Koshyar Abdulrahman (Team Leader)    
Responsible for Building and Designing the project, as well as managing the development workflow.

- Yousif Abdulmajeed    
Responsible for Building the project, and Designing the User Interface.

- Zryan Mohammed    
Responsible for Building the project, and Implementing the User Interface.

- Rawa Osman    
Responsible for Building and Testing the project.

- Blnd Fakhir    
Responsible for Building and Testing the project.

- Ary Mohammed    
Responsible for Building and Testing the project.
