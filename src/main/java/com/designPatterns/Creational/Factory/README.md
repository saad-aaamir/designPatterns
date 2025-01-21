# Factory Pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

Factory pattern contains two main components: 

## Product

• **Product**

it is a blueprint (interface) that declare what are the products functionalities.

    public interface product{
        void func1();
        void func2();
        void func3();
    }

• **Concrete Product**

it is a actual product (class) that defines the functionalities provided by Product (interface).

    
    public class concrete_product_1 implements product {

        @Override
        public void func1() {
            // actual implementation here
        }

        @Override
        public void func2() {
            // actual implementation here
        }

        @Override
        public void func3() {
            // actual implementation here
        }

    }


---

    public class concrete_product_2 implements product {

        @Override
        public void func1() {
            // actual implementation here
        }

        @Override
        public void func2() {
            // actual implementation here
        }

        @Override
        public void func3() {
            // actual implementation here
        }

    }

---

    public class concrete_product_3 implements product {

        @Override
        public void func1() {
            // actual implementation here
        }

        @Override
        public void func2() {
            // actual implementation here
        }

        @Override
        public void func3() {
            // actual implementation here
        }

    }


---
## Factory

• **Factory**

it is a blueprint (interface) that declare what are the factories functionalities.

    public abstract class factory {
        public abstract product createProduct();
    }


• **Concrete Factory**

it is a actual factory (class) that returns the concrete products.

    public class concrete_factory_product_1 extends factory {
        @Override
            public concrete_product_1 createProduct() {
            return new concrete_product_1();
        }
    }

---

    public class concrete_factory_product_2 extends factory {
        @Override
            public concrete_product_2 createProduct() {
            return new concrete_product_2();
        }
    }
---
    public class concrete_factory_product_3 extends factory {
        @Override
            public concrete_product_3 createProduct() {
            return new concrete_product_3();
        }
    }
