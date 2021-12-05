<?php

// without Pattern, with old or manual constructor
// $gameEasy = new Game(new LevelEasy(), new ArenaEasy());
// $gameEasy->start();

// $gameMedium = new Game(new LevelMedium(), new ArenaMedium());
// $gameMedium->start();



// with Abstract Factory (GameFactory)
$gameEasy = new Game(new GameFactoryEasy());
$gameEasy->start();

$gameMedium = new Game(new GameFactoryMedium());
$gameMedium->start();

$gameHard = new Game(new GameFactoryHard());
$gameHard->start();