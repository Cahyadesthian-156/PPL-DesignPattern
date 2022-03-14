/**
 * 0 def
 * 
 * woul render a forest 1.000.000 trees
 * Each tree will represeneted by its ow object 
 * each oobject has its own state(coordinate,texture,etc)
 * if we not use flyweight pattern, lot of RAM would be used
 * padahal many tree object contain duplicate data(name, texture, color)
 * 
 * Need to apply flyweight pattern
 */

import java.awt.*;

public class App {

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;


    public static void main(String[] args)  {
        // System.out.println("Hello, World!");

        Forest forest = new Forest();
        for(int i=0; i<Math.floor(TREES_TO_DRAW/TREE_TYPES); i++) {
            forest.plantTree(random(0,CANVAS_SIZE), random(0,CANVAS_SIZE), "Pohon Beringin", Color.GREEN, "Beringin Texture");
            forest.plantTree(random(0,CANVAS_SIZE), random(0,CANVAS_SIZE), "Pohon Mangga", Color.ORANGE, "Mango Texture");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("--------------------------");
        System.out.println("Memory Usage: ");
        System.out.println("Tree size(8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size(~30 bytes) * " + TREE_TYPES + "");
        System.out.println("--------------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW*8 + TREE_TYPES*30)/1024/1024) + "MB (instead of " + ((TREES_TO_DRAW*38)/1024/1024) + "MB)");


    }

    private static int random(int min, int max) {
        return min + (int)(Math.random()*((max-min)+1));
    }

}
