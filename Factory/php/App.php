<?php

// manuall way
$manager1 = new Employee("Eko", "Manager", 10000000);
$manager2 = new Employee("Joni", "Manager", 10000000);
$staff1 = new Employee("Fanko", "Staff", 5000000);
$staff2 = new Employee("Finko", "Staff", 5000000);

// with factory method
$managerMantap = EmployeeFactory::createManager("Cahya");
$staffOke = EmployeeFactory::createManager("Widigda");