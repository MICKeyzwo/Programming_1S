import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    //漸化式を用いて入力された数の平方根を求める問題
    public static void main(String args[]){
        String in_num_str = System.console().readLine("数字を入力してください:");
        int num = Integer.parseInt(in_num_str);
        double a = 1.0;
        for(int i = 0 ; i < 30; i ++){
            a = (a + num / a) / 2;
        }
        System.out.println("数字"+ num +"の平方根は" + a + "でした");
    }
}