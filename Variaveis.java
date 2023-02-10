/**
 * @author Vinícius Pelizzari
 */
public class Variaveis {

    // criando variáveis - *SÃO TODAS VARIÁVEIS DE CLASSE
    private int num;
    private long numMaior;
    private double vlrvDec;
    private boolean verif;
    private String txt;
    private float vlrDeci;
    private short vlrDecim;
    private byte numOne;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getNumMaior() {
        return numMaior;
    }

    public void setNumMaior(long numMaior) {
        this.numMaior = numMaior;
    }

    public double getVlrvDec() {
        return vlrvDec;
    }

    public void setVlrvDec(double vlrvDec) {
        this.vlrvDec = vlrvDec;
    }

    public boolean isVerif() {
        return verif;
    }

    public void setVerif(boolean verif) {
        this.verif = verif;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public float getVlrDeci() {
        return vlrDeci;
    }

    public void setVlrDeci(float vlrDeci) {
        this.vlrDeci = vlrDeci;
    }

    public short getVlrDecim() {
        return getVlrDecim();
    }

    public void setVlrDecim(short vlrDecim) {
        this.vlrDecim = vlrDecim;
    }

    public byte getNumOne() {
        return numOne;
    }

    public void setNumOne(byte numOne) {
        this.numOne = numOne;
    }
}
/*
 * Uma variável de classe, pode ser acessada no escpo da classe e do método, já
 * uma variável de método/local, só pode ser acessada pelo escopo do método
 */