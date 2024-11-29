

## PROYECTO DE CLASES GENERICAS ##
Proyecto de Java con ejemplos de Datos y clases Genericos.

# Definicion de Clases Genericas:
Clases que se diseñan con el fin de utilizar diferentes tipos de datos en el mismo.
En lugar de utilizar los tipos de datos especificos cono el Integer o String se 
remplaza por cualquier nombre o tambien llamado parametro generico <T>. Cuando se 
realiza la intancia de esa clase, se debe especificar en el mismo formato, que 
tipo de dato es el objeto.
# Ventajas:

La principal funcion de estas clases es la reutilización de codigo. Sin escribir 
versiones especificas de cada tipo de variable.

Permite deterctar errores en tiempo de compilación, evitando problemas.

No son limitantes. Por lo tanto es muy facil de escalar con ellas.

# Definicion de Datos Genericos:
Referencias o representación de un tipo de dato. En el contexto de clases genericas
se utilizan para trabajar con datos que no sabemos que tipo de datos son.

# Interpretación segun los ejemplos:
Un ejemplo de interpretación del uso de estos genericos, es la propia libreria de 
ArrayList, el cual nosotros entre el menor y mayor que, debemos especificar el 
tipo de dato que van a estar dentro del array. O tambien no podemos especificarlo,
pero tendremos problemas al poder operar con los tipos de datos dentro del mismo.

En el ejemplo 3, nosotros estamos definiendo dos datos genericos, A y Z, donde 
ponemos los getters y setters, y todos los componentes que debe tener un modelo,
ahi en la App, nosotros debemos espeficiar el tipo de datos, ya que java debe 
saber el tipo para poder procesarlos. 

En el ejemplo 1, nosotros estamos creando genericos en un metodo, por lo que,
a diferencia del ejemplo 3, donde no podemos simplemente definir una variable 
y asignarle un valor de la instancia de la clase, en este caso, si podemos, 
como vemos ahi, final Integer si puede ser y tomar el tipo de dato del metodo,
apesar de ser dos genericos.



