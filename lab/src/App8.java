public class App8 {
    public static void main(String[] args) throws Exception {
        
        vehicle[] vc = new vehicle[2];

        vc[0] = new car(123, 20.5);
        vc[1] = new plane(8988);
        
        for(int i=0;i<vc.length;i++){
           if (vc[i] instanceof car) {
                System.out.println("��"+(i+1)+"�Ocar");
           }

           System.out.println("��"+(i+1)+"���Ocar");
        }
    }

}

abstract class vehicle {
        protected int speed;
        
        public void setspeed(int s){
            speed = s;
            System.out.println("�N�t�׳]��"+speed);
        }

        abstract public void show();
    }


    class car extends vehicle{
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
            System.out.println("�t�׬O"+speed);
        }
    }
    class plane extends vehicle{
        private int flight;
        
        public plane(int f){
            flight = f;
            System.out.println("�Ͳ�"+flight+"�Z��������");
        }
        public void show(){
            System.out.println("�Z��"+flight);
            System.out.println("�t�׬O"+speed);
        }
    }



    