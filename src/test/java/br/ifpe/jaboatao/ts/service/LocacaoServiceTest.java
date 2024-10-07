package br.ifpe.jaboatao.ts.service;


import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.ifpe.jaboatao.ts.entidades.Filme;
import br.ifpe.jaboatao.ts.entidades.Locacao;
import br.ifpe.jaboatao.ts.entidades.Usuario;
import br.ifpe.jaboatao.ts.servicos.LocacaoService;
import br.ifpe.jaboatao.ts.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void teste01() {
		//Cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuário 01");
		Filme filme = new Filme("Filme 01", 1, 10.0);
		
		//Ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//Verificação
		Assertions.assertTrue(locacao.getUsuario().getNome() == "Usuário 01");
		Assertions.assertTrue(DataUtils.boDatasIguais(locacao.getDataLocacao(), new Date()));
		Assertions.assertTrue(DataUtils.boDatasIguais(locacao.getDataRetorno(), DataUtils.incrementarQntDias(1)));
		
	}

}
