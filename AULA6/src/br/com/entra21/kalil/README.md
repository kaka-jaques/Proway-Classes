# FUN��ES

<p> Aprender a estrutura da fun��o e criar fun��o espec�fica de uma a��o </p>

---

**ESTRUTURA DE UMA FUN��O**

`visibilidade static retorno nome (parametros)`


| Partes           | Fun��o de cada parte                 |
| -----------------|------------------------------|
| **visibilidade** | private, public ou protected. |
| **static**       | Quando for static, a fun��o ser� um **contexto de uma classe**, caso n�o informe ser� um **contexto de objeto**.|
| **retorno**      | `void` quando n�o houver retorno, quando houver deve informar o tipo da vari�vel (byte, short, long, int, String). |
| **nome**         | Utilizar de boa conve��o um `verboComplemento`. |
| **par�metros**  | Quando houver ser�o informados pelo tipo e nome (ex.: `int numA`), separados por virgula quando houver mais de um (ex.: `(int numA, int numB)`).
 
Ex.:

```
public static void nomeFuncao(){

	escopo de a��es;
	
	return; //se houver retorno
}
```
**Fun��o** o nome ja diz por si, voc� cria um escopo separado da sua classe ou do escopo principal da classe, para realizar uma fun��o seja o que for (mostrar texto, pedir valor, etc)

Voc� sempre inicia o codigo no escopo principal, e quando voc� precisa, voc� chama aquela fun��o em um determinado momento que voc� quiser para realizar aquela a��o, sem precisar ter que ficar repetindo o c�digo inteiro, apenas invocando ele.

**Argumentos** s�o valores que voc� adiciona no par�metro para obter um resultado seja de retorno ou fun��o com `void`