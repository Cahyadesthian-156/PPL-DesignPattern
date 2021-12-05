<?php

interface Animal {
    function speak();
}

class Tiger implements Animal {
    function speak() {
        echo "Roar!";
    }
}

class Cat implements Animal {
    function speak()
    {
        echo "Meow";
    }
}

class Dog implements Animal {
    function speak()
    {
        echo "Guk Guk";
    }
}