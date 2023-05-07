# Ecommerce API 

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `MySql Version 8.0.32`
* `Spring Boot 3.0.5(Framwork)`
*  `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:

### 1. Models:
* It consists User, Address, Product, Order entity classes along with their properties.
* Used @Entity annotation to create table of class in database.
* Create constructors and getters and setters of all of classes By using annotation @Data and @AllArgsConstructor and @NoArgsConstructor.
* Used @OneToOne annotation to perform one to one mapping between Orders and User,Address,Product and also using one to one mapping between Address and User.

### 2. Controllers:
* It consists of UserController, AddressController, ProductController and OrderController classes in which used the annotations like @RestController to annotate the class as Controller layer.
* Used annotation @GetMapping , @PostMapping , @PutMapping , @DeleteMapping to map the HTTP web requests to the specific handler methods.


### API References:

#### User API References

* Add User:
```
  http://localhost:8080/user
```

* Get all User:
```
  http://localhost:8080/user/all
```

* Get User By userId:
```
  http://localhost:8080/user/userId/{userId}
```
#### Address API References:

* Add Address:
```
  http://localhost:8080/address
```

* Get all Address:
```
  http://localhost:8080/address/all
```

#### Product API References:

* Add Product:
```
  http://localhost:8080/product
```

* Get all Product:
```
  http://localhost:8080/product/all
```

* Get Product by categorey:
```
  http://localhost:8080/product/category/{category}
```

* Delete Product by productId:
```
http://localhost:8080/product/productId/{productId}
```

#### Order API References:

* Add Order:
```
  http://localhost:8080/order
```

* Get Order By orderId:
```
  http://localhost:8080/order/orderId/{orderId}
```

### 3. Services:
* It consists  UserService, AddressService, ProductService and OrderService classes in which having some business logic of every handler methods.
* Used @Service annotation to indicate that a class belongs to the service layer.

### 4. Repositories:
* It consists of IUserRepo, IAddressRepo, IProductRepo and IOrderRepo interfaces that extends CrudRepository interface so we can use inbuilt crudRepo method and we create some cusom finder method and writting some query method to perform crud operation like create ,read, update and delete.
* Used @Repository annotation to indicate that a interface belongs to the repository layer(Dao layer).


## Project Summary:

In this spring boot application I had created API's mapping for CRUD operations like create(save), read(find), update and delete .Aim of this project to perform one to one mapping between Order and other Entity like User, Address, Product. In this project  Using the CrudRepositorya Interface method and createing and using custom finder method and custom query method.