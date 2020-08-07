package pokemonevcounter.gamemechanics;

public class PokemonG4 extends PokemonG3{
	
	public PokemonG4(String n) {
		super(n);
	}
	
	
	// CLASS METHODS
	
	public void equip(int id) {
		this.equipment = id;
	}

	
	// BATTLING
	
	@Override
	public void battleUpHp() {
		int gain = 1;
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
		}
		
		if(this.pokerus) {
			gain *= 2;
		}
		
		// TODO: Pokerus modifier
		
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
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
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
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
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
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
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
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
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
		
		// Macho Brace
		if(this.equipment == 1) {
			gain *= 2;
		}
		
		// Power items
		else if(this.equipment == 2) {
			gain += 4;
		}
		else if(this.equipment == 3) {
			this.atk += 4;
		}
		else if(this.equipment == 4) {
			this.def += 4;
		}
		else if(this.equipment == 5) {
			this.spAtk += 4;
		}
		else if(this.equipment == 6) {
			this.spDef += 4;
		}
		else if(this.equipment == 7) {
			this.spd += 4;
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
		if(this.hp > 100) {
			this.hp = 100;
		}
		else {
			this.hp -= 10;
			if(this.hp < 0) {
				this.hp = 0;
			}
		}
	}

	@Override
	public void kelpsy() {
		if(this.atk > 100) {
			this.atk = 100;
		}
		else {
			this.atk -= 10;
			if(this.atk < 0) {
				this.atk = 0;
			}
		}
	}

	@Override
	public void qualot() {
		if(this.def > 100) {
			this.def = 100;
		}
		else {
			this.def -= 10;
			if(this.def < 0) {
				this.def = 0;
			}
		}
	}

	@Override
	public void hondew() {
		if(this.spAtk > 100) {
			this.spAtk = 100;
		}
		else {
			this.spAtk -= 10;
			if(this.spAtk < 0) {
				this.spAtk = 0;
			}
		}
	}

	@Override
	public void grepa() {
		if(this.spDef > 100) {
			this.spDef = 100;
		}
		else {
			this.spDef -= 10;
			if(this.spDef < 0) {
				this.spDef = 0;
			}
		}
	}

	@Override
	public void tamato() {
		if(this.spd > 100) {
			this.spd = 100;
		}
		else {
			this.spd -= 10;
			if(this.spd < 0) {
				this.spd = 0;
			}
		}
	}

}
