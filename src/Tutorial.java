class Tutorial {
    public static void main(String args[]) {
        int a1 = 4, b1 = 667;
        final double Pi = 3.14;
        a1 += 2;
        System.out.println(a1 * 111 + " Welcome to HELL " + --b1);
        System.out.println("Pi=" + Pi);
        System.out.println("Первый круг О \nВторой круг О");
        System.out.println("Ж\tМ");
        char a = 'a', b = 'b', с = 'с', d = 'd', n = '\n';
        System.out.println(a + " & " + b + n + с + " not " + d);
        int[][] i = new int[3][1]; //Объявление массива и задание ему размера
        int z = i.length; //Размер масива
        i[0][0] = 11;
        i[1][0] = 12;
        i[2][0] = z;

        if (i[1][0] == 12) i[1][0] = 777;
        else i[1][0]--;
        i[0][0] = i[0][0] < i[1][0] ? i[0][0] = 666 : i[0][0] - 1;//аналог if
        String[] s1 = new String[]{"LoL", "LuL", "LAIK"};

        for (int j = 0; j < z; j++) { //Можно использовать не одну переменную  (int j = 0, m = 10; j < m; j++, m--)
            System.out.print(i[j][0] + "=" + s1[j] + "|");
        }

        System.out.print("\n");
        char[] hell = s1[2].toCharArray();//Разбиваем строку на символы
        String s2 = new String(hell, 1, 3); //Создаём строку из массива hell начиная с элемента 1 берём  3 символа
        System.out.print(s2 + "\n");

        int i3 = 0;
        while (i3 < 10) {
            System.out.print("*");
            i3++;
        }
        System.out.print("\n");

        int a4 = 3;
        switch (a4) {
            case 1:
                System.out.print("-");
                break;
            case 2:
                System.out.print("--");
                break;
            case 3:
                System.out.print("---");
                break;
            default:
                System.out.print("+-=");
        }


    }

    static class Trees{
        int LenghtRadix;
        int LenghtToHeight;
        int Age;
        String Name;
        static int numbers = 0;
        int Number;

        static void setNumbers (Trees obj){
            obj.Number = ++Trees.numbers;
        }

        public static void main (String args[]){

            Graph q= new Graph();
            q.create();

            Trees AppleTree = new Trees();
            Trees.setNumbers(AppleTree);
            AppleTree.LenghtRadix = 2;
            AppleTree.LenghtToHeight = 10;
            AppleTree.Age = 2;
            AppleTree.Name = "Apple";
            Trees LipaTree = new Trees();
            Trees.setNumbers(LipaTree);
            LipaTree.LenghtRadix = 3;
            LipaTree.LenghtToHeight = 7;
            LipaTree.Age = 2;
            LipaTree.Name = "Lipa";
            System.out.print(AppleTree.LenghtRadix + " " + AppleTree.LenghtToHeight + " " + AppleTree.Age + " " + AppleTree.Name);
        }
    }
}
