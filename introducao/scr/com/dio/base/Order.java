package com.dio.base;

public class Order {

    private final String code;
    private final int totalValue;

    private String[] itens;

    // Comentário em Linha

    /*
    *Comentário
    *em
    *bloco
    */

    /**
     * @author Emanuel
     * @version
     * @see BigDecimal
     * @since 1.0.0
     */

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /*
    public void printItens() {

        int i = 0;

        while (i < itens.length) {
            System.out.println(itens[i]);
            i++;
        }

        i = 0;
        do {
            System.out.println(itens[i]);
            i++;
        } while (i < itens.length);

        for (int i2 = 0; i2 < itens.length; i2++) {
            System.out.println(itens[i2]);
        }

        for (String i3 : itens) {
            System.out.println(itens);
        }
    }
    */

    /*
     * public double calculateFee() {
     * switch (totalValue) { // Não se usa double em switch erro do expert
     * case 100:
     * return totalValue * 0.99;
     * 
     * case 200:
     * return totalValue * 1.99;
     * 
     * default:
     * return totalValue;
     * }
     */
}
