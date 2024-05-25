public class Student implements Cloneable{
    public int roll;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
