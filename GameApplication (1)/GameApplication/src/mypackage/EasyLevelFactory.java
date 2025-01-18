package mypackage;

public class EasyLevelFactory implements GameElementsFactory{
	public Weapon createWeapon() {
        return new Sword();
    }
	public Powerup createPowerUp() {
        return new HealthPotion();
    }

}
