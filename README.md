A Simple Spring Boot JPA One To Many mapping example

http://localhost:8080/findAllOrders
POST
{
    "customer": {
        "name": "RKB",
        "email": "a@b.com",
        "gender": "male",
        "products": [
            {
                "pid": 1,
                "productName": "P1",
                "price": 2000,
                "qty": 2
            },
            {
                "pid": 2,
                "productName": "P2",
                "price": 3000,
                "qty": 1
            }
        ]
    }
}

http://localhost:8080/findAllOrders
GET