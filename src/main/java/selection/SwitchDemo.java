package selection;

public class SwitchDemo {

  public static void main(String[] args) {
    int day = 2;

    //fall-through behavior 落空行
    switch (day) {
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("case 4");
      case 5:
        System.out.println("Weekday");
      case 6:
        System.out.println("Weekend");
        break;
      default:
        System.out.println("1111");
    }

  }
}
