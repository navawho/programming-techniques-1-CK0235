class Main {
  public static void main (String args[]) {
    Conjunto conjuntoA = new Conjunto();

    conjuntoA.push(1);
    conjuntoA.printElementos();
    conjuntoA.push(2);
    conjuntoA.printElementos();
    conjuntoA.push(3);
    conjuntoA.printElementos();
    conjuntoA.push(4);
    conjuntoA.printElementos();
    conjuntoA.push(5);
    conjuntoA.printElementos();
    conjuntoA.push(6);
    conjuntoA.printElementos();
    conjuntoA.push(7);
    conjuntoA.printElementos();
    conjuntoA.push(8);
    conjuntoA.printElementos();
    conjuntoA.push(9);
    conjuntoA.printElementos();
    conjuntoA.push(10);
    conjuntoA.printElementos();
    conjuntoA.push(11);
    conjuntoA.printElementos();
    conjuntoA.push(12);
    conjuntoA.printElementos();

    Conjunto conjuntoB = new Conjunto();
    conjuntoB.push(13);
    conjuntoB.printElementos();
    conjuntoB.push(14);
    conjuntoB.printElementos();
    conjuntoB.push(15);
    conjuntoB.printElementos();
    conjuntoB.push(3);
    conjuntoB.printElementos();

    conjuntoB.remove(3);
    conjuntoB.printElementos();

    conjuntoB.remove(14);
    conjuntoB.printElementos();

    conjuntoA.remove(6);
    conjuntoA.printElementos();

    conjuntoA.remove(4);
    conjuntoA.printElementos();

    conjuntoA.remove(9);
    conjuntoA.printElementos();

  }
}
