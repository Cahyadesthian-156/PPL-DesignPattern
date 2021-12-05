<?php

class Employee {
    private $name;
    private $title;
    private $salary;

    public function __construct($nama, $jobTitle, $salJob)
    {
        $this->name = $nama;
        $this->title = $jobTitle;
        $this->salary = $salJob;
    }

    public function getName() {
        return $this->name;
    }

    public function getTitle() {
        return $this->title;
    }

    public function getSalary() {
        return $this->salary;
    }
}