# Spring Property File Reading Example

This project demonstrates how to read values from a `.properties` file using Spring Framework's `@PropertySource` and `@Value` annotations.

## Features

- Java-based Spring Configuration
- Reading external properties file
- Using `@PropertySource`
- Injecting property values with `@Value`
- Dependency Injection with Spring IoC Container

## Technologies Used

- Java 8+
- Spring Framework 5.3.18
- Maven

## Project Structure

```
src/main/java
└── com.db
    ├── AppConfig.java
    ├── DbConfig.java
    └── Driver.java

src/main/resources
└── test.properties
```

## Properties File

`src/main/resources/test.properties`

```properties
test.user.name=rites
test.user.password=root
test.db.url=testURL
```

## Configuration Class

```java
@Configuration
@ComponentScan(basePackages = "com.db")
@PropertySource("classpath:test.properties")
public class AppConfig {
}
```

## Property Injection

```java
@Component
public class DbConfig {

    @Value("${test.user.name}")
    private String username;

    @Value("${test.user.password}")
    private String password;

    @Value("${test.db.url}")
    private String url;

}
```

## Running the Project

1. Clone the repository

```bash
git clone https://github.com/your-username/read-properties-file.git
```

2. Import as a Maven Project in Eclipse or IntelliJ IDEA.

3. Update Maven Dependencies.

4. Run:

```java
Driver.java
```

## Expected Output

```text
-----Db details--------
rites
root
testURL
```

## Concepts Learned

- Spring Java Configuration
- `@Configuration`
- `@ComponentScan`
- `@PropertySource`
- `@Value`
- Reading values from `.properties` files
- Spring Dependency Injection

## Author

Ritesh Singh
