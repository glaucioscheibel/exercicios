# Exercícios de Programação

## Conteúdo
1. [Lógica](#lógica)
1. [Estrutura sequencial](#estrutura-sequencial)
1. [Estrutura de decisão](#estrutura-de-decisão)
1. [Estrutura de repetição](#estrutura-de-repetição)
1. [Strings](#strings)
1. [Vetores](#vetores)
1. [Matrizes](#matrizes)
1. [Funções](#funções)
    1. [Funções recursivas](#funções-recursivas)
1. [Filmes](#filmes)
1. [Agradecimentos](#agradecimentos)

## Lógica
1. Um homem precisa atravessar um rio com um barco que possui capacidade de transportar apenas ele e mais uma de suas três cargas, que são: um lobo, uma ovelha e um kilo de couve. Quais os passos que o homem deve fazer para conseguir atravessar o rio sem perder as suas cargas?
[link racha-cuca](https://rachacuca.com.br/jogos/o-lobo-e-a-ovelha/)

1. Uma Torre de Hanói é formada por três discos sobrepostos transpassados por uma haste. Tendo mais duas hastes e podendo mover um disco por vez, mas nunca deixando um disco maior sobre um disco menor, quais os passos necessários para podermos passar os discos para uma outra haste?
[link UFRGS](https://www.ufrgs.br/psicoeduc/hanoi/)

1. Três jesuítas e três canibais precisam atravessar um rio. No entanto dispõem apenas de um barco com capacidade para duas pessoas. Por medida de segurança não se permite que em alguma das margens do rio a quantidade de jesuítas seja inferior à quantidade de canibais. Qual a sequência de viagens necessárias para a travessia do rio com segurança para os jesuítas?
[link racha-cuca](https://rachacuca.com.br/jogos/missionarios-e-canibais/)

1. Para comemorar o aniversário de Cláudio, ele e mais quatro amigos – Alberto, Beto, Dino e Eurico – foram almoçar juntos no restaurante da escola. As mesas são redondas e acomodam exatamente cinco pessoas. Cláudio e Dino sentam-se um ao lado do outro. Alberto e Beto não sentam-se um ao lado do outro. Os dois amigos sentados ao lado de Eurico são:
    - Alberto e Beto
    - Cláudio e Dino
    - Dino e Beto
    - Cláudio e Alberto
    - Alberto e Dino

1. Uma equipe de meninas está participando de uma gincana preparada pelos professores da escola. Depois de muitas peripécias, elas finalmente encontraram o cofre escondido que contém a última tarefa a ser resolvida. Mas o cofre está protegido com um cadeado digital que é aberto somente se uma senha de quatro letras for digitada. Junto ao cofre elas encontraram também um pedaço de papel com as letras Xkzk. Inicialmente elas pensaram que essa era a senha, mas o cofre não abriu. No entanto, elas tinham certeza de que as quatro letras encontradas eram a chave para o enigma. Depois de pensar um pouco elas perceberam que os nomes das cinco meninas da equipe tinham exatamente quatro letras. Seria essa a ligação com as letras encontradas? Não demorou muito para elas abrirem o cofre, pois a senha era mesmo o nome de uma das meninas. Qual era a senha do cofre?
    - Anna
    - Lisa
    - Nina
    - Iris
    - Nara

1. Um palíndrome é um número inteiro positivo, sem zeros à esquerda, que é o mesmo se lido da esquerda para a direita ou da direita para a esquerda. Por exemplo, os números 11 e 65256 são palíndromes, mas os números 010 e 123 não são. A diferença entre o valor do maior palíndrome de três dígitos e o menor palíndrome de três dígitos é:
    - 989
    - 888
    - 898
    - 998
    - 979

1. Na Nlogônia, as cédulas de dinheiro são de $1,00, $3,00, $9,00, $27,00, e $81,00. Num dado momento, um vendedor possui apenas cinco cédulas, uma de cada um dos valores das cédulas existentes na Nlogônia. Qual dos valores abaixo não é possível ser dado como troco por esse vendedor?
    - $40,00
    - $35,00
    - $31,00
    - $13,00
    - $4,00

1. . Em uma sala há duas lousas (quadros negros), a lousa A e a lousa B. Na lousa A foi escrito o número 7 e na lousa B foi escrito o número 13. Após isso, um aluno entrou na sala, apagou o número da lousa B e em seu lugar escreveu um número igual ao número escrito na lousa A. Depois disso, outro aluno entrou na sala, apagou o número da lousa A e em seu lugar escreveu um número igual ao número atualmente escrito na lousa B. Depois dessas mudanças, quais são os números escritos nas
lousas?
    - 13 na lousa A e 7 na lousa B
    - 7 na lousa A e 13 na lousa B
    - 7 na lousa A e 7 na lousa B
    - 13 na lousa A e 13 na lousa B
    - 20 na lousa A e 6 na lousa B

1. Maria tinha alguns biscoitos. Ela comeu dois e deu dois à irmã. Depois deu metade do que sobrou ao irmão. Se o irmão ficou com 5 biscoitos, quantos tinha Maria no início?

1. Uma pessoa lê um livro de 100 páginas em 6 dias. Em quantos dias essa pessoa lê um livro de 150 páginas?

1. Lúcia foi ao mesmo tempo a décima terceira melhor classificada e a décima terceira pior classificada de um concurso. Quantos eram os concorrentes?

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

    66, 59, 52, 45, 38, ??
    - 32
    - 35
    - 31
    - 41
    - 43

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

    102, 103, 105, 108, ??
    - 109
    - 114
    - 106
    - 111
    - 112

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

    50, 5, 40, 10, 30, ??
    - 35
    - 20
    - 25
    - 15
    - 37

1. Para A = V, B = V e C = F, qual o resultado da avaliação das seguintes expressões lógicas:
    1. A or C and not B
    2. (A or B) and (A and C)

## Estrutura sequencial
1. Faça um programa que imprima a mensagem "Alo mundo" na tela.

1. Faça um programa que peça as 4 notas bimestrais, calcule e imprima a média.

1. Faça um programa para calcular a área de uma circunferência, considerando a fórmula AREA = &pi; &times; RAIO<sup>2</sup>. Utilize as variáveis AREA e RAIO, a constante &pi; (pi = 3,14159) e os operadores aritméticos de multiplicação.

1. Faça um programa que peça dois números, base e expoente, calcule e imprima o primeiro número elevado ao segundo número. Utilize a função de potência da linguagem.

1. Faça um programa que:
    1. Leia o nome;
    1. Leia o sobrenome;
    1. Concatene o nome com o sobrenome;
    1. Apresente o nome completo.

1. Faça um programa que:
    1. Leia um número inteiro;
    1. Leia um segundo número inteiro;
    1. Efetue a adição dos dois valores;
    1. Apresente o valor calculado.

1. Faça um programa que leia uma temperatura em graus _Celsius_ e apresente-a
convertida em graus _Fahrenheit_. A fórmula de conversão é: &#8457; = (9 &times; &#8451; + 160) &divide; 5, na qual &#8457; é a temperatura em _Fahrenheit_ e &#8451; é a temperatura em _Celsius_.

1. Faça um programa que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO &times; VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA &divide; 12. O programa deve apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.

1. Faça um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

1. Faça um programa que leia os valores de COMPRIMENTO, LARGURA e ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o cálculo a fórmula VOLUME = COMPRIMENTO &times; LARGURA &times; ALTURA.

1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.

1. Faça um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência necessária é de 18 watts por metro quadrado.

1. Faça um programa que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

1. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

1. Considere a seguinte situação: Descontam-se inicialmente 10% do salário bruto do trabalhador como contribuição à previdência social. Após esse desconto, há um outro desconto de 5% sobre o valor restante do salário bruto, a título de imposto de renda. Faça um programa que leia o salário bruto de um cidadão e imprima o seu salário líquido.

1. Faça um programa que leia quatro números e apresente os resultados de adição e multiplicação dos valores entre si, baseando-se na utilização da propriedade distributiva, ou seja, se forem lidas as variáveis A, B, C e D, devem ser somadas e multiplicadas A com B, A com C e A com D; B com C, B com D e por último C
com D.

## Estrutura de decisão
1. Faça um programa que peça dois números e imprima o maior deles.

1. Faça um programa que leia três números e imprima o maior deles.

1. Faça um programa que receba como entrada três valores e os imprima em ordem crescente.

1. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva um programa que leia o número de maçãs compradas, calcule e imprima o custo total da compra.

1. Faça um programa para aprovar empréstimos bancários. O código deve pedir três informações: valor do empréstimo, número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do salário do solicitante.

1. A empresa paga ao corretor uma comissão calculada de acordo com o valor de suas vendas. Se o valor da venda de um corretor for maior que R$ 50.000,00 a comissão será de 12% do valor vendido. Se o valor da venda do corretor estiver entre R$ 30.000,00 e R$ 50.000,00 (incluindo extremos) a comissão será de 9,5%. Em qualquer outro caso, a comissão será de 7%. Escreva um programa onde será informado nome do corretor e o valor da venda, após isto o programa irá calcular o valor da comissão.

1. Faça um programa onde serão informados as quatro notas do aluno. O programa irá então apresentar a média, se foi aprovado (nota &ge; 7) ou se ficou em exame. Caso o aluno ficou em exame, o programa irá então perguntar qual foi a nota do exame e então irá calcular a nova média (média anteior com a nota do exame) e informar se ele foi aprovado (nova média &ge; 5) ou se foi reprovado.

1. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e imprima o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

1. Faça um programa que efetue a leitura de três valores numéricos representando os lados de um triângulo. O programa deverá verificar e informar se os lados fornecidos formam realmente um triângulo (cada lado é menor que a soma dos outros dois lados). Se esta condição for verdadeira, deverá ser indicado qual tipo de triângulo foi formado: isósceles (dois lados iguais e um diferente), escaleno (todos os lados diferentes) ou equilátero (todos os lados são iguais).

1. Faça um programa para uma empresa que decide dar um reajuste funcionários de acordo com os seguintes critérios:
    - 50% para aqueles que ganham menos do que três salários mínimos;
    - 20% para aqueles que ganham entre três até dez salários mínimos;
    - 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    - 10% para os demais funcionários.

1. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax<sup>2</sup> + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
    - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
    - Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
    - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    - Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário.

1. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

1. Um posto está vendendo combustíveis com a seguinte tabela de descontos. Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
    <table border="1" align="center">
        <tr>
            <th rowspan="2" align="center">Álcool</th>
            <td>até 20 litros, desconto de 3% por litro</td>
        </tr>
        <tr>
            <td>acima de 20 litros, desconto de 5% por litro</td>
        </tr>
        <tr>
            <th rowspan="2" align="center">Gasolina</th>
            <td>até 20 litros, desconto de 4% por litro</td>
        </tr>
        <tr>
            <td>acima de 20 litros, desconto de 6% por litro</td>
        </tr>
    </table>

1. Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e imprima o valor a ser pago pelo cliente.
    <table border="1" align="center">
        <tr>
            <td></td>
            <th>Até 5Kg</th>
            <th>Acima de 5kg</th>
        </tr>
        <tr>
            <th>Morango</th>
            <td>R$2,50 / kg</td>
            <td>R$2,20 / kg</td>
        </tr>
        <tr>
            <th>Maçã</th>
            <td>R$1,80 / kg</td>
            <td>R$1,50 / kg</td>
        </tr>
    </table>

1. Uma Companhia de Seguros possui nove categorias de seguro baseadas na idade e ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais de 70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações, foram definidos três grupos de risco. A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, idade e grupo de risco, determinar a categoria do pretendente à aquisição de tal seguro. Imprimir o nome a idade e a categoria do pretendente, e, caso a idade não esteja na faixa necessária, imprimir uma mensagem.
    <table border="1" align="center">
        <tr>
            <th rowspan="2">Idades</th>
            <th colspan="3" align="center">Grupos de risco</th>
        </tr>
        <tr>
            <th>Baixa</th>
            <th>Média</th>
            <th>Alta</th>
        </tr>
        <tr>
            <td>17 a 20</td>
            <td align="center">1</td>
            <td align="center">2</td>
            <td align="center">3</td>
        </tr>
        <tr>
            <td>21 a 24</td>
            <td align="center">2</td>
            <td align="center">3</td>
            <td align="center">4</td>
        </tr>
        <tr>
            <td>25 a 34</td>
            <td align="center">3</td>
            <td align="center">4</td>
            <td align="center">5</td>
        </tr>
        <tr>
            <td>35 a 64</td>
            <td align="center">4</td>
            <td align="center">5</td>
            <td align="center">6</td>
        </tr>
        <tr>
            <td>65 a 70</td>
            <td align="center">7</td>
            <td align="center">8</td>
            <td align="center">9</td>
        </tr>
    </table>

## Estrutura de repetição
1. Faça um programa que calcule a soma dos números inteiros de 1 a 100.

1. Escreva um programa que pergunte ao usuário um número e após, imprima na tela a soma total de 1 até o número lido. Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15

1. Faça um programa que peça dois números, base e expoente, calcule e imprima o primeiro número elevado ao segundo número. **Não utilize a função de potência da linguagem**.

1. Construa um programa que exiba a tabuada de 1 até N, onde N é informado pelo usuário. ex: Até a tabuada de 3, irá imprimir as tabuadas de 1, 2 e 3.

1. Faça um programa para calcular e imprimir a soma dos cubos dos números pares compreendidos entre A e B (B &gt; A). A e B são lidos pelo teclado.

1. Faça um programa que receba um valor que foi depositado na poupança e exiba o valor com rendimento mês a mês durante o período de um ano. Considere fixo o juros da poupança em 0,5% a. m.

1. Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Faça um programa que determine e imprima os números primos compreendidos entre um intervalo fornecido pelo usuário.

1. Faça um programa que calcule o resultado dos 50 primeiros números da sequinte sequência:

    1000 &divide; 1 - 997 &divide; 2 + 994 &divide; 3 - 991 &divide; 4 + ...

1. Faça um programa para calcular e imprimir a seguinte soma:

    37 &times; 38 &divide; 1 + 36 &times; 37 &divide; 2 + 35 &times; 36 &divide; 3 + ... + 1 &times; 2 &divide; 37

1. Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10m e cresce 3 centímetros por ano. Construa um programa que calcule e apresente quantos anos serão necessários para que Felisberto seja maior que Anacleto.

1. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, faça um programa que determine o tempo necessário para que essa massa se torne menor que 0,05 gramas.

1. Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa que calcule e imprima o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

1. Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Crie um programa para calcular o total de grãos que o monge recebeu.

1. Escreva um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N(N!) é definido conforme a seguir:

    N! = 1 &times; 2 &times; 3 &times; 4 &times; ... &times; (N - 1) &times; N

1. Faça um programa que peça para o usuário ir informando números até que ele informe 0 (zero). Após isto apresente os seguintes dados sobre os números digitados:
    1. O maior número;
    1. O menor número;
    1. A soma dos números;
    1. A média deles;
    1. A quantidade de números pares;
    1. A quantidade de números ímpares.

1. O seguinte programa em Python não está funcionando e lhe foi pedido para que seja corrigido. Apenas olhando o código, qual foi o erro de programação?
    ```python
    cont1 = 0
    cont2 = 0
    brancos = 0
    nulos = 0
    voto = int(input())
    while voto != -1:
        if voto == 1:
            cont1 += 1
        elif voto == 2:
            cont2 += 1
        elif voto == 0:
            brancos += 1
        else:
            nulos += 1
    print(cont1)
    print(cont2)
    print(brancos)
    print(nulos)
    ```

## Strings
1. Faça um programa que permita ao usuário digitar o seu nome e em seguida imprima o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas.

1. Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:
    1. quantos espaços em branco existem na frase.
    1. quantas vezes aparecem as vogais a, e, i, o, u.

1. Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com as letras embaralhadas. O programa terá uma lista de palavras lidas de um arquivo texto ou de um vetor e será escolhida uma aleatoriamente. O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra deve ser mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.

1. Leia um código de cinco algarismos (variável Codigo) e gere o digito verificador (DigitoV) módulo 7 para o mesmo. Supondo que os cinco algarismos do código são ABCDE, uma forma de calcular o dígito desejado, com módulo 7 é:

    DigitoV = resto da divisão de S por 7, onde S = 6A + 5B + 4C + 3D + 2E

1. Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável inteira), imprima cada um dos seus dígitos por extenso.
    Exemplo:

        Entre o número: 4571
        Resultado: quatro, cinco, sete, um

1. _Leet_ é uma forma de se escrever o alfabeto latino usando outros símbolos em lugar das letras, como números por exemplo. A própria palavra _leet_ admite muitas variações, como l33t ou 1337. O uso do _leet_ reflete uma subcultura relacionada ao mundo dos jogos de computador e internet, sendo muito usada para confundir os iniciantes e afirmar-se como parte de um grupo. Pesquise sobre as principais formas de traduzir as letras. Depois, faça um programa que peça uma texto e transforme-o para a grafia _leet speak_.

1. Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais. As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão aparecer em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das, de, di, du não são considerados nomes e, portanto, não devem ser considerados para a obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome seja entrado todo em minúsculas.

    Exemplos:

        Maria das Graças Pimenta => MGP
        João Carlos dos Santos => JCS

## Vetores
1. Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor dos valores armazenados em um vetor A de 100 elementos numéricos a serem lidos do dispositivo de entrada padrão.

1. Faça um programa que copie o conteúdo de um vetor em um segundo vetor.

1. Faça um programa que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor.

1. Faça um programa para ler dois vetores V1 e V2 de 15 números cada. Calcular e imprimir a quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.

1. Faça um programa que defina dois vetores A = [2, 4, 7, 13, 14, 15, 16] e B = [1, 6, 7, 11, 13, 16, 18] e faça as seguintes operações de conjuntos:
    - A &bigcup; B: União (todos os valores de ambos os vetores)
    - A &bigcap; B: Intersecção (apenas valores que existam em ambos)
    - A &minus; B: Diferença (apenas valores que não apareçam simultaneamente em ambos conjuntos)

1. Escrever um programa que lê um vetor com 20 números inteiros e os imprime na tela. Troque, a seguir, o 1&ordm; elemento com o último, o 2&ordm; com o penúltimo etc. até o 10&ordm; com o 11&ordm; e imprima na tela o vetor N assim modificado.

1. Numa eleição existem n candidatos identificados pelos números 1, 2, 3 ... n. Faça um programa que compute o resultado de uma eleição. Inicialmente o programa deverá pedir o número total de candidatos e de votantes. Em seguida, deverá pedir para cada votante votar (informando o numero do candidato) e a o final imprimir o número de votos de cada candidato. Utilize um vetor para armazenar o total de votos de cada candidato.

1. Ler 100 números de matriculas de alunos e armazenar em um vetor. Esses números são distintos, ou seja, não existem números de matriculas iguais. Caso o usuário informa um número de matrículo que já existe, o programa deverá emitir um alerta.

1. Faça um programa que leia um vetor com N elementos formado por valores do tipo inteiro. Crie então dois novos vetores, um com os valores pares e outro com os valores ímpares do vetor original.

1. Faça um programa que:
    1. Leia um vetor A com N elementos já ordenados e um vetor B com M elementos também já ordenados.
    1. Intercale os dois vetores A e B, formando um vetor C, sendo que ao final do processo de intercalação, o vetor C continue ordenado. Nenhum outro processo de ordenação poderá ser utilizado além da intercalação dos vetores A e B.
    1. Caso um vetor (A ou B) termine antes do outro, o vetor C deverá ser preenchido com os elementos do vetor que ainda possui informações.

1. Uma escola de samba recebeu como pontos pela alegoria os seguintes 5 valores inclusos no vetor Notas. Lembrando que a nota mais alta e a nota mais baixa são descartadas. Faça um programa que calcule a média final do quesito.
    ```
    Notas = [9.9, 9.7, 9.8, 10, 10]
    ```

## Matrizes
1. Faça um programa para ler e imprimir uma matriz 2 &times; 4 de números inteiros.

1. Dada a seguinte matriz, calcule:
    1. A soma dos elementos de primeira coluna;
    1. O produto dos elementos da primeira linha;
    1. A soma de todos os elementos;
    1. O produto da diagonal principal.

    <table>
        <tr>
            <td align="right">1</td>
            <td align="right">2</td>
            <td align="right">3</td>
            <td align="right">4</td>
        </tr>
        <tr>
            <td align="right">5</td>
            <td align="right">6</td>
            <td align="right">7</td>
            <td align="right">8</td>
        </tr>
        <tr>
            <td align="right">9</td>
            <td align="right">10</td>
            <td align="right">11</td>
            <td align="right">12</td>
        </tr>
        <tr>
            <td align="right">13</td>
            <td align="right">14</td>
            <td align="right">15</td>
            <td align="right">16</td>
        </tr>
    </table>

1. Dada as matrizes A e B determine A + B. 
    <table>
        <tr>
            <td>
                <table>
                    <tr>
                        <th rowspan="2">A =</th>
                        <td align="right">-10</td>
                        <td align="right">1</td>
                        <td align="right">4</td>
                        <td align="right">6</td>
                    </tr>
                    <tr>
                        <td align="right">2</td>
                        <td align="right">3</td>
                        <td align="right">2</td>
                        <td align="right">8</td>
                    </tr>
                </table>
            </td>
            <td>
                <table>
                    <tr>
                        <th rowspan="2">B =</th>
                        <td align="right">1</td>
                        <td align="right">8</td>
                        <td align="right">4</td>
                        <td align="right">-1</td>
                    </tr>
                    <tr>
                        <td align="right">0</td>
                        <td align="right">6</td>
                        <td align="right">3</td>
                        <td align="right">-3</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

1. Faça um programa que dada a matriz A, gere a matriz oposta -A. Matriz oposta possui valores que se somados à matriz original, gera uma matriz com valores zerados.
    <table>
        <tr>
            <th rowspan="2">A =</th>
            <td align="right">2</td>
            <td align="right">-3</td>
        </tr>
        <tr>
            <td align="right">-1</td>
            <td align="right">4</td>
        </tr>
    </table>

1. Faça um programa que dada a seguinte matriz A, gere a matriz transposta dela A<sup>t</sup>. Matriz transposta é a que se obtém trocando-se ordenadamente as linhas pelas colunas.
    <table border="0">
        <tr>
            <td>
                <table>
                    <tr>
                        <th rowspan="3">A =</th>
                        <td align="right">-7</td>
                        <td align="right">8</td>
                    </tr>
                    <tr>
                        <td align="right">4</td>
                        <td align="right">9</td>
                    </tr>
                    <tr>
                        <td align="right">2</td>
                        <td align="right">1</td>
                    </tr>
                </table>
            </td>
            <td valign="top">
                <table>
                    <tr>
                        <th rowspan="2">A<sup>t</sup> = </th>
                        <td align="right">-7</td>
                        <td align="right">4</td>
                        <td align="right">2</td>
                    </tr>
                    <tr>
                        <td align="right">8</td>
                        <td align="right">9</td>
                        <td align="right">1</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

1. Dada a seguinte matriz 3x3:
    <table>
        <tr>
            <td>1</td>
            <td>2</td>
            <td>3</td>
        </tr>
        <tr>
            <td>4</td>
            <td>5</td>
            <td>6</td>
        </tr>
        <tr>
            <td>7</td>
            <td>8</td>
            <td>9</td>
        </tr>
    </table>

    Faça um programa que:

    1. Apresente a matriz rotacionada em 90&deg;:
        <table>
            <tr>
                <td>7</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>8</td>
                <td>5</td>
                <td>2</td>
            </tr>
            <tr>
                <td>9</td>
                <td>6</td>
                <td>3</td>
            </tr>
        </table>
    1. Apresente a matriz rotacionada em 180&deg;:
        <table>
            <tr>
                <td>9</td>
                <td>8</td>
                <td>7</td>
            </tr>
            <tr>
                <td>6</td>
                <td>5</td>
                <td>4</td>
            </tr>
            <tr>
                <td>3</td>
                <td>2</td>
                <td>1</td>
            </tr>
        </table>
    1. Apresente a matriz rotacionada em 270&deg;:
        <table>
            <tr>
                <td>3</td>
                <td>6</td>
                <td>9</td>
            </tr>
            <tr>
                <td>2</td>
                <td>5</td>
                <td>8</td>
            </tr>
            <tr>
                <td>1</td>
                <td>4</td>
                <td>7</td>
            </tr>
        </table>

1. O tempo que um determinado avião dispensa para percorrer o trecho entre duas localidades distintas está disponível através da seguinte matriz:
    <table>
        <tr>
            <th>&nbsp;</th>
            <th>1</th>
            <th>2</th>
            <th>3</th>
            <th>4</th>
            <th>5</th>
            <th>6</th>
            <th>7</th>
        </tr>
        <tr>
            <th>1</th>
            <td align="right">&nbsp;</td>
            <td align="right">2</td>
            <td align="right">11</td>
            <td align="right">6</td>
            <td align="right">15</td>
            <td align="right">11</td>
            <td align="right">1</td>
        </tr>
        <tr>
            <th>2</th>
            <td align="right">2</td>
            <td align="right">&nbsp;</td>
            <td align="right">7</td>
            <td align="right">12</td>
            <td align="right">4</td>
            <td align="right">2</td>
            <td align="right">15</td>
        </tr>
        <tr>
            <th>3</th>
            <td align="right">11</td>
            <td align="right">7</td>
            <td align="right">&nbsp;</td>
            <td align="right">11</td>
            <td align="right">8</td>
            <td align="right">3</td>
            <td align="right">13</td>
        </tr>
        <tr>
            <th>4</th>
            <td align="right">6</td>
            <td align="right">12</td>
            <td align="right">11</td>
            <td align="right">&nbsp;</td>
            <td align="right">10</td>
            <td align="right">2</td>
            <td align="right">1</td>
        </tr>
        <tr>
            <th>5</th>
            <td align="right">15</td>
            <td align="right">4</td>
            <td align="right">8</td>
            <td align="right">10</td>
            <td align="right">&nbsp;</td>
            <td align="right">5</td>
            <td align="right">13</td>
        </tr>
        <tr>
            <th>6</th>
            <td align="right">11</td>
            <td align="right">2</td>
            <td align="right">3</td>
            <td align="right">2</td>
            <td align="right">5</td>
            <td align="right">&nbsp;</td>
            <td align="right">14</td>
        </tr>
        <tr>
            <th>7</th>
            <td align="right">1</td>
            <td align="right">15</td>
            <td align="right">13</td>
            <td align="right">1</td>
            <td align="right">13</td>
            <td align="right">14</td>
            <td align="right">&nbsp;</td>
        </tr>
    </table>

    1. Faça um programa que leia a matriz anterior e informe ao usuário o tempo necessário para percorrer duas cidades por ele fornecidas;
    1. Faça um programa que permita ao usuário informa várias cidades e as armazene no vetor de rota até que ele informe 0 (zero), após isto imprima o tempo total para cumprir todo o trajeto fornecido passando por todas as cidades.

1. Implemente um programa que exiba um triângulo de Pascal (Tartaglia) de ordem n, sendo n informado pelo usuário. Para tal, considere uma matriz quadrada de ordem n, o triângulo de Pascal segue a seguinte regra de formação:
    1. todos os elementos da primeira coluna da matriz são iguais a 1;
    1. todos os elementos da diagonal principal da matriz também são iguais a 1;
    1. para os demais elementos são obtido pela soma do elemento da mesma coluna na linha de cima com o seu vizinho esquerdo;
    1. os elementos acima da diagonal principal não são exibidos.

    ex: Triângulo de Pascal de ordem 7:

    <table>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;2</td>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;3</td>
            <td align="right">&nbsp;3</td>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;4</td>
            <td align="right">&nbsp;6</td>
            <td align="right">&nbsp;4</td>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;5</td>
            <td align="right">10</td>
            <td align="right">10</td>
            <td align="right">&nbsp;5</td>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td align="right">&nbsp;1</td>
            <td align="right">&nbsp;6</td>
            <td align="right">15</td>
            <td align="right">20</td>
            <td align="right">15</td>
            <td align="right">&nbsp;6</td>
            <td align="right">&nbsp;1</td>
        </tr>
    </table>

## Funções
1. Crie uma função que receba duas palavras e retorne _True_ caso a primeira palavra seja um prefixo da segunda.

1. Crie uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

1. Faça um programa com duas funções, uma que recebe uma temperatura em _Fahrenheit_ e retorna em _Celcius_ e outra que faz o inverso. Lembrando que as fórmulas são &#8451; = (&#8457; - 32) &divide; 1,8 e &#8457; = &#8451; &times; 1,8 + 32.

1. Crie uma função que receba como parâmetro um inteiro positivo ano e devolve verdadeiro ou falso se ano for bissexto ou não. Anos bissextos ocorrem a cada quatro anos exceto anos múltiplos de 100 que não são múltiplos de 400.

1. Crie uma função que receba o comprimento de cada um dos três lados de um triângulo e retorne se esse triângulo é isósceles (dois lados iguais e um diferente), escaleno (todos os lados diferentes), equilátero (todos os lados são iguais) ou se não é um triangulo (algum lado é maior que a soma dos outros dois lados).

1. Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Crie uma função que retorne verdadeiro ou falso se o número passado é primo ou não.

### Funções recursivas
1. Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.

1. Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.

1. O máximo divisor comum (MDC) dos inteiros x e y é o maior inteiro que é divisível por x e y. Escreva uma função recursiva MDC, que retorna o máximo divisor comum de x e y. O MDC de x e y é definido como segue:

    - se y é igual a 0, então mdc(x, y) é x;
    - caso contrário, mdc(x, y) é mdc (y, x mod y), onde mod é o operador módulo (resto).

1. Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

1. Faça uma função recursiva que retorne a inversão de uma String passada como parâmetro. Ex: teste &rarr; etset

## Filmes
Segue uma relação de filmes que abordam o tema da programação e/ou da importância da computação (ordem alfabética):
1. [AlphaGo](http://www.imdb.com/title/tt6700846)
1. [Eis os Delírios do Mundo Conectado](https://www.imdb.com/title/tt5275828)
1. [Intermediário.com](http://www.imdb.com/title/tt1251757)
1. [Jobs](http://www.imdb.com/title/tt2357129)
1. [O Jogo da Imitação](http://www.imdb.com/title/tt2084970)
1. [Jogos de Guerra](http://www.imdb.com/title/tt0086567)
1. [Piratas do Vale do Silício](http://www.imdb.com/title/tt0168122)
1. [A Rede Social](http://www.imdb.com/title/tt1285016)
1. [Silicon Cowboys](http://www.imdb.com/title/tt4938484)

## Agradecimentos
Segue alguns agradecimentos aos professores e eventos que disponibilizaram uma lista de exercícios na internet facilitando a criação desta lista:
- [Prof. Angelo Augusto Frozza](http://www.ifc-camboriu.edu.br/~frozza/)
- [Profa. Flávia Pereira de Carvalho](https://fit.faccat.br/~fpereira/pagina/)
- [Prof. Marco André Lopes Mendes](https://wiki.python.org.br/ListaDeExercicios)
- [Olimpíada Brasileira de Informática](http://olimpiada.ic.unicamp.br/passadas/pp)