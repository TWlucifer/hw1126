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
        System.out.println("������"+num+"�T�o�q��"+gas);
    }
    public void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
    public void mshow(){
        System.out.println("��������O�K");
       }
}
class plane implements vehicle{
    private int flight;
    
    public plane(int f){
        flight = f;
        System.out.println("�Ͳ�"+flight+"�Z��������");
    }
    public void show(){
        System.out.println("�Z��"+flight);
    }
}