public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        {
            Student s1 = new Student();
            s1.roll=21;
            Address ad = new Address();
            ad.addressID=123;
            s1.address=ad;

            Student s2 = (Student) s1.clone();
            s2.roll=56;

            System.out.println(s1.roll);
            System.out.println(s2.roll);

        }
    }
}
