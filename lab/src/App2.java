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
        public void newshow(){
            System.out.println("������"+num);
            System.out.println("�T�o�q��"+gas);
            System.out.println("�N�ɨ��s���]��"+course);
        }
    }