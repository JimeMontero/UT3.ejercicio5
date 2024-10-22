//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agua potable = new Agua(125);
        potable.determinarEstado();
        System.out.println("El agua tiene "+ potable.temperatura+"°C");
    }

}