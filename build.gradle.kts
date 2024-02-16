plugins {
    java
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "cn.org.codecrafters"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenLocal()
    maven(url = "https://codecrafters.coding.net/public-artifacts/base/public/packages")
    maven(url = "https://maven.proxy.ustclug.org/maven2/")
    mavenCentral()
}

dependencies {
    // Uncomment the following 2 lines to enable RabbitMQ.
    // implementation("org.springframework.boot:spring-boot-starter-amqp")
    // testImplementation("org.springframework.amqp:spring-rabbit-test")

    // Uncomment the following line to enable Redis.
    // implementation("org.springframework.boot:spring-boot-starter-data-redis")

    // Uncomment the following line to enable Java Mail Sender.
    // implementation("org.springframework.boot:spring-boot-starter-mail")

    // Uncomment the following line to enable Quartz Scheduler.
    // implementation("org.springframework.boot:spring-boot-starter-quartz")

    // Uncomment the following 2 lines to enable Spring Security.
    // implementation("org.springframework.boot:spring-boot-starter-security")
    // testImplementation("org.springframework.security:spring-security-test")

    // Uncomment the following line to enable Validation.
    // implementation("org.springframework.boot:spring-boot-starter-validation")

    // Uncomment the following line to enable Microsoft SQL Server.
    // runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")

    // Uncomment the following line to enable MySQL.
    // runtimeOnly("com.mysql:mysql-connector-j")

    // Uncomment the following line to enable MariaDB.
    // runtimeOnly("org.mariadb.jdbc:mariadb-java-client")

    // Uncomment the following line to enable PostgresDB.
    // runtimeOnly("org.postgresql:postgresql")

    // Uncomment the following line to enable JWT.
    // implementation("cn.org.codecrafters:simple-jwt-spring-boot-starter:1.3.0")
    // implementation("cn.org.codecrafters:simple-jwt-authzero:1.3.0")
    // implementation("cn.org.codecrafters:simple-jwt-jjwt:1.3.0")

    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
