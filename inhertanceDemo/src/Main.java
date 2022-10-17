public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        ogretmenKrediManager.calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new OgretmenKrediManager());

    }
}