/**
 * @author Vinícius Pelizzari
 */
public class Principal {

    // imprimindo os exemplos dos tipos de dados
    public static void main(String[] args) {
        Variaveis vari = new Variaveis();
        System.out.println("int: " + vari.retNum());
        System.out.println("long: " + vari.retNumMaior());
        System.out.println("double: " + vari.retVlrDec());
        System.out.println("boolean: " + vari.retVerif());
        System.out.println("String: " + vari.retTxt());
        System.out.println("float" + vari.retVlrDeci());
        System.out.println("short: " + vari.retVlrDecim());
        System.out.println("byte: " + vari.retNumOne());

    }
}