package pokemonevcounter.gamemechanics;

/*
 * EV modifiers which are implemented in each gen starting from III
 * Ordered by: HP, Atk, Def, Sp. Atk, Sp. Def, Spd
 */

public interface EVMods {
	
	// Equips and Pokerus modify the EVs earned from battle
	public void pokerus();
	
	// Hard set: Sets stat value to passed-in value
	public void hardSetHp(int newValue);
	public void hardSetAtk(int newValue);
	public void hardSetDef(int newValue);
	public void hardSetSpAtk(int newValue);
	public void hardSetSpDef(int newValue);
	public void hardSetSpd(int newValue);
	
	
	// Battling: Increase base 1 EV per battle
	public void battleUpHp();
	public void battleUpAtk();
	public void battleUpDef();
	public void battleUpSpAtk();
	public void battleUpSpDef();
	public void battleUpSpd();
	

	// Berries: Reduce X EVs per use
	public void pomeg();
	public void kelpsy();
	public void qualot();
	public void hondew();
	public void grepa();
	public void tamato();
	
	
	// Vitamins: Increase 10 EVs per use
	public void hpUp();
	public void protein();
	public void iron();
	public void calcium();
	public void zinc();
	public void carbos();
	
}
