package mypackage;

public class GameApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameState gameState = GameState.getInstance();
        gameState.setDifficulty("Easy");
        System.out.println("Current Difficulty: " + gameState.getDifficulty());
        
        EnemyFactory enemyFactory = new VampireFactory();
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        GameElementsFactory elementsFactory = new EasyLevelFactory();
        Weapon weapon = elementsFactory.createWeapon();
        Powerup powerUp = elementsFactory.createPowerUp();

        weapon.use();
        powerUp.activate();
	}

}
