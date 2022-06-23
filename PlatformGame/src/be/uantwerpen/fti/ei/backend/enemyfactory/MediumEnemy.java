package be.uantwerpen.fti.ei.backend.enemyfactory;

public class MediumEnemy implements Enemy{

    @Override
    public String getEnemy(){
        return "mediumnormal";
    }

    @Override
    public String doThing(){
        return "doing medium enemy thing";
    }
}
