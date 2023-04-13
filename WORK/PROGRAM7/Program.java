package WORK.PROGRAM7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
      
        // #region ex1 Demo

        // BaseHero hero3 = new Magician();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        
        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams

        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
 

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new Priest());
                priestCount++;
            }
            else{
                teams.add(new Magician());
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}

/*
ОТВЕТ:
Name: Hero_Magician #2  Hp: 187  Type: Magician  Mana: 145
Name: Hero_Magician #3  Hp: 117  Type: Magician  Mana: 76
Name: Hero_Priest #4  Hp: 106  Type: Priest  Elixir: 95
Name: Hero_Priest #5  Hp: 117  Type: Priest  Elixir: 96
Name: Hero_Priest #6  Hp: 166  Type: Priest  Elixir: 83
Name: Hero_Priest #7  Hp: 157  Type: Priest  Elixir: 120
Name: Hero_Priest #8  Hp: 139  Type: Priest  Elixir: 118
Name: Hero_Magician #9  Hp: 135  Type: Magician  Mana: 83
Name: Hero_Magician #10  Hp: 148  Type: Magician  Mana: 63

magicalCount: 5 priestCount: 5
Name: Hero_Priest #2  Hp: 129  Type: Priest  Elixir: 80
*/