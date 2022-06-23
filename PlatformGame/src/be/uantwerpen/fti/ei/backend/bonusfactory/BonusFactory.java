package be.uantwerpen.fti.ei.backend.bonusfactory;

import be.uantwerpen.fti.ei.backend.factory.AbstractFactory;

public class BonusFactory implements AbstractFactory<Bonus> {

    @Override
    public Bonus create(String bonusType){
        if ("pbonus".equalsIgnoreCase(bonusType)) {
            return new Pbonus();
        } else if ("nbonus".equalsIgnoreCase(bonusType)) {
            return new Nbonus();
        }

        return null;
    }
}
