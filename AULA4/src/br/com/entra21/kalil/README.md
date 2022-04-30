# OPERADORES CONDICIONAIS

<p>Definir condição para ir a um escopo adequado, tomando decisões e iniciando ações desejadas! </p>

### CONDICIONAL
```
if (condicao=true){
	Realiza pedido;
}else if (segunda condicao=true){
	realiza pedido;
}else {
	realiza pedido caso nenhuma satisfaça;
}
```
**Condições Indepedentes:** É quando se tem apenas o `if` sem o `else if` ou `else` no final de seu escopo, e sobrepõe ações em cima da última decisão de escopo se não bem estruturado.

**Condições Dependentes:** É quando toda as condições seja `if` ou `else if` estão nos finais de seu escopo, lembrando que é necessário adicionar o `else` no final do último escopo de decisão.

### CONDICIONAL TERNARIO
```
System.out.println("Texto irá ser completado dependendo se a condição for )+(condicao=true?"true":"ou false?"));
```
**Condição Ternario** serve para pequenas decisões, atribuindo dados a variáveis, por exemplo: saída de texto dentro de um `System.out.println` ou `JOptionPane.showMessageDialog`, mas não pode tomar ações de execução.