package be.uantwerpen.fti.ei.backend.enemyfactory;

public class BossEnemy implements Enemy{

    @Override
    public String getEnemy(){
        return "Bossnormal";
    }

    @Override
    public String doThing(){
        return "doing boss enemy thing";
    }
}
