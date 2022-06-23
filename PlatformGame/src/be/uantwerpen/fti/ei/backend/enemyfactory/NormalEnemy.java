package be.uantwerpen.fti.ei.backend.enemyfactory;

public class NormalEnemy implements Enemy{

    @Override
    public String getEnemy(){
        return "enemynormal";
    }

    @Override
    public String doThing(){
        return "doing normal enemy thing";
    }

    @Override
    public String toString() {
        return "NormalEnemy{}";
    }
}
