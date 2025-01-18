package mypackage;

public class ZombieFactory extends EnemyFactory{
	public Enemy createEnemy() {
        return new Zombie();
    }

}
