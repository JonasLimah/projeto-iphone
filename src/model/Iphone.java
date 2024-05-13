package model;

public class Iphone extends Electronic implements Browser,Ipod,Telephone{
    @Override
    public void showPage() {
        System.out.println("Mostrando navegador");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando página");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void next() {
        System.out.println("Próxima musica");

    }

    @Override
    public void decrease() {
        System.out.println("Voltando musica");
    }

    @Override
    public void pause() {
        System.out.println("pausando musica");
    }

    @Override
    public void turnUp() {
        System.out.println("Aumentando volume");
    }

    @Override
    public void turnDown() {
        System.out.println("Diminuindo volume");
    }

    @Override
    public void call() {
        System.out.println("ligando...");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo!");
    }

    @Override
    public void voiceMail() {
        System.out.println("Iniciando correio de voz.");

    }
}
