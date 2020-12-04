package Train;
import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість поїздів: ");
        int arraySize = scanner.nextInt();
        Train[] array = RandomTrains(arraySize);
        PrintTrains(array);
        toPunktPrinter(array,arraySize);
        toPunktAndTime(array,arraySize);
        toPunktAndZag(array,arraySize);
    }
    public static Train[] RandomTrains(int arraySize) {
        Train[] array = new Train[arraySize];
        Random random = new Random();
        String[] punkt = {"Kyiv", "Kherson", "Lviv", "Dnipro", "Rivne"};
        String[] deptime = {"12:30", "10:30", "9:45", "4:15", "19:15"};
        for(int i = 0; i < arraySize; i++)
        {
           array[i]=new Train(random.nextInt(200),
                   punkt[random.nextInt(punkt.length)],
                   deptime[random.nextInt(deptime.length)],
                   random.nextInt(300),
                   random.nextInt(100),
                   random.nextInt(150),
                   random.nextInt(25));
        }
        return array;
    }


    public static void PrintTrains(Train [] array){
        for (Train train:array){
            System.out.println(train.ToString());
        }
    }
    public static void toPunktPrinter(Train []array,int arraySize){
       Scanner scanner=new Scanner(System.in);
       System.out.println("------Zavdannya A------");
       System.out.println("Type punkt: ");
       String punkt=scanner.nextLine();
       for(int i=0;i<arraySize;i++){
           if(array[i].getPunkt().equals(punkt)){
               System.out.println(array[i].ToString());
           }
       }
    }
    public static void toPunktAndTime(Train[]array,int arraySize){
        Scanner scanner=new Scanner(System.in);
        System.out.println("------Zavdannya B------");
        System.out.println("Type punkt: ");
        String punkt=scanner.nextLine();
        System.out.println("Type hours: ");
        Integer hours= scanner.nextInt();
        for(int i=0;i<arraySize;i++){
               if(array[i].getHours()>hours&array[i].getPunkt().equals(punkt)){
                System.out.println(array[i].ToString()); }
        }
    }
    public static void toPunktAndZag(Train []array,int arraySize){
        Scanner scanner=new Scanner(System.in);
        System.out.println("------Zavdannya C------");
        System.out.println("Type punkt: ");
        String punkt=scanner.nextLine();
                for(int i=0;i<arraySize;i++){
            if(array[i].getPunkt().equals(punkt)&array[i].getNumSeatsZag()>0){
                System.out.println(array[i].ToString());
            }
        }

    }
}


