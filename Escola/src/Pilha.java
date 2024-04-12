

public class Pilha {
    Aluno[] itens;
    int topo;

    Pilha(int tamanho) {
        itens = new Aluno[tamanho];
        topo = -1;
    }

    boolean isEmpty() {
        return topo == -1;
    }

    boolean isFull() {
        return topo == itens.length - 1;
    }

    void push(Aluno aluno) {
        if (isFull()) {
            System.out.println("Erro: pilha cheia!");
            return;
        }
        itens[++topo] = aluno;
    }

    Aluno pop() {
        if (isEmpty()) {
            System.out.println("Erro: pilha vazia!");
            return null;
        }
        return itens[topo--];
    }

    Aluno topo() {
        if (isEmpty()) {
            return null;
        }
        return itens[topo];
    }

    void destroy() {
        topo = -1;
    }
}