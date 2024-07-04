import model.Apple;
import model.Samsong;
import view.Phone;

public class Main {
  public static void main(String[] args) {

    Phone apple = new Apple("잡스");
    apple.turnOn();
    apple.loading();

    Phone samsong = new Samsong("재용");
    samsong.turnOn();
    samsong.loading();

  }
}
