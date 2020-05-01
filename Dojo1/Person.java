class Person {
  //印刷用処理
  public static void printData(String name, int age, double height, double weight){
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    
    if (age >= 20) {
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
    
  
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    
    //BMIの算出
    double bmi = bmi(height, weight);
    System.out.println("BMIは"+ Math.round(bmi) +"です");
    
    //BMIの分析で出力
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }
  }
  
  //名前の連結処理
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  //BMIを計算
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  
  //BMI判断
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}
