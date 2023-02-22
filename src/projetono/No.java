package projetono;
// Class Generics
public class No<T> {
    private T conteudo;
    private No<T> proximono;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximono = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximono() {
        return proximono;
    }

    public void setProximono(No<T> proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

}
