package WorkersApp;

public class Program {
     public static void main(String[] args) {
          Worker w1 = new Worker.Builder("Вася", "Пупкин").age(33).salary(232131).build();
          Passport p1 = new Passport(121, 2112);
          Worker w2 = new Worker.Builder("Вася", "")
                  .age(24)
                  .workerPost("Director")
                  .passport(p1)
                  .build();

          System.out.println(w2);
     }
}
