package Agregasi;

public class Mainprogram {
    public static void main(String[] args) {
        //membuat object phone
        Phone handPhone = new Phone();

        //memanggil attribut dan nilai
        handPhone.brand = "OPPO";
        handPhone.OS = "OneUI";

        Person akhmad = new Person(handPhone);

        akhmad.brand = "OPPO";
        akhmad.start();
        akhmad.run();
        akhmad.shutdown();
    }
}
