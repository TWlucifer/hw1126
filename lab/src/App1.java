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
            System.out.println("�Ͳ��F�ɨ�");
        }

        public car(int n, double g){
            num = n;
            gas = g;
            System.out.println("�Ͳ��F���l"+num +"�T�o�q��"+gas);
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
        public Racingcar(int n,double g,int c){
            super(n,g);
            course = c;
            System.out.println("�Ͳ��s����"+course+"���ɨ�");
        }
        public void setCourse(int c){
            course = c;
            System.out.println("�N�ɨ��s���]��"+course);
        }
    }