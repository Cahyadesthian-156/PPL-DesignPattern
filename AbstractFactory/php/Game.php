<?php

class Game {
    private $level;
    private $arena;
    private $enemy;

    // Manual Way/ without pattern
    // public function __construct(Level $level, Arena $arena) {
    //     $this->level = $level;
    //     $this->arena = $arena;
    // }
    

    // after make game factory
    public function __construct(GameFactory $gameFactory) 
    {
        $this->level = $gameFactory->createLevel();
        $this->arena = $gameFactory->createArena();
        $this->enemy = $gameFactory->createEnemy();
    }


    function start() {
        $this->level->start();
        $this->arena->start();
        $this->enemy->start();
    }


}