package Javaoop;

public class ThisKeyWord {
    int x,y;

    public static void main(String[] args) {
        ThisKeyWord tkw = new ThisKeyWord(20,30);
       tkw.display();

    }

   void setData(int x ,int y ){
      this.x=x;
        this.y=y;
   }


    ThisKeyWord(int x, int y){

        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);

    }

}
