import java.util.Scanner;

public class Calculadora 
{
    Scanner ler = new Scanner(System.in);
    
    void Adição()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = num1 + num2;
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println("");    
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Subtração()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = num1 - num2;
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println("");    
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Multiplicação()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = num1 * num2;
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println("");     
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Divisão()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = num1 / num2;
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println("");      
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Exponenciação()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = Math.pow(num1,num2);
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println(""); 
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Fatorial()
    {
        long num, R;
        R = 1;   
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        for(num=num; num>0; num = num - 1)
        {
            R = R * num;
                     
        }
        System.out.println("Resultado: "+R);   
    }
    
    void Raíz_Quadrada()
    {
        double num, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
          
            R = Math.sqrt(num);
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println(""); 
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Raíz_Cúbica()
    {
        double num, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
          
            R = Math.cbrt(num);
            
            System.out.println("Resultado: "+R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println(""); 
        }
        
        System.out.println("Resultado: "+R);
    }
    
    void Porcentagem_1()
    {
        double num1, num2, R = 0;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num1 = ler.nextDouble();
            System.out.println("Digite outro número qualquer: ");
            num2 = ler.nextDouble();
            
            R = (num1 / num2) * 100;
            
            System.out.println("");
            System.out.printf("Resultado: %.2f%%" , R);
           
            System.out.println(""); 
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            System.out.println("");      
        }
        
        System.out.printf("Resultado: %.2f%%" , R);
        System.out.println("");
    }
    
    void Porcentagem_2()
    {
        int i = 1;
        double num, P, R = 0;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
            System.out.println("Digite o valor do acréscimo/decréscimo percentual: "); 
            P = ler.nextDouble();
            R = num + (num * P) / 100;

            System.out.println("");
            System.out.printf("Resultado: %.0f", R);

            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            i = ler.nextInt();
        }
        
        System.out.printf("Resultado: %.0f", R);
        System.out.println("");
    }
    
    void Porcentagem_3()
    {
        int i = 1;
        double num, P, R = 0;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
            System.out.println("Digite o valor do percentual: "); 
            P = ler.nextDouble();
            R = (num * P) / 100;

            System.out.println("");
            System.out.printf("Resultado: %.0f" , R);

            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            i = ler.nextInt();
        }
        
        System.out.printf("Resultado: %.0f" , R);
        System.out.println("");
    }
    

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int op;
        System.out.println("Digite 1 para Adição");
        System.out.println("Digite 2 para Subtração");
        System.out.println("Digite 3 para Multiplicação");
        System.out.println("Digite 4 para Divisão");
        System.out.println("Digite 5 para Exponenciação");
        System.out.println("Digite 6 para Fatorial");
        System.out.println("Digite 7 para Raíz Quadrada");
        System.out.println("Digite 8 para Raíz Cúbica");
        System.out.println("Digite 9 para Porcentagem 1");
        System.out.println("Digite 10 para Porcentagem 2");
        System.out.println("Digite 11 para Porcentagem 3");
        
        op = ler.nextInt();
        System.out.println("");
        if(op==1)
        {
            c.Adição();
        }
        
        if(op==2)
        {
            c.Subtração();
        }
        
        if(op==3)
        {
            c.Multiplicação();
        }
        
        if(op==4)
        {
            c.Divisão();
        }
        
        if(op==5)
        {
            c.Exponenciação();
        }
        
        if(op==6)
        {
            c.Fatorial();
        }
        
        if(op==7)
        {
            c.Raíz_Quadrada();
        }
        
        if(op==8)
        {
            c.Raíz_Cúbica();
        }
        
        if(op==9)
        {
            c.Porcentagem_1();
        }
        
        if(op==10)
        {
            c.Porcentagem_2();
        }
        
        if(op==11)
        {
            c.Porcentagem_3();
        }
    }
}
