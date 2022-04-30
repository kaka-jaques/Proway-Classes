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
<p> **Condições Indepedentes:** É quando se tem apenas o `if` sem o `else if` ou `else` no final de seu escopo</p>
<p> **Condições Dependentes:** É quando toda as condições seja `if` ou `else if` estão nos finais de seu escopo</p>

### CONDICIONAL TERNARIO
```
System.out.println("Texto irá ser completado dependendo se a condição for )+(condicao=true?"true":"ou false?"));
```
**Condição Ternario** serve para pequenas decisões como demonstradas acima