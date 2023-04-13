package WORK.PROGRAM5;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

    }
}

/*
ОТВЕТ:
Name: Hero_Magician #1  Hp: 160 Enegry:  144 Type: Magician
Name: Hero_Priest #1  Hp: 175 Elixir:  118 Type: Priest
Name: Hero_Priest #2  Hp: 188 Elixir:  92 Type: Priest
*/