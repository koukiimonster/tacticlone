package dev.game.entity;

/** Super type for all effects i.e. buffs, debuffs...
 * 
 * @author TSok
 *
 */
public class Effect implements IEffect {

	private String effectName;
	private int type;		// determines the type of effect i.e. buff, debuff, etc
	private int effect;		
	
	// How long the buff lasts. The last turn of the duration, the effect ends at the end of the turn.
	private int duration;
	
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setType(int type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return duration;
	}

	@Override
	public void setDuration(int duration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEffectName() {
		// TODO Auto-generated method stub
		return effectName;
	}

	@Override
	public void setEffectName(String effectName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		//return 0;
	}

	
}
