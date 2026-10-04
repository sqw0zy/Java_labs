import Interfaces.*;
import ModernFurniture.*;
import VictorianFurniture.*;

public class FactoryTest {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        IO.println(chair);

        factory = new VictorianFurnitureFactory();
        Sofa sofa = factory.createSofa();
        IO.println(sofa);
    }
}
