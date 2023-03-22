public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int intMax = 2_147_483_647;
        byte byteMax = 127;
        short shortMax = 32_767;
        long longMax = 9_223_372_036_854_775_807L;
        float floatMax = 3.4E+38f;
        double doubleMax = 1.7E+308;

        System.out.println("Значение переменной intMax с типом int равно " + intMax);
        System.out.println("Значение переменной byteMax с типом byte равно " + byteMax);
        System.out.println("Значение переменной shortMax с типом short равно " + shortMax);
        System.out.println("Значение переменной longMax с типом long равно " + longMax);
        System.out.println("Значение переменной floatMax с типом float равно " + floatMax);
        System.out.println("Значение переменной doubleMax с типом double равно " + doubleMax);

    }

    public static void task2 () {
        System.out.println("Задача 2");

        float value1 = 27.12f;
        long value2 = 987_678_965_549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        short value6 = 27897;
        byte value7 = 67;

        System.out.println("Было предложено назначить тип переменных для числа: " + value1);
        System.out.println("Было предложено назначить тип переменных для числа: " + value2);
        System.out.println("Было предложено назначить тип переменных для числа: " + value3);
        System.out.println("Было предложено назначить тип переменных для числа: " + value4);
        System.out.println("Было предложено назначить тип переменных для числа: " + value5);
        System.out.println("Было предложено назначить тип переменных для числа: " + value6);
        System.out.println("Было предложено назначить тип переменных для числа: " + value7);

    }

    public static void task3 () {
        System.out.println("Задача 3");

        int studentsNumberKlass1 = 23;
        int studentsNumberKlass2 = 27;
        int studentsNumberKlass3 = 30;
        int sheetsPaper = 480;

        int studentsTotal = studentsNumberKlass1 + studentsNumberKlass2 + studentsNumberKlass3;
        int sheetsProStudent = sheetsPaper / studentsTotal;

        System.out.println("На каждого ученика рассчитано " + sheetsProStudent + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");

        float bottlesNumber = 16;
        float productionTime = 2;
        float performanceMinute = bottlesNumber / productionTime;

        byte productionTime1 = 20;
        short productionTime2 = 1440;
        int productionTime3 = productionTime2 * 3;
        int productionTime4 = productionTime2 * 30;

        float performance20Minute = performanceMinute * productionTime1;
        float performance1Day = performanceMinute * productionTime2;
        float performance3Days = performanceMinute * productionTime3;
        float performanceMonth = performanceMinute * productionTime4;

        System.out.println("За 20 минут машина произвела " + performance20Minute + " штук бутылок");
        System.out.println("За день машина произвела " + performance1Day + " штук бутылок");
        System.out.println("За три дня машина произвела " + performance3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + performanceMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte paintTinWhiteClass = 2;
        byte paintTinBrownClass = 4;
        short paintTinSchoolTotal = 120;

        int classNumber = paintTinSchoolTotal / (paintTinBrownClass + paintTinWhiteClass);
        int whitePantTotal = classNumber * paintTinWhiteClass;
        int brownPaintTotal = classNumber * paintTinBrownClass;

        System.out.println("В школе, где " + classNumber + " классов, нужно " + whitePantTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 6");

        byte bananas = 5;
        byte weightBanana = 80;
        short milk = 2;
        byte weightMilk1 = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEgg = 70;

        int weightTotalGram = bananas * weightBanana + milk * weightMilk1 + iceCream * weightIceCream + egg * weightEgg;
        float weightTotalKilo = weightTotalGram / 1000f;

        System.out.println("Вес спортзавтрака в граммах = " + weightTotalGram + " гр");
        System.out.println("Вес спортзавтрака в килограммах = " + weightTotalKilo + " кг");

    }

    public static void task7 () {
        System.out.println("Задача 7");

        short weightToLose = 7 * 1000;
        short weightToLoseMin = 250;
        short weightToLoseMax = 500;
        int weightToLoseAverage = (weightToLoseMin + weightToLoseMax) / 2;

        int daysToTargetWeight1 = weightToLose / weightToLoseMin;
        int daysToTargetWeight2 = weightToLose / weightToLoseMax;
        int daysToTargetWeightAverage = weightToLose / weightToLoseAverage;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + daysToTargetWeight1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то уйдет " + daysToTargetWeight2 + " дней");
        System.out.println("Если спортсмен будет терять каждый день среднее значение, то уйдет " + daysToTargetWeightAverage + " дней");

    }

    public static void task8 () {
        System.out.println("Задача 8");

        float salaryMasha = 67_760;
        float salaryDenis = 83_690;
        float salaryChristina = 76_230;

        float salaryMashaYear = salaryMasha * 12;
        float salaryDenisYear = salaryDenis * 12;
        float salaryChristinaYear = salaryChristina * 12;

        float salaryMashaAfterIncrease = salaryMasha + salaryMasha / 100 * 10;
        float salaryDenisAfterIncrease = salaryDenis + salaryDenis / 100 * 10;
        float salaryChristinaAfterIncrease = salaryChristina + salaryChristina / 100 * 10;

        float salaryMashaAfterIncreaseYear = salaryMashaAfterIncrease * 12;
        float salaryDenisAfterIncreaseYear = salaryDenisAfterIncrease * 12;
        float salaryChristinaAfterIncreaseYear = salaryChristinaAfterIncrease * 12;


        System.out.println("Маша теперь получает " + salaryMashaAfterIncrease + " рублей. Годовой доход вырос на " + (salaryMashaAfterIncreaseYear - salaryMashaYear) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfterIncreaseYear + " рублей. Годовой доход вырос на " + (salaryDenisAfterIncreaseYear - salaryDenisYear) + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristinaAfterIncrease + " рублей. Годовой доход вырос на " + (salaryChristinaAfterIncreaseYear - salaryChristinaYear) + " рублей");

    }
}