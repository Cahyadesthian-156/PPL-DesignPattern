<?php

// manual way
$store1 = new Store("Toko Padmasari", "Surabaya", "Indonesia", "Fashion");
$store2 = new Store("Toko Pradipta", "Surabaya", "Indonesia", "Gadget");
// store 2 can be written as
// $store2 = new Store("Toko Pradipta", $store1->getCity(), $store1->getCountry(), "Gadget");
$store3 = new Store("Toko Kumalasari", "Bondowoso", "Indonesia", "Food");
$store4 = new Store("Toko Agniasari", "Jember", "Indonesia", "Fashion");


// with clone
$store2 = $store1->clone();
$store2->setName("Toko Pradipta");