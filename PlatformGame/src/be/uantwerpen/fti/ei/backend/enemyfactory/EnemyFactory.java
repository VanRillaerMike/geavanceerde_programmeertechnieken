package be.uantwerpen.fti.ei.backend.enemyfactory;

import be.uantwerpen.fti.ei.backend.factory.AbstractFactory;

public class EnemyFactory implements AbstractFactory<Enemy> {

    @Override
    public Enemy create(String enemyType){
        if ("bossenemy".equalsIgnoreCase(enemyType)) {
            return new BossEnemy();
        } else if ("normalenemy".equalsIgnoreCase(enemyType)) {
            return new NormalEnemy();
        } else if ("mediumenemy".equalsIgnoreCase(enemyType)) {
            return new MediumEnemy();
        } else if ("hardenemy".equalsIgnoreCase(enemyType)){
            return new Hardenemy();
        }

        return null;
    }
}
