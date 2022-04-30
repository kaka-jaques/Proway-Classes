# OPERADORES CONDICIONAIS

<p>Definir condi��o para ir a um escopo adequado, tomando decis�es e iniciando a��es desejadas! </p>

### CONDICIONAL
```
if (condicao=true){
	Realiza pedido;
}else if (segunda condicao=true){
	realiza pedido;
}else {
	realiza pedido caso nenhuma satisfa�a;
}
```
**Condi��es Indepedentes:** � quando se tem apenas o `if` sem o `else if` ou `else` no final de seu escopo, e sobrep�e a��es em cima da �ltima decis�o de escopo se n�o bem estruturado.

**Condi��es Dependentes:** � quando toda as condi��es seja `if` ou `else if` est�o nos finais de seu escopo, lembrando que � necess�rio adicionar o `else` no final do �ltimo escopo de decis�o.

### CONDICIONAL TERNARIO
```
System.out.println("Texto ir� ser completado dependendo se a condi��o for )+(condicao=true?"true":"ou false?"));
```
**Condi��o Ternario** serve para pequenas decis�es, atribuindo dados a vari�veis, por exemplo: sa�da de texto dentro de um `System.out.println` ou `JOptionPane.showMessageDialog`, mas n�o pode tomar a��es de execu��o.