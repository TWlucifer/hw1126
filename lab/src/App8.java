public class App8 {
    public static void main(String[] args) throws Exception {
        
        vehicle[] vc = new vehicle[2];

        vc[0] = new car(123, 20.5);
        vc[1] = new plane(8988);
        
        for(int i=0;i<vc.length;i++){
           if (vc[i] instanceof car) {
                System.out.println("第"+(i+1)+"是car");
           }

           System.out.println("第"+(i+1)+"不是car");
        }
    }

}

abstract class vehicle {
        protected int speed;
        
        public void setspeed(int s){
            speed = s;
            System.out.println("將速度設為"+speed);
        }

        abstract public void show();
    }


    class car extends vehicle{
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
            System.out.println("速度是"+speed);
        }
    }
    class plane extends vehicle{
        private int flight;
        
        public plane(int f){
            flight = f;
            System.out.println("生產"+flight+"班次的飛機");
        }
        public void show(){
            System.out.println("班次"+flight);
            System.out.println("速度是"+speed);
        }
    }



    