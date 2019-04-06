package br.com.digitalhouse;

public class Filho {

    private  String mae;
    private  String pai;
    private  String nome1;

    public Filho(String nomeMae, String nomePai, String nomeFilho){
        mae = nomeMae;
        pai = nomePai;
        nome1 = nomeFilho;
    }


    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
        nome1 = "Cecilia";
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
        nome1 = "Humberto";
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }
}
