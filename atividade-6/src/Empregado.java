public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    // Construtor

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    // Metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // https://www.creditas.com/exponencial/tabela-imposto-de-renda/ - Site com a tabela que usei de referência:
    public double calcularIrpf() {
        double irpf;
        if (salario <= 2259.20) {
            irpf = 0;
        }else if (salario <= 2826.65) {
            irpf = salario * 0.075;
        }else if (salario <= 3751.05) {
            irpf = salario * 0.15;
        }else if (salario <= 4664.68) {
            irpf = salario * 0.225;
        }else {
            irpf = salario * 0.275;
        }
        return irpf;

    }

    // https://www.coalize.com.br/calculadora-de-inss - Site com a tabela que usei de refêrencia:
    public double calcularInss() {
        double inss;
        if (salario <= 1412.00) {
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = salario * 0.09;
        } else if (salario <= 4000.03) {
            inss = salario * 0.12;
        } else if (salario <= 7786.02) {
            inss = salario * 0.14;
        } else {
            inss = salario * 0.14;
        }
        return inss;
    }
        
}
