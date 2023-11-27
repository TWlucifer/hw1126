public class App2 {
    public static void main(String[] args) throws Exception {
        
        Racingcar rccar1= new Racingcar();

        rccar1.setcar(1234, 20.5);
        rccar1.setCourse(5);
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
        public void newshow(){
            System.out.println("車號為"+num);
            System.out.println("汽油量為"+gas);
            System.out.println("將賽車編號設為"+course);
        }
    }