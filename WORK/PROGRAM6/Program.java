package WORK.PROGRAM6;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());
    }
}

/*
ОТВЕТ:
Name: Hero_Magician #1  Hp: 177  Type: Magician  Mana: 51
Name: Hero_Priest #2  Hp: 129  Type: Priest  Elixir: 101
Name: Hero_Priest #3  Hp: 142  Type: Priest  Elixir: 136
Name: Hero_Priest #3  Hp: 94  Type: Priest  Elixir: 120
Name: Hero_Priest #2  Hp: 129  Type: Priest  Elixir: 80
*/