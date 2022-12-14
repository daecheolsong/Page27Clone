# Page27 Clone Coding

## π€² νλ‘μ νΈ μκ°
```
page 27 clone coding (λ²‘μλ μ€μ¬)
```

> κ΅¬ν κΈ°λ₯


<br>


## π  κΈ°μ  μ€ν

### BackEnd

<table>
  <tr>
    <td>
        <img src="https://images.velog.io/images/codemcd/post/131a0a54-437c-4acf-ba01-c8798c0b7628/Java_Logo.png" width="100px" />
    </td>
    <td>
        <img src="https://images.velog.io/images/courage331/post/1331631e-dbe9-4697-ad99-4521f4b04490/image.png" width="100px" />
    </td>
    <td>
        <img src="https://perfectacle.github.io/2017/08/02/Spring-boot-study-001day/thumb.png" width="100px" />
    </td>
    <td>
        <img src="https://dbdb.io/media/logos/h2-logo.svg" width="100px" />
    </td>
    <td>
        <img src="https://miro.medium.com/max/658/1*Ok6oJjpnrroklRhRiL6l3w.png" width="100px" />
    </td>
    <td>
        <img src="https://blog.kakaocdn.net/dn/eVRvQn/btqEbu9rz8n/k7ea2jKIlA4koHgBVrlrT1/img.png" width="100px" />
    </td>
  </tr>
  <tr>
    <td><b>Java 11</b></td>
    <td><b>Gradle</b></td>
    <td><b>Spring Boot</b></td>
    <td><b>H2 database</b></td>
    <td><b>Spring DataJPA/<br>QueryDSL</b></td>
    <td><b>JUnit5 / Mockito</b></td>
  </tr>
</table>


<br>


## β μ΄νλ¦¬μΌμ΄μ μ€μ 

### application.properties
``` properties
# live server
spring.devtools.livereload.enabled=true

spring.thymeleaf.check-template-location=true

# default -> resources/static
spring.mvc.static-path-pattern=/**

# database configuration
spring.datasource.url= jdbc:h2:tcp://localhost/~/project
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

spring.jpa.hibernate.ddl-auto=create
```

### build.gradle
```groovy
plugins {
    id 'org.springframework.boot' version '2.7.2'
    id 'io.spring.dependency-management' version '1.0.12.RELEASE'
    id 'java'
    // querydsl plugin
    id 'com.ewerk.gradle.plugins.querydsl' version '1.0.10'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

configurations {
    compileOnly {
        extendsFrom annotationProcessor
    }
}

repositories {
    mavenCentral()
}

dependencies {

    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-web'

    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
    implementation 'com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.5.6'
    // querydsl
    /*
    μΈνλ¦¬μ μ΄ 2020.X μ¬μ©μ: κ·Έλ μ΄λ€ annotationProcessor μ¬μ©
     */
    implementation 'com.querydsl:querydsl-jpa'
    implementation 'com.querydsl:querydsl-core'

    annotationProcessor("com.querydsl:querydsl-apt:${dependencyManagement.importedProperties['querydsl.version']}:jpa") // querydsl JPAAnnotationProcessor μ¬μ© μ§μ 
    annotationProcessor "jakarta.persistence:jakarta.persistence-api"// java.lang.NoClassDefFoundError(javax.annotation.Entity) λ°μ λμ
    annotationProcessor "jakarta.annotation:jakarta.annotation-api" // java.lang.NoClassDefFoundError (javax.annotation.Generated) λ°μ λμ

    // μ€νλ§ μνλ¦¬ν° ν΅ν© λͺ¨λ μ¬μ© in thymeleaf
//    implementation 'org.thymeleaf.extras::thymeleaf-extras-springsecurity5'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
//    testImplementation 'org.springframework.security:spring-security-test'
}

tasks.named('test') {
    useJUnitPlatform()
}

// clean νμ€ν¬μ cleanGeneatedDir νμ€ν¬ μ€ μ·¨ν₯μ λ°λΌμ μ ννμΈμ.
/** clean νμ€ν¬ μ€νμ QClass μ­μ  */
clean {
    delete file('src/main/generated') // μΈνλ¦¬μ μ΄ Annotation processor μμ±λ¬Ό μμ±μμΉ
}

/**
 * μΈνλ¦¬μ μ΄ Annotation processor μ μμ±λλ 'src/main/generated' λλ ν°λ¦¬ μ­μ 
 */
task cleanGeneatedDir(type: Delete) { // μΈνλ¦¬μ μ΄ annotation processor κ° μμ±ν Qν΄λμ€κ° clean νμ€ν¬λ‘ μ­μ λλ κ² λΆνΈνλ€λ©΄ λ μ€μ νλλ₯Ό μ ν
    delete file('src/main/generated')
}

```

-----------------------

## π μ§νμν©

* **22-08-18**

```
1. dbμ°λ λ° μ€μ 
2. λ©μΈ μΊλ¬μ itemIdx μλ²μμ λκ²¨μ£ΌκΈ°(/main/index.html)
3. MainCarousel ν΄λμ€ (test data) μΆκ°
```

* **22-08-19**
```
1. gradle querydsl annotation processor μ¬μ©νμ¬ μ€μ 
2. MainCarousel -> IndexInitμΌλ‘ λ³κ²½(+ weeklyBestItem test data μΆκ°)
3. orderList μλ²μμ λκ²¨μ£ΌκΈ°(/main/index.html)
 - WeeklyBestDtoλ‘ λκ²¨μ€ 
```


* **22-08-20**
```
1. IndexInit μμ±(/main/index test data)
    - weeklyBestDto
        - weeklyBestOuterItem
        - weeklyBestShoesItem
        - weeklyBestSleeveItem
        - weeklyBestShirtsItem
        - weeklyBestBottomItem
        - weeklyBestKnitItem
2. /main/index μμ±
    - weeklyBestDto λ₯Ό ν΅ν΄ μ‘°ν
```


---------------


## β μ΄μ

 



