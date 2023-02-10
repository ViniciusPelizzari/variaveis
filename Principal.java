/**
 * @author Vinícius Pelizzari
 */
public class Principal {

    // imprimindo os exemplos dos tipos de dados
    public static void main(String[] args) {
        // criando objeto
        Variaveis vari = new Variaveis();
        // declarando atributos
        vari.setNum(123);
        vari.setNumMaior(12548793);
        vari.setVlrvDec(6.6);
        vari.setVerif(true);
        vari.setTxt("Teste");
        vari.setVlrDeci(6.4f);
        // vari.setVlrDecim();
        // vari.setNumOne(getNumOne);

        // imprimindo resultados
        System.out.println(vari.getNum());
        System.out.println(vari.getNumMaior());
        System.out.println(vari.getVlrvDec());
        System.out.println(vari.isVerif());
        System.out.println(vari.getTxt());
        System.out.println(vari.getVlrDeci());
        // System.out.println(vari.getVlrDecim());
        // System.out.println(vari.getNumOne());
    }
}