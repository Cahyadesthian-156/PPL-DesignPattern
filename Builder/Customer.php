<?php

class Customer {
    private $id;
    private $firstName;
    private $lastName;
    private $email;
    private $phone;
    private $address;
    private $age;
    private $hobby;


    public function __construct($id, $firstName, $lastName, $email, $phone, $address, $age, $hobby )
    {
        $this->id = $id;
        $this->firstName =$firstName;
        $this->lastName = $lastName;
        $this->email = $email;
        $this->phone = $phone;
        $this->address = $address;
        $this->age = $age;
        $this->hobby = $hobby;
        
    }

    public function getId() {
        return $this->id;
    }

    public function getFirstName() {
        return $this->firstName;
    }

    public function getLastName() {
        return $this->lastName;
    }

    public function getEmail() {
        return $this->email;
    }

    public function getPhone() {
        return $this->phone;
    }

    public function getAddress() {
        return $this->address;
    }

    public function getAge() {
        return $this->age;
    }
}