# Calculadora de Salário Líquido - 3º Desafio do 1º do **aceleraDev - Java**

Neste desafio, foi implementado um algoritmo que será responsável por receber como parâmetro o salário bruto e retornar o salário líquido, já com todos os descontos de INSS e IRRF. Esse algoritmo foi implementado na classe **CalculadoraSalario** no método **calcularSalarioLiquido**, esse método recebe um valor do tipo **double** e retorna um valor do tipo **int**.

**Observações:**
Para simplificar o desafio, serão utilizados valores fictícios e não os valores oficiais das tabelas de alíquotas da Previdência Social e Receita Federal.


## Como Funciona?

### Primeiro passo
Primeiro é calculado o valor do desconto do INSS, o mesmo foi calculado conforme a tabela abaixo:


| Faixa salarial  |  Percentual de desconto  |
| --- | --- |
|  Até R$ 1.500,00 | 8% |
|  De R$ 1.500,01 até R$ 4.000,00 | 9% |
|  Acima de R$ 4.000,00 |  11% |

**Exemplo:**
- Para um salário bruto de **R$1.000,00** ou **R$1.500,00**, deverá ser aplicado o desconto de 8% resultando em valores líquidos de  **R$920,00** ou **R$1.320,00**, respectivamente.
- Para um salário bruto de **R$1.500,01** ou **R$10.000,00**, deverá ser aplicado o desconto de 11% resultando em valores líquidos de **R$1.335,00** ou **R$ 8.900,00**, respectivamente.

### Segundo passo

Após obter o valor do **salário bruto - INSS**, utilizamos esse valor como referência para realizar o cálculo do IRRF e realizar o desconto correto. Esse valor de referência (salário bruto - INSS) deverá ter um percentual descontado de acordo com a tabela abaixo:

| Faixa salarial  |  Percentual de desconto  |
| --- | --- |
|  Até R$ 3.000,00 | ISENTO |
|  De R$ 3.000,01 até R$ 6.000,00 | 7.5% |
|  Acima de R$ 6.000,00 |  15% |

**Exemplo**

- Após descontar o INSS, obtivemos o valor de **R$1.320,00**, como esse valor é até R$ 3.000,00, não haverá desconto do IRRF, totalizando um **salário líquido final de R$ 1.320,00**.
- Após descontar o INSS, obtivemos o valor de **R$8.900,00**, como esse valor é maior que **R$3.000,00**, haverá o desconto de **15%** desse valor, totalizando um **salário líquido final de R$7.565,00**. 

**Observações**
- Caso o valor do salário base recebido seja abaixo do salário mínimo **(R$ 1.039,00)**, o algoritmo retornará **0.0**.

## Tópicos

Neste desafio, apliquei os seguintes tópicos:
- Variáveis e métodos;
- Operadores aritméticos;
- Operadores lógicos;
- Controle de fluxo (estrutura condicional).
- Clean Code.
