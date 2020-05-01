import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bicycle.info();
    
    System.out.println("-----------------");
    Scanner scanner = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int scannerRun = scanner.nextInt();
    bicycle.run(scannerRun);
    
    System.out.println("=================");
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.info();
    
    System.out.println("-----------------");
    Scanner scannerCar = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int scannerCarRun = scanner.nextInt();
    car.run(scannerCarRun);
    
    System.out.println("-----------------");
    Scanner scannerCharges = new Scanner(System.in);
    System.out.print("給油する量を入力してください：");
    int scannerChargesRun = scanner.nextInt();
    car.charge(scannerChargesRun);
    
  }
}
