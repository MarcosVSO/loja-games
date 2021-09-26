# loja-games
Implementação de uma API de uma loja de games utilizando Springboot, Hibernate/JPA e Banco em memória H2

## Como Inicializar a aplicação
Após clonar o projeto, cd loja-game/springboot-rest-api-sample<br/>
Executar: mvn spring-boot:run

## Funcionalidades
**GET**<br/>
**Para mostrar os produtos:**  localhost:9000/products<br/>
**Para monstrar um produto específico:** localhost:9000/products/{id}<br/>
**Para mostrar os produtos em ordem alfabética:** localhost:9000/products/alphabetic<br/>
**Para mostrar os produtos em ordem do preço menor para maior:** localhost:9000/products/priceasc<br/>
**Para mostrar os produtos em ordem de score menor para maior:** localhost:9000/products/scoreasc<br/>

**Para mostrar os carts:** localhost:900/carts<br/>
**Para mostrar um cart específico:** localhost:9000/carts/{id}<br/>

**PUT**
Utilizando o PostMan
localhost:9000/carts
Body-Raw-Json
{
    "id": 1,
    "frete": 0.0,
    "total": 0.0,
    "products": [{
        "id": 12,
        "name": "Mortal Kombat XL",
        "price": 69.99,
        "score": 150,
        "image": "mortal-kombat-xl.png"
    },
    {
        "id": 31,
        "name": "Terra Média: Sombras de Mordor",
        "price": 79.99,
        "score": 50,
        "image": "terra-media-sombras-de-mordor.png"
    }]
}


