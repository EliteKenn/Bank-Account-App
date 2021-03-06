# Bank-Account-App
Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

Application will do the following:

Read a .csv file of names, social security numbers, account type, and initial deposit.
I use a proper data structure to hold all these accounts. 
Both savings and checking accounts share the following properties:

deposit()

withdraw() 

transfer() 

showInfo()

11-Digit Account Number(generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5 digit number, and random 3 digit number)

Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code

Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN Both accounts will use an interface that determines the best interest rate.

--Savings accounts will use .25 points less than the base rate

--Checking accounts will use 15% of the base rate

The ShowInfo method should reveal relevant account info as well as info specific to the Checking account or Savings account.
