package lesson_7;

public class MyTest {

    @BeforeSuite
    public static void test2() {
        System.out.println("test2 BeforeSuite");
    }

    @Test
    public static void test4() {
        System.out.println("test4");
    }

    @Test
    public static void test1() {
        System.out.println("test1");
    }

    @Test(priority = 3)
    public static void test8() {
        System.out.println("test8 priority = 3");
    }

    @Test(priority = 4)
    public static void test9() {
        System.out.println("test9 priority = 4");
    }

    @AfterSuite
    public static void test5() {
        System.out.println("test5 AfterSuite");
    }
}