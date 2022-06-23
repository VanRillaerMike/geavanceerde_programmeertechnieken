package be.uantwerpen.fti.ei.backend;

import be.uantwerpen.fti.ei.backend.enemyfactory.Enemy;
import be.uantwerpen.fti.ei.backend.enemyfactory.EnemyFactory;
import be.uantwerpen.fti.ei.backend.enemyfactory.MediumEnemy;
import be.uantwerpen.fti.ei.backend.enemyfactory.NormalEnemy;
import be.uantwerpen.fti.ei.backend.factory.AbstractFactory;
import be.uantwerpen.fti.ei.backend.factory.FactoryProvider;

import java.util.ArrayList;
import java.util.Objects;

public class Game {

    //single variable to do Singleton
    private static Game single_instance = null;
    //abstract factories maken
    AbstractFactory<Enemy> enemyfactory = FactoryProvider.getFactory("Enemy");
    private int totalEnemies = 5;
    public String s;

    private Game()
    {
        s = "Game created successfully";
    }

    //Singleton game declareren
    public static Game Game(){

        if (single_instance == null){
            single_instance = new Game();
        }
        return single_instance;

    }

    private void init(){
        //create level

        //create player

        //generate enemies en put in an array
        ArrayList<Enemy> allEnemies = new ArrayList<Enemy>();

            //aanpassen zodat "normalenemy" dynamischer is (we kunnen nu enkel nog maar normalenemies creeeren)
        for (int i = 0; i < totalEnemies; i++){
            allEnemies.add(enemyfactory.create("normalenemy"));
        }
        System.out.println(allEnemies);




        //bepaald type enemy creeeren mbv de factory
        enemyfactory.create("normalenemy");



        //create camera to follow player in the world

        //create stopwatch


    }

    public void run(){

        this.init();

    }
}
