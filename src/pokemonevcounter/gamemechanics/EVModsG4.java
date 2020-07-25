package pokemonevcounter.gamemechanics;


/*
 * EV-per-battle items which are implemented differently by gen
 * Ordered by: HP, Atk, Def, Sp. Atk, Sp. Def, Spd
 */
public interface EVModsG4 extends EVMods{
	
	// Power items: Increase EVs per battle
	public void weight();
	public void bracer();
	public void belt();
	public void lens();
	public void band();
	public void anklet();
	
}
