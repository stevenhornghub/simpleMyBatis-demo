# spring-mybatis
A simple walkthrough on Springboot mybatis using MariaDb database connection.

Step 1: Make sure to have dependency needed in building you own Springboot mybatis using MariaDb database connection:

   <dependency>
            <groupId>ch.vorburger.mariaDB4j</groupId>
            <artifactId>mariaDB4j-core</artifactId>
            <version>2.4.0</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>ch.vorburger.mariaDB4j</groupId>
            <artifactId>mariaDB4j</artifactId>
            <version>2.4.0</version>
        </dependency>
        
         <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
          <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.2</version>
        </dependency>

Step 2: You can create now your database table:

use library;

create table books
(
    id  int auto_increment not null
        primary key,
    name           varchar(255) not null UNIQUE,
    description    varchar(255) not null,
    genre          varchar(255) not null,
    author         varchar(255)  not null
);

step 3: Try the CRUD with the console:

SELECT * FROM books;

INSERT INTO library.books (id, name, description, genre, author)
 VALUES (1, 'steven', 'meme', 'science', 'steven jr');
 
 Step 4: Create your Model
 Step 5: Create your Controller, Service, and Repository.
 
 Tips: Don't forget this on your launcher to configure
 @SpringBootApplication(scanBasePackages = "com.bib.basiclibraryspring")
@MapperScan("com.bib.basiclibraryspring.mapper")
