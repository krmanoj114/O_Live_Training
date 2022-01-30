import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample{
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda to filter data
        long t0 = System.currentTimeMillis();
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection  
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
        long t1 = System.currentTimeMillis();
        System.out.printf("Time taken = %, d%n",t1 - t0);

        long t2 = System.currentTimeMillis();
        list.stream()
                .filter(product -> product.price > 20000)
                .map(product -> product.name + ":" + product.price)
                .forEach(System.out::println);

        long t3 = System.currentTimeMillis();
        System.out.printf("Time taken old way= %, d%n", t3 - t2);

        long t4 = System.currentTimeMillis();
        list.stream()
                .filter(p -> p.price > 20000)
                .map(p -> p.name + ":" + p.price)
                .forEach(System.out::println);

        long t5 = System.currentTimeMillis();
        System.out.printf("Time taken old way>>>>>>> %, d%n", t5 - t4);


    }
}  