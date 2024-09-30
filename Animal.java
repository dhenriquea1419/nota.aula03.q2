class Animal {
    String nome;
    String raca;

    public Animal() {
        this.nome = "Sem nome";
        this.raca = "Sem raça";
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
