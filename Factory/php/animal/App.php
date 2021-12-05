<?php 

// without pattern
$tiger = new Tiger();
$cat = new Cat();
$dog = new Dog();


// with animal factory
$tigerFact = AnimalFactory::create("tiger");
$catFact = AnimalFactory::create("cat");
$dogFact = AnimalFactory::create("dog");