package projeto_funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClasseInsertSQL {

	
	public void salvarDados(ClasseFuncionarios pessoa) {
		
		String insert_sql = "INSERT INTO tabela_banco VALUES(default, ?, ?)";
		Connection acesso = null; // import java.sql
		PreparedStatement preparar = null; // import java.sql
		
		try {
			acesso = ClasseDadosConexao.criarConexao();//Juntar dados do banco com o comando sql insert
			preparar = acesso.prepareStatement(insert_sql);
			preparar.setString(1, pessoa.getNomeFuncionario());
			preparar.setDouble(2, pessoa.getRendaFuncionario());
			preparar.execute();
			}
			catch(Exception e) {
			System.out.println("Erro ao acessar o banco!" + e);
			}
		finally {
			try {
				if(preparar != null) {
					preparar.close();
				}
				if(acesso != null) {
					acesso.close();
				}
				}catch(Exception e) {
					System.out.println();
				}
			}
	}
}
