Nieuw model order maken.

stap 1. copy Customercontroller naar Order controller, verander mappings (voorzover bekend) naar:
         @RequestMapping(value = "/orders")
        endpoints kun je later toevoegen kun je later toevoegen, endpoints dan /orders/......

De waardes die nu nog verwijzen naar de customer later met de hand wijzigen en nieuwe verwijzing door IntelliJ 
laten opzoeken!!

stap 1.1. private OrderService orderService;   (moet later gckecked worden als je service gecopieerd hebt)



stap 2. Copy model Customer naar model Order
        kies veldnamen, en maak nieuwe getters en setters aan

stap 3. In SpringSecurityConfig
        .antMatchers("/orders/**").hasRole("USER")


stap 4 copy CustomerRepository naar OrderRepository

stap 5. copy CustomerService to OrderService

    5.1 Zet nu de verwijzing in OrderController goed van 
        private OrderService orderService;
naar: private OrderService orderService; Dit opnieuw intypen anders verwijzing misschien niet goed.

stap 6. maak handmatig nieuwe class OrderServiceImpl aan, bij copieeren krijg je gauw verkeerde links!
        LET OP in OrderService staat waarschijnlijk nog de verkeerde import!!!!

        import nl.lotrac.bv.model.Customer;
        moet zijn: import nl.lotrac.bv.model.Order;




        