public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
//        System.out.println(teacherCreditManager.calculate(100000));

        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new AgricultureCreditManager(), new TeacherCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager: creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }
}