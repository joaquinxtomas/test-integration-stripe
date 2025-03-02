<h1>Stripe Integration Project</h1>
    <p>This project integrates Stripe into a Java application to simulate product payments. It provides a simple interface to select products, define quantities, and proceed to checkout using Stripe.</p>

   <h2>Project Features</h2>
    <ul>
        <li><strong>Home Controller:</strong> Displays 3 product cards with options to select quantity and proceed to checkout.</li>
        <li><strong>Checkout Controller:</strong> Handles requests, validates inputs, and redirects to Stripe for payment processing.</li>
        <li><strong>DTOs:</strong>
            <ul>
                <li><strong>ProductDTO:</strong> Contains product details (price, quantity, name, and currency).</li>
                <li><strong>StripeDTO:</strong> Holds Stripe session data (status, message, sessionId, and sessionUrl).</li>
            </ul>
        </li>
        <li><strong>Service Layer:</strong> Configures and interacts with Stripe API.</li>
  </ul>

  <h2>Getting Started</h2>
    <p>Follow these instructions to set up and run the project locally.</p>

   <h3>Prerequisites</h3>
    <ul>
        <li>Java 17 or higher</li>
        <li>Maven</li>
        <li>A Stripe account</li>
    </ul>

  <h3>Setup Instructions</h3>
    <ol>
        <li>Clone this repository:</li>
        <pre><code>git clone https://github.com/joaquinxtomas/test-integration-stripe.git</code></pre>
        <li>Navigate to the project directory:</li>
        <pre><code>cd &lt;project-directory&gt;</code></pre>
        <li>Configure Stripe API keys:</li>
        <p><strong>To get a secret key in stripe:</p>
            <ul>
                <li>Create an account on the Stripe website.</li>
                <li>In your dashboard, go to Developers -> API Keys</li>
                <li>There, you will find both a secret key and a public key. Copy the secret key and add it to the application.properties.</li>
            </ul>
        <pre>
<code>
stripe.api.key=your_secret_key
stripe.api.publishableKey=your_publishable_key
</code>
        </pre>
        <li>Build the project using Maven:</li>
        <pre><code>mvn clean install</code></pre>
        <li>Run the application:</li>
        <pre><code>mvn spring-boot:run</code></pre>
    </ol>

  <h3>Usage</h3>
    <ol>
        <li>Access the home page to view available products.</li>
        <li>Select product quantities and proceed to checkout.</li>
        <li>Complete the payment using Stripe.</li>
    </ol>

  <h2>Technical Details</h2>
    <ul>
        <li><strong>Backend Framework:</strong> Spring Boot</li>
        <li><strong>Stripe SDK:</strong> Used for payment processing</li>
        <li><strong>Swagger:</strong> API documentation</li>
    </ul>

   <h2>Known Limitations</h2>
    <ul>
        <li>No deployment: The application must be started locally.</li>
        <li>Requires manual setup of Stripe API keys.</li>
    </ul>

  <hr>
  
  <h1>Proyecto de Integración con Stripe</h1>
    <p>Este proyecto integra Stripe en una aplicación Java para simular pagos de productos. Proporciona una interfaz simple para seleccionar productos, definir cantidades y proceder al pago usando Stripe.</p>

  <h2>Características del Proyecto</h2>
    <ul>
        <li><strong>Controlador Home:</strong> Muestra 3 tarjetas de productos con opciones para seleccionar cantidad y proceder al pago.</li>
        <li><strong>Controlador Checkout:</strong> Gestiona las solicitudes, valida las entradas y redirige a Stripe para el procesamiento del pago.</li>
        <li><strong>DTOs:</strong>
            <ul>
                <li><strong>ProductDTO:</strong> Contiene los detalles del producto (precio, cantidad, nombre y moneda).</li>
                <li><strong>StripeDTO:</strong> Contiene los datos de la sesión de Stripe (estado, mensaje, sessionId y sessionUrl).</li>
            </ul>
        </li>
        <li><strong>Capa de Servicio:</strong> Configura e interactúa con la API de Stripe.</li>
    </ul>

  <h2>Comenzando</h2>
    <p>Sigue estas instrucciones para configurar y ejecutar el proyecto localmente.</p>

  <h3>Requisitos Previos</h3>
    <ul>
        <li>Java 17 o superior</li>
        <li>Maven</li>
        <li>Una cuenta de Stripe</li>
    </ul>

  <h3>Instrucciones de Configuración</h3>
    <ol>
        <li>Clona este repositorio:</li>
        <pre><code>git clone https://github.com/joaquinxtomas/test-integration-stripe.git</code></pre>
        <li>Ve al directorio del proyecto:</li>
        <pre><code>cd &lt;directorio-del-proyecto&gt;</code></pre>
        <li>Configura las claves de API de Stripe:</li>
        <p><strong>Para conseguir tu clave secreta en Stripe:</p>
            <ul>
                <li>Crea tu cuenta en la web de Stripe.</li>
                <li>En tu dashboard, Ve a Desarrolladores -> API Keys</li>
                <li>TAquí encontrarás una clave secreta y una publica. Copia la clave secreta y pégala en tu application.properties.</li>
            </ul>
        <pre>
<code>
# En application.properties
stripe.api.key=tu_clave_secreta
stripe.api.publishableKey=tu_clave_publicable
</code>
        </pre>
        <li>Compila el proyecto usando Maven:</li>
        <pre><code>mvn clean install</code></pre>
        <li>Ejecuta la aplicación:</li>
        <pre><code>mvn spring-boot:run</code></pre>
    </ol>

  <h3>Uso</h3>
    <ol>
        <li>Accede a la página principal para ver los productos disponibles.</li>
        <li>Selecciona las cantidades de los productos y procede al pago.</li>
        <li>Completa el pago usando Stripe.</li>
    </ol>

  <h2>Detalles Técnicos</h2>
    <ul>
        <li><strong>Framework Backend:</strong> Spring Boot</li>
        <li><strong>SDK de Stripe:</strong> Usado para el procesamiento de pagos</li>
        <li><strong>Swagger:</strong> Documentación de la API</li>
    </ul>

  <h2>Limitaciones Conocidas</h2>
    <ul>
        <li>No hay despliegue: La aplicación debe iniciarse localmente.</li>
        <li>Requiere configuración manual de las claves de API de Stripe.</li>
    </ul>
  
