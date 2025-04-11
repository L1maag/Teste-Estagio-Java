MOBIT - Teste de nível JAVA para Estágio
========================================

Visão do projeto
----------------
O teste consiste em desafios para avaliar o nível de conhecimento do candidato em logica de programação, orientação a objetos e linguagem de programação JAVA.

Tecnologias:
*	JAVA 12;
*	Controle de versão GIT;
*	Testes unitários com Junit;
*	Gerenciador de dependências Maven;

Iniciando
---------
Projeto disponibilizado em: 
    
    http://pdi.mobitbrasil.com.br:8601/projects/ANP/repos/estagiario-java

Para realizar o teste, faça o clone do repositório em sua máquina local.  
 
    http://pdi.mobitbrasil.com.br:8601/scm/anp/estagiario-java.git

Também disponível para download em:

    http://pdi.mobitbrasil.com.br:8601/rest/api/latest/projects/ANP/repos/estagiario-java/archive?format=zip

Utilize o e-mail jobs@mobitbrasil.com.br para dúvidas e esclarecimentos.

Tarefas
-------
Os seguintes testes buscam avaliar o nível de conhecimento do candidato em recursos da plataforma Java. Caso o candidato deseje, pode-se utilizar de bibliotecas de terceiros para auxílio, desde que presentes em repositórios Maven.

Não é permitido alterar a assinatura de metodos existentes, mais caso necessário, pode-se criar metodos e classes auxiliares.

É de escolha do canditado a IDE ou editor de textos preferido para codificação.

1.	Validar a forma de um triangulo:
        
        *  O método receberá 3 valores quaisquer que representam os lados de um triangulo, desenvolver o algoritmo para verificar se é um triangulo, sabendo que, para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros dois lados e maior que o valor absoluto da diferença entre essas medidas..
        
            Exemplo: Entradas: 5, 9, 10 -> Saída: true.
        
            Retorno: true|false se é um triangulo;
				
2.	Validar se uma frase é um palíndromo: 
        
        *  O método receberá como entrada um texto, desenvolver um algoritmo para verificar se o texto recebido é um palíndromo, sabendo que um palíndromo são palavras (frases também) que são iguais quando lidas de frente para trás e de trás para frente, ignorando os espaços. 
            
            Exemplo: Entradas: amor e roma -> Saída: true.

            Retorno: true|false se é um palíndromo;

3.	Retornar o primeiro número primo após um valor numérico informado:
        
        *  O método receberá como entrada um valor numérico, desenvolver o algoritmo para retornar o primeiro número primo após o valor numérico informado.
            
            Exemplo: Entrada: 5 -> Saída: 7.
            
            Retorno: Um valor numérico.

4.	Validar se duas palavras são anagramas:
        
        *  O método receberá como entrada dois textos, desenvolver um algoritmo para verificar se os textos recebidos são anagramas, sabendo que anagrama é quando uma forma-se varias palavras com exatamente as mesma letras.
            
            Exemplo: Entradas: pato e topa -> Saída: true.
            
            Retorno: true|false se é anagrama;

5.	Retornar a soma de todos os valores positivos entre 1 e um valor especificado:
       
        *  O método receberá como entrada um valor numérico, desenvolver um algoritmo recursivo para somar todos os valores numéricos de 1 até o valor recebido.
            
            Exemplo: Entrada: 6 (6+5+4+3+2+1) -> Saída: 21.
            
            Retorno: Um valor numérico.

6.  Construção de classes: 
    
    a)  Crie uma interface Exibível que possui um único método chamado exibir(). Todas as classes que desejam exibir informações devem implementar essa interface. 
	
	b)  Crie a classe Motor. Inclua dados como potência (Numérico) e cilindrada (Numérico). Inclua um método exibir() para a visualização dos valores das variáveis de instância. 
	
	c)  Crie uma classe Peça. Inclua dados como descrição e marca e um método exibir() para a visualização dos valores das variáveis de instância. 
	
	d)  A classe Veiculo deve agregar uma instância da classe Motor e diversas instâncias da classe Peça. 
	
	e)  Crie a classe CarroPasseio usando a classe Veiculo como Base. Inclua cor (Texto) e modelo (Texto). Inclua um construtor sem argumentos que inicializa os dados com seus respectivos valores defaults (padrão) e um construtor que inicializa os dados dessa classe e da classe Base com os valores recebidos como argumento. Acrescente métodos set e get para mudar e acessar cada atributo da classe e um método exibir() para a visualização dos valores das variáveis de instância dessa classe e da classe Base. 
	
	f)  Crie a classe Caminhão derivada da classe Veiculo. Inclua toneladas (Numérico), alturaMax (Numérico) e comprimento (Numérico). Inclua um construtor sem argumentos que inicializa os dados com seus respectivos valores defaults (padrão) e um construtor que inicializa os dados dessa classe e da classe Base com os valores recebidos como argumento.


7.  Contar a quantidade de ocorrências de uma determinada palavra em um arquivo texto:

    7.1.    Utilizar o arquivo presente no projeto: palavras.txt
        
    *  O método receberá como entrada um texto, desenvolver um algoritmo que conte em um arquivo a quantidade de ocorrências da palavra recebida.
            
        Retorno: Um valor numérico.
            
8.	Realizar ordenação de um objeto em uma listagem:
        
        *  O método receberá como entrada uma lista de objetos Pessoa, desenvolver um algoritmo que ordene a listagem pela idade de cada pessoa.
            
            Retorno: Listagem ordenada de pessoas.

9.	Codificar com programação funcional (Diferencial);


10. Criar testes unitários para validação dos desafios (Diferencial).


Critérios avaliados
-------------------
1.  Solução        
    *  Projeto funcional e atendimento aos itens especificados.
    
2.  Conhecimento da plataforma
    *   Evidências através do código de conhecimentos da plataforma Java e seus recursos.

3.  Code Style
    *   Código limpo? Código legível? Fácil entendimento para outros desenvolvedores? 

4.	Uso adequado da ferramenta de controle de versão (Diferencial);

Submetendo o código para avaliação: via github
----------------------------------------------
	
O candidato pode clonar este repositório e subir a solução em sua própria conta do Git Hub de forma **privada** e compartilhar com os seguintes usuários: https://github.com/radamssilva, https://github.com/geissivan, https://github.com/davitavora e https://github.com/Zacmenezes

Enviar o endereço do repositório com a solução para o email: jobs@mobitbrasil.com.br
