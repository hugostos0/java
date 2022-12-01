package projeto_funcionarios;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseFuncionarios pessoa = new ClasseFuncionarios();
		pessoa.setIdFuncionario(1);
		pessoa.setNomeFuncionario("Samuel");
		pessoa.setRendaFuncionario(1.3);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(pessoa);


	}

}
