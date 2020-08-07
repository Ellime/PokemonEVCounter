package pokemonevcounter.gamemechanics;

public class PokemonG3 implements EVMods {
	
	// Stat types
	protected int hp;
	protected int atk;
	protected int def;
	protected int spAtk;
	protected int spDef;
	protected int spd;
	
	protected int totalEv; // Sum of EVs accumulated
	
	protected String name;
	
	protected int equipment; // 0: N/A | 1: Macho Brace
	protected boolean pokerus; // true if infected with Pokerus
	

	public PokemonG3(String n) {
		this.name = n;
		this.hp = 0;
		this.atk = 0;
		this.def = 0;
		this.spAtk = 0;
		this.spDef = 0;
		this.spd = 0;
		this.totalEv = 0;
		this.equipment = 0;
		
	}
	
	
	// GETTERS
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getEquipment() {
		return this.equipment;
	}
	
	
	// CLASS METHODS
	
	private void equip() {
		if(this.equipment > 0) {
			this.equipment = 0;
		}
		else {
			this.equipment = 1;
		}
	}
	
	@Override
	public void pokerus() {
		this.pokerus = !this.pokerus;
	}
	
	
	// HARD SETTERS
	
	@Override
	public void hardSetHp(int newValue) {
		this.hp = newValue;
		
	}


	@Override
	public void hardSetAtk(int newValue) {
		this.atk = newValue;
		
	}


	@Override
	public void hardSetDef(int newValue) {
		this.def = newValue;
		
	}


	@Override
	public void hardSetSpAtk(int newValue) {
		this.spAtk = newValue;
		
	}


	@Override
	public void hardSetSpDef(int newValue) {
		this.spDef = newValue;
		
	}


	@Override
	public void hardSetSpd(int newValue) {
		this.spd = newValue;
		
	}
	
	
	// BATTLING
	
	@Override
	public void battleUpHp() {
		int gain = 1;
		
		if(this.equipment > 0) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.hp + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.hp += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void battleUpAtk() {
		int gain = 1;
		
		if(this.equipment > 0) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.atk + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.atk += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void battleUpDef() {
		int gain = 1;
		
		if(this.equipment > 0) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.def + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.def += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void battleUpSpAtk() {
		int gain = 1;
		
		if(this.equipment > 0) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.spAtk + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spAtk += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void battleUpSpDef() {
		int gain = 1;
		
		if(this.equipment > 1) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.spDef + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spDef += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void battleUpSpd() {
		int gain = 1;
		
		if(this.equipment > 0) {
			gain *= 2;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		int diffVal = this.spd + gain - 255;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			gain -= diffVal;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spd += gain;
		this.totalEv += gain;
		
	}
	
	
	// BERRIES

	@Override
	public void pomeg() {
		this.hp -= 10;
		if(this.hp < 0) {
			this.hp = 0;
		}
		
	}

	@Override
	public void kelpsy() {
		this.atk -= 10;
		if(this.atk < 0) {
			this.atk = 0;
		}
		
	}

	@Override
	public void qualot() {
		this.def -= 10;
		if(this.def < 0) {
			this.def = 0;
		}
		
	}

	@Override
	public void hondew() {
		this.spAtk -= 10;
		if(this.spAtk < 0) {
			this.spAtk = 0;
		}
		
	}

	@Override
	public void grepa() {
		this.spDef -= 10;
		if(this.spDef < 0) {
			this.spDef = 0;
		}
		
	}

	@Override
	public void tamato() {
		this.spd -= 10;
		if(this.spd < 0) {
			this.spd = 0;
		}
		
	}
	
	
	// VITAMINS

	@Override
	public void hpUp() {
		int gain = 10;
		int diffVal = this.hp + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.hp += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void protein() {
		int gain = 10;
		int diffVal = this.atk + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.atk += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void iron() {
		int gain = 10;
		int diffVal = this.def + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.def += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void calcium() {
		int gain = 10;
		int diffVal = this.spAtk + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spAtk += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void zinc() {
		int gain = 10;
		int diffVal = this.spDef + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spDef += gain;
		this.totalEv += gain;
		
	}

	@Override
	public void carbos() {
		int gain = 10;
		int diffVal = this.spd + gain - 100;
		int diffTotal = this.totalEv + gain - 510;
		
		if(diffVal > 0) {
			if(diffTotal > 0) {
				
				gain -= Math.max(diffVal, diffTotal);
			}
			
			// Do nothing if over 100/stat, under 510 total
			return;
		}
		else if(diffTotal > 0) {
			gain -= diffTotal;
		}
		
		this.spd += gain;
		this.totalEv += gain;
		
	}
}
