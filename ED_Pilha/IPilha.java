/**
 * Define a interface para ADT Pilha (FILO).
 * void push(Item item) - insere item na pilha
 * Item pop() - remove o Item mais recente da pilha
 * boolean isEmpty() - esta pilha está vazia?
 * int size() - número de Items na pilha
 *
 * @author Julio Arakaki
 * @version 06/05/2020
 */
public interface IPilha {
    // push
    public void inserir(Object o);
    // pop
    public Object remover();
    // isEmpty
    public boolean estaVazia();
    // size
    public int tamanho();
    // top
    public Object topo();
    //public boolean estaCheia();
}
