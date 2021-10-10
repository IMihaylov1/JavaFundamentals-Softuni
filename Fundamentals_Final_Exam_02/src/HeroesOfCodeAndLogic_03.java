import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Integer> heroesHp = new TreeMap<>();
        TreeMap<String, Integer> heroesMp = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String heroes = scanner.nextLine();
            String[] tokens = heroes.split("\\s+");
            String name = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);
            if(!heroesHp.containsKey(name)&&!heroesHp.containsKey(name)){
                heroesHp.put(name, hp);
                heroesMp.put(name, mp);
            }

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            switch (command) {
                case "CastSpell": {
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int currentMp = heroesMp.get(heroName);

                    if (currentMp >= mpNeeded) {
                        currentMp-=mpNeeded;
                        heroesMp.put(heroName, currentMp);
                        System.out.printf("%s has successfully cast %s" +
                                " and now has %d MP!%n", heroName, spellName, currentMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                }
                break;
                case "TakeDamage": {
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHealth = heroesHp.get(heroName);
                    currentHealth -= damage;
                    heroesHp.put(heroName,currentHealth );
                    if (currentHealth > 0) {
                        System.out.printf("%s was hit for %d HP" +
                                " by %s and now has %d HP left!%n", heroName, damage, attacker, currentHealth);
                    } else {
                        heroesHp.remove(heroName);
                        heroesMp.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                }
                break;
                case "Recharge": {
                    int amount = Integer.parseInt(tokens[2]);
                    int currentMp = heroesMp.get(heroName);
                    int sumMp = currentMp + amount;
                    int maxMp = 200;

                    if (sumMp > 200) {
                        heroesMp.put(heroName, maxMp);
                        System.out.printf("%s recharged for %d MP!%n", heroName, maxMp - currentMp);
                    } else {
                        heroesMp.put(heroName, amount+(heroesMp.get(heroName)));
                        System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    }
                }
                break;
                case "Heal": {

                    int amount = Integer.parseInt(tokens[2]);
                    int currentHp = heroesHp.get(heroName);
                    int sumHp = currentHp + amount;
                    int maxHp = 100;

                    if (sumHp > 100) {
                        heroesHp.put(heroName, maxHp);
                        System.out.printf("%s healed for %d HP!%n", heroName, maxHp - currentHp);
                    } else {
                        heroesHp.put(heroName, sumHp);
                        System.out.printf("%s healed for %d HP!%n", heroName, amount);
                    }
                }
                break;
            }

            input = scanner.nextLine();
        }

        heroesHp.entrySet()
                .stream()
                .sorted((h1, h2) -> h2.getValue().compareTo(h1.getValue()))
                .forEach(h->{
                    System.out.printf("%s%n",h.getKey());
                    System.out.printf("  HP: %d%n",h.getValue());
                    System.out.printf("  MP: %d%n",heroesMp.get(h.getKey()));
                });

    }
}


