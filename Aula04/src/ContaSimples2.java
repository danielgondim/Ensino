/**
 * Classe de conta banc�ria simples.
 *
 * @author Jacques Sauv�
 * @version 2.0
 */

public class ContaSimples2 {
   private static final String STRING_VAZIA = "";
   private String nome;
   private String cpf;
   private int numero;
   private double saldo;

   // construtor
   /**
    * Cria uma conta a partir de um nome e cpf de pessoa f�sica, e um n�mero de
    * conta.
    *
    * @param nome
    *            O nome do titular da conta.
    * @param cpf
    *            O CPF do titular da conta.
    * @param n�mero
    *            O n�mero da conta.
    * @throws Exception
    *             Se o nome for nulo ou vazio, o CPF for nulo ou vazio ou a
    *             conta n�o for um n�mero positivo
    */
   public ContaSimples2(String nome, String cpf, int numero) throws Exception {
      if (nome == null || nome.equals(STRING_VAZIA)) {
         throw new Exception("Nome nao pode ser nulo ou vazio");
      }
      if (cpf == null || cpf.equals(STRING_VAZIA)) {
         throw new Exception("CPF nao pode ser nulo ou vazio");
      }
      if (numero <= 0) {
         throw new Exception("N�mero da conta deve ser positivo");
      }
      this.nome = nome;
      this.cpf = cpf;
      this.numero = numero;
      this.saldo = 0.0;
   }

   // m�todos
   /**
    * Recupera o nome do titular da conta.
    *
    * @return O nome do titular da conta.
    */
   public String getNome() {
      return nome;
   }

   /**
    * Recupera o CPF do titular da conta.
    *
    * @return O CPF do titular da conta.
    */
   public String getCPF() {
      return cpf;
   }

   /**
    * Recupera o n�mero da conta.
    *
    * @return O n�mero da conta.
    */
   public int getNumero() {
      return numero;
   }

   /**
    * Recupera o saldo da conta.
    *
    * @return O saldo da conta.
    */
   public double getSaldo() {
      return saldo;
   }

 
   /**
    * Efetua um dep�sito numa conta.
    *
    * @param valor
    *            O valor a depositar.
    * @throws Exception
    *             Quando o valor a depositar � negativo.
    *
    */
   public void depositar(double valor) throws Exception {
      if (valor < 0.0) {
         throw new Exception("Deposito nao pode ser negativo");
      }
      saldo += valor;
   }

   /**
    * Efetua saque na conta.
    *
    * @param valor
    *            O valor a sacar.
    * @return O sucesso ou n�o da opera��o.
    * @throws Exception
    *             Para um valor de saque negativo
    */
   public boolean sacar(double valor) throws Exception {
      if (valor < 0.0) {
         throw new Exception("Saque nao pode ser negativo");
      }
      if (saldo >= valor) {
         saldo -= valor;
         return true;
      }
      return false;
   }

   /**
    * Transforma os dados da conta em um String.
    *
    * @return O string com os dados da conta.
    */
   public String toString() {
      return "numero " + getNumero() + ", nome " + getNome() + ", saldo " + getSaldo();
   }

   // O programa sempre tem um "m�todo" main que � onde come�a a execu��o
   public static void main(String args[]) {
      // Abra uma conta de n�mero 1 para Jo�o com CPF 309140605-06
      // A conta ser� "referenciada" com a vari�vel umaConta
      ContaSimples2 umaConta = null;
      try {
         umaConta = new ContaSimples2("Joao", "30914060506", 1);
         // Nesta conta, deposite R$1000,00
         umaConta.depositar(1000.0);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

      // Imprima o saldo da conta de Jo�o
      double saldo = umaConta.getSaldo();
      System.out.print("Saldo da conta de Joao antes do saque: ");
      System.out.println(saldo);

      // Saque R$300,00 desta conta
      try {
         umaConta.sacar(300.0);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

      // Imprima o objeto umaConta
      System.out.println(umaConta);
      // Imprima o saldo da conta de Jo�o
      System.out.println("Saldo da conta de Joao depois do saque: "
            + umaConta.getSaldo());
   } // fim do m�todo main
}