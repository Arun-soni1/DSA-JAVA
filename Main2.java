import java.util.LinkedList;
public class Main2 
{
    public static void main(String[] args)
     {
        LinkedList<String> car =new LinkedList<String>();
        car.add("safari");
        car.add("Nano");
        car.add("Max");
        car.add("suzuki");
        car.add("tata");
        car.add("Maruti");
        car.addFirst("Alto");
        car.addLast("Pizarro");
        System.out.println(car);
        car.remove("max");
        car.removeFirst();
        car.removeLast();
        System.out.println(car);
    }
}