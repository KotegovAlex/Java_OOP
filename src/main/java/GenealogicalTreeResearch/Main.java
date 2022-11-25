package GenealogicalTreeResearch;

public class Main {
    public static void main(String[] args) {

        Human irina = new Human("Irina");
        Human vasiliy = new Human("Vasiliy");
        Human masha = new Human("Masha");
        Human jane = new Human("Jane");
        Human ivan = new Human("Ivan");
        Human igor = new Human("Igor");
        Human egor = new Human("Egor");
        Human polina = new Human("Polina");
        Human vladimir = new Human("Vladimir");
        Human svetlana = new Human("Svetlana");
        Human stepan = new Human("Stepan");
        Human vova = new Human("Vova");

        GenTree genTree1 = new GenTree();
        genTree1.append(irina, vasiliy);
        genTree1.append(igor, vasiliy);
        genTree1.append(irina, masha);
        genTree1.append(irina, egor);
        genTree1.append(vasiliy, jane);
        genTree1.append(vasiliy, ivan);

        GenTree genTree2 = new GenTree();
        genTree2.append(svetlana, polina);
        genTree2.append(vladimir, polina);
        genTree2.append(svetlana, stepan);
        genTree2.append(vladimir, stepan);
        genTree2.append(svetlana, vova);
        genTree2.append(vladimir, vova);

        System.out.println("1. Поиск родителей:");
        for (Human hum : (new ParentResearch(genTree2, polina).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("2. Поиск детей:");
        for (Human hum : (new ChildResearch(genTree2, vladimir).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("3. Поиск братьев и сестёр:");
        for (Human hum : (new BrotherSisterResearch(genTree2, polina).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("4. Поиск бабушек и дедушек:");
        for (Human hum : (new GrandParentsResearch(genTree1, jane).start())) {
            System.out.println(hum.getName());
        }
    }
}

