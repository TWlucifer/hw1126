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
            System.out.println("�Ͳ��F���l");
        }
        public void setcar(int n,double g){
            num = n;
            gas = g;
            System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
        }
        public void show(){
            System.out.println("������"+num);
            System.out.println("�T�o�q��"+gas);
        }
    }


    class Racingcar extends car{
        private int course;
        public Racingcar(){
            course = 0;
            System.out.println("�Ͳ��F�ɨ�");
        }
        public void setCourse(int c){
            course = c;
            System.out.println("�N�ɨ��s���]��"+course);
        }
        public void show(){
            System.out.println("������"+num);
            System.out.println("�T�o�q��"+gas);
            System.out.println("�N�ɨ��s���]��"+course);
        }
    }