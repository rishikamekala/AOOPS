package mypackage;

public class HardLevelFactory implements GameElementsFactory{
	public Weapon createWeapon() {
        return new Bow();
    }
	public Powerup createPowerUp() {
        return new SpeedBoost();
    }

}
