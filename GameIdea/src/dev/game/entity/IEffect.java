package dev.game.entity;


public interface IEffect {

	
	public int getType();
	
	public void setType(int type);
	
	public int getDuration();
	
	public void setDuration(int duration);
	
	public String getEffectName();
	
	public void setEffectName(String effectName);
	
	public void apply();
}
