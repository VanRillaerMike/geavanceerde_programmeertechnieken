package be.uantwerpen.fti.ei.backend.factory;

import be.uantwerpen.fti.ei.backend.bonusfactory.BonusFactory;
import be.uantwerpen.fti.ei.backend.enemyfactory.EnemyFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Enemy".equalsIgnoreCase(choice)){
            return new EnemyFactory();
        } else if ("Bonus".equalsIgnoreCase(choice)) {
            return new BonusFactory();
        }
        return null;
    }
}
