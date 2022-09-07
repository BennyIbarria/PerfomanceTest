public class PerformanceStringConcatenatioTest {
    public static void main(String[] args) {

        //Declaramos tres instancias de la clase String
        String a = "a";
        String b= "b";
        String c= a;

        //Utilizamos la clase StringBuilder para generar objetos
        StringBuilder sb = new StringBuilder(a);

        //Con esta variable iniaremos a contar los milisegundos que tardará el programa en completar los ciclos
        long inicio = System.currentTimeMillis();

        //En este bucle llevamos a imprimir las instancias declaradas del tipo String

        for (int i=0; i<100000; i++){
           c = c.concat(a).concat(b).concat("\n"); //500 it = 0ms, 1,000 it = 0ms, 10,000 it = 200ms, 100,000 it = 7472 ms
           //c += a + b + "\n";//500 it = 20ms, 1000 it =31 ms, 10,000 it = 85ms, 100,000 it = 2935 ms
           //sb.append(a).append(b).append("\n");//500 it = 0ms, 1000 it = 0ms, 10,000 it = 16 ms, 100,000 it = 16ms
        }

        //Con esta variable tendremos el control de la finalización del tiempo que dura en finalizar el programa
        long fin = System.currentTimeMillis();

        //Aqui imprimimos el tiempo que tardó en completar todos los ciclos declarados en el ciclo For
        System.out.println(fin-inicio);

        //Imprimimos loos objetos para ver que esté trabajando el ciclo for
        System.out.println("c= " + c);

        //Tenemos que pasar como de tipo cadena la instancia de la clase StringBuilder
        System.out.println("sb " + sb.toString());
    }

}
