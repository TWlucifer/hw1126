public class App5 {
    public static void main(String[] args) throws Exception {
        
        car car1= new car();

        car1.setcar(1234, 54.8);
        System.out.println(car1);
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
        public String toString(){
            String str = "����"+num+"�T�o�q��"+gas;

            return str;
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