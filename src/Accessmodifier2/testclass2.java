package Accessmodifier2;
public class testclass2 {
 int t=30;
 void displyhafca(){
     System.out.println(t);
 }
 private void displayhafcaprivate()
 {
     System.out.println(t+"hi");
 }
 protected void displayhafcaprotect(){

     System.out.println(t+"lkj");
 }
 public void displayhafcapublic(){
     System.out.println(t+"ko");
 }
//this code can be all accessed under this class
    public static void main(String[] args) {
        testclass2 tc2=new   testclass2();
        tc2.displyhafca();
        tc2.displayhafcaprivate();
        tc2.displayhafcaprotect();
        tc2.displayhafcapublic();

    }
}
