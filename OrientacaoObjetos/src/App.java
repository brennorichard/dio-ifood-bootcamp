class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW M4");
        carro1.setCapacidade(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        // System.out.println(carro1.getCapacidade());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        // System.out.println(carro2.getCapacidade());
        System.out.println(carro2.totalValorTanque(6.39));

    }
}
