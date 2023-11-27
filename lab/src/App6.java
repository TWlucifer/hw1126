public class App6 {
    public static void main(String[] args) throws Exception {
        
        car car1= new car();
        car car2= new car();
        car car3= car1;

        System.out.println("car1與car2相同"+car1.equals(car2));
        System.out.println("car1與car2相同"+car1.equals(car3));
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
        public String toString(){
            String str = "車號"+num+"汽油量為"+gas;

            return str;
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