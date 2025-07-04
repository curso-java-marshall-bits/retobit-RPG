# RetoBit: RPG a medias 🧝

En este RetoBit tenemos un RPG medio empezado, pero el developer es un poco vago y lo dejó a medias 🤔
Deberás continuar el desarrollo con varias tareas pendientes.

## ¿Qué practicarás?

- Herencia
- Encapsulamiento
- Clases abstractas
- Métodos

## Fork del repositorio:

Haz un fork del repo.

Pulsa el botón Fork en github:

![fork](public/img1.png)

Esto creará una copia del repositorio en tu perfil de Github. 

## Clona el repo en tu computadora

Ahora hay que descargarse el proyecto en tu computadora.

### 1. Asegúrate de que estás en la URL de TU copia del repositorio
   

Si la URL es esta: https://github.com/curso-java-marshall-bits/retobit-RPG **NO ES CORRECTO**.
    

Donde aparece 'curso-java-marshall-bits' debería aparecer tu nombre de usuario. Haz click en tu perfil y mira tus repositorios para comprobar si hiciste el fork. En caso contrario vuelve al paso anterior. 


### 2. Pulsa en "code" para ver la URL del repositorio y cópiala

![clone](public/img2.png)

Para ello deberás abrir una terminal y navegar a la carpeta donde quieras añadir este retobit.

Utiliza el siguiente comando:

```commandline
git clone https://aqui.debes.pegar.la.url
```

**Nota: Después del 'git clone' debes pegar la url del repositorio. No pongas la que he puesto yo en el ejemplo 🤣*

Ahora se va a crear un nuevo directorio con el nombre del retobit.

### 3. ¡Ya puedes abrir este reto en IntelliJ!

# Instrucciones

## Parte 1: Analiza el código

Este puede ser un ejemplo real que te vayas a encontrar en tu trabajo. Hay algo que ya está siendo desarrollado y te toca hacer el siguiente paso. Lo primero que deberás hacer es fijarte en los archivos que tienes en la carpeta Java. Analiza su relación y funcionalidad. Fíjate en el tipo de datos que tenemos, el tipo de clases, etc.

## Parte 2: Completa la clase Character

A la clase Character le faltan métodos.
Impleméntalos. 

\- Pero Marcel, no me has dicho qué métodos debo implementar...

\- ¿No? ¿Seguro? 🤔 Ok, voy a dejar que el código hable por mí... 

<details>
  <summary>Pista</summary>
Fíjate en la interfaz de Combatant y verás todos los métodos a implementar.
Si intentas ejecutar los tests saltará error y te dirá qué métodos faltan.

</details>

Asegúrate de que el status del character cambia a DEAD cuando la vida es 0. Y que la vida no puede ser menor a 0.

## Parte 3: Añade varias clases heredadas

Crea dos clases que representen tipos específicos de personajes de RPG: Warrior y Mage (se deben llamar así). Estas clases deberán heredar de Character y tener propiedades extra:

- Warrior debe tener *defense* (int). Serán puntos extra de defensa.
- Mage debe tener *mana* (int). Los puntos de magia que tiene para realizar hechizos.

**Recuerda que las propiedades y clases deben llamarse tal cual pedimos en las instrucciones. Si no es así los tests no pasarán.*

## Testing

Para comprobar si has realizado bien el ejercicio ejecuta los tests ubicados en **src/test**. Hay un archivo para cada parte del RetoBit.

- **CharacterTest**
- **MageTest**
- **WarriorTest**

Puedes ejecutar los tests de cada uno de los archivos pulsando en él con el botón derecho y *Run NombreDelArchivoTest*. También puedes pulsar con el botón derecho en la carpeta */test/java* y seleccionar *Run all tests* para ejecutarlos todos a la vez. 

El test te indicará si has pasado con un tick verde ✅. En caso contrario verás el error.

Ejemplo:

![img.png](public/img3.png)

Pulsa en cualquiera de los tests que has fallado y mira el mensaje de la derecha.

- *Expected*: es el valor que el test estaba esperando.
- *Actual*: es el valor que tu reto está retornando. 

## Solución

Si quieres ver una posible solución para el retobit que pasa todos los tests puedes mirar la rama *solution* dentro del repositorio.

![rama solution](public/img4.png)

Ten en cuenta que hay muchas formas de resolver los ejercicios y la tuya puede pasar los tests iguales, pero ser completamente distinta a la solución. No significa que la tuya esté mal. Compara los resultados y decide cuál te gusta más o te parece más legible.

## Entrega

Realiza un commit con los cambios desde la terminal:

1. Añade todos los cambios
````commandline
git add .
````

2. Haz el commit con el mensaje
````commandline
git commit -m "retobit finalizado"
````

3. Haz un push
````commandline
git push origin main
````

Debes realizar una pull request para entregar el ejercicio. Abre el link del repositorio en github y haz click en la pestaña *pull requests*.

Selecciona *New pull request*, *Create pull request* y confírmala. Esto hará que yo pueda verlo y revisarlo en caso de que haya fallado algún test para poder darte feedback.

Mucha suerte con el reto. Te mando un abrazo y ¡Sigamos desarrollando! 🫂

[marshall-bits.dev](http://marshall-bits.dev)

*Nota: Estos retos pertenecen al curso de Marcel Bosch de Java para desarrolladores junior. Cualquier uso fuera de este contexto debe estar autorizado explícitamente. Si quieres usar estos ejercicios ponte en contacto conmigo a través de mis redes sociales (visita mi página para [más información](http://marshall-bits.dev)).* 