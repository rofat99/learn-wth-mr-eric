plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.pm"
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
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation:3.2.0")
	implementation ("org.projectlombok:lombok")
	implementation ("org.mapstruct:mapstruct:1.4.2.Final")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")

	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.mysql:mysql-connector-j")
	annotationProcessor("org.projectlombok:lombok")
	annotationProcessor ("org.mapstruct:mapstruct-processor:1.4.2.Final")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}


tasks.withType<Test> {
	useJUnitPlatform()
}
