<?php

$customer1 = (new CustomerBuilder())
    ->setFirstName("Cahyadesthian")
    ->setLastName("Widigda")
    ->setPhone("0877784784")
    ->build();

$customer2 = (new CustomerBuilder())
    ->setFirstName("Padmasari")
    ->setLastName("Anindya")
    ->setPhone("0877784213")
    ->setAge(19)
    ->build();


$customer3 = (new CustomerBuilder())
    ->setFirstName("Cahyadesthian")
    ->setLastName("Widigda")
    ->setPhone("0877784784")
    ->setAddress("Jl. Brigjen Letna Lalala")
    ->build();


$customer3 = (new CustomerBuilder())
    ->setFirstName("Cahyadesthian")
    ->setLastName("Widigda")
    ->setHobby("Swimming")
    ->setPhone("0877784784")
    ->setAddress("Jl. Brigjen Letna Lalala")
    ->build();