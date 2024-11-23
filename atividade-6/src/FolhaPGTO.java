public class FolhaPGTO {

    public static void main(String[] args) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("Endereço: " + men1.getEndereco());
        System.out.println("Salário Bruto: " + men1.getSalario());
        men1.imprimir(args);

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        System.out.println("Nome: " + men2.getNome());
        System.out.println("Endereço: " + men2.getEndereco());
        System.out.println("Salário Bruto: " + men2.getSalario());
        men2.imprimir(args);

        // Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz",20);
        hora1.calcularSalario();
        System.out.println("Nome: " + hora1.getNome());
        System.out.println("Endereço: " + hora1.getEndereco());
        System.out.println("Salário Bruto: " + hora1.getSalario());
        hora1.imprimir(args);

        hora2 = new Horista("Cristina", "Rua do centro",100);
        hora2.calcularSalario();
        System.out.println("Nome: " + hora2.getNome());
        System.out.println("Endereço: " + hora2.getEndereco());
        System.out.println("Salário Bruto: " + hora2.getSalario());
        hora2.imprimir(args);
    }
}
