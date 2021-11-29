<?php
class CustomerBuilder {
    private $id;
    private $firstName;
    private $lastName;
    private $email;
    private $phone;
    private $address;
    private $age = 0;
    // pemberian default value dilakukan di customer builder

    private $hobby="";

    public function setId($idInp) {
        $this->id = $idInp;
        return $this;
    }
    
    public function setFirstName($firstNameInp) {
        $this->firstName = $firstNameInp;
        return $this;
    }

    public function setLastName($lastNameInp) {
        $this->lastName = $lastNameInp;
        return $this;
    }

    public function setEmail($emailInp) {
        $this->email = $emailInp;
        return $this;
    }

    public function setPhone($phoneInp) {
        $this->phone = $phoneInp;
        return $this;
    }

    public function setAddress($addressInp) {
        $this->address = $addressInp;
        return $this;
    }

    public function setAge($ageInp) {
        $this->age = $ageInp;
        return $this;
    }

    public function setHobby($hobbyInp) {
        $this->hobby = $hobbyInp;
        return $this;
    }

    public function build(): Customer {
        return new Customer(
            $this->id,
            $this->firstName,
            $this->lastName,
            $this->email,
            $this->phone,
            $this->address,
            $this->age,
            $this->hobby
        );
    }
}