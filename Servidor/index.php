<?php 

	if($_GET){

		$URL = explode("/", $_GET["url"]);
		
		switch ($URL[0]) {
			case 'estagio':
				estagio($URL);
				break;

			case 'emprego':
				emprego($URL);
				break;

			case 'ensino':
				ensino($URL);
				break;
			
			default:
				# code...
				break;
		}

		
	}

	function estagio($value)
	{
		
		if($value[1] == 1){

			$result = '{
			  "data": {
			    "estagio": {
			      "id": "1",
			      "empresanome": "FUNAPE",
			      "titulo": "Processo Seletivo de Estágio Sistema de Informação",
			      "salario": 9500,
			      "distancia": 7,
			      "estrela": 4,
			      "tempo": "2 dias 3hs",
			      "inscricao": "22h de 1 de julho de 2019",
			      "deficiencia": "Auditiva",
			      "resumo": "Vaga de estágio para alunos do curso de Sistema de Informação com foco em engenharia de software e programação em PHP.",
			      "requisito": "- Estar no mínimo no 4º período;- Conhecimento na linguagem PHP, Mysql e Programação OO;- Conhecimento em Joomla, Jquery e Bootstrap;- Ter disponibilidade para realizar estágio não obrigatório.",
			      "cargahoraria": 20,
			      "beneficio": "- Seguro de vida;- Auxílio transporte",
			      "atividades": "Desenvolvimento de Plataforma Web, voltada para garantia de autoridade na produção intelectual, maior visibilidade, gestão da propriedade industrial e transferência de tecnologia.",
			      "sobreempresa": "As finalidades da FUNAPE, conforme estatuto são: promoção e apoio à pesquisa científica, tecnológica, filosófica e artística em todos os seus aspectos e fases; exercícios de atividades científicas, culturais e artística; divulgação de trabalhos científicos e artísticos de reconhecido valor; participação no processo de desenvolvimento do país estimulando trabalho de pesquisa; apoio à formação de recursos humanos para a ciência, tecnologia e artes; e prestação de serviços técnicos e científicos à comunidade",
			      "link": "https://www.funape.org.br/site/"
			    }
			  }
			}';

		}elseif($value[1] == 2){

			$result = '{
			  "data": {
			    "estagio": {
			      "id": "2",
			      "empresanome": "Linx",
			      "titulo": "Estágio para Sist. Inf.",
			      "salario": 800,
			      "distancia": 12,
			      "estrela": 4,
			      "tempo": "10 dias 17hs",
			      "inscricao": null,
			      "deficiencia": null,
			      "resumo": null,
			      "requisito": null,
			      "cargahoraria": null,
			      "beneficio": null,
			      "atividades": null,
			      "sobreempresa": null,
			      "link": null
			    }
			  }
			}';

		}elseif($value[1] == 3){

			$result = '
			  {
			  "data": {
			    "estagio": {
			      "id": "3",
			      "empresanome": "VULCANUM",
			      "titulo": "Estágio para Engenharia da Computação e Sistema de Informação",
			      "salario": 790,
			      "distancia": 3,
			      "estrela": 3,
			      "tempo": "7 dias 1h",
			      "inscricao": null,
			      "deficiencia": null,
			      "resumo": null,
			      "requisito": null,
			      "cargahoraria": null,
			      "beneficio": null,
			      "atividades": null,
			      "sobreempresa": null,
			      "link": null
			    }
			  }
			}';

		}else{
			$result  = '
			{
			  "data": {
			    "estagios": [
			      {
			        "id": "1",
			        "empresanome": "FUNAPE",
			        "titulo": "Processo Seletivo de Estágio Sistema de Informação",
			        "salario": 9500,
			        "distancia": 7,
			        "estrela": 4
			      },
			      {
			        "id": "2",
			        "empresanome": "Linx",
			        "titulo": "Estágio para Sist. Inf.",
			        "salario": 800,
			        "distancia": 12,
			        "estrela": 4
			      },
			      {
			        "id": "3",
			        "empresanome": "VULCANUM",
			        "titulo": "Estágio para Engenharia da Computação e Sistema de Informação",
			        "salario": 790,
			        "distancia": 3,
			        "estrela": 3
			      }
			    ]
			  }
			}
		';

		
		}

		header("Content-Type: Application/json");
		echo $result;

	}

	function emprego($value)
	{
		
		if($value[1] == 1){

			$result = '
			  {
			  "data": {
			    "emprego": {
			      "id": "1",
			      "empresanome": "Escolar Manager – Softwares para Gestão Escolar",
			      "titulo": "Desenvolvedor de Sistemas",
			      "salario": 1950,
			      "distancia": 2,
			      "tempo": "23 dias",
			      "inscricao": "20 de julho de 2019",
			      "vagas": 2,
			      "regime": "Efetivo/CLT",
			      "resumo": "Vaga destinada a criação de softwares, aplicativos e monitoria de redes e sistemas digitais.",
			      "requisito": "- Superior Completo na Área de Sistema de Informação; - Pós Graduação; - Linguagens C#, ASP.Net, Web API, Javascript, Jquery, Angular, Bootstrap, HTML5 e CSS3; - Pleno conhecimento de orientação a objetos, padrões de projeto e arquitetura de software.",
			      "cargahoraria": 40,
			      "beneficio": "- Vale transporte; - Tiquete alimentação; - Seguro Saúde; - Seguro de Vida; - Bolsa de estudo.",
			      "atividades": "Desenvolver melhorias e apoiar a manutenção do Sistema de Gestão Escolar da empresa (Escolar Manager)",
			      "sobreempresa": "Somos uma empresa composta por profissionais altamente qualificados e experientes graduados e pós-graduados em tecnologia da informação e vivência em projetos de software de grande porte.",
			      "link": "http://www.escolarmanager.com.br/"
			    }
			  }
			}';

		}elseif($value[1] == 2){

			$result = '
			  {
			  "data": {
			    "emprego": {
			      "id": "2",
			      "empresanome": "NEC Sistema LTDA",
			      "titulo": "Analista Júnior",
			      "salario": 2320,
			      "distancia": 9,
			      "tempo": "5 dias 4 horas",
			      "inscricao": null,
			      "vagas": null,
			      "regime": null,
			      "resumo": null,
			      "requisito": null,
			      "cargahoraria": null,
			      "beneficio": null,
			      "atividades": null,
			      "sobreempresa": null,
			      "link": null
			    }
			  }
			}';

		}elseif($value[1] == 3){

			$result = '
			  {
			  "data": {
			    "emprego": {
			      "id": "3",
			      "empresanome": "3E Engenharia",
			      "titulo": "Assistente Operacional",
			      "salario": 1500,
			      "distancia": 24,
			      "tempo": "23 dias",
			      "inscricao": null,
			      "vagas": null,
			      "regime": null,
			      "resumo": null,
			      "requisito": null,
			      "cargahoraria": null,
			      "beneficio": null,
			      "atividades": null,
			      "sobreempresa": null,
			      "link": null
			    }
			  }
			}';

		}else{
			$result  = '
			{
			  "data": {
			    "empregos": [
			      {
			        "id": "1",
			        "empresanome": "Escolar Manager – Softwares para Gestão Escolar",
			        "titulo": "Desenvolvedor de Sistemas",
			        "salario": 1950,
			        "distancia": 2,
			        "tempo": "23 dias"
			      },
			      {
			        "id": "2",
			        "empresanome": "NEC Sistema LTDA",
			        "titulo": "Analista Júnior",
			        "salario": 2320,
			        "distancia": 9,
			        "tempo": "5 dias 4 horas"
			      },
			      {
			        "id": "3",
			        "empresanome": "3E Engenharia",
			        "titulo": "Assistente Operacional",
			        "salario": 1500,
			        "distancia": 24,
			        "tempo": "23 dias"
			      }
			    ]
			  }
			}
		';

		
		}

		header("Content-Type: Application/json");
		echo $result;

	}

	function ensino($value)
	{
		
		if($value[1] == 1){

			$result = '
			  {
			  "data": {
			    "ensino": {
			      "id": "1",
			      "departamento": "Instituto de Informática",
			      "titulo": "Mestrado em Ciência da Computação",
			      "turno": "Vespertino",
			      "bolsa": "Aplicável",
			      "dias": 36,
			      "inscricao": "2 de agosto de 2019",
			      "tema": "Engenharia de Software, Informática e Educação, Fundamentos de Computação e Sistemas Inteligentes e Aplicações",
			      "link": "http://www.inf.ufg.br/mestrado/node/679"
			    }
			  }
			}';

		}elseif($value[1] == 2){

			$result = '
			  {
			  "data": {
			    "ensino": {
			      "id": "2",
			      "departamento": "Instituto de Informática",
			      "titulo": "Programa Nacional de Pós-Doutorado",
			      "turno": "Integral",
			      "bolsa": "Bolsa Aplicável",
			      "dias": 15,
			      "inscricao": null,
			      "tema": null,
			      "link": null
			    }
			  }
			}';

		}else{
			$result  = '
			{
			  "data": {
			    "ensinos": [
			      {
			        "id": "1",
			        "departamento": "Instituto de Informática",
			        "titulo": "Mestrado em Ciência da Computação",
			        "turno": "Vespertino",
			        "bolsa": "Aplicável"
			      },
			      {
			        "id": "2",
			        "departamento": "Instituto de Informática",
			        "titulo": "Programa Nacional de Pós-Doutorado",
			        "turno": "Integral",
			        "bolsa": "Bolsa Aplicável"
			      }
			    ]
			  }
			}
		';

		
		}

		header("Content-Type: Application/json");
		echo $result;

	}
