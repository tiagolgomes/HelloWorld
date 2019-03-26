/*
    Desenvolver um app em Java 8, que calcule o valor de cada uma das parcelas de um pedido de venda.
    O apllicativo deverá receber como entrada os seguintes parametros:

    Order de venda
        Data
        Nome do cliente
        endereço
        itens do pedido
            produto (nome for exit, sair do laço
            valor
        numero de parcelas

        No final deverá aparecer assim:

        -Código do pedido: 1
        -Data: 01/03/2017
        -Person: Rodrigo
        -Endereço: aksfsjkfhsdkjf
        -Produtos:
        -Mouse sem fio - R$ 30,00
        -números de parcelas 3
        parcela 1: 01/04/2017 - R$10,00
        parcela 2: 01/05/2017 - R$10,00
        parcela 3: 01/06/2017 - R$10,00
        -Total do pedido: R$ 30,00
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Order {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        Person person = new Person();
        Product product = new Product();
        ArrayList<Product> listProduct = new ArrayList<Product>();

        int i;
        int number;
        String date;
        String nameClient;
        String addressClient;
        String nameProduct;
        double cost;
        double costTotal = 0;
        int parcel;
        double costParcel;

        scanner = new Scanner(System.in);

        System.out.println("Digite o número do pedido:");

        number = scanner.nextInt();
        order.setNumber(number);

        System.out.println("Digite a data:");

        scanner = new Scanner(System.in);
        date = scanner.nextLine();
        order.setDate(date);

        System.out.println("Digite o nome do Cliente:");

        nameClient = scanner.nextLine();
        person.setName(nameClient);

        System.out.println("Digite o endereço do Cliente:");

        addressClient = scanner.nextLine();
        person.setAddress(addressClient);

        order.setPerson(person);

        boolean exit = false;

        do {

            System.out.println("Digite o produto:");

            scanner = new Scanner(System.in);
            nameProduct = scanner.nextLine();
            if (nameProduct == "exit") {
                exit = true;
            }
            product.setName(nameProduct);

            System.out.println("Digite o valor do produto: ");

            cost = scanner.nextDouble();
            product.setCost(cost);

            costTotal = costTotal + cost;

            listProduct.add(product);

            order.setListProduct(listProduct);

        } while (exit);

        System.out.println("Digite a quantidade de parcelas:");

        scanner = new Scanner(System.in);
        parcel = scanner.nextInt();
        order.setParcel(parcel);

        costParcel = costTotal / parcel;

        System.out.println("O resumo do pedido é: \n\n" +
                "Código do pedido: " + order.getNumber() + "\n" +
                "Data: " + order.getDate() + "\n" +
                "Cliente: " + person.getName() + "\n" +
                "Endereço: " + person.getAddress());

        /*
        for (Product product1 : listProduct){
            System.out.println("Produto: \n" + product1.getName() + " - " + product1.getCost());
        }
        */

        for (i = 0; i < listProduct.size(); i++) {
            Product s = listProduct.get(i);
            System.out.println("Produto: \n" + s.getName() + " - " + s.getCost());

            System.out.println("Número de parcela: " + parcel);

            for (i = 0; i < order.getParcel(); i++) {
                int aux = i + 1;
                int day = Integer.parseInt(order.getDate().substring(0, 2));
                int mounth = Integer.parseInt(order.getDate().substring(3, 5));
                int year = Integer.parseInt(order.getDate().substring(6, 10));
                mounth = mounth + aux;
                String newDate = day + "/" + mounth + "/" + year;
                System.out.println(" - Parcela " + aux + " : " + newDate + " - " + costParcel);
            }

            System.out.println("Valor totaldo pedido: R$" + costTotal);

        }
    }
}
