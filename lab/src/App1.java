public class App1 {
    public static void main(String[] args) throws Exception {
        
        Racingcar rccar1= new Racingcar(1234, 20.5,5);
    }

}

class car {
        private int num;
        private double gas;

        public car(){
            num = 0;
            gas = 0.0;
            System.out.println("生產了賽車");
        }

        public car(int n, double g){
            num = n;
            gas = g;
            System.out.println("生產了車子"+num +"汽油量為"+gas);
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
        public Racingcar(int n,double g,int c){
            super(n,g);
            course = c;
            System.out.println("生產編號為"+course+"的賽車");
        }
        public void setCourse(int c){
            course = c;
            System.out.println("將賽車編號設為"+course);
        }
    }