public class Main {
    public static void main(String[] args) {
      // Задание 1
        int first = 321333;
        byte person = 31;
        short tri = 333;
        long chetyre = 777777766789012L;
        float fifth = 3.255f;
        double six = 2.33;
        char seven = '7';
        char percent = 37;
        boolean personIsAdult = person > 18;
        System.out.println (chetyre);

        //Задание 2
        double fighter1 = 78.2;
        double fighter2 = 82.7;
        double allFightersWeight = fighter1 + fighter2;
        double differenceWeight = fighter2 - fighter1;
        System.out.println ("Общий вес боксеров " + allFightersWeight);
        System.out.println("Разница в весе боксеров " + differenceWeight);

        //Задание 3
        int bananas = 5 * 80;
        int milk = 200 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int inCommonGram = bananas + milk + iceCream + eggs;
        float inCommonKilo = (bananas + milk + iceCream + eggs)/1000;
        System.out.println(inCommonGram);
        System.out.println("Общий вес всех продуктов (кг): " + inCommonKilo);

        //Задание 4
        int sportWeight = 87;
        int mustWeight = sportWeight-7;
        int minus250 = (sportWeight-mustWeight)*1000/250;
        int minus500 = (sportWeight-mustWeight)*1000/500;
        System.out.println("При сбросе по 250 грамм в день, спортсмен будет худеть: " + minus250 + " дней");
        System.out.println("При сбросе по 250 грамм в день, спортсмен будет худеть: " + minus500 + " дней");


        //Задание 5
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        double salaryGrow = 1.1;
        int year = 12;
        double mashaGrow = masha * salaryGrow;
        double mashaYear2Grow = mashaGrow * year;
        double mashaYear1 = masha * year;
        double mashaDiff = mashaYear2Grow - mashaYear1;
        double denisGrow = denis * salaryGrow;
        double denisYear2Grow = denisGrow * year;
        double denisYear1 = denis * year;
        double denisDiff = denisYear2Grow - denisYear1;
        double kristinaGrow = kristina * salaryGrow;
        double kristinaYear2Grow = kristinaGrow * year;
        double kristinaYear1 = kristina * year;
        double kristinaDiff = kristinaYear2Grow - kristinaYear1;


        System.out.println("Маша теперь получает " + mashaGrow + " рублей в месяц. В год: " + mashaYear2Grow + " рублей. Годовой доход вырос на: " + mashaDiff);
        System.out.println("Денис теперь получает " + denisGrow + " рублей в месяц. В год: " + denisYear2Grow + " рублей. Годовой доход вырос на: " + denisDiff);
        System.out.println("Кристина теперь получает " + kristinaGrow + " рублей в месяц. В год: " + kristinaYear2Grow + " рублей. Годовой доход вырос на: " + kristinaDiff);

    }
}