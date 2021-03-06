package tv.gregor.game;

import tv.gregor.game.entities.Bug01;
import tv.gregor.game.entities.EnemyType;

public class PositionsMap01 {
    boolean position1 = false,positionEnd = false;

    EnemyType enemyType;

    public PositionsMap01(EnemyType enemy) {
        this.enemyType = enemy;
    }

    public boolean isPosition1() {
        return position1;
    }

    public void setPosition1(boolean position1) {
        this.position1 = position1;
    }

    public boolean isPositionEnd() {
        return positionEnd;
    }

    public void setPositionEnd(boolean positionEnd) {
        this.positionEnd = positionEnd;
    }

    public EnemyType getEnemyType() {
        return this.enemyType;
    }
}
