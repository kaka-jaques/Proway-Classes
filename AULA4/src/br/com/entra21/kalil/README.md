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
<p> **Condi��es Indepedentes:** � quando se tem apenas o `if` sem o `else if` ou `else` no final de seu escopo</p>
<p> **Condi��es Dependentes:** � quando toda as condi��es seja `if` ou `else if` est�o nos finais de seu escopo</p>

### CONDICIONAL TERNARIO
```
System.out.println("Texto ir� ser completado dependendo se a condi��o for )+(condicao=true?"true":"ou false?"));
```
**Condi��o Ternario** serve para pequenas decis�es como demonstradas acima