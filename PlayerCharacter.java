public class PlayerCharacter {
   
   // instance variables
   private String name;
   private String playerClass;
   private int level;
   private int currentXp;
   private int xpToNextLevel;
   private double health;
   private double attackPower;
   private double critChance;
   private double critBonus;
   private boolean alive;
   
   // constructors
   
      // default character
   public PlayerCharacter() {
      name = "Joe";
      playerClass = "Mage";
      level = 1;
      currentXp = 0;
      xpToNextLevel = 10;
      health = 10.0;
      attackPower = 2.0;
      critChance = 0.02;
      critBonus = 1.5;
      alive = true;
   }
   
      // new character
   public PlayerCharacter(String name, String playerClass) {
      this.name = name;
      this.playerClass = playerClass;
      level = 1;
      currentXp = 0;
      xpToNextLevel = 10;
      health = 10.0;
      attackPower = 2.0;
      critChance = 0.02;
      critBonus = 1.5;
      alive = true;
   }
   
   
      // fully imported character
   public PlayerCharacter(String name, 
                          String playerClass, 
                          int level, 
                          int currentXp, 
                          int xpToNextLevel, 
                          double health, 
                          double attackPower, 
                          double critChance, 
                          double critBonus, 
                          boolean alive) {
      this.name = name;
      this.playerClass = playerClass;
      this.level = level;
      this.currentXp = currentXp;
      this.xpToNextLevel = xpToNextLevel;
      this.health = health;
      this.attackPower = attackPower;
      this.critChance = critChance;
      this.critBonus = critBonus;
      this.alive = alive;
   }
   
   // methods
   public void levelUp() {
      // Reset xp to 0, add 1 to level, and increase xp requirement
   }
   
   public double attack(double targetHealth) {
      // Deal damage equal to attackPower * critBonus (if crit) and returns the targets remaining health
      return targetHealth;
   }
   
   public boolean crit() {
      // Generate random number, return true if < critChance
      return false;
   }
   
   public void changeName(String newName) {
      // Changes the character's name
   }
   
   public void takeDamage(int damageTaken) {
      // Changes health according to damageTaken and kills the character if health <= 0
   }
   
   public void die() {
      // Kills the character
   }
}