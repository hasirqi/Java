import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("何人分の情報を入力しますか：");
    int numberPeople = scanner.nextInt();
    int maxAge = 0;
    int totalAge = 0;
    for (int i = 0; i < numberPeople; i++) {
      System.out.println((i + 1) + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
    
      System.out.print("年齢：");
      int age = scanner.nextInt();
      //年齢の合計計算
      totalAge = totalAge + age;
      
      //最高年齢分析
      if (age > maxAge) {
        maxAge = age;
      }
    
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
    
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      
      Person.printData(Person.fullName(firstName, lastName), age, height, weight);
      
      }
      //最高年齢者を出力
      System.out.println("最高年齢は" + maxAge + "歳です");
      //平均年齢
      System.out.println("平均年齢は" + totalAge / numberPeople + "歳です");
    }
    
    
}

