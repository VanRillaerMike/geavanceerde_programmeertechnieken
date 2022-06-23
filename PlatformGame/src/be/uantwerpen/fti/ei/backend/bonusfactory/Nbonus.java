package be.uantwerpen.fti.ei.backend.bonusfactory;

public class Nbonus implements Bonus{

    @Override
    public String getBonus(){
        return "bonus -1";
    }

    @Override
    public String doThing(){
        return "thing -1";
    }
}
