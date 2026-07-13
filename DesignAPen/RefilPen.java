package Projects.DesignAPen;
//doesn't violate the interface segregation principle since , ISP says
// an interface should have atleast method as possible , but can have multiple if
// if all of them ar related to each other , or you are sure every method that implements this interface
// have this method
public interface RefilPen {
    Refil getRefil();

    boolean canChangeRefil();

    void changeRefil(Refil newRefil);

}
