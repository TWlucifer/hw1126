public class App9 {
    public static void main(String[] args) throws Exception {
        
        car car1 = new car(1234, 20.5);

        car1.show();
        car1.mshow();
    }

}

interface vehicle {
    int weight = 1000;
    void show();
}

interface material {
    void mshow();
    
}


class car implements vehicle,material{
    private int num;
    private double gas;
    
    public car(int n,double g){
        num = n;
        gas = g;
        System.out.println("車號為"+num+"汽油量為"+gas);
    }
    public void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
    public void mshow(){
        System.out.println("車的材質是鐵");
       }
}
class plane implements vehicle{
    private int flight;
    
    public plane(int f){
        flight = f;
        System.out.println("生產"+flight+"班次的飛機");
    }
    public void show(){
        System.out.println("班次"+flight);
    }
}