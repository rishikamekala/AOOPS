package mypackage;

public class VampireFactory extends EnemyFactory{
	public Enemy createEnemy() {
        return new Vampire();
    }

}
