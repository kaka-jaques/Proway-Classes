# <img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Enchanting_Table.gif?raw=true" align="center" width="60px"> OPERADORES CONDICIONAIS

<p> <img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Enchanted_Book.gif?raw=true" align="center" width="30px"> Definir condição para ir a um escopo adequado, tomando decisões e iniciando ações desejadas! </p>

---

### <img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Arrow_Burning.gif?raw=true" align="center" width="35px"> **_CONDICIONAL_**
```
if (condicao=true){
	Ação(1);
}else if (segunda condicao=true){
	Ação(2);
}else {
	Ação(3);
}
```
<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> `if`: Condicional que realizará uma ação em seu escopo SE sua condição for satisfeita.

<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> `else if`: Serve como uma segunda condição em que realiza ações em outro escopo SE atender a outras satisfações. (Pode ser inserido quantos `else if` desejar)
```
if (condicao){
	Ação();
}else if(condicao){
	Ação()
}else if(condicao){
	Ação();
}else{
	Ação();
}
```

<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> `else`: Tem a função de ser executado caso nem o `if` e o `else if` seja executados.

<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> **_Condições Indepedentes:_** È quando se tem apenas o `if` sem o `else if` ou `else` no final de seu escopo, e sobrepõe ações em cima da última decisão de escopo se não bem estruturado.

<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> **_Condições Dependentes:_** É quando toda as condições seja `if` ou `else if` estão nos finais de seu escopo, lembrando que é necessário adicionar o `else` no final do último escopo de decisão.

### <img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Arrow_Burning.gif?raw=true" align="center" width="35px"> **_CONDICIONAL TERNARIO_**
```
System.out.println("Texto irá ser completado dependendo se a condição for )+(condicao=true?"true":"ou false?"));
```
<img src="https://github.com/kaka-jaques/Proway-Classes/blob/main/gifs/Bottle_Enchanting.gif?raw=true" align="center" width="30px"> **_Condição Ternario_** serve para pequenas decisões, atribuindo dados a variáveis, por exemplo: saída de texto dentro de um `System.out.println` ou `JOptionPane.showMessageDialog`, mas não pode tomar ações de execução.