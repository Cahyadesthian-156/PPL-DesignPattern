<?php 

// why interface? because it maybe used as menu, we can choose easy, medium ,hard

interface Level {
    function start();
}

class LevelEasy implements Level {
    function start() {
        echo "Level Easy";
    }
}

class LevelMedium implements Level {
    function start() {
        echo "LEvel Medium";
    }
}

class LevelHard implements Level {
    function start()
    {
        echo "Level Hard";
    }
}