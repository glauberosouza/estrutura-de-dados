package pilhas;

import javax.management.ReflectionException;

public class Pilha {

    private NoPilha reNoPilhaEntrada;

    public Pilha() {
        this.reNoPilhaEntrada = null;
    }

    public NoPilha top() {
        return reNoPilhaEntrada;
    }

    public NoPilha pop() {
        if (!this.isEmpty()) {
            //Verificar o erro.
            NoPilha noPoped = reNoPilhaEntrada;
            reNoPilhaEntrada = reNoPilhaEntrada.getRefNo();
    }
        return null;
    }

    public void push(NoPilha novoNo) {
        NoPilha reAuxiliar = reNoPilhaEntrada;
        reNoPilhaEntrada = novoNo;
        reNoPilhaEntrada.setRefNo(reAuxiliar);
    }

    public boolean isEmpty(){
    return reNoPilhaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha:\n";
        stringRetorno += "------------\n";

        NoPilha noAuxiliar = reNoPilhaEntrada;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}