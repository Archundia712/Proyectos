package proyectos;
public class Casa {
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++){
            for (int j = 6 - i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k ++){
                System.out.print("/");
            }
            System.out.println();
        }
        for (int i = 1; i <=4; i++){
            System.out.println("| * * * * |");
        }
    }
}
