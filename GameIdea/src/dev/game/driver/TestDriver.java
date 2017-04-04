package dev.game.driver;

import dev.game.entity.Character;
import dev.game.entity.Stats;
public class TestDriver {
	public static void main(String[] args) {
		
		Character char_1 = new Character("Bob");
		Stats stats = new Stats();
		stats.setArmorRating(0);
		stats.setHp(100);
		stats.setCurrentHp(100);
		stats.setDefense(12);
		stats.setStrength(17);
		stats.setMp(40);
		stats.setCurrentMp(40);
		stats.setIntelligence(8);
		stats.setSpeed(10);
		stats.setAgility(7);
		stats.setHeight(2);
		stats.setMovement(4);
		stats.setVigor(8);
		char_1.setStats(stats);
		
		System.out.println(char_1.toString());
		
		Character enemy_1 = new Character("Seifer");
		stats.setArmorRating(0);
		stats.setHp(100);
		stats.setCurrentHp(100);
		stats.setDefense(27);
		stats.setStrength(13);
		stats.setMp(40);
		stats.setCurrentMp(40);
		stats.setIntelligence(8);
		stats.setSpeed(10);
		stats.setAgility(7);
		stats.setHeight(2);
		stats.setMovement(4);
		stats.setVigor(8);
		enemy_1.setStats(stats);
		System.out.println(enemy_1.toString());
		
	}
}
