Advantage online shopping

Se realizó la automatización de la página web www.advantageonlineshopping.com. Utilizando Java, Gradle, SerenityBDD, Cucumber y el patrón de diseño ScreenPlay. A continuación, se describe los escenarios:

Caso positivo.

Como caso positivo se automatizó los siguientes procesos:
1.	Se automatizó el proceso de iniciar sesión (con una cuenta previamente creada).
2.	Ir a la sección de venta de computadoras portátiles.
3.	Escoger una de las computadoras entre todo el catálogo.
4.	Iniciar el proceso de pago.
5.	Antes de pagar, verificar que se va a realizar la compra deseada.
6.	Hacer el pago respectivo.

Caso negativo.

Como caso negativo se automatizó los siguientes procesos:
1.	Se automatizó el proceso de iniciar sesión (con una cuenta previamente creada).
2.	Ir a la sección de búsqueda, e ingresar una referencia de una computadora la cual no está en existencia (stock).
3.	Validar que aparezca un texto, el cual indica que no hubo un resultado satisfactorio para la búsqueda.

¿Cómo ejecutar la automatización de la prueba?

Para ejecutar la automatización de la prueba se debe ir a la clase BuyALaptopRunner.java, la cual se encuentra en la siguiente ruta:

src/test/java/com/advantageonlineshopping/automations/runners/BuyALaptopRunner.java

Estando allí, se debe aclarar que en el atributo “tags” se indica cual escenario se desea ejecutar, por ejemplo:

•	Si se desea ejecutar el escenario exitoso se indica así: tags = {"@successfulPurchase"}

•	Por el contrario, si se desea ejecutar el escenario fallido se indica de la siguiente manera: tags = {"@failedPurchase"}
