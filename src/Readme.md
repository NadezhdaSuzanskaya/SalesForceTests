### Demo project of wrapped elements

The education project demonstrates realization of wrapped element pattern. Also, it has implementation of the following
patterns:

1. Page object
2. Chain of invocations
3. Value object

[Saleforce](https://www.salesforce.com/) was used as testing product.

# Test suite

## Test case 1 - Add new account

| step # | desc | expected result |
| --- | --- |  --- |
| 1 | login | main menu loaded |
| 2 | open accounts menu | account view opened |
| 3 | add new account | new account added into account list |
| 4 | check info in the added account | info is the same that in the created account |
| 5 | add new contact| new contact added into contact list |
| 6 | check info in the added contact| info is the same that in the created contact|

