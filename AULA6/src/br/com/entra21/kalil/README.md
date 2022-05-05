# FUNÇÕES

<p> Aprender a estrutura da função e criar função específica de uma ação </p>

---

`visibilidade static retorno nome (parametros)`

| Partes           | Função de cada parte                 |
| -----------------|------------------------------|
| **visibilidade** | private, public ou protected. |
| **static**       | Quando for static, a função será um **contexto de uma classe**, caso não informe será um **contexto de objeto**.|
| **retorno**      | `void` quando não houver retorno, quando houver deve informar o tipo da variável (byte, short, long, int, String). |
| **nome**         | Utilizar de boa conveção um `verboComplemento`. |
| **parâmetros**   | Quando houver serão informados pelo tipo e nome (ex.: `int numA`), separados por virgula quando houver mais de um (ex.: `(int numA, int numB)`).
 
Ex.:

```
public static void nomeFuncao(){

	escopo de ações;
	
	return; //se houver retorno
}
```
**Função** o nome ja diz por si, você cria um escopo separado da sua classe ou do escopo principal da classe, para realizar uma função seja o que for (mostrar texto, pedir valor, etc)

Você sempre inicia o codigo no escopo principal, e quando você precisa, você chama aquela função em um determinado momento que você quiser para realizar aquela ação, sem precisar ter que ficar repetindo o código inteiro, apenas invocando ele.

**Argumentos** são valores que você adiciona no parâmetro para obter um resultado seja de retorno ou função com `void`