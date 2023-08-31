import javax.sound.midi.Soundbank;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws IOException {
        System.out.println("\n*******************************\n");
        System.out.println("Primeiro projeto");
        System.out.println(" ");
        System.out.println("Olá, mundo!");
        System.out.println("\n*******************************\n");

        System.out.println("Segundo projeto");
        System.out.println(" ");
        char ch;
        ch ='X';
        System.out.println("ch contains" + ch);
        ch++;
        System.out.println("ch is now" + ch);
        ch = 90;
        System.out.println("ch is now" + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBoolean = true;
        System.out.println("valor do tipoByte = " + tipoByte);
        System.out.println("valor do tipoShort = " + tipoShort);
        System.out.println("valor do tipoChar = " + tipoChar);
        System.out.println("valor do tipoFloat = " + tipoFloat);
        System.out.println("valor do tipoDouble = " + tipoDouble);
        System.out.println("valor do tipoInt = " + tipoInt);
        System.out.println("valor do tipoLong = " + tipoLong);
        System.out.println("valor do tipoBoolean = " + tipoBoolean);

        System.out.println("\n*******************************\n");
        System.out.println("Terceiro Projeto");
        System.out.println(" ");
        System.out.println("\nFirst Line\nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");

        System.out.println("10 > 9 is " + (10>9));

        System.out.println("\n*******************************\n");
        System.out.println("Quarto Projeto");
        System.out.println(" ");
        int count = 10;
        char chr = 'X';
        float f = 1.2F;

        int x = 0, y = 8, z = 19, w = 7;

        System.out.println(x + y + z + w);

        System.out.println("\n*******************************\n");
        System.out.println("Quinto Projeto");
        System.out.println(" ");
        double radius = 4, height = 5;

        double volume = 3.1416 * radius * radius * height;
        System.out.println("\nvolume is " + volume);

        System.out.println("\n*******************************\n");
        System.out.println("Sexto Projeto");
        System.out.println(" ");
        int m;
        m = 10;
        int n;
        n = 0;
        if(m==10) {
            System.out.println("m and n" + m + " " + n);
            m = n * 2;

        }
        n = 100;

        System.out.println("m is " + m);

        for(int i = 0; i< 3; i++) {
            int j = -1;
            System.out.println("j is: " + j);
            j = 100;
            System.out.println("j is now: " + j);
        }

        System.out.println("\n*******************************\n");
        System.out.println("Setimo Projeto");
        System.out.println(" ");
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3;
        System.out.println("\nResult and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " +dresult + " " +drem);

        System.out.println("\n*******************************\n");
        System.out.println("Oitavo Projeto");
        System.out.println(" ");

        int i, j; boolean b1, b2;
        i = 10;
        j = 11;

        if(i < j) System.out.println("\n i< j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2)
            System.out.println("this won't execute");
        if(!(b1  & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");

        System.out.println("\n*******************************\n");
        System.out.println("Nono Projeto");
        System.out.println(" ");

        x = 5;
        int resultado = ++x;
        System.out.println("\nx: " + x);
        System.out.println("resultado: " + resultado);

        x = 5;
        resultado = x++;
        System.out.println("\nx: " + x);
        System.out.println("resultado: " + resultado);

        System.out.println("\n*******************************\n");
        System.out.println("Decimo Projeto");
        System.out.println(" ");

        enum DiaDaSemana{
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }

        DiaDaSemana dia = DiaDaSemana.QUARTA;

        switch (dia) {
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia de Trabalho.");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Final de Semana.");
                break;
        }

    }
}
