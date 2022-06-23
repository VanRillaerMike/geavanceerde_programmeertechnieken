package be.uantwerpen.fti.ei.backend.enemyfactory;

public class Hardenemy implements Enemy{

    @Override
    public String getEnemy(){
        return "enemyhard";
    }

    @Override
    public String doThing(){
        return "doing hard enemy thing";
    }
}
