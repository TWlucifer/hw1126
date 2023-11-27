public class App4 {
    public static void main(String[] args) throws Exception {
        
        car cars[]= new car[2];

        cars[0] = new car();
        cars[0].setcar(1234, 20.5);

        cars[1] = new Racingcar();
        cars[1].setcar(4561, 550.6);

        for(int i=0;i<2;i++){
            cars[i].show();
        }
    }

}

class car {
        protected int num;
        protected double gas;

        public car(){
            num = 0;
            gas = 0.0;
            System.out.println("生產了車子");
        }
        public void setcar(int n,double g){
            num = n;
            gas = g;
            System.out.println("將車號設為"+num+"汽油量設為"+gas);
        }
        public void show(){
            System.out.println("車號為"+num);
            System.out.println("汽油量為"+gas);
        }
    }


    class Racingcar extends car{
        private int course;
        public Racingcar(){
            course = 0;
            System.out.println("生產了賽車");
        }
        public void setCourse(int c){
            course = c;
            System.out.println("將賽車編號設為"+course);
        }
        public void show(){
            System.out.println("車號為"+num);
            System.out.println("汽油量為"+gas);
            System.out.println("將賽車編號設為"+course);
        }
    }