package pokemonevcounter.gamemechanics;

public class PokemonG3 implements EVMods {
	
	// Stat types
	private int hp;
	private int atk;
	private int def;
	private int spAtk;
	private int spDef;
	private int spd;
	
	private int totalEv; // Sum of EVs accumulated
	
	private String name;
	
	private boolean mBrace;
	

	public PokemonG3(String n) {
		this.name = n;
		this.hp = 0;
		this.atk = 0;
		this.def = 0;
		this.spAtk = 0;
		this.spDef = 0;
		this.spd = 0;
		this.totalEv = 0;
		this.mBrace = false;
		
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	// BATTLING
	
	@Override
	public void battleUpHp() {
		int gain = 1;
		
		if(mBrace) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battleUpDef() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battleUpSpAtk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battleUpSpDef() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battleUpSpd() {
		// TODO Auto-generated method stub
		
	}
	
	
	// BERRIES

	@Override
	public void pomeg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kelpsy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void qualot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hondew() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grepa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tamato() {
		// TODO Auto-generated method stub
		
	}
	
	
	// VITAMINS

	@Override
	public void hp() {
		int gain = 10;
		int diffVal = this.hp + gain - 100;
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
	public void protein() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iron() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcium() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zinc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carbos() {
		// TODO Auto-generated method stub
		
	}

	

}
