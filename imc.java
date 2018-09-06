import java.util.Scanner;

public class imc
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Float peso,
              altura,
              i;

        System.out.print("qual o seu peso? ");
        peso = input.nextFloat();

        System.out.print("e a sua altura? ");
        altura = input.nextFloat();

        i = peso / (altura * altura);

        if(i <= 16.9)
        {
            System.out.print("Você esta muito a baixo do peso! seu imc é: " + i);
        }

        if(i >= 17 && i <= 18.4)
        {
            System.out.print("Você esta a baixo do peso! seu imc é: " + i);
        }

        if(i >= 18.5 && i <= 24.9)
        {
            System.out.print("Seu peso esta normal! seu imc é: " + i);
        }

        if(i >= 25 && i <= 29.9)
        {
            System.out.print("Você esta a cima do peso! seu imc é: " + i);
        }

        if(i >= 30)
        {
            System.out.print("Você tem obesidade! seu imc é: " + i);
       }
    }
}